package classes.attraction;

public class PremiereAttraction extends Attraction {

    public PremiereAttraction(String name, String areaName, int capacity){
        super(name, areaName, capacity);
    }

    public PremiereAttraction(String name, String areaName, int capacity, int waitTime){
        super(name, areaName, capacity, waitTime);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("注記：プレミア会員専用のアトラクションです。");
    }

}