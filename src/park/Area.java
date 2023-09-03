package classes.park;

public enum Area{
    PiratesArea("パイレーツエリア"),
    TomorrowArea("トゥモローエリア");

    private String areaName;

    private Area(String areaName){
        this.areaName = areaName;
    }

    public String getAreaName(){
        return this.areaName;
    }
}