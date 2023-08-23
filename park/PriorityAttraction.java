package park;
public class PriorityAttraction extends Attraction {

    public PriorityAttraction(String name, String areaName){
        super(name, areaName);
    }

    public PriorityAttraction(String name, String areaName, int waitTime){
        super(name, areaName, waitTime);
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