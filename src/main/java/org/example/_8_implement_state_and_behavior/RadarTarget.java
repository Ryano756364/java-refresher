package org.example._8_implement_state_and_behavior;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RadarTarget {
    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private String model;

    //Using this call sign to remove the ambiguity of field shadowing
    public RadarTarget(String callSign, int flightLevel, String model) {
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.requiredFlightLevel = flightLevel;
        this.model = model;
    }

    public String getLabel(){  //can be called by every other class in our project
        StringBuilder sb = new StringBuilder();

        sb.append(this.callSign);
        sb.append(System.lineSeparator());
        sb.append(this.flightLevel)
                .append(this.getClimbDescendIndicator())
                .append(this.requiredFlightLevel);
        sb.append(System.lineSeparator());
        sb.append(model);

        return sb.toString();
    }

    public void changeAltitude(int newFl) {  //new flight level
        System.out.println(this.callSign + " change altitude " + newFl);
        System.out.println();

        this.requiredFlightLevel = newFl;

        // Simulate long-running operation
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(() -> {
            try {
                Thread.sleep((long)(Math.random() * 5 * 1000));  //here we are waiting a random amount of time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.flightLevel = requiredFlightLevel;
        });
    }

    //arrows done mainly for pilot ease of reading
    private String getClimbDescendIndicator(){
        if(this.requiredFlightLevel > this.flightLevel){
            return "▲";
        }
        if(this.requiredFlightLevel < this.flightLevel){
            return "▼";
        }
        return "=";
    }
}