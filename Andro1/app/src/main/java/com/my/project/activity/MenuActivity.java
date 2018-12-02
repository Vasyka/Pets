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
import android.text.style.ForegroundColorSpan;
import com.my.project.R;
import android.widget.ImageView;


public class MenuActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, MenuActivity.class);
	}
	
	private TextView headline6TextView;
	private TextView body2TextView;
	private TextView headline6TwoTextView;
	private TextView body2TwoTextView;
	private TextView headline6ThreeTextView;
	private TextView captionTextView;
	private TextView body2ThreeTextView;
	private TextView headline6FourTextView;
	private TextView body2FourTextView;
	private TextView headline6FiveTextView;
	private TextView body2FiveTextView;
	private TextView body2SixTextView;
	private TextView body2SevenTextView;
	private TextView body2EightTextView;
	private TextView headline6SixTextView;
	private TextView body2NineTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.menu_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Headline 6 component
		headline6TextView = this.findViewById(R.id.headline6_text_view);
		SpannableString headline6TextViewText = new SpannableString(this.getString(R.string.menu_activity_headline6_text_view_text));
		headline6TextView.setText(headline6TextViewText);
		
		// Configure Body 2 component
		body2TextView = this.findViewById(R.id.body2_text_view);
		SpannableString body2TextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_text_view_text));
		body2TextView.setText(body2TextViewText);
		
		// Configure Headline 6 component
		headline6TwoTextView = this.findViewById(R.id.headline6_two_text_view);
		SpannableString headline6TwoTextViewText = new SpannableString(this.getString(R.string.menu_activity_headline6_two_text_view_text));
		headline6TwoTextView.setText(headline6TwoTextViewText);
		
		// Configure Body 2 component
		body2TwoTextView = this.findViewById(R.id.body2_two_text_view);
		SpannableString body2TwoTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_two_text_view_text));
		body2TwoTextView.setText(body2TwoTextViewText);
		
		// Configure Headline 6 component
		headline6ThreeTextView = this.findViewById(R.id.headline6_three_text_view);
		SpannableString headline6ThreeTextViewText = new SpannableString(this.getString(R.string.menu_activity_headline6_three_text_view_text));
		headline6ThreeTextView.setText(headline6ThreeTextViewText);
		
		// Configure Caption component
		captionTextView = this.findViewById(R.id.caption_text_view);
		SpannableString captionTextViewText = new SpannableString(this.getString(R.string.menu_activity_caption_text_view_text));
		captionTextView.setText(captionTextViewText);
		
		// Configure Body 2 component
		body2ThreeTextView = this.findViewById(R.id.body2_three_text_view);
		SpannableString body2ThreeTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_three_text_view_text));
		body2ThreeTextView.setText(body2ThreeTextViewText);
		
		// Configure Headline 6 component
		headline6FourTextView = this.findViewById(R.id.headline6_four_text_view);
		SpannableString headline6FourTextViewText = new SpannableString(this.getString(R.string.menu_activity_headline6_four_text_view_text));
		headline6FourTextView.setText(headline6FourTextViewText);
		
		// Configure Body 2 component
		body2FourTextView = this.findViewById(R.id.body2_four_text_view);
		SpannableString body2FourTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_four_text_view_text));
		body2FourTextView.setText(body2FourTextViewText);
		
		// Configure Headline 6 component
		headline6FiveTextView = this.findViewById(R.id.headline6_five_text_view);
		SpannableString headline6FiveTextViewText = new SpannableString(this.getString(R.string.menu_activity_headline6_five_text_view_text));
		headline6FiveTextView.setText(headline6FiveTextViewText);
		
		// Configure Body 2 component
		body2FiveTextView = this.findViewById(R.id.body2_five_text_view);
		SpannableString body2FiveTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_five_text_view_text));
		body2FiveTextView.setText(body2FiveTextViewText);
		
		// Configure Body 2 component
		body2SixTextView = this.findViewById(R.id.body2_six_text_view);
		SpannableString body2SixTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_six_text_view_text));
		body2SixTextView.setText(body2SixTextViewText);
		
		// Configure Body 2 component
		body2SevenTextView = this.findViewById(R.id.body2_seven_text_view);
		SpannableString body2SevenTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_seven_text_view_text));
		body2SevenTextView.setText(body2SevenTextViewText);
		
		// Configure Body 2 component
		body2EightTextView = this.findViewById(R.id.body2_eight_text_view);
		SpannableString body2EightTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_eight_text_view_text));
		body2EightTextView.setText(body2EightTextViewText);
		
		// Configure Headline 6 component
		headline6SixTextView = this.findViewById(R.id.headline6_six_text_view);
		SpannableString headline6SixTextViewText = new SpannableString(this.getString(R.string.menu_activity_headline6_six_text_view_text));
		headline6SixTextView.setText(headline6SixTextViewText);
		
		// Configure Body 2 component
		body2NineTextView = this.findViewById(R.id.body2_nine_text_view);
		SpannableString body2NineTextViewText = new SpannableString(this.getString(R.string.menu_activity_body2_nine_text_view_text));
		body2NineTextView.setText(body2NineTextViewText);
	}
}
