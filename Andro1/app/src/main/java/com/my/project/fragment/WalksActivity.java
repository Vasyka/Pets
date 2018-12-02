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
import com.my.project.adapter.WalksActivityWalksCardsRecyclerViewAdapter;
import android.view.View;
import android.view.MenuItem;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuInflater;
import com.my.project.R;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;


public class WalksActivity extends Fragment {
	
	public static WalksActivity newInstance() {
	
		WalksActivity fragment = new WalksActivity();
		Bundle arguments = new Bundle();
		fragment.setArguments(arguments);
		return fragment;
	}
	
	private RecyclerView walksCardsRecyclerView;
	protected WalksActivity() {
		super();
		setHasOptionsMenu(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	
		return inflater.inflate(R.layout.walks_activity, container, false);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
	
		inflater.inflate(R.menu.walks_activity_menu, menu);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
	
		super.onViewCreated(view, savedInstanceState);
		init();
	}
	
	public void init() {
	
		// Configure Walks_cards component
		walksCardsRecyclerView = getView().findViewById(R.id.walks_cards_recycler_view);
		walksCardsRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, LinearLayoutManager.VERTICAL, false));
		walksCardsRecyclerView.setAdapter(new WalksActivityWalksCardsRecyclerViewAdapter());
	}
}
