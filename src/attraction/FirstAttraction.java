package classes.attraction;
import classes.park.Area;

public class FirstAttraction extends Attraction {

    public FirstAttraction(String name, String areaName, int capacity){
        super(name, areaName, capacity);
    }

    public FirstAttraction(String name, String areaName, int capacity, int waitTime){
        super(name, areaName, capacity, waitTime);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("注記：優先パス対象のアトラクションです");
    }

}