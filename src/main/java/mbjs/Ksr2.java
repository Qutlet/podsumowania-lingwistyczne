package mbjs;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
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
    public CheckBox qua1;

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
            //summarizerList.add(new Summarizer(summ3.getText(),new TriangularFunction(),0,0,0,0));
        }

    }

    public void chooseQualifiers(){
        if (qua1.isSelected()){
            qualifierList.add(new Qualifier(qua1.getText(),new TrapezoidalFunction(),0,0,12,23));
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
        for (Quantifier quantifier : quantifierList) {
            if (!qualifierList.isEmpty()){
                for (Qualifier qualifier : qualifierList){
                    for (Summarizer summarizer : summarizerList){
                        linguisticSummaryList.add(new LinguisticSummary(quantifier,qualifier,summarizer));
                    }
                }
            } else {
                for (Summarizer summarizer : summarizerList){
                    linguisticSummaryList.add(new LinguisticSummary(quantifier,summarizer));
                }
            }
        }
        System.out.println(linguisticSummaryList.size());
        System.out.println(quantifierList.size());
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
