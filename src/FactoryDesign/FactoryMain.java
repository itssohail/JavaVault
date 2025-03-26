package FactoryDesign;

import FactoryDesign.phone.Android;
import FactoryDesign.phone.FactoryOS;
import FactoryDesign.phone.Ios;

public class FactoryMain
{

    //This is not hiding.

//    public static void main(String[] args) {
//        OS obj = new Android();
//        obj.specs();
//
//        OS obj1 = new Ios();
//        obj1.specs();
//    }

    public static void main(String[] args) {
        FactoryOS operatingSystem = new FactoryOS();
       OS obj = operatingSystem.getInstance("Android");
       obj.specs();
    }
}
