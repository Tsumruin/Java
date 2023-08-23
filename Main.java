import park.*;

class Main{
    public static void main(String[] args){
        Area area = Area.AdventureLand;
        String areaName = area.getAreaName();


        DPAAttraction soaring = new DPAAttraction(
                                "ソアリン",
                                "MediterraneanHarbor"
                            );

        PriorityAttraction space = new PriorityAttraction(
                                "スペースマウンテン",
                                "TomorrowLand"
                            );

        Attraction syndo = new Attraction(
                                "シンド",
                                "ArabianCoast"
                            );

        Attraction[] attAry = new Attraction[3];
        attAry[0] = soaring;
        attAry[1] = space;
        attAry[2] = syndo;

        for(Attraction att : attAry){
            att.printInfo();
            System.out.println("====");
        }

    }
}