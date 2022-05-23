package com.application.isrosatellites;

public class Satellites {
    private String satelliteId;
    private String satelliteCountry;
    private String satelliteLaunchDate;
    private String satelliteMass;
    private String satelliteLauncher;

    public String getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
    }

    public String getSatelliteCountry() {
        return satelliteCountry;
    }

    public void setSatelliteCountry(String satelliteCountry) {
        this.satelliteCountry = satelliteCountry;
    }

    public String getSatelliteLaunchDate() {
        return satelliteLaunchDate;
    }

    public void setSatelliteLaunchDate(String satelliteLaunchDate) {
        this.satelliteLaunchDate = satelliteLaunchDate;
    }

    public String getSatelliteMass() {
        return satelliteMass;
    }

    public void setSatelliteMass(String satelliteMass) {
        this.satelliteMass = satelliteMass;
    }

    public String getSatelliteLauncher() {
        return satelliteLauncher;
    }

    public void setSatelliteLauncher(String satelliteLauncher) {
        this.satelliteLauncher = satelliteLauncher;
    }

    public Satellites(String satelliteId, String satelliteCountry,
                      String satelliteLaunchDate, String satelliteMass, String satelliteLauncher) {
        this.satelliteId = satelliteId;
        this.satelliteCountry = satelliteCountry;
        this.satelliteLaunchDate = satelliteLaunchDate;
        this.satelliteMass = satelliteMass;
        this.satelliteLauncher = satelliteLauncher;
    }
}
