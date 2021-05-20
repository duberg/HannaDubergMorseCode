package morsecodeconverter;

import java.util.Scanner;

public class userInput {
   Scanner userInputScanner = new Scanner(System.in);


    public String userInputMorseOrLetter() {
        String firstInput;
        firstInput = userInputScanner.next();
        return firstInput.toString();
    }

    public int chooseMenuItem() {
        boolean correct = true;
        int choosenChoice = 0;

        while (correct) {
            try {
                choosenChoice = Integer.valueOf(userInputScanner.nextLine()); //Ser till att det är en int som kommer tillbaka.
                correct = false;
            } catch (Exception e) {//fångar om man skriver en bokstav istället
                System.out.println("Please type 1 or 2");
            }
        }

        return choosenChoice;
    }












}



