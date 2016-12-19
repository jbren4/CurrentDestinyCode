/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missions;

/**
 *
 * @author Joseph
 */
public class ScanObject extends Mission {

    public ScanObject(String missionName, String patrol, int missionTime, String beaconLocation, int experienceGain, int vanRep) {
        missionType = missionName;
        patrolMap = patrol;
        timeToComplete = missionTime;
        beacon = beaconLocation;
        expGain = experienceGain;
        vanguardRepGain = vanRep;

    }

    public ScanObject(String missionName, String patrol, int missionTime, String beaconLocation, int experienceGain, int vanRep, int factionRepGain) {
        missionType = missionName;
        patrolMap = patrol;
        timeToComplete = missionTime;
        beacon = beaconLocation;
        expGain = experienceGain;
        vanguardRepGain = vanRep;
        factionRep = factionRepGain;
    }

    @Override
    public String getMissionType() {
        return missionType;
    }

    @Override
    public String getPatrolMap() {
        return patrolMap;
    }

    @Override
    public int getMissionTime() {
        return timeToComplete;
    }

    @Override
    public String getBeacon() {
        return beacon;
    }

    @Override
    public int getExpGain() {
        return expGain;
    }

    @Override
    public int vanguardRepGain() {
        return vanguardRepGain;
    }

    @Override
    public int factionRep() {
        return factionRep;
    }

}
