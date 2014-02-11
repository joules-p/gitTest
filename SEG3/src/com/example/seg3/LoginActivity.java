package com.example.seg3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class LoginActivity extends Activity {

	private String patientName;
	TextView tvPatientName;
	TimePicker appointmentTime;
	Button loginButton;
	 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        tvPatientName = (TextView) findViewById(R.id.patientLoginName);
        appointmentTime = (TimePicker) findViewById(R.id.patientAppointmentTime);
        loginButton = (Button) findViewById(R.id.loginButton);
        patientName = (String) tvPatientName.getText();
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
    public String getPatientName() {
    	return patientName;
    }
    
}
