package sample;

import java.util.*;
import java.util.concurrent.TimeUnit;
enum Options{
    ROCK,PAPER,SCISSORS
}
public class Game {
    // Structure of the sample.Game
    static Options O1 = Options.ROCK;
    static Options O2 = Options.PAPER;
    static Options O3 = Options.SCISSORS;

    public static void main(String[] args) {
        start();
    }
    static void start() {
        System.out.println("The sample.Game Has Started : ");
        waitASecond();
        System.out.println("What do You Chose ?");
        waitASecond();
        System.out.println("Rock Papers Or Scissors");
        System.out.print("1. Rock \n" +
                "2. Papers \n" +
                "3. Scissors \n");
        waitASecond();
        boolean result = round(0);
        if(result){
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Wins");
        }
    }
    static boolean round(int num){ // Keeps the round going until someone wins
        Scanner in = new Scanner(System.in);
        if(num == 1) {
            System.out.println("Choose Again : ");
        }
        int choiceUser = in.nextInt();
        int choiceComputer = (int) ((Math.random() * 10)) % 4;
        while(choiceComputer == 0){
            choiceComputer = (int) ((Math.random() * 10)) % 4;
        }
        if(choiceComputer==1 && choiceUser==2){
            System.out.println("Computer chose "+O1);
            waitASecond();
            System.out.println(O2+" Covers "+O1);
            waitASecond();
            return true;
        }
        else if(choiceComputer==2 && choiceUser==3){
            System.out.println("Computer chose "+O2);
            waitASecond();
            System.out.println(O3+" Cuts "+O2);
            waitASecond();
            return true;
        }
        else if(choiceComputer==3 && choiceUser==1){
            System.out.println("Computer chose "+O3);
            waitASecond();
            System.out.println(O1+" Smashes "+O3);
            waitASecond();
            return true;
        }
        else if(choiceUser==1 && choiceComputer==2){
            System.out.println("Computer chose "+O2);
            waitASecond();
            System.out.println(O2+" Covers "+O1);
            waitASecond();
            return false;
        }
        else if(choiceUser==2 && choiceComputer==3){
            System.out.println("Computer chose "+O3);
            waitASecond();
            System.out.println(O3+" Cuts "+O2);
            waitASecond();
            return false;
        }
        else if(choiceUser==3 && choiceComputer==1){
            System.out.println("Computer chose "+O1);
            waitASecond();
            System.out.println(O1+" Smashes "+O3);
            waitASecond();
            return false;
        }
        else if(choiceComputer == choiceUser){
            System.out.println("Both chose the same : ");
            System.out.println("Tie");
        }
        return round(1);
       /* System.out.println("Computer Choice = "+choiceComputer);
        System.out.println("User Choice = "+choiceUser); */
    }
    public static void waitASecond(){ // Waits a second
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static int computerChoice(){
        int choiceComputer = (int) ((Math.random() * 10)) % 4;
        while(choiceComputer == 0){
            choiceComputer = (int) ((Math.random() * 10)) % 4;
        }
        return choiceComputer;
    }
}