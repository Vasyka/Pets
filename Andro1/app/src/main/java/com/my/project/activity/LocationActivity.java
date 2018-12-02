/**
 *  Created by Vasyka.
 */

package com.my.project.activity;

import android.view.View;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import com.my.project.R;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.content.Context;
import android.view.MenuItem;
import android.view.MenuInflater;
import com.google.android.gms.maps.MapView;


public class LocationActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, LocationActivity.class);
	}
	
	private Toolbar toolbar;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.location_activity);
		this.init();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	
		getMenuInflater().inflate(R.menu.location_activity_menu, menu);
		return true;
	}
	
	private void init() {
	
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
