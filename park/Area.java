package park;

public enum Area{
    AdventureLand("アドベンチャーランド"),
    WesternLand("ウエスタンランド"),
    CritterCountry("クリッターカントリー"),
    FantasyLand("ファンタジーランド"),
    ToonTown("トゥーンタウン"),
    TomorrowLand("トゥモローランド"),
    MediterraneanHarbor("メディテレーニアンハーバー"),
    AmericanWaterfront("アメリカンウォーターフロント"),
    PortDiscovery("ポートディスカバリー"),
    LostLiverDelta("ロストリバーデルタ"),
    ArabianCoast("アラビアンコースト"),
    MermaidLagoon("マーメイドラグーン"),
    MysteriousIsland("ミステリアスアイランド");

    private String areaName;

    private Area(String areaName){
        this.areaName = areaName;
    }

    public String getAreaName(){
        return this.areaName;
    }
}