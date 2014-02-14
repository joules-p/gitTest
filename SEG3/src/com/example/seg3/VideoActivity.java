package com.example.seg3;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends Activity {
	
	VideoView welcomeVideo;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_video);
		
		//set VideoView
		welcomeVideo = (VideoView) findViewById(R.id.videoView);
		
		Uri videoPath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedeodog);
		
		welcomeVideo.setVideoURI(videoPath);
		welcomeVideo.requestFocus();
		welcomeVideo.start();
	}

}
