package com.example.mega2.recycler_exp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mega2 on 2/14/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Recyclerviewholder> {

    String[] hello,user;

    public RecyclerAdapter(String[] hello,String[] user)
    {
        this.hello=hello;
        this.user=user;
    }
    @Override
    public Recyclerviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        Recyclerviewholder recyclerviewholder=new Recyclerviewholder(view);
        return recyclerviewholder;
    }

    @Override
    public void onBindViewHolder(Recyclerviewholder holder, int position) {
        holder.tx_hello.setText(hello[position]);
        holder.tx_user.setText(user[position]);

    }

    @Override
    public int getItemCount() {
        return user.length;
    }

    public static class Recyclerviewholder extends RecyclerView.ViewHolder
    {
        TextView tx_user,tx_hello;
        public Recyclerviewholder(View view)
        {

            super(view);
            tx_hello =(TextView) view.findViewById(R.id.textView1);
            tx_user =(TextView) view.findViewById(R.id.textView2);

        }
    }
}
