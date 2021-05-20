package morsecodeconverter;

public class theProgram {


    public static void main(String[] args) {
        userInput j = new userInput();
        userInput k = new userInput();
        int choice = 1;
        String input = "";

        while (choice != 2) {

            if (choice == 1) {
                menuAndSelection.printConverterMenu();
                input = j.userInputMorseOrLetter();
                theConverter.theConverterPublic(input);
                menuAndSelection.printMenu();
                choice = k.chooseMenuItem();
            }else{
                System.out.println("Please type 1 or 2"); //felhantering om man skriver något som inte är 1 eller 2
                choice = k.chooseMenuItem();
            }

        }

        System.out.println("Have a nice day!");



    }}





