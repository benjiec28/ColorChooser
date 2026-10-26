import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
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
}
