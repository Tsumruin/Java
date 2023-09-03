package classes.attraction;

public class NormalAttraction extends Attraction {

    public NormalAttraction(String name, String areaName, int capacity){
        super(name, areaName, capacity);
    }

    public NormalAttraction(String name, String areaName, int capacity, int waitTime){
        super(name, areaName, capacity, waitTime);
    }


}