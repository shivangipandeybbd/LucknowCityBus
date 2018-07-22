package com.digipodium.lkobus;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RouteSearchAdapter extends RecyclerView.Adapter<RouteSearchAdapter.RouteSearchHolder> {
    LayoutInflater inflater;
    Context context;

    public RouteSearchAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RouteSearchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.search_card,parent,false);//load layout itemcard
        RouteSearchHolder holder=new RouteSearchHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RouteSearchHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RouteSearchHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tv_search_route;

        public RouteSearchHolder(View itemView) {
            super(itemView);
            tv_search_route=itemView.findViewById(R.id.tv_search);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, ""+tv_search_route.getText(), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(context,Route_search_second.class);
            context.startActivity(intent);
        }
    }
}
