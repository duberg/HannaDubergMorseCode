package morsecodeconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class converterTest {

    @Test
    public void testWhenAReturnMorse() {
        theConverter buzzer = new theConverter();

        //Arrange
        String input = "a";
        String expected = ".-";

        //Act
        String output = buzzer.theConverterPublic(input);

        //Assert
        assertEquals(expected, output);


    }
    @Test
    public void testWhenStringReturnNull() {
        theConverter buzzer = new theConverter();

        //Arrange
        String input = "abcd";
        String expected = "Can't translate, are you sure you typed it the right way?";

        //Act
        String output = buzzer.theConverterPublic(input);

        //Assert
        assertEquals(expected, output);


    }
    @Test
    public void testWhenBReturnMorse() {
        theConverter buzzer = new theConverter();

        //Arrange
        String input = "b";
        String expected = "-...";

        //Act
        String output = buzzer.theConverterPublic(input);

        //Assert
        assertEquals(expected, output);


    }

    @Test
    public void testWhenMorseReturnA() {
        theConverter buzzer = new theConverter();

        //Arrange
        String input = ".-";
        String expected = "a";

        //Act
        String output = buzzer.theConverterPublic(input);

        //Assert
        assertEquals(expected, output);


    }

    @Test
    public void testWhenCapitalAReturnMorse() {
        theConverter buzzer = new theConverter();

        //Arrange
        String input = ("A");
        String expected = ".-";

        //Act
        String output = buzzer.theConverterPublic(input);

        //Assert
        assertEquals(expected, output);


    }


    @Test
    public void testWhenABReturnMorse() {
        theConverter buzzer = new theConverter();

        //Arrange
        String input = ("a:b");
        String expected = ".--...";

        //Act
        String output = buzzer.theConverterPublic(input);

        //Assert
        assertEquals(expected, output);


    }
    @Test
    public void testWhenHelloBReturnMorse() {
        theConverter buzzer = new theConverter();

        //Arrange
        String input = ("h:e:l:l:o");
        String expected = "......-...-..---";

        //Act
        String output = buzzer.theConverterPublic(input);

        //Assert
        assertEquals(expected, output);




    }
    }
