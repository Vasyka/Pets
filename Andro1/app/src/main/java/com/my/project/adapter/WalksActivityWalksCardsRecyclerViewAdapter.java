/**
 *  Created by Vasyka.
 */

package com.my.project.adapter;

import java.util.*;
import android.view.LayoutInflater;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.support.constraint.ConstraintLayout;
import com.google.android.gms.maps.MapView;
import android.widget.TextView;
import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.text.style.ForegroundColorSpan;
import com.my.project.R;
import android.support.v7.widget.RecyclerView;


public class WalksActivityWalksCardsRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	public static final int WALK_CARD_VIEW_HOLDER_VIEW_TYPE = 1;
	public static final int WALK_CARD2_VIEW_HOLDER_VIEW_TYPE = 2;
	
	public static final List<Integer> MOCK_DATA = Arrays.asList(WALK_CARD_VIEW_HOLDER_VIEW_TYPE, WALK_CARD2_VIEW_HOLDER_VIEW_TYPE, WALK_CARD_VIEW_HOLDER_VIEW_TYPE, WALK_CARD2_VIEW_HOLDER_VIEW_TYPE, WALK_CARD_VIEW_HOLDER_VIEW_TYPE, WALK_CARD2_VIEW_HOLDER_VIEW_TYPE);
	
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
	
		switch (viewType) {
			case WALK_CARD_VIEW_HOLDER_VIEW_TYPE: 
				return new WalkCardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.walk_card_view_holder, parent, false));
			case WALK_CARD2_VIEW_HOLDER_VIEW_TYPE: 
				return new WalkCard2ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.walk_card2_view_holder, parent, false));
		}
		
		throw new RuntimeException("Unsupported view type");
	}
	
	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
	
		// Here you can bind RecyclerView item data.
	}
	
	@Override
	public int getItemViewType(int position) {
	
		return MOCK_DATA.get(position);
	}
	
	@Override
	public int getItemCount() {
	
		return MOCK_DATA.size();
	}
	
	
	public static class WalkCardViewHolder extends RecyclerView.ViewHolder {
		private TextView body2TextView;
		private TextView headline6TextView;
		public WalkCardViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Body 2 component
			body2TextView = itemView.findViewById(R.id.body2_text_view);
			SpannableString body2TextViewText = new SpannableString(itemView.getContext().getString(R.string.walk_card_view_holder_body2_text_view_text));
			body2TextView.setText(body2TextViewText);
			
			// Configure Headline 6 component
			headline6TextView = itemView.findViewById(R.id.headline6_text_view);
			SpannableString headline6TextViewText = new SpannableString(itemView.getContext().getString(R.string.walk_card_view_holder_headline6_text_view_text));
			headline6TextView.setText(headline6TextViewText);
		}
	}
	
	
	public static class WalkCard2ViewHolder extends RecyclerView.ViewHolder {
		private TextView body2TextView;
		private TextView headline6TextView;
		public WalkCard2ViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Body 2 component
			body2TextView = itemView.findViewById(R.id.body2_text_view);
			SpannableString body2TextViewText = new SpannableString(itemView.getContext().getString(R.string.walk_card2_view_holder_body2_text_view_text));
			body2TextView.setText(body2TextViewText);
			
			// Configure Headline 6 component
			headline6TextView = itemView.findViewById(R.id.headline6_text_view);
			SpannableString headline6TextViewText = new SpannableString(itemView.getContext().getString(R.string.walk_card2_view_holder_headline6_text_view_text));
			headline6TextView.setText(headline6TextViewText);
		}
	}
}
