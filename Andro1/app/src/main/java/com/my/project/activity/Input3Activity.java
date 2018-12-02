/**
 *  Created by Vasyka.
 */

package com.my.project.activity;

import android.content.Context;
import android.text.SpannableString;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.style.ForegroundColorSpan;
import com.my.project.R;
import com.my.project.adapter.TwoActivityPagerAdapter;
import com.my.project.fragment.TodayActivity;

import android.widget.ImageView;


public class Input3Activity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, Input3Activity.class);
	}
	
	private TextView inputDeviceNumberTextView;
	private TextView greetingTextView;
	private TextView greetTextTextView;
	private Button continueButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.input3_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Input device number component
		inputDeviceNumberTextView = this.findViewById(R.id.input_device_number_text_view);
		SpannableString inputDeviceNumberTextViewText = new SpannableString(this.getString(R.string.input3_activity_input_device_number_text_view_text));
		inputDeviceNumberTextView.setText(inputDeviceNumberTextViewText);
		
		// Configure Greeting component
		greetingTextView = this.findViewById(R.id.greeting_text_view);
		SpannableString greetingTextViewText = new SpannableString(this.getString(R.string.input3_activity_greeting_text_view_text));
		greetingTextView.setText(greetingTextViewText);
		
		// Configure Greet text component
		greetTextTextView = this.findViewById(R.id.greet_text_text_view);
		SpannableString greetTextTextViewText = new SpannableString(this.getString(R.string.input3_activity_greet_text_text_view_text));
		greetTextTextView.setText(greetTextTextViewText);
		
		// Configure Continue component
		continueButton = this.findViewById(R.id.continue_button);
		continueButton.setOnClickListener((view) -> {
	this.onButtonContinuePressed();
});
	}
	
	public void onButtonContinuePressed() {
	
		//startTodayActivity();
		startTwoActivity();
	}
	
	private void startTwoActivity() {
	
		//this.startActivity(TodayActivity.newIntent(this));
		this.startActivity(TwoActivity.newIntent(this));

	}
}
