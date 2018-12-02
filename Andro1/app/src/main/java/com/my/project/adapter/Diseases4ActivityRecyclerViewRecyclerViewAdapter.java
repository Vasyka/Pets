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


public class Diseases4ActivityRecyclerViewRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	public static final int CARD_VIEW_HOLDER_VIEW_TYPE = 1;
	public static final int CARD2_VIEW_HOLDER_VIEW_TYPE = 2;
	public static final int CARD3_VIEW_HOLDER_VIEW_TYPE = 3;
	
	public static final List<Integer> MOCK_DATA = Arrays.asList(CARD_VIEW_HOLDER_VIEW_TYPE, CARD2_VIEW_HOLDER_VIEW_TYPE, CARD3_VIEW_HOLDER_VIEW_TYPE, CARD_VIEW_HOLDER_VIEW_TYPE, CARD2_VIEW_HOLDER_VIEW_TYPE, CARD3_VIEW_HOLDER_VIEW_TYPE, CARD_VIEW_HOLDER_VIEW_TYPE, CARD2_VIEW_HOLDER_VIEW_TYPE, CARD3_VIEW_HOLDER_VIEW_TYPE);
	
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
	
		switch (viewType) {
			case CARD_VIEW_HOLDER_VIEW_TYPE: 
				return new CardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_holder, parent, false));
			case CARD2_VIEW_HOLDER_VIEW_TYPE: 
				return new Card2ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card2_view_holder, parent, false));
			case CARD3_VIEW_HOLDER_VIEW_TYPE: 
				return new Card3ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card3_view_holder, parent, false));
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
	
	
	public static class CardViewHolder extends RecyclerView.ViewHolder {
		private TextView captionTextView;
		private TextView captionTwoTextView;
		private TextView captionThreeTextView;
		private TextView body2TextView;
		public CardViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Caption component
			captionTextView = itemView.findViewById(R.id.caption_text_view);
			SpannableString captionTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_view_holder_caption_text_view_text));
			captionTextView.setText(captionTextViewText);
			
			// Configure Caption component
			captionTwoTextView = itemView.findViewById(R.id.caption_two_text_view);
			SpannableString captionTwoTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_view_holder_caption_two_text_view_text));
			captionTwoTextView.setText(captionTwoTextViewText);
			
			// Configure Caption component
			captionThreeTextView = itemView.findViewById(R.id.caption_three_text_view);
			SpannableString captionThreeTextViewText = new SpannableString(itemView.getContext().getString(R.string.card_view_holder_caption_three_text_view_text));
			captionThreeTextView.setText(captionThreeTextViewText);
			
			// Configure Body 2 component
			body2TextView = itemView.findViewById(R.id.body2_text_view);
			SpannableString body2TextViewText = new SpannableString(itemView.getContext().getString(R.string.card_view_holder_body2_text_view_text));
			body2TextView.setText(body2TextViewText);
		}
	}
	
	
	public static class Card2ViewHolder extends RecyclerView.ViewHolder {
		private TextView captionTextView;
		private TextView captionTwoTextView;
		private TextView captionThreeTextView;
		private TextView body2TextView;
		public Card2ViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Caption component
			captionTextView = itemView.findViewById(R.id.caption_text_view);
			SpannableString captionTextViewText = new SpannableString(itemView.getContext().getString(R.string.card2_view_holder_caption_text_view_text));
			captionTextView.setText(captionTextViewText);
			
			// Configure Caption component
			captionTwoTextView = itemView.findViewById(R.id.caption_two_text_view);
			SpannableString captionTwoTextViewText = new SpannableString(itemView.getContext().getString(R.string.card2_view_holder_caption_two_text_view_text));
			captionTwoTextView.setText(captionTwoTextViewText);
			
			// Configure Caption component
			captionThreeTextView = itemView.findViewById(R.id.caption_three_text_view);
			SpannableString captionThreeTextViewText = new SpannableString(itemView.getContext().getString(R.string.card2_view_holder_caption_three_text_view_text));
			captionThreeTextView.setText(captionThreeTextViewText);
			
			// Configure Body 2 component
			body2TextView = itemView.findViewById(R.id.body2_text_view);
			SpannableString body2TextViewText = new SpannableString(itemView.getContext().getString(R.string.card2_view_holder_body2_text_view_text));
			body2TextView.setText(body2TextViewText);
		}
	}
	
	
	public static class Card3ViewHolder extends RecyclerView.ViewHolder {
		private TextView captionTextView;
		private TextView captionTwoTextView;
		private TextView captionThreeTextView;
		private TextView body2TextView;
		public Card3ViewHolder(View itemView) {
			super(itemView);
			init();
		}
		
		public void init() {
		
			// Configure Caption component
			captionTextView = itemView.findViewById(R.id.caption_text_view);
			SpannableString captionTextViewText = new SpannableString(itemView.getContext().getString(R.string.card3_view_holder_caption_text_view_text));
			captionTextView.setText(captionTextViewText);
			
			// Configure Caption component
			captionTwoTextView = itemView.findViewById(R.id.caption_two_text_view);
			SpannableString captionTwoTextViewText = new SpannableString(itemView.getContext().getString(R.string.card3_view_holder_caption_two_text_view_text));
			captionTwoTextView.setText(captionTwoTextViewText);
			
			// Configure Caption component
			captionThreeTextView = itemView.findViewById(R.id.caption_three_text_view);
			SpannableString captionThreeTextViewText = new SpannableString(itemView.getContext().getString(R.string.card3_view_holder_caption_three_text_view_text));
			captionThreeTextView.setText(captionThreeTextViewText);
			
			// Configure Body 2 component
			body2TextView = itemView.findViewById(R.id.body2_text_view);
			SpannableString body2TextViewText = new SpannableString(itemView.getContext().getString(R.string.card3_view_holder_body2_text_view_text));
			body2TextView.setText(body2TextViewText);
		}
	}
}
