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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import mbjs.fuzzy.Measures;
import mbjs.fuzzy.Summarizer;
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

    protected List<Player> playerList;// = new ArrayList<>();

    protected List<Summarizer> summarizerList = new ArrayList<>();

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
    }



}
