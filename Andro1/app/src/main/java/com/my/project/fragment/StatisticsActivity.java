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
import android.view.View;
import android.view.MenuItem;
import android.text.style.ForegroundColorSpan;
import android.view.MenuInflater;
import com.my.project.R;
import android.support.v4.app.Fragment;
import android.widget.ImageView;


public class StatisticsActivity extends Fragment {
	
	public static StatisticsActivity newInstance() {
	
		StatisticsActivity fragment = new StatisticsActivity();
		Bundle arguments = new Bundle();
		fragment.setArguments(arguments);
		return fragment;
	}
	
	private TextView body2TextView;
	private TextView body2TwoTextView;
	private TextView body2ThreeTextView;
	private TextView overlineTextView;
	private TextView body2FourTextView;
	private TextView body2FiveTextView;
	private TextView overlineTwoTextView;
	private TextView body2SixTextView;
	private TextView body2SevenTextView;
	protected StatisticsActivity() {
		super();
		setHasOptionsMenu(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	
		return inflater.inflate(R.layout.statistics_activity, container, false);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
	
		inflater.inflate(R.menu.statistics_activity_menu, menu);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
	
		super.onViewCreated(view, savedInstanceState);
		init();
	}
	
	public void init() {
	
		// Configure Body 2 component
		body2TextView = getView().findViewById(R.id.body2_text_view);
		SpannableString body2TextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_body2_text_view_text));
		body2TextView.setText(body2TextViewText);
		
		// Configure Body 2 component
		body2TwoTextView = getView().findViewById(R.id.body2_two_text_view);
		SpannableString body2TwoTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_body2_two_text_view_text));
		body2TwoTextView.setText(body2TwoTextViewText);
		
		// Configure Body 2 component
		body2ThreeTextView = getView().findViewById(R.id.body2_three_text_view);
		SpannableString body2ThreeTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_body2_three_text_view_text));
		body2ThreeTextView.setText(body2ThreeTextViewText);
		
		// Configure Overline component
		overlineTextView = getView().findViewById(R.id.overline_text_view);
		SpannableString overlineTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_overline_text_view_text));
		overlineTextView.setText(overlineTextViewText);
		
		// Configure Body 2 component
		body2FourTextView = getView().findViewById(R.id.body2_four_text_view);
		SpannableString body2FourTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_body2_four_text_view_text));
		body2FourTextView.setText(body2FourTextViewText);
		
		// Configure Body 2 component
		body2FiveTextView = getView().findViewById(R.id.body2_five_text_view);
		SpannableString body2FiveTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_body2_five_text_view_text));
		body2FiveTextView.setText(body2FiveTextViewText);
		
		// Configure Overline component
		overlineTwoTextView = getView().findViewById(R.id.overline_two_text_view);
		SpannableString overlineTwoTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_overline_two_text_view_text));
		overlineTwoTextView.setText(overlineTwoTextViewText);
		
		// Configure Body 2 component
		body2SixTextView = getView().findViewById(R.id.body2_six_text_view);
		SpannableString body2SixTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_body2_six_text_view_text));
		body2SixTextView.setText(body2SixTextViewText);
		
		// Configure Body 2 component
		body2SevenTextView = getView().findViewById(R.id.body2_seven_text_view);
		SpannableString body2SevenTextViewText = new SpannableString(getContext().getString(R.string.statistics_activity_body2_seven_text_view_text));
		body2SevenTextView.setText(body2SevenTextViewText);
	}
}
