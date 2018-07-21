package com.digipodium.lkobus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class NearByStopAdapter extends RecyclerView.Adapter<NearByStopAdapter.NearByStopHolder>{
    Context context;
    LayoutInflater inflater;
    ArrayList<StationJavaClass> stationList;

    public NearByStopAdapter(Context context,ArrayList<StationJavaClass> stationList) {
        this.stationList = stationList;
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public NearByStopHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.stop_card,parent,false);
        NearByStopHolder holder=new NearByStopHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NearByStopHolder holder, int position) {
    StationJavaClass station=stationList.get(position);
    holder.txtTime.setText(station.time);
    holder.txtStation.setText(station.stationList);
    }

    @Override
    public int getItemCount() {
        return stationList.size();
    }

    class NearByStopHolder extends RecyclerView.ViewHolder{
TextView txtStation,txtTime;
        public NearByStopHolder(View itemView) {
            super(itemView);
            txtStation=itemView.findViewById(R.id.txt_station);
            txtTime=itemView.findViewById(R.id.txt_time);
        }
    }
}
