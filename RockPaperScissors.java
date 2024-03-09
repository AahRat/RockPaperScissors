import javax.swing.*;
import java.awt.*;
public class RockPaperScissors {
    
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame();
        mainWindow.setTitle("Rock Paper Scissors");


        JButton rockButton = new JButton("ROCK");
        mainWindow.add(rockButton);
        rockButton.setBounds(10,100,85,50);

        JButton paperButton = new JButton("PAPER");
        mainWindow.add(paperButton);
        paperButton.setBounds(105,100,85,50);

        JButton sciButton = new JButton("SCISSORS");
        mainWindow.add(sciButton);
        sciButton.setBounds(200,100,85,50);
        

        JLabel finalLabel = new JLabel("Outcome");
        mainWindow.add(finalLabel);
        finalLabel.setBounds(200,350,100,100);

        JLabel compLabel = new JLabel("Choice");
        mainWindow.add(compLabel);
        compLabel.setBounds(300,175,150,150);

        JLabel headLabel = new JLabel("ROCK PAPER SCISSORS");
        mainWindow.add(headLabel);
        Font heading = new Font("Default", 0, 20);
        headLabel.setFont(heading);
        headLabel.setBounds(100,20,350, 75);


        JLabel userLabel = new JLabel("Text");
        mainWindow.add(userLabel);
        userLabel.setBounds(65,175,150,150);
        rockButton.addActionListener((e)->{
            userLabel.setText("ROCK");
            computerMove(userLabel, compLabel, finalLabel);
        });

        paperButton.addActionListener((e)->{userLabel.setText("PAPER");
        computerMove(userLabel, compLabel, finalLabel);
    });
        sciButton.addActionListener((e)->{userLabel.setText("SCISSORS");
        computerMove(userLabel, compLabel, finalLabel);
    });
        

        




        mainWindow.setLayout(null);
        mainWindow.setSize(500,500);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }

    public static void checkForWin(String userMove, String compMove , JLabel finalLabel){


        if(userMove.equals("ROCK") && compMove.equals("SCISSORS")){
            finalLabel.setText("You Win!");
    }
        else if(userMove.equals("ROCK") && compMove.equals("PAPER")){
            finalLabel.setText("Computer Wins!");
    }
        else if(userMove.equals("ROCK") && compMove.equals("ROCK")){
            finalLabel.setText("TIE!");
    }
        else if(userMove.equals("PAPER") && compMove.equals("ROCK")){
        finalLabel.setText("You Win!");
    }
        else if(userMove.equals("PAPER") && compMove.equals("SCISSORS")){
        finalLabel.setText("Computer Wins");
    }
        else if(userMove.equals("PAPER") && compMove.equals("PAPER")){
        finalLabel.setText("TIE!");
    }
        else if(userMove.equals("SCISSORS") && compMove.equals("ROCK")){
        finalLabel.setText("Computer Wins");
    }
        else if(userMove.equals("SCISSORS") && compMove.equals("PAPER")){
        finalLabel.setText("You Win!");
    }
    else if(userMove.equals("SCISSORS") && compMove.equals("SCISSORS")){
        finalLabel.setText("TIE!");
    }
        }

    public static void computerMove(JLabel userLabel, JLabel compLabel, JLabel finalLabel){
        if ( userLabel.getText().equals("Text")){
            return;
        }

        double randomValue = Math.random();
        double randomRoll = Math.floor(randomValue*3 + 1);
        if(randomRoll==1){
            compLabel.setText("ROCK");
        }
        else if(randomRoll==2){
            compLabel.setText("PAPER");
        }
        else{
            compLabel.setText("SCISSORS");
        }

        checkForWin(userLabel.getText(), compLabel.getText(), finalLabel);
    }
}
