package FactoryDesign.phone;

import FactoryDesign.OS;

public class Android implements OS {

    public void specs() {
        System.out.println("You are currently in Android OS. You are most compatable.");
    }
}
