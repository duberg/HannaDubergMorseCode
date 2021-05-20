package morsecodeconverter;

public class menuAndSelection {

    public static void printMenu() {
        printHeader();
        printChoices();
    }

    public static void printConverterMenu() {
        converterMenu();

    }

    private static void printHeader() {

        System.out.println("\n........................................");
    }

    private static void printChoices() {

        System.out.println("\nChoose");
        System.out.println("1. to convert");
        System.out.println("2. exit");

    }

    private static void converterMenu() {
        System.out.println("\nType what you want to convert.");
        System.out.println("If it's more than one letter/morse typ ':' in between");
        System.out.println("Example: H:e:l:l:o");


    }
}




