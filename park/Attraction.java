package park;

public class Attraction{
    /**
     * Attraction class contains basic infomations of attractions
     */

    private String name;
    private String area;
    private int waitTime;
    private boolean dpa;
    private boolean priority;

    public Attraction(String name, String areaName){
        this.name = name;
        this.area = Area.valueOf(areaName).getAreaName();
        this.waitTime = 0;
        this.dpa = false;
        this.priority = false;
    }

    public Attraction(String name, String areaName, int waitTime, boolean dpa, boolean priority){
        this(name, areaName);
        this.waitTime = waitTime;
        this.dpa = dpa;
        this.priority = priority;
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

    public boolean isDPA(){
        return dpa;
    }

    public boolean isPriority(){
        return priority;
    }

    public void dispDPA(){
        String str = "";
        if(dpa){
            str += "DPA対象アトラクションです。";
        }
        else{
            str+= "DPA対象アトラクションではありません";
        }
        System.out.println(str);
    }
    
    public void dispPriority(){
        String str = "";
        if(priority){
            str += "プライオリティパス対象アトラクションです。";
        }
        else{
            str+= "プライオリティパス対象アトラクションではありません";
        }
        System.out.println(str);
    }

    public void printAll(){
        System.out.println("アトラクション名： " + name);
        System.out.println("所属エリア名： " + area);
        System.out.println("現在の待ち時間:" + waitTime);
        dispDPA();
        dispPriority();
    }

}