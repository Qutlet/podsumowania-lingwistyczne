package mbjs.model;

public class Player {
    //Nie do rozmycia
    private String League;
    private String nationality;
    private String name;
    private String season;
    //Do rozmycia
    private int GP;
    private int FGM;
    private int ThreePM;
    private int TOV;
    private int PF;
    private int REB;
    private int AST;
    private int STL;
    private int BLK;
    private int PTS;
    private double height;
    private double weight;

    public Player(String league, String nationality, String name, String season, int GP, int FGM, int threePM, int TOV, int PF, int REB, int AST, int STL, int BLK, int PTS, double height, double weight) {
        League = league;
        this.nationality = nationality;
        this.name = name;
        this.season = season;
        this.GP = GP;
        this.FGM = FGM;
        ThreePM = threePM;
        this.TOV = TOV;
        this.PF = PF;
        this.REB = REB;
        this.AST = AST;
        this.STL = STL;
        this.BLK = BLK;
        this.PTS = PTS;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLeague() {
        return League;
    }

    public void setLeague(String league) {
        League = league;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getGP() {
        return GP;
    }

    public void setGP(int GP) {
        this.GP = GP;
    }

    public int getFGM() {
        return FGM;
    }

    public void setFGM(int FGM) {
        this.FGM = FGM;
    }

    public int getThreePM() {
        return ThreePM;
    }

    public void setThreePM(int threePM) {
        ThreePM = threePM;
    }

    public int getTOV() {
        return TOV;
    }

    public void setTOV(int TOV) {
        this.TOV = TOV;
    }

    public int getPF() {
        return PF;
    }

    public void setPF(int PF) {
        this.PF = PF;
    }

    public int getREB() {
        return REB;
    }

    public void setREB(int REB) {
        this.REB = REB;
    }

    public int getAST() {
        return AST;
    }

    public void setAST(int AST) {
        this.AST = AST;
    }

    public int getSTL() {
        return STL;
    }

    public void setSTL(int STL) {
        this.STL = STL;
    }

    public int getBLK() {
        return BLK;
    }

    public void setBLK(int BLK) {
        this.BLK = BLK;
    }

    public int getPTS() {
        return PTS;
    }

    public void setPTS(int PTS) {
        this.PTS = PTS;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Player{" +
                "League='" + League + '\'' +
                ", nationality='" + nationality + '\'' +
                ", name='" + name + '\'' +
                ", season='" + season + '\'' +
                ", GP=" + GP +
                ", FGM=" + FGM +
                ", ThreePM=" + ThreePM +
                ", TOV=" + TOV +
                ", PF=" + PF +
                ", REB=" + REB +
                ", AST=" + AST +
                ", STL=" + STL +
                ", BLK=" + BLK +
                ", PTS=" + PTS +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

//    public double getPlayerStat(String statName) {
//        if (statName.contains("GP")) {
//            return GP;
//        }
//        if (statName.contains("FGM")) {
//            return FGM;
//        }
//        if (statName.contains("3PM")) {
//            return ThreePM;
//        }
//        if (statName.contains("TOV")) {
//            return TOV;
//        }
//        if (statName.contains("PF")) {
//            return PF;
//        }
//        if (statName.contains("REB")) {
//            return REB;
//        }
//        if (statName.contains("AST")) {
//            return AST;
//        }
//        if (statName.contains("STL")) {
//            return STL;
//        }
//        if (statName.contains("BLK")) {
//            return BLK;
//        }
//        if (statName.contains("PTS")) {
//            return PTS;
//        }
//        if (statName.contains("height")) {
//            return height;
//        }
//        if (statName.contains("weight")) {
//            return weight;
//        }
//        return 0.0;
//    }


    public double getPlayerStat(String statName){
        switch (statName) {
            case "a few GP":
            case "small amount of GP":
            case "average amount of GP":
            case "large amount of GP":
            case "great amount of GP":
                return GP;
            case "a few FGM":
            case "small amount of FGM":
            case "average amount of FGM":
            case "large amount of FGM":
            case "great amount of FGM":
                return FGM;
            case "a few 3PM":
            case "small amount of 3PM":
            case "average amount of 3PM":
            case "large amount of 3PM":
            case "great amount of 3PM":
                return ThreePM;
            case "a few TOV":
            case "small amount of TOV":
            case "average amount of TOV":
            case "large amount of TOV":
            case "great amount of TOV":
                return TOV;
            case "a few PF":
            case "small amount of PF":
            case "average amount of PF":
            case "large amount of PF":
            case "great amount of PF":
                return PF;
            case "a few REB":
            case "small amount of REB":
            case "average amount of REB":
            case "large amount of REB":
            case "great amount of REB":
                return REB;
            case "a few AST":
            case "small amount of AST":
            case "average amount of AST":
            case "large amount of AST":
            case "great amount of AST":
                return AST;
            case "a few STL":
            case "small amount of STL":
            case "average amount of STL":
            case "large amount of STL":
            case "great amount of STL":
                return STL;
            case "a few BLK":
            case "small amount of BLK":
            case "average amount of BLK":
            case "large amount of BLK":
            case "great amount of BLK":
                return BLK;
            case "a few PTS":
            case "small amount of PTS":
            case "average amount of PTS":
            case "large amount of PTS":
            case "great amount of PTS":
                return PTS;
            case "quite short":
            case "short":
            case "medium-height":
            case "height":
            case "very height":
                return height;
            case "thin":
            case "slim":
            case "medium weight":
            case "bonny":
            case "stout":
                return weight;

        }
        return 0.0;
    }
}
