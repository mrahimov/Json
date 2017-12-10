package controller;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.jsoninclass.R;
import view.MessageViewHolder;

/**
 * Created by muridjonrahimov on 12/10/17.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder>{

    private String[] mess;

    public MessageAdapter(String[] mess) {
        this.mess = mess;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View V= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);

        return new MessageViewHolder(V);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {

        String data = mess[position];
        holder.onBind(data);
    }

    @Override
    public int getItemCount() {
        return mess.length;
    }
}
