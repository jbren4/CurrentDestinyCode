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
public abstract class Mission {

    public String missionType;
    public String patrolMap;
    public int timeToComplete;
    public String beacon;
    public int expGain;
    public int vanguardRepGain;
    public int factionRep;

    public abstract String getMissionType();

    public abstract String getPatrolMap();

    public abstract int getMissionTime();

    public abstract String getBeacon();

    public abstract int getExpGain();

    public abstract int vanguardRepGain();

    public abstract int factionRep();

}
