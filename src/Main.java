package classes;
import classes.park.*;
import classes.attraction.*;

class Main{
    public static void main(String[] args){
        Area area = Area.AdventureLand;
        String areaName = area.getAreaName();

        Attraction[] attAry = new Attraction[7];

        attAry[0] = new DPAAttraction(
                        "ソアリン",
                        "MediterraneanHarbor",
                        87
                    );
        DPAAttraction soaring = (DPAAttraction)attAry[0];

        attAry[1] = new DPAAttraction(
                        "スプラッシュマウンテン",
                        "CritterCountry",
                        8
                    );
        DPAAttraction splash = (DPAAttraction)attAry[1];

        attAry[2] = new DPAAttraction(
                        "美女と野獣",
                        "FantasyLand",
                        10
                    );
        DPAAttraction ebb = (DPAAttraction)attAry[2];

        attAry[3] = new PriorityAttraction(
                        "スペースマウンテン",
                        "TomorrowLand",
                        12
                    );
        PriorityAttraction space = (PriorityAttraction)attAry[3];

        attAry[4] = new PriorityAttraction(
                        "ビッグサンダーマウンテン",
                        "WesternLand",
                        30
                    );
        PriorityAttraction big = (PriorityAttraction)attAry[4];

        attAry[5] = new Attraction(
                        "シンド",
                        "ArabianCoast",
                        24
                    );
        Attraction sindo = attAry[5];

        attAry[6] = new Attraction(
                        "スターツアーズ",
                        "TomorrowLand",
                        40
                    );
        Attraction star = attAry[6];

        for(Attraction att : attAry){
            att.printInfo();
            System.out.println("====");
        }

    }
}