package classes;
import classes.park.*;
import classes.attraction.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        Area area = Area.AdventureLand;
        String areaName = area.getAreaName();

        List<Attraction> attList = new ArrayList<>();

        attList.add(new DPAAttraction("ソアリン", "MediterraneanHarbor", 87));
        attList.add(new DPAAttraction("スプラッシュマウンテン", "CritterCountry", 8));
        attList.add(new DPAAttraction("美女と野獣", "FantasyLand", 10));
        attList.add(new PriorityAttraction("スペースマウンテン", "TomorrowLand", 12));
        attList.add(new PriorityAttraction("ビッグサンダーマウンテン", "WesternLand", 30));
        attList.add(new Attraction("シンド", "ArabianCoast", 24));
        attList.add(new Attraction("スターツアーズ", "TomorrowLand", 40));

        for(Attraction att : attList){
            att.printInfo();
            System.out.println("====");
        }

    }
}