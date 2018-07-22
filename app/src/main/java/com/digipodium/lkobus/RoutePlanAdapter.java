package com.digipodium.lkobus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RoutePlanAdapter extends RecyclerView.Adapter<RoutePlanAdapter.RoutePlanHolder> {
    LayoutInflater inflater;
    Context context;

    public RoutePlanAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RoutePlanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.plan_card,parent,false);//load layout itemcard
        RoutePlanHolder holder=new RoutePlanHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RoutePlanHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RoutePlanHolder extends RecyclerView.ViewHolder{

TextView text_route,text_stop;
        public RoutePlanHolder(View itemView) {
            super(itemView);
            text_route=itemView.findViewById(R.id.route_detail);
            text_stop=itemView.findViewById(R.id.stop_number);
        }
    }
}
