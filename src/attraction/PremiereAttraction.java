package classes.attraction;

public class PremiereAttraction extends Attraction {

    public PremiereAttraction(String name, String areaName){
        super(name, areaName);
    }

    public PremiereAttraction(String name, String areaName, int waitTime){
        super(name, areaName, waitTime);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("* 注記：当選者専用のアトラクションです。");
    }

}