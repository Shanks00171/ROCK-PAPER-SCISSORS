package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller{
    @FXML
    public ImageView comChoice;
    @FXML
    public ImageView useChoice;
    @FXML
    public ImageView result;
    @FXML
    public Label userChoice;
    @FXML
    public Label computerChoice;
    @FXML
    public Label resultText;
    @FXML
    public Button rockButton;
    @FXML
    public Button paperButton;
    @FXML
    public Button scissorButton;
    @FXML
    public void onButtonClicked(ActionEvent event){
        int ch = Game.computerChoice();
        int fi;
        if(event.getSource().equals(rockButton)){
            userChoice.setText("You Chose Rock");
            useChoice.setImage(new Image("Rock_Player.png"));
            setComImage(ch);
            fi = getResult(1,ch);
            if(fi==1){
                result.setImage(new Image("PlayerWins.png"));
            }
            if(fi==2){
                result.setImage(new Image("ComputerWins.png"));
            }
            if(fi==3){
                result.setImage(new Image("TIE.png"));
            }
        }
        if(event.getSource().equals(paperButton)){
            userChoice.setText("You Chose Paper");
            useChoice.setImage(new Image("PAPER_Player.png"));
            setComImage(ch);
            fi = getResult(2,ch);
            if(fi==1){
                result.setImage(new Image("PlayerWins.png"));
            }
            if(fi==2){
                result.setImage(new Image("ComputerWins.png"));
            }
            if(fi==3){
                result.setImage(new Image("TIE.png"));
            }
        }
        if(event.getSource().equals(scissorButton)){
            userChoice.setText("You Chose Scissors");
            useChoice.setImage(new Image("Scissors_Player.png"));
            setComImage(ch);
            fi = getResult(3,ch);
            if(fi==1){
                result.setImage(new Image("PlayerWins.png"));
            }
            if(fi==2){
                result.setImage(new Image("ComputerWins.png"));
            }
            if(fi==3){
                result.setImage(new Image("TIE.png"));
            }
        }
    }
    public void setComImage(int ch){
        if(ch==1){
            comChoice.setImage(new Image("Rock_Com.png"));
            computerChoice.setText("Computer Chose ROCK");
        }
        else if(ch==2){
            comChoice.setImage(new Image("Paper_Com.png"));
            computerChoice.setText("Computer Chose Paper");
        }
        else if(ch==3){
            comChoice.setImage(new Image("Scissors_Com.png"));
            computerChoice.setText("Computer Chose Scissors");
        }
    }
    public int getResult(int player, int computer){
        int re = 0;
        if(player==computer){
            re = 3;
            resultText.setText("Tie");
        }
        else if(player==1 && computer==2){
            re = 2;
            resultText.setText("Computer Wins");
        }
        else if(player==1 && computer==3){
            re = 1;
            resultText.setText("You Win");
        }
        else if(player==2 && computer==1){
            re = 1;
            resultText.setText("You Win");
        }
        else if(player==2 && computer==3){
            re = 2;
            resultText.setText("Computer Wins");
        }
        else if(player==3 && computer==1){
            re = 2;
            resultText.setText("Computer Wins");
        }
        else if(player==3 && computer==2){
            re = 1;
            resultText.setText("You Win");
        }
        return re;
    }
}
