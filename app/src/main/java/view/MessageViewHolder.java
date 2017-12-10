package view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.jsoninclass.R;

/**
 * Created by muridjonrahimov on 12/10/17.
 */

public class MessageViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    public MessageViewHolder(View itemView) {
        super(itemView);
        textView= itemView.findViewById(R.id.messege_text_view);
    }
    public void onBind(String data){
        textView.setText(data);
    }
}
