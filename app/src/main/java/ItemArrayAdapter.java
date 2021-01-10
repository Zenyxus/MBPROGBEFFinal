package com.example.binusezyfoody;


import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;


public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.OrderViewHolder> {

    int listItemLayout;
    ArrayList<Orders> orderlists;

    public ItemArrayAdapter(ArrayList<Orders> orderlists) {
        this.orderlists = orderlists;
    }


    @Override
    public OrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rvlayout, parent, false);
        return new OrderViewHolder(view);
    }
@Override
    public void onBindViewHolder(OrderViewHolder holder, int pos){
        holder.itemnameview.setText(orderlists.get(pos).getName());
        holder.itemqtyview.setText(orderlists.get(pos).getqty());
        holder.itempriceview.setText(orderlists.get(pos).getprice());

    }

    public int getItemCount() {
        return (orderlists != null) ? orderlists.size() : 0;
    }
    public class OrderViewHolder extends RecyclerView.ViewHolder {
    TextView itemnameview, itempriceview, itemqtyview;
    public OrderViewHolder(View v){
        super(v);
        itemnameview = (TextView) v.findViewById(R.id.rvtextitemname);
        itemqtyview = (TextView) v.findViewById(R.id.rvtextitemqty);
        itempriceview=(TextView) v.findViewById(R.id.rvtextitemprice);


    }
    }
}