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
public class Beacon {

    //Refers to the diagram of each patrol map
    public String beaconLocation;
    public String missionType;
    public String PatrolMap;

    public Beacon(String location, String missiontpye, String map) {
        beaconLocation = location;
        missionType = missiontpye;
        PatrolMap = map;
    }

}
