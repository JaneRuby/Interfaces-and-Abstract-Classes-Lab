package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static int getRandomChannel() {
        Random r = new SecureRandom();
        return Math.abs(r.nextInt(50));

    }


    public static void main(String[] args) {
        List<Remote> remotes = new ArrayList<>();
        boolean add = remotes.add(new Sony(true, true, "SONY"));
        remotes.add(new Samsung(false, true, "Samsung"));
        remotes.add(new LG(true, false, "LG"));

        String[] passCodes = {"abstract", "implements", "extends"};

        int i = 0;

        for (Remote remote : remotes) {
            remote.setPassCode(passCodes[getRandomChannel() % 3]);

        }

        i = 0;

        for (Remote remote : remotes) {
            String code = passCodes[i % 3];
            System.out.println("\nIteration #" + ++i + ": input code: " + code + " - Expected code: " + remote.getPassCode());

            if (remote.startScan(code)) {
                remote.numberButtonPressed(getRandomChannel());
                remote.channelUp();
                remote.channelDown();
                remote.volumeUp();
                remote.volumeDown();

            } else {
                System.out.println("Wrong input, cannot use remote.\n");

            }

        }

    }


}
