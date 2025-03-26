package FactoryDesign.phone;

import FactoryDesign.OS;

public class FactoryOS
{
    public OS getInstance(String operatingSystem)
    {
         if(operatingSystem.equalsIgnoreCase("Open"))
         {
             return new Android();
         } else if (operatingSystem.equalsIgnoreCase("Closed  ")) {
             return new Ios();
         }
         else {
             return new Windows();
         }
    }
}
