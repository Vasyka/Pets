/**
 *  Created by Vasyka.
 */

package com.my.project.activity;

import android.view.View;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import com.my.project.R;
import android.widget.ImageView;
import android.os.Bundle;
import android.content.Context;
import android.widget.Button;


public class AddPetActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, AddPetActivity.class);
	}
	
	private Button getStartedButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.add_pet_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Get Started component
		getStartedButton = this.findViewById(R.id.get_started_button);
		getStartedButton.setOnClickListener((view) -> {
	this.onGetStartedPressed();
});
	}
	
	public void onGetStartedPressed() {
	
		startInput3Activity();
	}
	
	private void startInput3Activity() {
	
		this.startActivity(Input3Activity.newIntent(this));
	}
}
