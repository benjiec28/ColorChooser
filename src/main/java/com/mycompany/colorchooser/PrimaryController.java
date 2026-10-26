package com.mycompany.colorchooser;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PrimaryController {

    @FXML
    private Label alphaLabel;

    @FXML
    private Slider alphaSlider;

    @FXML
    private TextField alphaTextField;

    @FXML
    private Label blueLabel;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField blueTextField;

    @FXML
    private Circle circle;

    @FXML
    private Rectangle colorRectangle;

    @FXML
    private Label greenLabel;

    @FXML
    private Slider greenSlider;

    @FXML
    private TextField greenTextField;

    @FXML
    private Label redLabel;

    @FXML
    private Slider redSlider;

    @FXML
    private TextField redTextField;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    public void initialize() {
        redTextField.textProperty().bind(
            redSlider.valueProperty().asString("%.0f"));
        
        redSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            red = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        
        greenTextField.textProperty().bind(
            greenSlider.valueProperty().asString("%.0f"));
        
        greenSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            green = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        
        blueTextField.textProperty().bind(
            blueSlider.valueProperty().asString("%.0f"));
        
        blueSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            blue = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        
        alphaTextField.textProperty().bind(
            alphaSlider.valueProperty().asString("%.0f"));
        
        alphaSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
    }
}
