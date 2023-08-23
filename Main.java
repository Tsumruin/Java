import park.*;

class Main{
    public static void main(String[] args){
        Area area = Area.AdventureLand;
        String areaName = area.getAreaName();


        DPAAttraction soaring = new DPAAttraction(
                                "ソアリン",
                                "MediterraneanHarbor",
                                87
                            );

        PriorityAttraction space = new PriorityAttraction(
                                "スペースマウンテン",
                                "TomorrowLand",
                                12
                            );

        Attraction sindo = new Attraction(
                                "シンド",
                                "ArabianCoast",
                                24
                            );

        Attraction[] attAry = new Attraction[3];
        attAry[0] = soaring;
        attAry[1] = space;
        attAry[2] = sindo;

        for(Attraction att : attAry){
            att.printInfo();
            System.out.println("====");
        }

    }
}