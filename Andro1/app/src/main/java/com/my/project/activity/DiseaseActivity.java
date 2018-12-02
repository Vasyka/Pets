/**
 *  Created by Vasyka.
 */

package com.my.project.activity;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.support.constraint.ConstraintLayout;
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


public class DiseaseActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, DiseaseActivity.class);
	}
	
	private TextView captionTextView;
	private TextView captionTwoTextView;
	private TextView captionThreeTextView;
	private TextView body2TextView;
	private TextView desc1TextView;
	private TextView desc2TextView;
	private TextView desc3TextView;
	private Toolbar toolbar;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.disease_activity);
		this.init();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	
		getMenuInflater().inflate(R.menu.disease_activity_menu, menu);
		return true;
	}
	
	private void init() {
	
		// Configure Caption component
		captionTextView = this.findViewById(R.id.caption_text_view);
		SpannableString captionTextViewText = new SpannableString(this.getString(R.string.disease_activity_caption_text_view_text));
		captionTextView.setText(captionTextViewText);
		
		// Configure Caption component
		captionTwoTextView = this.findViewById(R.id.caption_two_text_view);
		SpannableString captionTwoTextViewText = new SpannableString(this.getString(R.string.disease_activity_caption_two_text_view_text));
		captionTwoTextView.setText(captionTwoTextViewText);
		
		// Configure Caption component
		captionThreeTextView = this.findViewById(R.id.caption_three_text_view);
		SpannableString captionThreeTextViewText = new SpannableString(this.getString(R.string.disease_activity_caption_three_text_view_text));
		captionThreeTextView.setText(captionThreeTextViewText);
		
		// Configure Body 2 component
		body2TextView = this.findViewById(R.id.body2_text_view);
		SpannableString body2TextViewText = new SpannableString(this.getString(R.string.disease_activity_body2_text_view_text));
		body2TextView.setText(body2TextViewText);
		
		// Configure Desc1 component
		desc1TextView = this.findViewById(R.id.desc1_text_view);
		SpannableString desc1TextViewText = new SpannableString(this.getString(R.string.disease_activity_desc1_text_view_text));
		desc1TextView.setText(desc1TextViewText);
		
		// Configure Desc2 component
		desc2TextView = this.findViewById(R.id.desc2_text_view);
		SpannableString desc2TextViewText = new SpannableString(this.getString(R.string.disease_activity_desc2_text_view_text));
		desc2TextView.setText(desc2TextViewText);
		
		// Configure Desc3 component
		desc3TextView = this.findViewById(R.id.desc3_text_view);
		SpannableString desc3TextViewText = new SpannableString(this.getString(R.string.disease_activity_desc3_text_view_text));
		desc3TextView.setText(desc3TextViewText);
		
		// Configure Navigation Bar #1 component
		toolbar = this.findViewById(R.id.toolbar);
		
		setupToolbar();
	}
	
	public void setupToolbar() {
	
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		// Additional Toolbar setup code can go here.
	}
}
