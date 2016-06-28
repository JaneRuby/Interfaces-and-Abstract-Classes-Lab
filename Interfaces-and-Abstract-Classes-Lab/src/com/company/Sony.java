package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */
public class Sony extends Remote implements Waterproof {
    public Sony(boolean needsBatteries, boolean supportsUsb, String name) {

        super(needsBatteries, supportsUsb, name);
    }


    public void channelUp() {
        System.out.println("Sony channel up");
    }


    public void channelDown() {
        System.out.println("Sony channel down");
    }


    public void volumeUp() {
        System.out.println("Sony volume up");
    }

    public void volumeDown() {
        System.out.println("Sony volume down");
    }


    public boolean isWaterProof() {
        return false;
    }
}