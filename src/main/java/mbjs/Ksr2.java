package mbjs;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import mbjs.fuzzy.*;
import mbjs.model.DataBase;
import mbjs.model.Player;

import java.util.ArrayList;
import java.util.List;

public class Ksr2 {

    @FXML
    public ListView<Player> list1;

    @FXML
    public ListView list2;

    @FXML
    public ListView<LinguisticSummary> summList;

    @FXML
    public CheckBox summ1;
    @FXML
    public CheckBox summ2;
    @FXML
    public CheckBox summ3;
    @FXML
    public CheckBox summ4;
    @FXML
    public CheckBox summ5;
    @FXML
    public CheckBox summ6;
    @FXML
    public CheckBox summ7;
    @FXML
    public CheckBox summ8;
    @FXML
    public CheckBox summ9;
    @FXML
    public CheckBox summ10;
    @FXML
    public CheckBox summ11;
    @FXML
    public CheckBox summ12;
    @FXML
    public CheckBox summ13;
    @FXML
    public CheckBox summ14;
    @FXML
    public CheckBox summ15;
    @FXML
    public CheckBox summ16;
    @FXML
    public CheckBox summ17;
    @FXML
    public CheckBox summ18;
    @FXML
    public CheckBox summ19;
    @FXML
    public CheckBox summ20;
    @FXML
    public CheckBox summ21;
    @FXML
    public CheckBox summ22;
    @FXML
    public CheckBox summ23;
    @FXML
    public CheckBox summ24;
    @FXML
    public CheckBox summ25;
    @FXML
    public CheckBox summ26;
    @FXML
    public CheckBox summ27;
    @FXML
    public CheckBox summ28;
    @FXML
    public CheckBox summ29;
    @FXML
    public CheckBox summ30;
    @FXML
    public CheckBox summ31;
    @FXML
    public CheckBox summ32;
    @FXML
    public CheckBox summ33;
    @FXML
    public CheckBox summ34;
    @FXML
    public CheckBox summ35;
    @FXML
    public CheckBox summ36;
    @FXML
    public CheckBox summ37;
    @FXML
    public CheckBox summ38;
    @FXML
    public CheckBox summ39;
    @FXML
    public CheckBox summ40;
    @FXML
    public CheckBox summ41;
    @FXML
    public CheckBox summ42;
    @FXML
    public CheckBox summ43;
    @FXML
    public CheckBox summ44;
    @FXML
    public CheckBox summ45;
    @FXML
    public CheckBox summ46;
    @FXML
    public CheckBox summ47;
    @FXML
    public CheckBox summ48;
    @FXML
    public CheckBox summ49;
    @FXML
    public CheckBox summ50;
    @FXML
    public CheckBox summ51;
    @FXML
    public CheckBox summ52;
    @FXML
    public CheckBox summ53;
    @FXML
    public CheckBox summ54;
    @FXML
    public CheckBox summ55;
    @FXML
    public CheckBox summ56;
    @FXML
    public CheckBox summ57;
    @FXML
    public CheckBox summ58;
    @FXML
    public CheckBox summ59;
    @FXML
    public CheckBox summ60;
    @FXML
    public CheckBox qua1;
    @FXML
    public CheckBox qua2;
    @FXML
    public CheckBox qua3;
    @FXML
    public CheckBox qua4;
    @FXML
    public CheckBox qua5;
    @FXML
    public CheckBox qua6;
    @FXML
    public CheckBox qua7;
    @FXML
    public CheckBox qua8;
    @FXML
    public CheckBox qua9;
    @FXML
    public CheckBox qua10;
    @FXML
    public CheckBox qua11;
    @FXML
    public CheckBox qua12;
    @FXML
    public CheckBox qua13;
    @FXML
    public CheckBox qua14;
    @FXML
    public CheckBox qua15;
    @FXML
    public CheckBox qua16;
    @FXML
    public CheckBox qua17;
    @FXML
    public CheckBox qua18;
    @FXML
    public CheckBox qua19;
    @FXML
    public CheckBox qua20;
    @FXML
    public CheckBox qua21;
    @FXML
    public CheckBox qua22;
    @FXML
    public CheckBox qua23;
    @FXML
    public CheckBox qua24;
    @FXML
    public CheckBox qua25;
    @FXML
    public CheckBox qua26;
    @FXML
    public CheckBox qua27;
    @FXML
    public CheckBox qua28;
    @FXML
    public CheckBox qua29;
    @FXML
    public CheckBox qua30;
    @FXML
    public CheckBox qua31;
    @FXML
    public CheckBox qua32;
    @FXML
    public CheckBox qua33;
    @FXML
    public CheckBox qua34;
    @FXML
    public CheckBox qua35;
    @FXML
    public CheckBox qua36;
    @FXML
    public CheckBox qua37;
    @FXML
    public CheckBox qua38;
    @FXML
    public CheckBox qua39;
    @FXML
    public CheckBox qua40;
    @FXML
    public CheckBox qua41;
    @FXML
    public CheckBox qua42;
    @FXML
    public CheckBox qua43;
    @FXML
    public CheckBox qua44;
    @FXML
    public CheckBox qua45;
    @FXML
    public CheckBox qua46;
    @FXML
    public CheckBox qua47;
    @FXML
    public CheckBox qua48;
    @FXML
    public CheckBox qua49;
    @FXML
    public CheckBox qua50;
    @FXML
    public CheckBox qua51;
    @FXML
    public CheckBox qua52;
    @FXML
    public CheckBox qua53;
    @FXML
    public CheckBox qua54;
    @FXML
    public CheckBox qua55;
    @FXML
    public CheckBox qua56;
    @FXML
    public CheckBox qua57;
    @FXML
    public CheckBox qua58;
    @FXML
    public CheckBox qua59;
    @FXML
    public CheckBox qua60;

    protected List<Player> playerList = new ArrayList<>();

    protected List<Summarizer> summarizerList = new ArrayList<>();

    protected List<Qualifier> qualifierList = new ArrayList<>();

    protected List<Quantifier> quantifierList = new ArrayList<>();

    protected List<LinguisticSummary> linguisticSummaryList = new ArrayList<>();

    protected ListProperty<Player> playerListProperty = new SimpleListProperty<>();

    protected ListProperty<LinguisticSummary> linguisticSummaryListProperty = new SimpleListProperty<>();

    protected ListProperty paramListProperty = new SimpleListProperty();

    public void loadData(){
        DataBase dataBase = DataBase.getSelf();
        playerList = dataBase.addPlayers();
        chooseQuantifier();
//        playerListProperty.set(FXCollections.observableArrayList(playerList));
//        list1.itemsProperty().bind(playerListProperty);
    }

    public void chooseSummarizers(){
        if (summ1.isSelected()){
            summarizerList.add(new Summarizer(summ1.getText(),new TrapezoidalFunction(),0,0,12,23));
        }
        if (summ2.isSelected()){
            summarizerList.add(new Summarizer(summ2.getText(),new TrapezoidalFunction(),13,23,30,40));
        }
        if (summ3.isSelected()){
            summarizerList.add(new Summarizer(summ3.getText(),new TriangularFunction(), 30,44,57,2137));
        }
        if (summ4.isSelected()){
            summarizerList.add(new Summarizer(summ4.getText(), new TrapezoidalFunction(),47,57,64,74));
        }
        if (summ5.isSelected()){
            summarizerList.add(new Summarizer(summ5.getText(), new GaussianFunction(),64,85,1,1));
        }
        if (summ6.isSelected()){
            summarizerList.add(new Summarizer(summ6.getText(), new TrapezoidalFunction(),0,0,170,210));
        }
        if (summ7.isSelected()){
            summarizerList.add(new Summarizer(summ7.getText(), new TrapezoidalFunction(), 180,210,375,405));
        }
        if (summ8.isSelected()){
            summarizerList.add(new Summarizer(summ8.getText(), new TriangularFunction(),375,488,601,1));
        }
        if (summ9.isSelected()){
            summarizerList.add(new Summarizer(summ9.getText(), new TrapezoidalFunction(),571,601,767,797));
        }
        if (summ10.isSelected()){
            summarizerList.add(new Summarizer(summ10.getText(), new GaussianFunction(),767,978,1,1));
        }
        if (summ11.isSelected()){
            summarizerList.add(new Summarizer(summ11.getText(),new TrapezoidalFunction(),0,0,21,45));
        }
        if (summ12.isSelected()){
            summarizerList.add(new Summarizer(summ12.getText(),new TrapezoidalFunction(),12,45,95,119));
        }
        if (summ13.isSelected()){
            summarizerList.add(new Summarizer(summ13.getText(),new TriangularFunction(),95,135,174,1));
        }
        if (summ14.isSelected()){
            summarizerList.add(new Summarizer(summ14.getText(), new TrapezoidalFunction(), 150,174,205,229));
        }
        if (summ15.isSelected()){
            summarizerList.add(new Summarizer(summ15.getText(),new GaussianFunction(),205,272,1,1));
        }
        if (summ16.isSelected()){
            summarizerList.add(new Summarizer(summ16.getText(), new TrapezoidalFunction(),0,0,55,81));
        }
        if (summ17.isSelected()){
            summarizerList.add(new Summarizer(summ17.getText(),new TrapezoidalFunction(),55,81,124,150));
        }
        if (summ18.isSelected()){
            summarizerList.add(new Summarizer(summ18.getText(),new TriangularFunction(),124,172,219,1));
        }
        if (summ19.isSelected()){
            summarizerList.add(new Summarizer(summ19.getText(),new TrapezoidalFunction(),193,219,262,288));
        }
        if (summ20.isSelected()){
            summarizerList.add(new Summarizer(summ20.getText(), new GaussianFunction(), 262,344,1,1));
        }
        if (summ21.isSelected()){
            summarizerList.add(new Summarizer(summ21.getText(), new TrapezoidalFunction(),0,0,57,87));
        }
        if (summ22.isSelected()){
            summarizerList.add(new Summarizer(summ22.getText(), new TrapezoidalFunction(),57,87,130,160));
        }
        if (summ23.isSelected()){
            summarizerList.add(new Summarizer(summ23.getText(),new TriangularFunction(),130,183,236,1));
        }
        if (summ24.isSelected()){
            summarizerList.add(new Summarizer(summ24.getText(), new TrapezoidalFunction(),206,236,281,311));
        }
        if (summ25.isSelected()){
            summarizerList.add(new Summarizer(summ25.getText(), new GaussianFunction(),281,371,1,1));
        }
        if (summ26.isSelected()){
            summarizerList.add(new Summarizer(summ26.getText(),new TrapezoidalFunction(),0,0,230,270));
        }
        if (summ27.isSelected()){
            summarizerList.add(new Summarizer(summ27.getText(),new TrapezoidalFunction(),230,270,442,482));
        }
        if (summ28.isSelected()){
            summarizerList.add(new Summarizer(summ28.getText(), new TriangularFunction(),442,579,715,1));
        }
        if (summ29.isSelected()){
            summarizerList.add(new Summarizer(summ29.getText(), new TrapezoidalFunction(), 715,755,908,948));
        }
        if (summ30.isSelected()){
            summarizerList.add(new Summarizer(summ30.getText(),new GaussianFunction(),908,1161,1,1));
        }
        if (summ31.isSelected()){
            summarizerList.add(new Summarizer(summ31.getText(),new TrapezoidalFunction(),0,0,145,185));
        }
        if (summ32.isSelected()){
            summarizerList.add(new Summarizer(summ32.getText(), new TrapezoidalFunction(),145,185,350,390));
        }
        if (summ33.isSelected()){
            summarizerList.add(new Summarizer(summ33.getText(), new TriangularFunction(),350,463,575,1));
        }
        if (summ34.isSelected()){
            summarizerList.add(new Summarizer(summ34.getText(),new TrapezoidalFunction(),535,575,720,760));
        }
        if (summ35.isSelected()){
            summarizerList.add(new Summarizer(summ35.getText(),new GaussianFunction(),720,925,1,1));
        }
        if (summ36.isSelected()){
            summarizerList.add(new Summarizer(summ36.getText(), new TrapezoidalFunction(),0,0,35,55));
        }
        if (summ37.isSelected()){
            summarizerList.add(new Summarizer(summ37.getText(), new TrapezoidalFunction(),35,55,80,100));
        }
        if (summ38.isSelected()){
            summarizerList.add(new Summarizer(summ38.getText(), new TriangularFunction(),80,118,155,1));
        }
        if (summ39.isSelected()){
            summarizerList.add(new Summarizer(summ39.getText(), new TrapezoidalFunction(),145,155,170,190));
        }
        if (summ40.isSelected()){
            summarizerList.add(new Summarizer(summ40.getText(), new GaussianFunction(),170,225,1,1));
        }
        if (summ41.isSelected()){
            summarizerList.add(new Summarizer(summ41.getText(), new TrapezoidalFunction(),0,0,45,75));
        }
        if (summ42.isSelected()){
            summarizerList.add(new Summarizer(summ42.getText(), new TrapezoidalFunction(),45,75,107,137));
        }
        if (summ43.isSelected()){
            summarizerList.add(new Summarizer(summ43.getText(), new TriangularFunction(),107,153,199,1));
        }
        if (summ44.isSelected()){
            summarizerList.add(new Summarizer(summ44.getText(), new TrapezoidalFunction(), 169,199,230,260));
        }
        if (summ45.isSelected()){
            summarizerList.add(new Summarizer(summ45.getText(), new GaussianFunction(),230,307,1,1));
        }
        if (summ46.isSelected()){
            summarizerList.add(new Summarizer(summ46.getText(), new TrapezoidalFunction(),0,0,534,594));
        }
        if (summ47.isSelected()){
            summarizerList.add(new Summarizer(summ47.getText(), new TrapezoidalFunction(),534,594,1101,1161));
        }
        if (summ48.isSelected()){
            summarizerList.add(new Summarizer(summ48.getText(), new TriangularFunction(), 1101,1415,1728,1));
        }
        if (summ49.isSelected()){
            summarizerList.add(new Summarizer(summ49.getText(), new TrapezoidalFunction(),1668,1728,2235,2295));
        }
        if (summ50.isSelected()){
            summarizerList.add(new Summarizer(summ50.getText(), new GaussianFunction(),2235,2832,1,1));
        }
        if (summ51.isSelected()){
            summarizerList.add(new Summarizer(summ51.getText(), new TrapezoidalFunction(),160,160,169,177));
        }
        if (summ52.isSelected()){
            summarizerList.add(new Summarizer(summ52.getText(), new TrapezoidalFunction(),169,177,183,191));
        }
        if (summ53.isSelected()){
            summarizerList.add(new Summarizer(summ53.getText(),new TriangularFunction(),183,194,205,1));
        }
        if (summ54.isSelected()){
            summarizerList.add(new Summarizer(summ54.getText(), new TrapezoidalFunction(), 197,205,211,219));
        }
        if (summ55.isSelected()){
            summarizerList.add(new Summarizer(summ55.getText(), new GaussianFunction(),211,229,1,1));
        }
        if (summ56.isSelected()){
            summarizerList.add(new Summarizer(summ56.getText(), new TrapezoidalFunction(),59,59,83,95));
        }
        if (summ57.isSelected()){
            summarizerList.add(new Summarizer(summ57.getText(), new TrapezoidalFunction(), 83,95,106,118));
        }
        if (summ58.isSelected()){
            summarizerList.add(new Summarizer(summ58.getText(), new TriangularFunction(),106,123,139,1));
        }
        if (summ59.isSelected()){
            summarizerList.add(new Summarizer(summ59.getText(), new TrapezoidalFunction(),127,139,149,161));
        }
        if (summ60.isSelected()){
            summarizerList.add(new Summarizer(summ60.getText(), new GaussianFunction(), 149,170,1,1));
        }

    }

    public void chooseQualifiers(){
        if (qua1.isSelected()){
            qualifierList.add(new Qualifier(qua1.getText(),new TrapezoidalFunction(),0,0,12,23));
        }
        if (qua2.isSelected()){
            qualifierList.add(new Qualifier(qua2.getText(),new TrapezoidalFunction(),13,23,30,40));
        }
        if (qua3.isSelected()){
            qualifierList.add(new Qualifier(qua3.getText(),new TriangularFunction(), 30,44,57,2137));
        }
        if (qua4.isSelected()){
            qualifierList.add(new Qualifier(qua4.getText(), new TrapezoidalFunction(),47,57,64,74));
        }
        if (qua5.isSelected()){
            qualifierList.add(new Qualifier(qua5.getText(), new GaussianFunction(),64,85,1,1));
        }
        if (qua6.isSelected()){
            qualifierList.add(new Qualifier(qua6.getText(), new TrapezoidalFunction(),0,0,170,210));
        }
        if (qua7.isSelected()){
            qualifierList.add(new Qualifier(qua7.getText(), new TrapezoidalFunction(), 180,210,375,405));
        }
        if (qua8.isSelected()){
            qualifierList.add(new Qualifier(qua8.getText(), new TriangularFunction(),375,488,601,1));
        }
        if (qua9.isSelected()){
            qualifierList.add(new Qualifier(qua9.getText(), new TrapezoidalFunction(),571,601,767,797));
        }
        if (qua10.isSelected()){
            qualifierList.add(new Qualifier(qua10.getText(), new GaussianFunction(),767,978,1,1));
        }
        if (qua11.isSelected()){
            qualifierList.add(new Qualifier(qua11.getText(),new TrapezoidalFunction(),0,0,21,45));
        }
        if (qua12.isSelected()){
            qualifierList.add(new Qualifier(qua12.getText(),new TrapezoidalFunction(),12,45,95,119));
        }
        if (qua13.isSelected()){
            qualifierList.add(new Qualifier(qua13.getText(),new TriangularFunction(),95,135,174,1));
        }
        if (qua14.isSelected()){
            qualifierList.add(new Qualifier(qua14.getText(), new TrapezoidalFunction(), 150,174,205,229));
        }
        if (qua15.isSelected()){
            qualifierList.add(new Qualifier(qua15.getText(),new GaussianFunction(),205,272,1,1));
        }
        if (qua16.isSelected()){
            qualifierList.add(new Qualifier(qua16.getText(), new TrapezoidalFunction(),0,0,55,81));
        }
        if (qua17.isSelected()){
            qualifierList.add(new Qualifier(qua17.getText(),new TrapezoidalFunction(),55,81,124,150));
        }
        if (qua18.isSelected()){
            qualifierList.add(new Qualifier(qua18.getText(),new TriangularFunction(),124,172,219,1));
        }
        if (qua19.isSelected()){
            qualifierList.add(new Qualifier(qua19.getText(),new TrapezoidalFunction(),193,219,262,288));
        }
        if (qua20.isSelected()){
            qualifierList.add(new Qualifier(qua20.getText(), new GaussianFunction(), 262,344,1,1));
        }
        if (qua21.isSelected()){
            qualifierList.add(new Qualifier(qua21.getText(), new TrapezoidalFunction(),0,0,57,87));
        }
        if (qua22.isSelected()){
            qualifierList.add(new Qualifier(qua22.getText(), new TrapezoidalFunction(),57,87,130,160));
        }
        if (qua23.isSelected()){
            qualifierList.add(new Qualifier(qua23.getText(),new TriangularFunction(),130,183,236,1));
        }
        if (qua24.isSelected()){
            qualifierList.add(new Qualifier(qua24.getText(), new TrapezoidalFunction(),206,236,281,311));
        }
        if (qua25.isSelected()){
            qualifierList.add(new Qualifier(qua25.getText(), new GaussianFunction(),281,371,1,1));
        }
        if (qua26.isSelected()){
            qualifierList.add(new Qualifier(qua26.getText(),new TrapezoidalFunction(),0,0,230,270));
        }
        if (qua27.isSelected()){
            qualifierList.add(new Qualifier(qua27.getText(),new TrapezoidalFunction(),230,270,442,482));
        }
        if (qua28.isSelected()){
            qualifierList.add(new Qualifier(qua28.getText(), new TriangularFunction(),442,579,715,1));
        }
        if (qua29.isSelected()){
            qualifierList.add(new Qualifier(qua29.getText(), new TrapezoidalFunction(), 715,755,908,948));
        }
        if (qua30.isSelected()){
            qualifierList.add(new Qualifier(qua30.getText(),new GaussianFunction(),908,1161,1,1));
        }
        if (qua31.isSelected()){
            qualifierList.add(new Qualifier(qua31.getText(),new TrapezoidalFunction(),0,0,145,185));
        }
        if (qua32.isSelected()){
            qualifierList.add(new Qualifier(qua32.getText(), new TrapezoidalFunction(),145,185,350,390));
        }
        if (qua33.isSelected()){
            qualifierList.add(new Qualifier(qua33.getText(), new TriangularFunction(),350,463,575,1));
        }
        if (qua34.isSelected()){
            qualifierList.add(new Qualifier(qua34.getText(),new TrapezoidalFunction(),535,575,720,760));
        }
        if (qua35.isSelected()){
            qualifierList.add(new Qualifier(qua35.getText(),new GaussianFunction(),720,925,1,1));
        }
        if (qua36.isSelected()){
            qualifierList.add(new Qualifier(qua36.getText(), new TrapezoidalFunction(),0,0,35,55));
        }
        if (qua37.isSelected()){
            qualifierList.add(new Qualifier(qua37.getText(), new TrapezoidalFunction(),35,55,80,100));
        }
        if (qua38.isSelected()){
            qualifierList.add(new Qualifier(qua38.getText(), new TriangularFunction(),80,118,155,1));
        }
        if (qua39.isSelected()){
            qualifierList.add(new Qualifier(qua39.getText(), new TrapezoidalFunction(),145,155,170,190));
        }
        if (qua40.isSelected()){
            qualifierList.add(new Qualifier(qua40.getText(), new GaussianFunction(),170,225,1,1));
        }
        if (qua41.isSelected()){
            qualifierList.add(new Qualifier(qua41.getText(), new TrapezoidalFunction(),0,0,45,75));
        }
        if (qua42.isSelected()){
            qualifierList.add(new Qualifier(qua42.getText(), new TrapezoidalFunction(),45,75,107,137));
        }
        if (qua43.isSelected()){
            qualifierList.add(new Qualifier(qua43.getText(), new TriangularFunction(),107,153,199,1));
        }
        if (qua44.isSelected()){
            qualifierList.add(new Qualifier(qua44.getText(), new TrapezoidalFunction(), 169,199,230,260));
        }
        if (qua45.isSelected()){
            qualifierList.add(new Qualifier(qua45.getText(), new GaussianFunction(),230,307,1,1));
        }
        if (qua46.isSelected()){
            qualifierList.add(new Qualifier(qua46.getText(), new TrapezoidalFunction(),0,0,534,594));
        }
        if (qua47.isSelected()){
            qualifierList.add(new Qualifier(qua47.getText(), new TrapezoidalFunction(),534,594,1101,1161));
        }
        if (qua48.isSelected()){
            qualifierList.add(new Qualifier(qua48.getText(), new TriangularFunction(), 1101,1415,1728,1));
        }
        if (qua49.isSelected()){
            qualifierList.add(new Qualifier(qua49.getText(), new TrapezoidalFunction(),1668,1728,2235,2295));
        }
        if (qua50.isSelected()){
            qualifierList.add(new Qualifier(qua50.getText(), new GaussianFunction(),2235,2832,1,1));
        }
        if (qua51.isSelected()){
            qualifierList.add(new Qualifier(qua51.getText(), new TrapezoidalFunction(),160,160,169,177));
        }
        if (qua52.isSelected()){
            qualifierList.add(new Qualifier(qua52.getText(), new TrapezoidalFunction(),169,177,183,191));
        }
        if (qua53.isSelected()){
            qualifierList.add(new Qualifier(qua53.getText(),new TriangularFunction(),183,194,205,1));
        }
        if (qua54.isSelected()){
            qualifierList.add(new Qualifier(qua54.getText(), new TrapezoidalFunction(), 197,205,211,219));
        }
        if (qua55.isSelected()){
            qualifierList.add(new Qualifier(qua55.getText(), new GaussianFunction(),211,229,1,1));
        }
        if (qua56.isSelected()){
            qualifierList.add(new Qualifier(qua56.getText(), new TrapezoidalFunction(),59,59,83,95));
        }
        if (qua57.isSelected()){
            qualifierList.add(new Qualifier(qua57.getText(), new TrapezoidalFunction(), 83,95,106,118));
        }
        if (qua58.isSelected()){
            qualifierList.add(new Qualifier(qua58.getText(), new TriangularFunction(),106,123,139,1));
        }
        if (qua59.isSelected()){
            qualifierList.add(new Qualifier(qua59.getText(), new TrapezoidalFunction(),127,139,149,161));
        }
        if (qua60.isSelected()){
            qualifierList.add(new Qualifier(qua60.getText(), new GaussianFunction(), 149,170,1,1));
        }
    }

    public void saveAndClose(){
        //todo add save
    }

    public void chooseGP(){
        //summarizerList.add()
    }

    public void chooseQuantifier(){
        quantifierList.add(new Quantifier("Less then 5000 ",new TrapezoidalFunction(),0,0,4000,5000,true));
        quantifierList.add(new Quantifier("About 5000 ",new TriangularFunction(),4000,5000,6000,-1,true));
        quantifierList.add(new Quantifier("About 6000 ",new TriangularFunction(),5000,6000,7000,-1,true));
        quantifierList.add(new Quantifier("About 7000 ",new TriangularFunction(),6000,7000,8000,-1,true));
        quantifierList.add(new Quantifier("About 8000 ",new TriangularFunction(),7000,8000,9200,-1,true));
        quantifierList.add(new Quantifier("About 10000 ",new TriangularFunction(),9000,10000,11000,-1,true));
        quantifierList.add(new Quantifier("About 11000 ",new TriangularFunction(),10000,11000,12700,-1,true));
        quantifierList.add(new Quantifier("More than 12500 ",new TrapezoidalFunction(),12500,12700,14500,14500,true));
        quantifierList.add(new Quantifier("None ",new TriangularFunction(),0,0,0.05,-1,false));
        quantifierList.add(new Quantifier("About 20% ",new TriangularFunction(),0.12,0.20,0.28,-1,false));
        quantifierList.add(new Quantifier("Less than a third ",new TrapezoidalFunction(),0,0,0.30,0.33,false));
        quantifierList.add(new Quantifier("About 33% ",new TriangularFunction(),0.27,0.33,0.39,-1,false));
        quantifierList.add(new Quantifier("About 45% ",new TriangularFunction(),0.35,0.45,0.5,-1,false));
        quantifierList.add(new Quantifier("More than a half ",new TrapezoidalFunction(),0.50,0.55,1,1,false));
        quantifierList.add(new Quantifier("About 60% ",new TriangularFunction(),0.52,0.62,0.68,-1,false));
        quantifierList.add(new Quantifier("Majority ",new TriangularFunction(),0.75,0.8,0.9,-1,false));
        quantifierList.add(new Quantifier("All ",new TrapezoidalFunction(),0.85,0.9,1,1,false));
    }

    public void generate(){

        if (qualifierList.isEmpty()){
            for (Quantifier quantifier : quantifierList) {
                for (Summarizer summarizer : summarizerList){
                    linguisticSummaryList.add(new LinguisticSummary(quantifier,summarizer));
                }
            }
        } else {
            for (Quantifier quantifier : quantifierList) {
                if (!quantifier.isAbsolute()){
                    for (Qualifier qualifier : qualifierList){
                        for (Summarizer summarizer : summarizerList){
                            linguisticSummaryList.add(new LinguisticSummary(quantifier,qualifier,summarizer));
                        }
                    }
                }
            }
        }
        for (LinguisticSummary summary : linguisticSummaryList){
            summary.calculateMeasures(linguisticSummaryList,playerList);
        }
        linguisticSummaryListProperty.set(FXCollections.observableArrayList(linguisticSummaryList));
        summList.itemsProperty().bind(linguisticSummaryListProperty);
    }

    public void test(){
        System.out.println("Hello World! test streamline object");
        //Measures measures = new Measures();
        System.out.println(playerList.size());
        //double T1 = measures.T1(playerList);
        //System.out.println(T1);
        System.out.println(summarizerList.size());
        System.out.println(summarizerList.get(0).getMembership(2));
        StringBuilder summary = new StringBuilder();
        for (Qualifier qualifier : qualifierList){
            summary.append(qualifier.toString());
            summary.append("basketball players are/have ");
            for (Summarizer summarizer: summarizerList){
                summary.append(summarizer.toString());
            }

        }
        System.out.println(summary.toString());
    }



}
