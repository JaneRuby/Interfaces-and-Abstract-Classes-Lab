package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */
public class Samsung extends Remote implements Rechargeable{

    public Samsung(boolean needsBatteries, boolean supportsUsb, String name) {

        super(needsBatteries, supportsUsb, name);
    }

    @Override
    public void channelUp() {
               System.out.println("Samsung channel up");
         }

       @Override
      public void channelDown() {
         System.out.println("Samsung channel down");
     }
              @Override
      public void volumeUp() {
           System.out.println("Samsung volume up");
           }

    @Override
     public void volumeDown() {
             System.out.println("Samsung volume down");
           }

    @Override
    public boolean isRechargeable() {
        return false;
    }
}