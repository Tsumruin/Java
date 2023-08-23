package park;

public enum Area{
    AdventureLand("アドベンチャーランド"),
    WesternLand("ウエスタンランド");

    private String name;

    private Area(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}