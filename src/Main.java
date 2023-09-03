package classes;
import classes.park.*;
import classes.attraction.*;
import java.util.*;

class Main{
    public static void main(String[] args){

        Attraction biking = new NormalAttraction("絶叫バイキング", "パイレーツエリア", 35);
        Attraction thunder = new FirstAttraction("サンダーマウンテン", "トゥモローエリア", 75);
        Attraction happy = new PremiereAttraction("ハッピーカルーセル", "トゥモローエリア", 10);

        biking.printInfo();
        thunder.printInfo();
        happy.printInfo();
        
    }
}