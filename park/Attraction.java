package park;

public class Attraction{
    private String name;
    private Area area;

    public Attraction(String name, String area){
        this.name = name;
        this.area = Area.valueOf(area);
    }

    public void disp(){
        System.out.println(name + " in " + area.getName());
    }

}