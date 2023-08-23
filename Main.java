import park.*;

class Main{
    public static void main(String[] args){
        Area area = Area.AdventureLand;
        String areaName = area.getAreaName();


        Attraction jungle = new Attraction(
                                "ジャングルクルーズ",
                                "AdventureLand"
                            );
                            
        jungle.printAll();

    }
}