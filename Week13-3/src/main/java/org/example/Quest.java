package org.example;

import java.util.ArrayList;

public class Quest {
    public String questName;
    public Character leader;
    public ArrayList<Character> participants;
    public MiddleEarthMap map;

    public Quest(String questName, Character leader, MiddleEarthMap map) {
        questName = questName;
        leader = leader;
        map = map;
        participants = new ArrayList<Character>();
    }

    public void addParticipant(Character character) {
        participants.add(character);
    }

    public void start() {
        System.out.println("Starting quest: " + questName);
        System.out.println("Leader: " + leader);
        System.out.println("Participants:");
        for (Character participant : participants) {
            System.out.println(participant + ", age: " + participant);
        }
        System.out.println("Map locations:");
        for (String location : map.getLocations()) {
            System.out.println(location);
        }

    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public Character getLeader() {
        return leader;
    }

    public void setLeader(Character leader) {
        this.leader = leader;
    }

    public ArrayList<Character> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Character> participants) {
        this.participants = participants;
    }

    public MiddleEarthMap getMap() {
        return map;
    }

    public void setMap(MiddleEarthMap map) {
        this.map = map;
    }
}
