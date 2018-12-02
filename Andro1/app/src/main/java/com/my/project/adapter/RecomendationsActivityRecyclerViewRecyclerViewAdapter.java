/**
 *  Created by Vasyka.
 */

package com.my.project.adapter;

import android.widget.ImageView;
import java.util.*;
import android.view.LayoutInflater;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;
import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.text.style.ForegroundColorSpan;
import com.my.project.R;
import android.support.v7.widget.RecyclerView;


public class RecomendationsActivityRecyclerViewRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	public static final int CARD_BIG_VIEW_HOLDER_VIEW_TYPE = 1;
	public static final int CARD_SMALL_VIEW_HOLDER_VIEW_TYPE = 2;
	public static final int CARD_SMALL2_VIEW_HOLDER_VIEW_TYPE = 3;
	
	public static final List<Integer> MOCK_DATA = Arrays.asList(CARD_BIG_VIEW_HOLDER_VIEW_TYPE, CARD_SMALL_VIEW_HOLDER_VIEW_TYPE, CARD_SMALL2_VIEW_HOLDER_VIEW_TYPE, CARD_BIG_VIEW_HOLDER_VIEW_TYPE, CARD_SMALL_VIEW_HOLDER_VIEW_TYPE, CARD_SMALL2_VIEW_HOLDER_VIEW_TYPE, CARD_BIG_VIEW_HOLDER_VIEW_TYPE, CARD_SMALL_VIEW_HOLDER_VIEW_TYPE, CARD_SMALL2_VIEW_HOLDER_VIEW_TYPE);
	
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
	
		switch (viewType) {
			case CARD_BIG_VIEW_HOLDER_VIEW_TYPE: 
				return new CardBigViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_big_view_holder, parent, false));
			case CARD_SMALL_VIEW_HOLDER_VIEW_TYPE: 
				return new CardSmallViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_small_view_holder, parent, false));
			case CARD_SMALL2_VIEW_HOLDER_VIEW_TYPE: 
				return new CardSmall2ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_small2_view_holder, parent, false));
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
	
	
	public static class CardBigViewHolder extends RecyclerView.ViewHolder {
		private TextView headline6TextView;
		private TextView overlineTextView;
		public CardBigViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Headline 6 component
			headline6TextView = itemView.findViewById(R.id.headline6_text_view);
			SpannableString headline6TextViewText = new SpannableString(itemView.getContext().getString(R.string.card_big_view_holder_headline6_text_view_text));
			headline6TextView.setText(headline6TextViewText);
			
			// Configure Overline component
			overlineTextView = itemView.findViewById(R.id.overline_text_view);
			SpannableString overlineTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_big_view_holder_overline_text_view_text));
			overlineTextView.setText(overlineTextViewText);
		}
	}
	
	
	public static class CardSmallViewHolder extends RecyclerView.ViewHolder {
		private TextView captionTextView;
		private TextView captionTwoTextView;
		private TextView headline6TextView;
		public CardSmallViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Caption component
			captionTextView = itemView.findViewById(R.id.caption_text_view);
			SpannableString captionTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_small_view_holder_caption_text_view_text));
			captionTextView.setText(captionTextViewText);
			
			// Configure Caption component
			captionTwoTextView = itemView.findViewById(R.id.caption_two_text_view);
			SpannableString captionTwoTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_small_view_holder_caption_two_text_view_text));
			captionTwoTextView.setText(captionTwoTextViewText);
			
			// Configure Headline 6 component
			headline6TextView = itemView.findViewById(R.id.headline6_text_view);
			SpannableString headline6TextViewText = new SpannableString(itemView.getContext().getString(R.string.card_small_view_holder_headline6_text_view_text));
			headline6TextView.setText(headline6TextViewText);
		}
	}
	
	
	public static class CardSmall2ViewHolder extends RecyclerView.ViewHolder {
		private TextView captionTextView;
		private TextView captionTwoTextView;
		private TextView headline6TextView;
		public CardSmall2ViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Caption component
			captionTextView = itemView.findViewById(R.id.caption_text_view);
			SpannableString captionTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_small2_view_holder_caption_text_view_text));
			captionTextView.setText(captionTextViewText);
			
			// Configure Caption component
			captionTwoTextView = itemView.findViewById(R.id.caption_two_text_view);
			SpannableString captionTwoTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_small2_view_holder_caption_two_text_view_text));
			captionTwoTextView.setText(captionTwoTextViewText);
			
			// Configure Headline 6 component
			headline6TextView = itemView.findViewById(R.id.headline6_text_view);
			SpannableString headline6TextViewText = new SpannableString(itemView.getContext().getString(R.string.card_small2_view_holder_headline6_text_view_text));
			headline6TextView.setText(headline6TextViewText);
		}
	}
}
