package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;



    @FXML
    private Button vider;

    @FXML
    private Button tracer;

    @FXML
    private TextField comp1;

    @FXML
    private TextField comp2;

    @FXML
    private TextField comp3;

    @FXML
    private TextField comp4;

    @FXML
    private TextField comp5;

    @FXML
    private TextField comp6;

    @FXML
    private Circle pointcomp1 = new Circle();

    @FXML
    private Circle pointcomp2 = new Circle();

    @FXML
    private Circle pointcomp3 = new Circle();

    @FXML
    private Circle pointcomp4 = new Circle();

    @FXML
    private Circle pointcomp5 = new Circle();

    @FXML
    private Circle pointcomp6 = new Circle();

    @FXML
    private Label labelerreur;

    @FXML
    private double valeurcomp1;

    @FXML
    private double valeurcomp2;

    @FXML
    private double valeurcomp3;

    @FXML
    private double valeurcomp4;

    @FXML
    private double valeurcomp5;

    @FXML
    private double valeurcomp6;

    @FXML
    private Pane toile;

    @FXML
    private Line line;


    @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("initialisation");
        comp1.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                if (!comp1.getText().isEmpty()) {
                    valeurcomp1 = Double.parseDouble(comp1.getText());
                    if (valeurcomp1 < 0 || valeurcomp1 > 20) {
                        labelerreur.setText("Erreur de saisie :\n Les valeur doivent étre entre 0 et 20");
                    } else {
                        pointcomp1.setCenterX(getXRadarChart(valeurcomp1, 1));
                        pointcomp1.setCenterY(getYRadarChart(valeurcomp1, 1));
                        pointcomp1.setRadius(5);
                        toile.getChildren().add(pointcomp1);

                    }
                }
            }
        });
        comp1.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                if (!comp1.getText().isEmpty()) {
                    valeurcomp1 = Double.parseDouble(comp1.getText());
                    if (valeurcomp1 < 0 || valeurcomp1 > 20) {
                        labelerreur.setText("Erreur de saisie :\n Les valeur doivent étre entre 0 et 20");
                    } else {
                        pointcomp1.setCenterX(getXRadarChart(valeurcomp1, 1));
                        pointcomp1.setCenterY(getYRadarChart(valeurcomp1, 1));
                        pointcomp1.setRadius(5);
                        toile.getChildren().add(pointcomp1);

                    }
                }
            }
        });
        comp2.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                if (!comp2.getText().isEmpty()) {
                    valeurcomp2 = Double.parseDouble(comp2.getText());
                    if (valeurcomp2 < 0 || valeurcomp2 > 20) {
                        labelerreur.setText("Erreur de saisie :\n Les valeur doivent étre entre 0 et 20");
                    } else {
                        pointcomp2.setCenterX(getXRadarChart(valeurcomp2, 5));
                        pointcomp2.setCenterY(getYRadarChart(valeurcomp2, 5));
                        pointcomp2.setRadius(5);
                        toile.getChildren().add(pointcomp2);

                    }
                }
            }
        });
        comp3.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                if (!comp3.getText().isEmpty()) {
                    valeurcomp3 = Double.parseDouble(comp3.getText());
                    if (valeurcomp3 < 0 || valeurcomp3 > 20) {
                        labelerreur.setText("Erreur de saisie :\n Les valeur doivent étre entre 0 et 20");
                    } else {
                        pointcomp3.setCenterX(getXRadarChart(valeurcomp3, 3));
                        pointcomp3.setCenterY(getYRadarChart(valeurcomp3, 3));
                        pointcomp3.setRadius(3);
                        toile.getChildren().add(pointcomp3);

                    }
                }
            }
        });
        comp4.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                if (!comp4.getText().isEmpty()) {
                    valeurcomp4 = Double.parseDouble(comp4.getText());
                    if (valeurcomp4 < 0 || valeurcomp4 > 20) {
                        labelerreur.setText("Erreur de saisie :\n Les valeur doivent étre entre 0 et 20");
                    } else {
                        pointcomp4.setCenterX(getXRadarChart(valeurcomp4, 4));
                        pointcomp4.setCenterY(getYRadarChart(valeurcomp4, 4));
                        pointcomp4.setRadius(5);
                        toile.getChildren().add(pointcomp4);

                    }
                }
            }
        });
        comp5.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                if (!comp5.getText().isEmpty()) {
                    valeurcomp5 = Double.parseDouble(comp5.getText());
                    if (valeurcomp5 < 0 || valeurcomp5 > 20) {
                        labelerreur.setText("Erreur de saisie :\n Les valeur doivent étre entre 0 et 20");
                    } else {
                        pointcomp5.setCenterX(getXRadarChart(valeurcomp5, 5));
                        pointcomp5.setCenterY(getYRadarChart(valeurcomp5, 5));
                        pointcomp5.setRadius(5);
                        toile.getChildren().add(pointcomp5);

                    }
                }
            }
        });
        comp6.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                if (!comp6.getText().isEmpty()) {
                    valeurcomp6 = Double.parseDouble(comp6.getText());
                    if (valeurcomp6 < 0 || valeurcomp5 > 20) {
                        labelerreur.setText("Erreur de saisie :\n Les valeur doivent étre entre 0 et 20");
                    } else {
                        pointcomp6.setCenterX(getXRadarChart(valeurcomp6, 6));
                        pointcomp6.setCenterY(getYRadarChart(valeurcomp6, 6));
                        pointcomp6.setRadius(5);
                        toile.getChildren().add(pointcomp6);

                    }
                }
            }
        });
        toile.getChildren().add(pointcomp1);
        toile.getChildren().add(pointcomp2);
        toile.getChildren().add(pointcomp3);
        toile.getChildren().add(pointcomp4);
        toile.getChildren().add(pointcomp5);
        toile.getChildren().add(pointcomp6);
        labelerreur.setStyle("-fx-text-fill: #0a0908");
        labelerreur.setText("");
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
}













