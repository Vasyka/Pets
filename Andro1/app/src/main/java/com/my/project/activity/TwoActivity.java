/**
 *  Created by Vasyka.
 */

package com.my.project.activity;

import android.content.Context;
import android.support.v4.view.ViewPager;
import com.my.project.fragment.WalksActivity;
import com.my.project.fragment.Diseases4Activity;
import android.support.v7.widget.Toolbar;
import com.my.project.fragment.StatisticsActivity;
import com.my.project.fragment.TodayActivity;
import java.util.List;
import com.my.project.adapter.TwoActivityPagerAdapter;
import com.my.project.fragment.RecomendationsActivity;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import java.util.Arrays;
import com.my.project.R;
import android.support.v4.app.Fragment;


public class TwoActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, TwoActivity.class);
	}
	
	private BottomNavigationView bottomNavigationBar;
	private Toolbar toolbar;
	private ViewPager viewPager;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.two_activity);
		init();
	}
	
	public void init() {
	
		// Configure Tab Bar #8 component
		bottomNavigationBar = this.findViewById(R.id.bottom_navigation_bar);
		
		// Configure Navigation Bar #1 component
		toolbar = this.findViewById(R.id.toolbar);
		
		// Configure View Pager
		viewPager = findViewById(R.id.view_pager);
		
		// Configure View Pager Adapter
		List<Fragment> fragments = Arrays.asList(TodayActivity.newInstance(), WalksActivity.newInstance(), StatisticsActivity.newInstance(), Diseases4Activity.newInstance(), RecomendationsActivity.newInstance());
		viewPager.setAdapter(new TwoActivityPagerAdapter(getSupportFragmentManager(), fragments));
		bottomNavigationBar.setOnNavigationItemSelectedListener((menuItem) -> {
	onTabSelected(menuItem);
	return true;
});
		
		setupToolbar();
	}
	
	private void setupToolbar() {
	
		setSupportActionBar(toolbar);
		
		// Additional Toolbar setup code can go here.
	}
	
	public void onTabSelected(MenuItem menuItem) {
	
		switch (menuItem.getItemId()) {
			case R.id.today_activity_menu_item: 
				viewPager.setCurrentItem(0, true);
				break;
			case R.id.walks_activity_menu_item: 
				viewPager.setCurrentItem(1, true);
				break;
			case R.id.statistics_activity_menu_item: 
				viewPager.setCurrentItem(2, true);
				break;
			case R.id.diseases4_activity_menu_item: 
				viewPager.setCurrentItem(3, true);
				break;
			case R.id.recomendations_activity_menu_item: 
				viewPager.setCurrentItem(4, true);
				break;
		}
	}
}
