package com.example.guest.mymessenger.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.guest.mymessenger.R;
import com.example.guest.mymessenger.models.Message;

public class FirebaseChatViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    View mView;
    Context mContext;

    public FirebaseChatViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
    }

    public void bindMessage(Message message){
        TextView mUsernameTextView = (TextView) mView.findViewById(R.id.userName);
        TextView mDateTexView = (TextView) mView.findViewById(R.id.date);
        TextView mMessageBodyTextView = (TextView) mView.findViewById(R.id.messageBody);

        mUsernameTextView.setText(message.getUser());
        //TODO format date
        mDateTexView.setText(message.getDate() + "");
        mMessageBodyTextView.setText(message.getBody());
    }

    @Override
    public void onClick(View v) {

    }
}
