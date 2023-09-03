package classes.attraction;

public abstract class Attraction{
    /**
     * Attraction class contains basic infomations of attractions
     */

    private String name;
    private String area;
    private int capacity;
    private int waitTime;

    public Attraction(String name, String areass, int capacity){
        this.name = name;
        this.area = area;
        this.capacity = capacity;
        this.waitTime = 0;
    }

    public Attraction(String name, String area, int capacity, int waitTime){
        this(name, area, capacity);
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
        System.out.println("アトラクション名： " + name);
    }

}