package mbjs;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import mbjs.fuzzy.*;
import mbjs.model.DataBase;
import mbjs.model.Player;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ksr2 {

    @FXML
    public ListView summList;

    @FXML
    public TextField newA;

    @FXML
    public TextField newB;

    @FXML
    public TextField newC;

    @FXML
    public TextField newD;

    @FXML
    public TextField newName;

    @FXML
    public CheckBox newAbsolute;

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
        //test();
        chooseQuantifier();
    }

    public void chooseSummarizers(){
        if (summ1.isSelected()){
            summarizerList.add(new Summarizer(summ1.getText(), new TrapezoidalFunction(), 0, 0, 12, 23, playerList));
        }
        if (summ2.isSelected()){
            summarizerList.add(new Summarizer(summ2.getText(), new TrapezoidalFunction(), 13, 23, 30, 40, playerList));
        }
        if (summ3.isSelected()){
            summarizerList.add(new Summarizer(summ3.getText(), new TriangularFunction(), 30, 44, 57, 2137, playerList));
        }
        if (summ4.isSelected()){
            summarizerList.add(new Summarizer(summ4.getText(), new TrapezoidalFunction(), 47, 57, 64, 74, playerList));
        }
        if (summ5.isSelected()){
            summarizerList.add(new Summarizer(summ5.getText(), new GaussianFunction(), 64, 85, 1, 1, playerList));
        }
        if (summ6.isSelected()){
            summarizerList.add(new Summarizer(summ6.getText(), new TrapezoidalFunction(), 0, 0, 170, 210, playerList));
        }
        if (summ7.isSelected()){
            summarizerList.add(new Summarizer(summ7.getText(), new TrapezoidalFunction(), 180, 210, 375, 405, playerList));
        }
        if (summ8.isSelected()){
            summarizerList.add(new Summarizer(summ8.getText(), new TriangularFunction(), 375, 488, 601, 1, playerList));
        }
        if (summ9.isSelected()){
            summarizerList.add(new Summarizer(summ9.getText(), new TrapezoidalFunction(), 571, 601, 767, 797, playerList));
        }
        if (summ10.isSelected()){
            summarizerList.add(new Summarizer(summ10.getText(), new GaussianFunction(), 767, 978, 1, 1, playerList));
        }
        if (summ11.isSelected()){
            summarizerList.add(new Summarizer(summ11.getText(), new TrapezoidalFunction(), 0, 0, 21, 45, playerList));
        }
        if (summ12.isSelected()){
            summarizerList.add(new Summarizer(summ12.getText(), new TrapezoidalFunction(), 12, 45, 95, 119, playerList));
        }
        if (summ13.isSelected()){
            summarizerList.add(new Summarizer(summ13.getText(), new TriangularFunction(), 95, 135, 174, 1, playerList));
        }
        if (summ14.isSelected()){
            summarizerList.add(new Summarizer(summ14.getText(), new TrapezoidalFunction(), 150, 174, 205, 229, playerList));
        }
        if (summ15.isSelected()){
            summarizerList.add(new Summarizer(summ15.getText(), new GaussianFunction(), 205, 272, 1, 1, playerList));
        }
        if (summ16.isSelected()){
            summarizerList.add(new Summarizer(summ16.getText(), new TrapezoidalFunction(), 0, 0, 55, 81, playerList));
        }
        if (summ17.isSelected()){
            summarizerList.add(new Summarizer(summ17.getText(), new TrapezoidalFunction(), 55, 81, 124, 150, playerList));
        }
        if (summ18.isSelected()){
            summarizerList.add(new Summarizer(summ18.getText(), new TriangularFunction(), 124, 172, 219, 1, playerList));
        }
        if (summ19.isSelected()){
            summarizerList.add(new Summarizer(summ19.getText(), new TrapezoidalFunction(), 193, 219, 262, 288, playerList));
        }
        if (summ20.isSelected()){
            summarizerList.add(new Summarizer(summ20.getText(), new GaussianFunction(), 262, 344, 1, 1, playerList));
        }
        if (summ21.isSelected()){
            summarizerList.add(new Summarizer(summ21.getText(), new TrapezoidalFunction(), 0, 0, 57, 87, playerList));
        }
        if (summ22.isSelected()){
            summarizerList.add(new Summarizer(summ22.getText(), new TrapezoidalFunction(), 57, 87, 130, 160, playerList));
        }
        if (summ23.isSelected()){
            summarizerList.add(new Summarizer(summ23.getText(), new TriangularFunction(), 130, 183, 236, 1, playerList));
        }
        if (summ24.isSelected()){
            summarizerList.add(new Summarizer(summ24.getText(), new TrapezoidalFunction(), 206, 236, 281, 311, playerList));
        }
        if (summ25.isSelected()){
            summarizerList.add(new Summarizer(summ25.getText(), new GaussianFunction(), 281, 371, 1, 1, playerList));
        }
        if (summ26.isSelected()){
            summarizerList.add(new Summarizer(summ26.getText(), new TrapezoidalFunction(), 0, 0, 230, 270, playerList));
        }
        if (summ27.isSelected()){
            summarizerList.add(new Summarizer(summ27.getText(), new TrapezoidalFunction(), 230, 270, 442, 482, playerList));
        }
        if (summ28.isSelected()){
            summarizerList.add(new Summarizer(summ28.getText(), new TriangularFunction(), 442, 579, 715, 1, playerList));
        }
        if (summ29.isSelected()){
            summarizerList.add(new Summarizer(summ29.getText(), new TrapezoidalFunction(), 715, 755, 908, 948, playerList));
        }
        if (summ30.isSelected()){
            summarizerList.add(new Summarizer(summ30.getText(), new GaussianFunction(), 908, 1161, 1, 1, playerList));
        }
        if (summ31.isSelected()){
            summarizerList.add(new Summarizer(summ31.getText(), new TrapezoidalFunction(), 0, 0, 145, 185, playerList));
        }
        if (summ32.isSelected()){
            summarizerList.add(new Summarizer(summ32.getText(), new TrapezoidalFunction(), 145, 185, 350, 390, playerList));
        }
        if (summ33.isSelected()){
            summarizerList.add(new Summarizer(summ33.getText(), new TriangularFunction(), 350, 463, 575, 1, playerList));
        }
        if (summ34.isSelected()){
            summarizerList.add(new Summarizer(summ34.getText(), new TrapezoidalFunction(), 535, 575, 720, 760, playerList));
        }
        if (summ35.isSelected()){
            summarizerList.add(new Summarizer(summ35.getText(), new GaussianFunction(), 720, 925, 1, 1, playerList));
        }
        if (summ36.isSelected()){
            summarizerList.add(new Summarizer(summ36.getText(), new TrapezoidalFunction(), 0, 0, 35, 55, playerList));
        }
        if (summ37.isSelected()){
            summarizerList.add(new Summarizer(summ37.getText(), new TrapezoidalFunction(), 35, 55, 80, 100, playerList));
        }
        if (summ38.isSelected()){
            summarizerList.add(new Summarizer(summ38.getText(), new TriangularFunction(), 80, 118, 155, 1, playerList));
        }
        if (summ39.isSelected()){
            summarizerList.add(new Summarizer(summ39.getText(), new TrapezoidalFunction(), 145, 155, 170, 190, playerList));
        }
        if (summ40.isSelected()){
            summarizerList.add(new Summarizer(summ40.getText(), new GaussianFunction(), 170, 225, 1, 1, playerList));
        }
        if (summ41.isSelected()){
            summarizerList.add(new Summarizer(summ41.getText(), new TrapezoidalFunction(), 0, 0, 45, 75, playerList));
        }
        if (summ42.isSelected()){
            summarizerList.add(new Summarizer(summ42.getText(), new TrapezoidalFunction(), 45, 75, 107, 137, playerList));
        }
        if (summ43.isSelected()){
            summarizerList.add(new Summarizer(summ43.getText(), new TriangularFunction(), 107, 153, 199, 1, playerList));
        }
        if (summ44.isSelected()){
            summarizerList.add(new Summarizer(summ44.getText(), new TrapezoidalFunction(), 169, 199, 230, 260, playerList));
        }
        if (summ45.isSelected()){
            summarizerList.add(new Summarizer(summ45.getText(), new GaussianFunction(), 230, 307, 1, 1, playerList));
        }
        if (summ46.isSelected()){
            summarizerList.add(new Summarizer(summ46.getText(), new TrapezoidalFunction(), 0, 0, 534, 594, playerList));
        }
        if (summ47.isSelected()){
            summarizerList.add(new Summarizer(summ47.getText(), new TrapezoidalFunction(), 534, 594, 1101, 1161, playerList));
        }
        if (summ48.isSelected()){
            summarizerList.add(new Summarizer(summ48.getText(), new TriangularFunction(), 1101, 1415, 1728, 1, playerList));
        }
        if (summ49.isSelected()){
            summarizerList.add(new Summarizer(summ49.getText(), new TrapezoidalFunction(), 1668, 1728, 2235, 2295, playerList));
        }
        if (summ50.isSelected()){
            summarizerList.add(new Summarizer(summ50.getText(), new GaussianFunction(), 2235, 2832, 1, 1, playerList));
        }
        if (summ51.isSelected()){
            summarizerList.add(new Summarizer(summ51.getText(), new TrapezoidalFunction(), 160, 160, 169, 177, playerList));
        }
        if (summ52.isSelected()){
            summarizerList.add(new Summarizer(summ52.getText(), new TrapezoidalFunction(), 169, 177, 183, 191, playerList));
        }
        if (summ53.isSelected()){
            summarizerList.add(new Summarizer(summ53.getText(), new TriangularFunction(), 183, 194, 205, 1, playerList));
        }
        if (summ54.isSelected()){
            summarizerList.add(new Summarizer(summ54.getText(), new TrapezoidalFunction(), 197, 205, 211, 219, playerList));
        }
        if (summ55.isSelected()){
            summarizerList.add(new Summarizer(summ55.getText(), new GaussianFunction(), 211, 229, 1, 1, playerList));
        }
        if (summ56.isSelected()){
            summarizerList.add(new Summarizer(summ56.getText(), new TrapezoidalFunction(), 59, 59, 83, 95, playerList));
        }
        if (summ57.isSelected()){
            summarizerList.add(new Summarizer(summ57.getText(), new TrapezoidalFunction(), 83, 95, 106, 118, playerList));
        }
        if (summ58.isSelected()){
            summarizerList.add(new Summarizer(summ58.getText(), new TriangularFunction(), 106, 123, 139, 1, playerList));
        }
        if (summ59.isSelected()){
            summarizerList.add(new Summarizer(summ59.getText(), new TrapezoidalFunction(), 127, 139, 149, 161, playerList));
        }
        if (summ60.isSelected()){
            summarizerList.add(new Summarizer(summ60.getText(), new GaussianFunction(), 149, 170, 1, 1, playerList));
        }

    }

    public void chooseQualifiers(){
        if (qua1.isSelected()){
            qualifierList.add(new Qualifier(qua1.getText(), new TrapezoidalFunction(), 0, 0, 12, 23, playerList));
        }
        if (qua2.isSelected()){
            qualifierList.add(new Qualifier(qua2.getText(), new TrapezoidalFunction(), 13, 23, 30, 40, playerList));
        }
        if (qua3.isSelected()){
            qualifierList.add(new Qualifier(qua3.getText(), new TriangularFunction(), 30, 44, 57, 2137, playerList));
        }
        if (qua4.isSelected()){
            qualifierList.add(new Qualifier(qua4.getText(), new TrapezoidalFunction(), 47, 57, 64, 74, playerList));
        }
        if (qua5.isSelected()){
            qualifierList.add(new Qualifier(qua5.getText(), new GaussianFunction(), 64, 85, 1, 1, playerList));
        }
        if (qua6.isSelected()){
            qualifierList.add(new Qualifier(qua6.getText(), new TrapezoidalFunction(), 0, 0, 170, 210, playerList));
        }
        if (qua7.isSelected()){
            qualifierList.add(new Qualifier(qua7.getText(), new TrapezoidalFunction(), 180, 210, 375, 405, playerList));
        }
        if (qua8.isSelected()){
            qualifierList.add(new Qualifier(qua8.getText(), new TriangularFunction(), 375, 488, 601, 1, playerList));
        }
        if (qua9.isSelected()){
            qualifierList.add(new Qualifier(qua9.getText(), new TrapezoidalFunction(), 571, 601, 767, 797, playerList));
        }
        if (qua10.isSelected()){
            qualifierList.add(new Qualifier(qua10.getText(), new GaussianFunction(), 767, 978, 1, 1, playerList));
        }
        if (qua11.isSelected()){
            qualifierList.add(new Qualifier(qua11.getText(), new TrapezoidalFunction(), 0, 0, 21, 45, playerList));
        }
        if (qua12.isSelected()){
            qualifierList.add(new Qualifier(qua12.getText(), new TrapezoidalFunction(), 12, 45, 95, 119, playerList));
        }
        if (qua13.isSelected()){
            qualifierList.add(new Qualifier(qua13.getText(), new TriangularFunction(), 95, 135, 174, 1, playerList));
        }
        if (qua14.isSelected()){
            qualifierList.add(new Qualifier(qua14.getText(), new TrapezoidalFunction(), 150, 174, 205, 229, playerList));
        }
        if (qua15.isSelected()){
            qualifierList.add(new Qualifier(qua15.getText(), new GaussianFunction(), 205, 272, 1, 1, playerList));
        }
        if (qua16.isSelected()){
            qualifierList.add(new Qualifier(qua16.getText(), new TrapezoidalFunction(), 0, 0, 55, 81, playerList));
        }
        if (qua17.isSelected()){
            qualifierList.add(new Qualifier(qua17.getText(), new TrapezoidalFunction(), 55, 81, 124, 150, playerList));
        }
        if (qua18.isSelected()){
            qualifierList.add(new Qualifier(qua18.getText(), new TriangularFunction(), 124, 172, 219, 1, playerList));
        }
        if (qua19.isSelected()){
            qualifierList.add(new Qualifier(qua19.getText(), new TrapezoidalFunction(), 193, 219, 262, 288, playerList));
        }
        if (qua20.isSelected()){
            qualifierList.add(new Qualifier(qua20.getText(), new GaussianFunction(), 262, 344, 1, 1, playerList));
        }
        if (qua21.isSelected()){
            qualifierList.add(new Qualifier(qua21.getText(), new TrapezoidalFunction(), 0, 0, 57, 87, playerList));
        }
        if (qua22.isSelected()){
            qualifierList.add(new Qualifier(qua22.getText(), new TrapezoidalFunction(), 57, 87, 130, 160, playerList));
        }
        if (qua23.isSelected()){
            qualifierList.add(new Qualifier(qua23.getText(), new TriangularFunction(), 130, 183, 236, 1, playerList));
        }
        if (qua24.isSelected()){
            qualifierList.add(new Qualifier(qua24.getText(), new TrapezoidalFunction(), 206, 236, 281, 311, playerList));
        }
        if (qua25.isSelected()){
            qualifierList.add(new Qualifier(qua25.getText(), new GaussianFunction(), 281, 371, 1, 1, playerList));
        }
        if (qua26.isSelected()){
            qualifierList.add(new Qualifier(qua26.getText(), new TrapezoidalFunction(), 0, 0, 230, 270, playerList));
        }
        if (qua27.isSelected()){
            qualifierList.add(new Qualifier(qua27.getText(), new TrapezoidalFunction(), 230, 270, 442, 482, playerList));
        }
        if (qua28.isSelected()){
            qualifierList.add(new Qualifier(qua28.getText(), new TriangularFunction(), 442, 579, 715, 1, playerList));
        }
        if (qua29.isSelected()){
            qualifierList.add(new Qualifier(qua29.getText(), new TrapezoidalFunction(), 715, 755, 908, 948, playerList));
        }
        if (qua30.isSelected()){
            qualifierList.add(new Qualifier(qua30.getText(), new GaussianFunction(), 908, 1161, 1, 1, playerList));
        }
        if (qua31.isSelected()){
            qualifierList.add(new Qualifier(qua31.getText(), new TrapezoidalFunction(), 0, 0, 145, 185, playerList));
        }
        if (qua32.isSelected()){
            qualifierList.add(new Qualifier(qua32.getText(), new TrapezoidalFunction(), 145, 185, 350, 390, playerList));
        }
        if (qua33.isSelected()){
            qualifierList.add(new Qualifier(qua33.getText(), new TriangularFunction(), 350, 463, 575, 1, playerList));
        }
        if (qua34.isSelected()){
            qualifierList.add(new Qualifier(qua34.getText(), new TrapezoidalFunction(), 535, 575, 720, 760, playerList));
        }
        if (qua35.isSelected()){
            qualifierList.add(new Qualifier(qua35.getText(), new GaussianFunction(), 720, 925, 1, 1, playerList));
        }
        if (qua36.isSelected()){
            qualifierList.add(new Qualifier(qua36.getText(), new TrapezoidalFunction(), 0, 0, 35, 55, playerList));
        }
        if (qua37.isSelected()){
            qualifierList.add(new Qualifier(qua37.getText(), new TrapezoidalFunction(), 35, 55, 80, 100, playerList));
        }
        if (qua38.isSelected()){
            qualifierList.add(new Qualifier(qua38.getText(), new TriangularFunction(), 80, 118, 155, 1, playerList));
        }
        if (qua39.isSelected()){
            qualifierList.add(new Qualifier(qua39.getText(), new TrapezoidalFunction(), 145, 155, 170, 190, playerList));
        }
        if (qua40.isSelected()){
            qualifierList.add(new Qualifier(qua40.getText(), new GaussianFunction(), 170, 225, 1, 1, playerList));
        }
        if (qua41.isSelected()){
            qualifierList.add(new Qualifier(qua41.getText(), new TrapezoidalFunction(), 0, 0, 45, 75, playerList));
        }
        if (qua42.isSelected()){
            qualifierList.add(new Qualifier(qua42.getText(), new TrapezoidalFunction(), 45, 75, 107, 137, playerList));
        }
        if (qua43.isSelected()){
            qualifierList.add(new Qualifier(qua43.getText(), new TriangularFunction(), 107, 153, 199, 1, playerList));
        }
        if (qua44.isSelected()){
            qualifierList.add(new Qualifier(qua44.getText(), new TrapezoidalFunction(), 169, 199, 230, 260, playerList));
        }
        if (qua45.isSelected()){
            qualifierList.add(new Qualifier(qua45.getText(), new GaussianFunction(), 230, 307, 1, 1, playerList));
        }
        if (qua46.isSelected()){
            qualifierList.add(new Qualifier(qua46.getText(), new TrapezoidalFunction(), 0, 0, 534, 594, playerList));
        }
        if (qua47.isSelected()){
            qualifierList.add(new Qualifier(qua47.getText(), new TrapezoidalFunction(), 534, 594, 1101, 1161, playerList));
        }
        if (qua48.isSelected()){
            qualifierList.add(new Qualifier(qua48.getText(), new TriangularFunction(), 1101, 1415, 1728, 1, playerList));
        }
        if (qua49.isSelected()){
            qualifierList.add(new Qualifier(qua49.getText(), new TrapezoidalFunction(), 1668, 1728, 2235, 2295, playerList));
        }
        if (qua50.isSelected()){
            qualifierList.add(new Qualifier(qua50.getText(), new GaussianFunction(), 2235, 2832, 1, 1, playerList));
        }
        if (qua51.isSelected()){
            qualifierList.add(new Qualifier(qua51.getText(), new TrapezoidalFunction(), 160, 160, 169, 177, playerList));
        }
        if (qua52.isSelected()){
            qualifierList.add(new Qualifier(qua52.getText(), new TrapezoidalFunction(), 169, 177, 183, 191, playerList));
        }
        if (qua53.isSelected()){
            qualifierList.add(new Qualifier(qua53.getText(), new TriangularFunction(), 183, 194, 205, 1, playerList));
        }
        if (qua54.isSelected()){
            qualifierList.add(new Qualifier(qua54.getText(), new TrapezoidalFunction(), 197, 205, 211, 219, playerList));
        }
        if (qua55.isSelected()){
            qualifierList.add(new Qualifier(qua55.getText(), new GaussianFunction(), 211, 229, 1, 1, playerList));
        }
        if (qua56.isSelected()){
            qualifierList.add(new Qualifier(qua56.getText(), new TrapezoidalFunction(), 59, 59, 83, 95, playerList));
        }
        if (qua57.isSelected()){
            qualifierList.add(new Qualifier(qua57.getText(), new TrapezoidalFunction(), 83, 95, 106, 118, playerList));
        }
        if (qua58.isSelected()){
            qualifierList.add(new Qualifier(qua58.getText(), new TriangularFunction(), 106, 123, 139, 1, playerList));
        }
        if (qua59.isSelected()){
            qualifierList.add(new Qualifier(qua59.getText(), new TrapezoidalFunction(), 127, 139, 149, 161, playerList));
        }
        if (qua60.isSelected()){
            qualifierList.add(new Qualifier(qua60.getText(), new GaussianFunction(), 149, 170, 1, 1, playerList));
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

    public void generateWithAdd() throws IOException {
        clearAll();
        chooseQualifiers();
        chooseSummarizers();
        loadData();
        CompoundSummarizer CompoundSummarizer = new CompoundSummarizer(false);
        CompoundSummarizer.addAll(summarizerList);
        CompoundQualifier CompoundQualifier = new CompoundQualifier(false);
        CompoundQualifier.addAll(qualifierList);
        if (qualifierList.isEmpty()) {
            for (Quantifier quantifier : quantifierList) {
                if (!quantifier.isAbsolute()) {
                    linguisticSummaryList.add(new LinguisticSummary(quantifier, CompoundSummarizer));
                }
            }
        } else {
            for (Quantifier quantifier : quantifierList) {
                if (!quantifier.isAbsolute()) {
                    linguisticSummaryList.add(new LinguisticSummary(quantifier, CompoundQualifier, CompoundSummarizer));
                }
            }
        }
        for (LinguisticSummary summary : linguisticSummaryList) {
            summary.calculateMeasures(playerList);
        }
        linguisticSummaryList.removeIf(linguisticSummary -> linguisticSummary.T1(playerList) == 0);
        linguisticSummaryList.sort(LinguisticSummary::compareTo);
        linguisticSummaryListProperty.set(FXCollections.observableArrayList(linguisticSummaryList));
        summList.itemsProperty().bind(linguisticSummaryListProperty);
        save();
    }

    public void generateWithOr() throws IOException {
        clearAll();
        chooseQualifiers();
        chooseSummarizers();
        loadData();
        CompoundSummarizer CompoundSummarizer = new CompoundSummarizer(true);
        CompoundSummarizer.addAll(summarizerList);
        CompoundQualifier CompoundQualifier = new CompoundQualifier(true);
        CompoundQualifier.addAll(qualifierList);
        if (qualifierList.isEmpty()) {
            for (Quantifier quantifier : quantifierList) {
                if (!quantifier.isAbsolute()) {
                    //CompoundQualifier CompoundQualifier = new CompoundQualifier(true);
                    linguisticSummaryList.add(new LinguisticSummary(quantifier, CompoundSummarizer));
                    //linguisticSummaryList.add(new LinguisticSummary(quantifier,new CompoundSummarizer(summarizerList.get(0),summarizerList.get(1),true)));
                }
            }
        } else {
            for (Quantifier quantifier : quantifierList) {
                if (!quantifier.isAbsolute()) {
                    linguisticSummaryList.add(new LinguisticSummary(quantifier, CompoundQualifier, CompoundSummarizer));
                }
            }
        }
        for (LinguisticSummary summary : linguisticSummaryList){
            summary.calculateMeasures(playerList);
        }

        linguisticSummaryListProperty.set(FXCollections.observableArrayList(linguisticSummaryList));
        summList.itemsProperty().bind(linguisticSummaryListProperty);
        save();
    }

    public void clearAll(){
        playerList.clear();
        qualifierList.clear();
        quantifierList.clear();
        summarizerList.clear();
    }

    public void generate() throws IOException {
        clearAll();
        chooseQualifiers();
        chooseSummarizers();
        loadData();
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
                        for (Summarizer summarizer : summarizerList) {
                            linguisticSummaryList.add(new LinguisticSummary(quantifier, qualifier, summarizer));
                        }
                    }
                }
            }
        }
        for (LinguisticSummary summary : linguisticSummaryList) {
            summary.calculateMeasures(playerList);
        }
        //linguisticSummaryList.removeIf(linguisticSummary -> linguisticSummary.T1(playerList) == 0);
        linguisticSummaryList.sort(LinguisticSummary::compareTo);
        linguisticSummaryListProperty.set(FXCollections.observableArrayList(linguisticSummaryList));
        summList.itemsProperty().bind(linguisticSummaryListProperty);
        save();
    }

    public void addNewSummarizer(){
        if (newD.getText().equals("") && newC.getText().equals("")){
            summarizerList.add(new Summarizer(newName.getText(), new GaussianFunction(), Double.parseDouble(newA.getText()), Double.parseDouble(newB.getText()), -1, -1, playerList));
        } else if (newD.getText().equals("")){
            summarizerList.add(new Summarizer(newName.getText(), new TriangularFunction(), Double.parseDouble(newA.getText()), Double.parseDouble(newB.getText()), Double.parseDouble(newC.getText()), -1, playerList));
        } else {
            summarizerList.add(new Summarizer(newName.getText(), new TrapezoidalFunction(), Double.parseDouble(newA.getText()), Double.parseDouble(newB.getText()), Double.parseDouble(newC.getText()), Double.parseDouble(newD.getText()), playerList));
        }
    }

    public void addNewQuantifier(){
        if (newD.getText().equals("") && newC.getText().equals("")){
            quantifierList.add(new Quantifier(newName.getText(),new GaussianFunction(),Double.parseDouble(newA.getText()),Double.parseDouble(newB.getText()),-1,-1,newAbsolute.isSelected()));
        } else if (newD.getText().equals("")){
            quantifierList.add(new Quantifier(newName.getText(),new TriangularFunction(),Double.parseDouble(newA.getText()),Double.parseDouble(newB.getText()),Double.parseDouble(newC.getText()),-1,newAbsolute.isSelected()));
        } else {
            quantifierList.add(new Quantifier(newName.getText(),new TrapezoidalFunction(),Double.parseDouble(newA.getText()),Double.parseDouble(newB.getText()),Double.parseDouble(newC.getText()),Double.parseDouble(newD.getText()),newAbsolute.isSelected()));
        }
    }

    public void addNewQualifiers(){
        if (newD.getText().equals("") && newC.getText().equals("")){
            qualifierList.add(new Qualifier(newName.getText(), new GaussianFunction(), Double.parseDouble(newA.getText()), Double.parseDouble(newB.getText()), -1, -1, playerList));
        } else if (newD.getText().equals("")){
            qualifierList.add(new Qualifier(newName.getText(), new TriangularFunction(), Double.parseDouble(newA.getText()), Double.parseDouble(newB.getText()), Double.parseDouble(newC.getText()), -1, playerList));
        } else {
            qualifierList.add(new Qualifier(newName.getText(), new TrapezoidalFunction(), Double.parseDouble(newA.getText()), Double.parseDouble(newB.getText()), Double.parseDouble(newC.getText()), Double.parseDouble(newD.getText()), playerList));
        }
    }



    public void save() throws IOException {


        List<List<LinguisticSummary>> rows = Collections.singletonList(linguisticSummaryList);
        List<List<MultiLinguisticSummary>> rows2 = Collections.singletonList(multiLinguisticSummaries);
        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("\n");

        for (List<MultiLinguisticSummary> rowData : rows2) {
            csvWriter.append(rowData.toString());
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();
    }


    @FXML
    public ComboBox<String> f; //liga
    @FXML
    public ComboBox<String> f1; //liga
    @FXML
    public ComboBox<String> k;  //kraj
    @FXML
    public ComboBox<String> k1;  //kraj

    @FXML
    public ComboBox<String> help;

    @FXML
    public ComboBox<Integer> help1;

    @FXML
    public void initialize() {
        loadData();
        //chooseQuantifier();
        help.getItems().addAll(Arrays.asList("Leagues","Nationalities"));
        help1.getItems().addAll(Arrays.asList(1,2,3,4));
        k.getItems().addAll(Arrays.asList("United States","Jordan","Palestine","France","Senegal","Antigua and Barbuda","Italy","Democratic Republic of the Congo","Morocco","Belgium","Finland","Guam","Serbia","Norway","Central African Republic","Slovenia","Ivory Coast","Denmark","Netherlands","Romania","Canada","Bosnia and Herzegovina","South Korea","New Zealand","Australia","Russia","Lithuania","Hungary","Portugal","Dominican Republic","Austria","Argentina","Mali","England","Wales","Dominica","Bahamas","Switzerland","Haiti","Turkey","Poland","Germany","Croatia","Montenegro","Iraq","Sweden","China","Taiwan","Puerto Rico","Burundi","North Macedonia","Albania","Tunisia","Belarus","Cyprus","Angola","Greece","Egypt","Scotland","Azerbaijan","Brazil","Guinea-Bissau","Venezuela","Cameroon","Nigeria","U.S. Virgin Islands","Jamaica","Israel","Spain","Slovakia","Cuba","Iceland","Mexico","Czech Republic","Barbados","Ireland","Estonia","Qatar","Algeria","Lebanon","Gibraltar","Ukraine","Luxembourg","Uganda","Samoa","Bulgaria","Cape Verde","Mongolia","Trinidad and Tobago","Madagascar","Georgia","South Sudan","Panama","Kazakhstan","Ghana","Malta","Uruguay","Zimbabwe","Syria","Andorra","Republic of Suriname","Latvia","Saint Vincent and the Grenadines","Uzbekistan","Guyana","Kosovo","Gabon","Soa","Singapore","Chad","Moldova","Japan","South Africa","Rwanda","Philippines","Republic of the Congo","Colombia","Tanzania","Iran","Paraguay"));
        k1.getItems().addAll(Arrays.asList("United States","Jordan","Palestine","France","Senegal","Antigua and Barbuda","Italy","Democratic Republic of the Congo","Morocco","Belgium","Finland","Guam","Serbia","Norway","Central African Republic","Slovenia","Ivory Coast","Denmark","Netherlands","Romania","Canada","Bosnia and Herzegovina","South Korea","New Zealand","Australia","Russia","Lithuania","Hungary","Portugal","Dominican Republic","Austria","Argentina","Mali","England","Wales","Dominica","Bahamas","Switzerland","Haiti","Turkey","Poland","Germany","Croatia","Montenegro","Iraq","Sweden","China","Taiwan","Puerto Rico","Burundi","North Macedonia","Albania","Tunisia","Belarus","Cyprus","Angola","Greece","Egypt","Scotland","Azerbaijan","Brazil","Guinea-Bissau","Venezuela","Cameroon","Nigeria","U.S. Virgin Islands","Jamaica","Israel","Spain","Slovakia","Cuba","Iceland","Mexico","Czech Republic","Barbados","Ireland","Estonia","Qatar","Algeria","Lebanon","Gibraltar","Ukraine","Luxembourg","Uganda","Samoa","Bulgaria","Cape Verde","Mongolia","Trinidad and Tobago","Madagascar","Georgia","South Sudan","Panama","Kazakhstan","Ghana","Malta","Uruguay","Zimbabwe","Syria","Andorra","Republic of Suriname","Latvia","Saint Vincent and the Grenadines","Uzbekistan","Guyana","Kosovo","Gabon","Soa","Singapore","Chad","Moldova","Japan","South Africa","Rwanda","Philippines","Republic of the Congo","Colombia","Tanzania","Iran","Paraguay"));
        f.getItems().addAll(Arrays.asList("NBA","Euroleague", "Eurocup", "Australian-NBL", "German-BBL", "Italian-Lega-Basket-Serie-A", "Spanish-ACB","French-Jeep-Elite", "Argentinian-Liga-A","Balkan-BIL","Austrian-A-Bundesliga","Belarusian-BPL","Belgium-Scooore-League", "Bosnian-BiG-Liga","Brazylian-NBB","British-BBL","Bulgarian-NBL","Canadian-NBL","Chinese-CBA","Croatian-A-1-Liga","Czech-NBL","Danish-Basketligaen","Finnish-Korisliiga","Greek-HEBA-A1", "Hungarian-NBIA", "Israeli-BSL","Lithuanian-LKL", "Macedonian-Superleague", "Mexican-LNBP", "Netherlands-DBL", "New-Zealand-NBL", "Norwegian-BLNO","Polish-TBL","Romanian-Divizia-A", "Serbian-KLS", "Slovakian-Extraliga","Slovenian-SKL","South-Korean-KBL","Swedish-Basketligan", "Swiss-LNA", "Turkish-BSL", "Ukrainian-Superleague", "Georgian-Super-Liga", "Lebanese-Division-A", "Luxembourg-Total-League", "FIBA-Europe-Cup","Japanese-BLeague", "Kosovo-FBK"));
        f1.getItems().addAll(Arrays.asList("NBA","Euroleague", "Eurocup", "Australian-NBL", "German-BBL", "Italian-Lega-Basket-Serie-A", "Spanish-ACB","French-Jeep-Elite", "Argentinian-Liga-A","Balkan-BIL","Austrian-A-Bundesliga","Belarusian-BPL","Belgium-Scooore-League", "Bosnian-BiG-Liga","Brazylian-NBB","British-BBL","Bulgarian-NBL","Canadian-NBL","Chinese-CBA","Croatian-A-1-Liga","Czech-NBL","Danish-Basketligaen","Finnish-Korisliiga","Greek-HEBA-A1", "Hungarian-NBIA", "Israeli-BSL","Lithuanian-LKL", "Macedonian-Superleague", "Mexican-LNBP", "Netherlands-DBL", "New-Zealand-NBL", "Norwegian-BLNO","Polish-TBL","Romanian-Divizia-A", "Serbian-KLS", "Slovakian-Extraliga","Slovenian-SKL","South-Korean-KBL","Swedish-Basketligan", "Swiss-LNA", "Turkish-BSL", "Ukrainian-Superleague", "Georgian-Super-Liga", "Lebanese-Division-A", "Luxembourg-Total-League", "FIBA-Europe-Cup","Japanese-BLeague", "Kosovo-FBK"));
    }

    protected ListProperty<MultiLinguisticSummary> multiLinguisticSummaryListProperty = new SimpleListProperty<>();

    protected List<MultiLinguisticSummary> multiLinguisticSummaries = new ArrayList<>();

    public void test2() {
        List<Player> p1 = new ArrayList<>(playerList);
        List<Player> p2 = new ArrayList<>(playerList);

        String p1Name = "";
        String p2Name = "";
        String var = help.getValue();
        if (var.equals("Leagues")) {
            p1Name = f.getValue();
            String finalP1Name = p1Name;
            p1.removeIf(player -> !player.getLeague().equals(finalP1Name));
            p2Name = f1.getValue();
            String finalP2Name = p2Name;
            p2.removeIf(player -> !player.getLeague().equals(finalP2Name));
        } else if (var.equals("Nationalities")) {
            p1Name = k.getValue();
            String finalP1Name1 = p1Name;
            p1.removeIf(player -> !player.getNationality().equals(finalP1Name1));
            p2Name = k1.getValue();
            String finalP2Name1 = p2Name;
            p2.removeIf(player -> !player.getNationality().equals(finalP2Name1));
        } else {
            //abort
        }
        int form = help1.getValue();
        CompoundSummarizer CompoundSummarizer = new CompoundSummarizer(false);
        CompoundSummarizer.addAll(summarizerList);
        CompoundQualifier CompoundQualifier = new CompoundQualifier(false);
        CompoundQualifier.addAll(qualifierList);
        if (form == 1) {
            for (Quantifier quantifier : quantifierList) {

                if (!quantifier.isAbsolute()) {
                    multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, quantifier, CompoundSummarizer, form));
                }

            }
        } else if (form == 2) {
            for (Quantifier quantifier : quantifierList) {

                if (!quantifier.isAbsolute()) {
                    multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, quantifier, CompoundSummarizer, CompoundQualifier, form));
                }


            }
        } else if (form == 3) {
            for (Quantifier quantifier : quantifierList) {

                if (!quantifier.isAbsolute()) {
                    multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, quantifier, CompoundSummarizer, CompoundQualifier, form));
                }


            }
        } else if (form == 4) {

            multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, CompoundSummarizer, form));

        }
        multiLinguisticSummaries.sort(MultiLinguisticSummary::compareTo);
        multiLinguisticSummaryListProperty.set(FXCollections.observableArrayList(multiLinguisticSummaries));
        summList.itemsProperty().bind(multiLinguisticSummaryListProperty);
    }


    public void test3() throws IOException {
        List<Player> p1 = new ArrayList<>(playerList);
        List<Player> p2 = new ArrayList<>(playerList);

        String p1Name = "";
        String p2Name = "";
        String var = help.getValue();
        if (var.equals("Leagues")) {
            p1Name = f.getValue();
            String finalP1Name = p1Name;
            p1.removeIf(player -> !player.getLeague().equals(finalP1Name));
            p2Name = f1.getValue();
            String finalP2Name = p2Name;
            p2.removeIf(player -> !player.getLeague().equals(finalP2Name));
        } else if (var.equals("Nationalities")) {
            p1Name = k.getValue();
            String finalP1Name1 = p1Name;
            p1.removeIf(player -> !player.getNationality().equals(finalP1Name1));
            p2Name = k1.getValue();
            String finalP2Name1 = p2Name;
            p2.removeIf(player -> !player.getNationality().equals(finalP2Name1));
        } else {
            //abort
        }
        int form = help1.getValue();
        if (form == 1) {
            for (Quantifier quantifier : quantifierList) {
                for (Summarizer summarizer : summarizerList) {
                    if (!quantifier.isAbsolute()) {
                        multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, quantifier, summarizer, form));
                    }
                }
            }
        }
        else if (form == 2){
            for (Quantifier quantifier : quantifierList){
                for (Summarizer summarizer : summarizerList){
                    for (Qualifier qualifier : qualifierList) {
                        if (!quantifier.isAbsolute()) {
                            multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, quantifier, summarizer, qualifier, form));
                        }
                    }
                }
            }
        }
        else if (form == 3){
            for (Quantifier quantifier : quantifierList){
                for (Summarizer summarizer : summarizerList){
                    for (Qualifier qualifier : qualifierList) {
                        if (!quantifier.isAbsolute()) {
                            multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, quantifier, summarizer, qualifier, form));
                        }
                    }
                }
            }
        } else if (form == 4) {
            for (Summarizer summarizer : summarizerList) {
                multiLinguisticSummaries.add(new MultiLinguisticSummary(p1, p1Name, p2, p2Name, summarizer, form));
            }
        }
        save();
        multiLinguisticSummaries.sort(MultiLinguisticSummary::compareTo);
        multiLinguisticSummaryListProperty.set(FXCollections.observableArrayList(multiLinguisticSummaries));
        summList.itemsProperty().bind(multiLinguisticSummaryListProperty);
    }








}
