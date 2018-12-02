/**
 *  Created by Vasyka.
 */

package com.my.project.activity;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.support.constraint.ConstraintLayout;
import com.google.android.gms.maps.MapView;
import android.widget.TextView;
import android.view.Menu;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.MenuItem;
import android.text.style.ForegroundColorSpan;
import android.view.MenuInflater;
import com.my.project.R;
import android.widget.ImageView;


public class WalkActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, WalkActivity.class);
	}
	
	private TextView subtitle1TextView;
	private TextView subtitle1TwoTextView;
	private TextView subtitle1ThreeTextView;
	private TextView subtitle1FourTextView;
	private Toolbar toolbar;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.walk_activity);
		this.init();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	
		getMenuInflater().inflate(R.menu.walk_activity_menu, menu);
		return true;
	}
	
	private void init() {
	
		// Configure Subtitle 1 component
		subtitle1TextView = this.findViewById(R.id.subtitle1_text_view);
		SpannableString subtitle1TextViewText = new SpannableString(this.getString(R.string.walk_activity_subtitle1_text_view_text));
		subtitle1TextView.setText(subtitle1TextViewText);
		
		// Configure Subtitle 1 component
		subtitle1TwoTextView = this.findViewById(R.id.subtitle1_two_text_view);
		SpannableString subtitle1TwoTextViewText = new SpannableString(this.getString(R.string.walk_activity_subtitle1_two_text_view_text));
		subtitle1TwoTextView.setText(subtitle1TwoTextViewText);
		
		// Configure Subtitle 1 component
		subtitle1ThreeTextView = this.findViewById(R.id.subtitle1_three_text_view);
		SpannableString subtitle1ThreeTextViewText = new SpannableString(this.getString(R.string.walk_activity_subtitle1_three_text_view_text));
		subtitle1ThreeTextView.setText(subtitle1ThreeTextViewText);
		
		// Configure Subtitle 1 component
		subtitle1FourTextView = this.findViewById(R.id.subtitle1_four_text_view);
		SpannableString subtitle1FourTextViewText = new SpannableString(this.getString(R.string.walk_activity_subtitle1_four_text_view_text));
		subtitle1FourTextView.setText(subtitle1FourTextViewText);
		
		// Configure Navigation Bar #1 component
		toolbar = this.findViewById(R.id.toolbar);
		
		setupToolbar();
	}
	
	public void setupToolbar() {
	
		setSupportActionBar(toolbar);
		
		// Additional Toolbar setup code can go here.
	}
}
