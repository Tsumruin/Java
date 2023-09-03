package classes.attraction;

public class FirstAttraction extends Attraction {

    private int ticketNum = 100;

    public FirstAttraction(String name, String areaName){
        super(name, areaName);
    }

    public FirstAttraction(String name, String areaName, int waitTime){
        super(name, areaName, waitTime);
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void publishTicket() {
        ticketNum--;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("* 注記：優先パス対象のアトラクションです");
    }

}