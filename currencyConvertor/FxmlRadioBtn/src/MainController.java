import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainController implements Initializable{

    @FXML
    private RadioButton cadToUKP;

    @FXML
    private RadioButton cadToUsD;

    @FXML
    private TextArea tareaTemp;

    @FXML
    private Button txtClear;

    @FXML
    private Button txtExit;


    @FXML
    private TextField txtCad;

    ToggleGroup tg=new ToggleGroup();
    

//Method for converting cad to UK Pound
    @FXML
    void cadToUK(ActionEvent event) 
    {
           if(txtCad.getText().isEmpty())
           {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error message");
            a.setContentText("cant have empty value in textfield");
            a.show();
           }
           else
           {
            double temp=Double.parseDouble(txtCad.getText());           
            double a=(temp*0.55);
             tareaTemp.clear();   
            tareaTemp.appendText(a+" UK Pound\n");   
           }   

    }


    // Method to convert cad to US Doller
    @FXML
    void cadToUs(ActionEvent event) 
    {
        
        double temp=Double.parseDouble(txtCad.getText());           
        double a=(temp*0.77);
              tareaTemp.clear();
        tareaTemp.appendText(a+" US dollar\n");      
    }
 //  method to clear textField
    @FXML
    void txtClear1(ActionEvent event) 
    {
        txtCad.clear();
        
        tareaTemp.clear();

    }
//method to exit 
    @FXML
    void txtExit1(ActionEvent event) 
    {
        Alert a=new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmation message");
        a.setContentText("Click OK to exit!!");
        a.showAndWait().ifPresent(response -> {
            if(response==ButtonType.OK)
            {
                System.exit(0);
            }
        });
      
    }


    // initializable method to initialises radio buttons
    public void initialize(URL url,ResourceBundle rBundle)
    {
        cadToUKP.setToggleGroup(tg);
        cadToUsD.setToggleGroup(tg);
    }
}

