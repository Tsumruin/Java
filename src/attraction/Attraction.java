package classes.attraction;

public abstract class Attraction{
    /**
     * Attraction class contains basic infomations of attractions
     */

    private String name;
    private String area;
    private int waitTime;

    public Attraction(String name, String area){
        this.name = name;
        this.area = area;
        this.waitTime = 0;
    }

    public Attraction(String name, String area, int waitTime){
        this(name, area);
        this.waitTime = waitTime;
    }

    public String getName(){
        return name;
    }

    public String getArea(){
        return area;
    }

    public int getWaitTime(){
        return  waitTime;
    }

    public void setWaitTime(int waitTime){
        this.waitTime = waitTime;
    }

    public void dispWaitTime(){
        System.out.println("現在の待ち時間: " + waitTime);
    }

    public void printInfo(){
        System.out.println("\n----------------------------------------");
        System.out.println("アトラクション名: " + name);
        System.out.println("エリア名: " + area);
        System.out.println("待ち時間: " + waitTime + "分");
    }

}