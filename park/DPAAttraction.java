package park;
public class DPAAttraction extends Attraction {

    public DPAAttraction(String name, String areaName){
        super(name, areaName);
    }

    public DPAAttraction(String name, String areaName, int waitTime){
        super(name, areaName, waitTime);
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