package classes.attraction;
import classes.park.Area;

public class DPAAttraction extends Attraction {

    public DPAAttraction(String name, String areaName, int capacity){
        super(name, areaName, capacity);
    }

    public DPAAttraction(String name, String areaName, int capacity, int waitTime){
        super(name, areaName, capacity, waitTime);
    }

    public void dispDPA(){
        System.out.println("DPA対象アトラクションです");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        dispDPA();
    }

}