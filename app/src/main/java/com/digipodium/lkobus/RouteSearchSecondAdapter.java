package com.digipodium.lkobus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RouteSearchSecondAdapter extends RecyclerView.Adapter<RouteSearchSecondAdapter.RouteSearchSecondViewHolder> {
    LayoutInflater inflater;
    Context context;
    public RouteSearchSecondAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RouteSearchSecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.route_card,parent,false);//load layout itemcard
        RouteSearchSecondViewHolder holder=new RouteSearchSecondViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RouteSearchSecondViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RouteSearchSecondViewHolder extends RecyclerView.ViewHolder {
TextView route;

        public RouteSearchSecondViewHolder(View itemView) {
            super(itemView);
            route=itemView.findViewById(R.id.textView);
        }
    }
}
