package com.company;

/* Create an abstract class called Remote.

Give the abstract class the property needsBatteries and supportsUsb.

Create a constructor that accepts parameters to set the properties you just created.

Create getters and setters for the properties.

Declare the following abstract methods, channelUp, channelDown, volumeUp, volumeDown; they all take no parameters and
return nothing.

Implement powerButtonPressed that does not take any parameters and just prints out that the power button was pressed.

Implement numberButtonPressed, that takes in an int parameter and appends/concatenates the int parameter to the String
"Changing channel to " then prints it out to the terminal.


Create three concrete classes that extends the abstract class Remote, name the concrete class one of your favorite brands.
(Samsung, LG, Panasonic, Sony, etc.)

Implement the methods you declared in the Remote abstract class which are required to be implemented in each concrete class.

Make sure the implementations output something different for each concrete class.

Implement the WaterProof, Rechargeable, and Universal interfaces.

Implement the methods defined by those interfaces. You can choose what to do, but at the minimum print something out to the terminal.

*/

/**
 * Created by janerubygrissom on 6/28/16.
 */

public abstract class Remote {
    boolean mNeedsBatteries;
    boolean mSupportsUsb;
    String mName;
    String mPassCode;

    public Remote(boolean needsBatteries, boolean supportsUsb, String name) {
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
        mName = name;
    }

    abstract void channelUp();

    abstract void channelDown();

    abstract void volumeUp();

    abstract void volumeDown();
    public String getName() {
        return mName;
    }

    public void powerButtonPressed() {
        System.out.println("The power button was pressed and the television was turned off.");
    }

    public void setName(String name) {
        mName = name;
    }

    void numberButtonPressed(int channel) {
        System.out.println("Changing channel to " + channel + ".");
    }

    public boolean isNeedsBatteries() {
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public boolean isSupportsUSB() {
        return mSupportsUsb;
    }

    public void setSupportsUSB(boolean supportsUSB) {
        mSupportsUsb = supportsUSB;
    }


     public boolean startScan(String scannedInput) {

        return scannedInput.equals(mPassCode);
            }

    public void setPassCode(String passCode) {
        mPassCode = passCode;
    }

    public String getPassCode() {
        return mPassCode;
    }

    public boolean isWaterProof() {
     return true;
  }
}
