package com.example.seg3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

public class LoginActivity extends Activity {

	private String appointmentTime;
	private String patientDob;
	TextView tvPatientName;
	TimePicker timePicker;
	Button loginButton;
	DatePicker datePickerDOB;
	 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        //set TextView, TimePicker, DatePicker and Button
        
        timePicker = (TimePicker) findViewById(R.id.patientAppointmentTime);
        loginButton = (Button) findViewById(R.id.loginButton);
        datePickerDOB = (DatePicker) findViewById(R.id.datePickerDOB);
        
        
        // listener for Button
        loginButton.setOnClickListener(new OnClickListener() { 
        	
			@Override
			public void onClick(View loginClick) {
				// Store data re. name, time.  Direct user to video activity.
				appointmentTime = Integer.toString(timePicker.getCurrentHour()) + "." 
											+ Integer.toString(timePicker.getCurrentMinute());
				patientDob = Integer.toString(datePickerDOB.getDayOfMonth()) + "/" + Integer.toString(datePickerDOB.getMonth()+1)
											+ "/" + Integer.toString(datePickerDOB.getYear());
				
				Intent i = new Intent(LoginActivity.this, VideoActivity.class);
				startActivity(i);
			}
		});
        
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
    
    
    public String getAppointmentTime() {
		return appointmentTime;
	}
    
    public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

    public String getPatientDob() {
		return patientDob;
	}

    public void setPatientDob(String patientDob) {
		this.patientDob = patientDob;
	}
    
    
}
