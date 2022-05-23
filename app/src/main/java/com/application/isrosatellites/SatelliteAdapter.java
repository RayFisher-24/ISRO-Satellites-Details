package com.application.isrosatellites;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SatelliteAdapter extends RecyclerView.Adapter<SatelliteAdapter.ViewHolder> {

    private ArrayList<Satellites> satelliteArrayList;
    private Context context;

    public SatelliteAdapter(ArrayList<Satellites> satelliteArrayList, Context context) {
        this.satelliteArrayList = satelliteArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.satellite_details, parent, false);
        return new SatelliteAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Satellites satellites = satelliteArrayList.get(position);
        holder.satName.setText(satellites.getSatelliteId());
        holder.satCon.setText(satellites.getSatelliteCountry());
        holder.satDate.setText(satellites.getSatelliteLaunchDate());
        holder.satMass.setText(satellites.getSatelliteMass());
        holder.satLaunc.setText(satellites.getSatelliteLauncher());

    }

    @Override
    public int getItemCount() {
        return satelliteArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView satName, satCon, satDate, satMass, satLaunc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            satName=itemView.findViewById(R.id.idDetailSatName);
            satCon=itemView.findViewById(R.id.idDetailCountry);
            satDate=itemView.findViewById(R.id.idDetailLaunchDate);
            satMass=itemView.findViewById(R.id.idDetailMass);
            satLaunc=itemView.findViewById(R.id.idDetailLauncher);
        }
    }
}
