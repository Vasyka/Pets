/**
 *  Created by Vasyka.
 */

package com.my.project.fragment;

import java.util.*;
import android.view.LayoutInflater;
import android.support.v7.widget.Toolbar;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import com.my.project.activity.*;
import android.support.v7.widget.GridLayoutManager;
import android.view.Menu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuInflater;
import com.my.project.R;
import android.support.v4.app.Fragment;
import com.my.project.adapter.RecomendationsActivityRecyclerViewRecyclerViewAdapter;
import android.support.v7.widget.RecyclerView;


public class RecomendationsActivity extends Fragment {
	
	public static RecomendationsActivity newInstance() {
	
		RecomendationsActivity fragment = new RecomendationsActivity();
		Bundle arguments = new Bundle();
		fragment.setArguments(arguments);
		return fragment;
	}
	
	private RecyclerView recyclerViewRecyclerView;
	protected RecomendationsActivity() {
		super();
		setHasOptionsMenu(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	
		return inflater.inflate(R.layout.recomendations_activity, container, false);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
	
		inflater.inflate(R.menu.recomendations_activity_menu, menu);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
	
		super.onViewCreated(view, savedInstanceState);
		init();
	}
	
	public void init() {
	
		// Configure Recycler View component
		recyclerViewRecyclerView = getView().findViewById(R.id.recycler_view_recycler_view);
		recyclerViewRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1, LinearLayoutManager.VERTICAL, false));
		recyclerViewRecyclerView.setAdapter(new RecomendationsActivityRecyclerViewRecyclerViewAdapter());
	}
}
