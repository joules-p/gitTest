package com.example.seg3;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

public class LoginActivity extends Activity {

	private String patientName;
	private String appointmentTime;
	TextView tvPatientName;
	TimePicker timePicker;
	Button loginButton;
	 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        //set TextView, TimePicker and Button
        
        timePicker = (TimePicker) findViewById(R.id.patientAppointmentTime);
        loginButton = (Button) findViewById(R.id.loginButton);
        
        
        // listener for Button
        loginButton.setOnClickListener(new OnClickListener() { 
        	
			@Override
			public void onClick(View loginClick) {
				// Store data re. name, time.  Direct user to video activity.
				patientName = tvPatientName.getText().toString();
				appointmentTime = Integer.toString(timePicker.getCurrentHour()) + "." + Integer.toString(timePicker.getCurrentMinute());
				
				Log.i("patientname", patientName);
			}
		});
        
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
    public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
    
    public String getPatientName() {
		return patientName;
	}
    
    public String getAppointmentTime() {
		return appointmentTime;
	}
    
    public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
    
    
}
