package com.example.seg3;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class LoginActivity extends Activity {

	private String patientName;
	private int appointmentHour;
	private int appointmentMinute;
	TextView tvPatientName;
	TimePicker appointmentTime;
	Button loginButton;
	 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        //set TextView, TimePicker and Button
        
        tvPatientName = (TextView) findViewById(R.id.patientLoginName);
        appointmentTime = (TimePicker) findViewById(R.id.patientAppointmentTime);
        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View loginClick) {
				// Store data re. name, time.  Direct user to video activity.
				patientName = tvPatientName.getText().toString();
				appointmentHour = appointmentTime.getCurrentHour();
				
				Log.v("hour", Integer.toString(appointmentHour));
				Log.i("textview content", patientName);
				
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
    
    
}
