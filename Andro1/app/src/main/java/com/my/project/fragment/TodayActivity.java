/**
 *  Created by Vasyka.
 */

package com.my.project.fragment;

import java.util.*;
import android.view.LayoutInflater;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.view.ViewGroup;
import com.my.project.activity.*;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;
import android.view.Menu;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.MenuItem;
import android.text.style.ForegroundColorSpan;
import android.view.MenuInflater;
import com.my.project.R;
import android.support.v4.app.Fragment;
import android.widget.ImageView;


public class TodayActivity extends Fragment {
	
	public static TodayActivity newInstance() {
	
		TodayActivity fragment = new TodayActivity();
		Bundle arguments = new Bundle();
		fragment.setArguments(arguments);
		return fragment;
	}
	
	private TextView body2TextView;
	private TextView subtitle1TextView;
	private TextView body2TwoTextView;
	private TextView subtitle1TwoTextView;
	private TextView body2ThreeTextView;
	private TextView subtitle1ThreeTextView;
	private TextView body2FourTextView;
	private TextView subtitle1FourTextView;
	private Button locationButton;
	protected TodayActivity() {
		super();
		setHasOptionsMenu(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	
		return inflater.inflate(R.layout.today_activity, container, false);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
	
		inflater.inflate(R.menu.today_activity_menu, menu);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
	
		super.onViewCreated(view, savedInstanceState);
		init();
	}
	
	public void onLocationButtonPressed() {
	
		startLocationActivity();
	}
	
	public void init() {
	
		// Configure Body 2 component
		body2TextView = getView().findViewById(R.id.body2_text_view);
		SpannableString body2TextViewText = new SpannableString(getContext().getString(R.string.today_activity_body2_text_view_text));
		body2TextView.setText(body2TextViewText);
		
		// Configure Subtitle 1 component
		subtitle1TextView = getView().findViewById(R.id.subtitle1_text_view);
		SpannableString subtitle1TextViewText = new SpannableString(getContext().getString(R.string.today_activity_subtitle1_text_view_text));
		subtitle1TextView.setText(subtitle1TextViewText);
		
		// Configure Body 2 component
		body2TwoTextView = getView().findViewById(R.id.body2_two_text_view);
		SpannableString body2TwoTextViewText = new SpannableString(getContext().getString(R.string.today_activity_body2_two_text_view_text));
		body2TwoTextView.setText(body2TwoTextViewText);
		
		// Configure Subtitle 1 component
		subtitle1TwoTextView = getView().findViewById(R.id.subtitle1_two_text_view);
		SpannableString subtitle1TwoTextViewText = new SpannableString(getContext().getString(R.string.today_activity_subtitle1_two_text_view_text));
		subtitle1TwoTextView.setText(subtitle1TwoTextViewText);
		
		// Configure Body 2 component
		body2ThreeTextView = getView().findViewById(R.id.body2_three_text_view);
		SpannableString body2ThreeTextViewText = new SpannableString(getContext().getString(R.string.today_activity_body2_three_text_view_text));
		body2ThreeTextView.setText(body2ThreeTextViewText);
		
		// Configure Subtitle 1 component
		subtitle1ThreeTextView = getView().findViewById(R.id.subtitle1_three_text_view);
		SpannableString subtitle1ThreeTextViewText = new SpannableString(getContext().getString(R.string.today_activity_subtitle1_three_text_view_text));
		subtitle1ThreeTextView.setText(subtitle1ThreeTextViewText);
		
		// Configure Body 2 component
		body2FourTextView = getView().findViewById(R.id.body2_four_text_view);
		SpannableString body2FourTextViewText = new SpannableString(getContext().getString(R.string.today_activity_body2_four_text_view_text));
		body2FourTextView.setText(body2FourTextViewText);
		
		// Configure Subtitle 1 component
		subtitle1FourTextView = getView().findViewById(R.id.subtitle1_four_text_view);
		SpannableString subtitle1FourTextViewText = new SpannableString(getContext().getString(R.string.today_activity_subtitle1_four_text_view_text));
		subtitle1FourTextView.setText(subtitle1FourTextViewText);
		
		// Configure Location component
		locationButton = getView().findViewById(R.id.location_button);
		locationButton.setOnClickListener((view) -> {
	this.onLocationButtonPressed();
});
	}
	
	private void startLocationActivity() {
	
		this.startActivity(LocationActivity.newIntent(getActivity()));
	}
}
