package com.eldritchmod.entity.ai;

import java.util.ArrayList;

public interface IEntityPlayerCommunicator {
    //Waypoint messages
    public String getInitiateMessage();
    public String getDefeatedMessage();
    public String getHalfHealthMessage();
    public String getNearDeathMessage();
    //Combat messages
    public String getAttackMissMessage();
    public String getBuffMessage();
    public String getHealMessage();
    public String getConfusedMessage();
    public String getEnragedMessage();
    //General messages
    public ArrayList<String> getMiscMessages();
}