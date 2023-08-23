import park.*;

class Main{
    public static void main(String[] args){
        Area area = Area.AdventureLand;
        String areaName = area.getName();

        System.out.println(areaName);
        

        Attraction attraction  = new Attraction("ジャングルクルーズ", "AdventureLand");
        attraction.disp();

    }
}