package classes.attraction;
import classes.park.Area;

public class Attraction{
    /**
     * Attraction class contains basic infomations of attractions
     */

    private String name;
    private String area;
    private int capacity;
    private int waitTime;

    public Attraction(String name, String areaName, int capacity){
        this.name = name;
        this.area = Area.valueOf(areaName).getAreaName();
        this.capacity = capacity;
        this.waitTime = 0;
    }

    public Attraction(String name, String areaName, int capacity, int waitTime){
        this(name, areaName, capacity);
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

    public void dispWaitTime(){
        System.out.println("現在の待ち時間: " + waitTime);
    }

    public void printInfo(){
        System.out.println("アトラクション名： " + name);
        System.out.println("所属エリア名： " + area);
        System.out.println("1回あたりの定員:" + capacity);
    }

}