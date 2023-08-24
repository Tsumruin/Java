package classes.attraction;
import classes.park.Area;

public class PriorityAttraction extends Attraction {

    public PriorityAttraction(String name, String areaName, int capacity){
        super(name, areaName, capacity);
    }

    public PriorityAttraction(String name, String areaName, int capacity, int waitTime){
        super(name, areaName, capacity, waitTime);
    }

    public void dispPriority(){
        System.out.println("プライオリティパス対象アトラクションです");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        dispPriority();
    }

}