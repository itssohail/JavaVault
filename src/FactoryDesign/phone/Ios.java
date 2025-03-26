package FactoryDesign.phone;

import FactoryDesign.OS;

public class Ios implements OS
{

    @Override
    public void specs() {
        System.out.println("You are currently in IOS-Apple. You are most secure.");
    }
}
