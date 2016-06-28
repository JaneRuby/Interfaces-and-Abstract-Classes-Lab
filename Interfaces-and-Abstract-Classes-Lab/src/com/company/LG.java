package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */
public class LG extends Remote implements Universal {

    public LG(boolean needsBatteries, boolean supportsUsb, String name) {
        super(needsBatteries, supportsUsb, name);
    }

    @Override

    public void channelUp() {
        System.out.println("LG channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("LG channel down");

    }

    @Override
    public void volumeUp() {
        System.out.println("LG volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("LG volume down");
    }

    @Override
    public void supportsBrands() {

    }
}
