package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import java.util.Random;

public class Controller {

    private String messages[]={
            "Hello! Can I buy you coffee",
            "Hello! Who Are you",
            "Hello! Can you define yourself",
            "Hello!! Do you believe you are here",
            "Hello! Can you believe this?",
            "Hello!! I know you can do this"
    };

    private Random rand=new Random();
    @FXML
    private Text actionTarget;

    @FXML
    public void generateAnswerForUser(){
        actionTarget.setText(messages[rand.nextInt(messages.length)]);
    }

}
