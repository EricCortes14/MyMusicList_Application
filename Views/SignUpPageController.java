
package Views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SignUpPageController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField confirmPassword;
    @FXML
    private TextField email;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

     @FXML
    private void signUpButtonClicked(ActionEvent _event) throws IOException {
        
        String theUsername = this.username.getText();
        String thePassword = this.password.getText();
        String theConfirmPassword = this.confirmPassword.getText();
        String theEmail = this.email.getText();
        
        if("username".equals(theUsername)){
            Parent loginPageErrorRoot = FXMLLoader.load(getClass().getResource("SignUpPageError.fxml"));
            Scene loginPageErrorScene = new Scene(loginPageErrorRoot);
            Stage loginPageErrorStage = (Stage)((Node) _event.getSource()).getScene().getWindow();
            loginPageErrorStage.setScene(loginPageErrorScene);
            loginPageErrorStage.show();
        }
        else if(!theConfirmPassword.equals(thePassword)){
            Parent loginPageError2Root = FXMLLoader.load(getClass().getResource("SignUpPageError2.fxml"));
            Scene loginPageError2Scene = new Scene(loginPageError2Root);
            Stage loginPageError2Stage = (Stage)((Node) _event.getSource()).getScene().getWindow();
            loginPageError2Stage.setScene(loginPageError2Scene);
            loginPageError2Stage.show();
        }
        else{
            Parent loginPageRoot = FXMLLoader.load(getClass().getResource("LoginPageUI.fxml"));
            Scene loginPageScene = new Scene(loginPageRoot);
            Stage loginPageStage = (Stage)((Node) _event.getSource()).getScene().getWindow();
            loginPageStage.setScene(loginPageScene);
            loginPageStage.show();
        }
    }

    @FXML
    private void returnToLoginPageClicked(ActionEvent _event) throws IOException {
        Parent loginPageRoot = FXMLLoader.load(getClass().getResource("LoginPageUI.fxml"));
        Scene loginPageScene = new Scene(loginPageRoot);
        Stage loginPageStage = (Stage)((Node) _event.getSource()).getScene().getWindow();
        loginPageStage.setScene(loginPageScene);
        loginPageStage.show();
    }
    
}
