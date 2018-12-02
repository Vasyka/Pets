/**
 *  Created by Vasyka.
 */

package com.my.project.fragment;

import android.support.v7.widget.RecyclerView;
import java.util.*;
import android.view.LayoutInflater;
import android.support.v7.widget.Toolbar;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import com.my.project.activity.*;
import com.my.project.adapter.Diseases4ActivityRecyclerViewRecyclerViewAdapter;
import android.widget.TextView;
import android.view.Menu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuInflater;
import com.my.project.R;
import android.support.v4.app.Fragment;
import android.widget.ImageView;


public class Diseases4Activity extends Fragment {
	
	public static Diseases4Activity newInstance() {
	
		Diseases4Activity fragment = new Diseases4Activity();
		Bundle arguments = new Bundle();
		fragment.setArguments(arguments);
		return fragment;
	}
	
	private RecyclerView recyclerViewRecyclerView;
	protected Diseases4Activity() {
		super();
		setHasOptionsMenu(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	
		return inflater.inflate(R.layout.diseases4_activity, container, false);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
	
		inflater.inflate(R.menu.diseases4_activity_menu, menu);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
	
		super.onViewCreated(view, savedInstanceState);
		init();
	}
	
	public void init() {
	
		// Configure Recycler View component
		recyclerViewRecyclerView = getView().findViewById(R.id.recycler_view_recycler_view);
		recyclerViewRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
		recyclerViewRecyclerView.setAdapter(new Diseases4ActivityRecyclerViewRecyclerViewAdapter());
	}
}
