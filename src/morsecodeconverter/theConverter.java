package morsecodeconverter;

import java.util.HashMap;


public class theConverter {

    public static String theConverterPublic(String input) {
        String s = convertFromLettersToMorse(input);
        return s.toString();
    }


    private static String convertFromLettersToMorse(String input) {

        HashMap<String, String> lettersAndMorse = new HashMap<>();

        String[] morseChar = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", ".....", "-....", "--...", "---..", "----.", "-----", ".-.-.-", "--..--", "..--.."};
        String[] smallLetters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};
        String[] bigLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};


        StringBuffer r = new StringBuffer();

        for (int i = 0; i < smallLetters.length; i++) {

            lettersAndMorse.put(smallLetters[i], morseChar[i]);

        }
        for (int i = 0; i < morseChar.length; i++) {

            lettersAndMorse.put(morseChar[i], smallLetters[i]);

        }

        for (int i = 0; i < bigLetters.length; i++) {

            lettersAndMorse.put(bigLetters[i], morseChar[i]);

        }


        String t = "";
        String str = input;

        String[] arrOfStr = str.split(":",
                0);

        for (int i = 0; i < arrOfStr.length; i++) {

            t = lettersAndMorse.get(arrOfStr[i]);
            if (t == null) {
                String s = "Can't translate, are you sure you typed it the right way?"; //fångar om man skriver något som inte går att översätta
                System.out.println(s);
                r.append(s);
            } else {

                System.out.print(t + " ");
                r.append(t);

            }
        }


        return r.toString();
    }


}
