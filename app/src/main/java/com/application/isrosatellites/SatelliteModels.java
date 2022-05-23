package com.application.isrosatellites;

import java.util.ArrayList;

public class SatelliteModels {
    private int totalSatellites;
    private String satellitesStatus;
    private ArrayList<Satellites> satellites;

    public int getTotalSatellites() {
        return totalSatellites;
    }

    public void setTotalSatellites(int totalSatellites) {
        this.totalSatellites = totalSatellites;
    }

    public String getSatellitesStatus() {
        return satellitesStatus;
    }

    public void setSatellitesStatus(String satellitesStatus) {
        this.satellitesStatus = satellitesStatus;
    }

    public ArrayList<Satellites> getSatellites() {
        return satellites;
    }

    public void setSatellites(ArrayList<Satellites> satellites) {
        this.satellites = satellites;
    }

    public SatelliteModels(int totalSatellites, String satellitesStatus, ArrayList<Satellites> satellites) {
        this.totalSatellites = totalSatellites;
        this.satellitesStatus = satellitesStatus;
        this.satellites = satellites;
    }
}
