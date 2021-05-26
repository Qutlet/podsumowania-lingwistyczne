package mbjs;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import mbjs.fuzzy.*;
import mbjs.model.DataBase;
import mbjs.model.Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ksr2 {

    pom pom = mbjs.pom.getInstance();

    @FXML
    public ListView<Player> list1;

    @FXML
    public ListView list2;

    @FXML
    public CheckBox summ1;

    @FXML
    public CheckBox summ2;

    @FXML
    public CheckBox summ3;

    @FXML
    public CheckBox qua1;

    protected List<Player> playerList;// = new ArrayList<>();

    protected List<Summarizer> summarizerList = new ArrayList<>();

    protected List<Qualifier> qualifierList = new ArrayList<>();

    protected ListProperty<Player> playerListProperty = new SimpleListProperty<>();

    protected ListProperty paramListProperty = new SimpleListProperty();

    protected Stage summarizerStage = new Stage();

    public int test =0;


    public void loadData(){
        DataBase dataBase = DataBase.getSelf();
        pom.setPlayerList(dataBase.addPlayers());
        //System.out.println(playerList.size());
        playerListProperty.set(FXCollections.observableArrayList(pom.getPlayerList()));
        System.out.println(pom.getPlayerList().size());
        list1.itemsProperty().bind(playerListProperty);
    }

    public void chooseSummarizers(){
        if (summ1.isSelected()){
            summarizerList.add(new Summarizer(summ1.getText(),new TrapezoidalFunction(),0,0,12,23));
        }
        if (summ2.isSelected()){
            summarizerList.add(new Summarizer(summ2.getText(),new TrapezoidalFunction(),13,23,30,40));
        }
        if (summ3.isSelected()){
            //summarizerList.add(new Summarizer(summ3.getText(),new TrapezoidalFunction()))
        }

    }

    public void chooseQualifiers(){
        if (qua1.isSelected()){
            qualifierList.add(new Qualifier(qua1.getText(),new TrapezoidalFunction(),0,0,12,23));
        }
    }

    public void saveAndClose(){
        //todo add save
        summarizerStage.close();
    }

    public void chooseGP(){
        //summarizerList.add()
    }

    public void test(){
        System.out.println("Hello World! test streamline object");
        //Measures measures = new Measures();
        System.out.println(pom.getPlayerList().size());
        //double T1 = measures.T1(playerList);
        //System.out.println(T1);
        System.out.println(summarizerList.size());
        System.out.println(summarizerList.get(0).getMembership(2));
        StringBuilder summary = new StringBuilder();
        for (Qualifier qualifier : qualifierList){
            summary.append(qualifier.toString());
            summary.append("basket ball players are/have ");
            for (Summarizer summarizer: summarizerList){
                summary.append(summarizer.toString());
            }

        }
        System.out.println(summary.toString());
    }



}
