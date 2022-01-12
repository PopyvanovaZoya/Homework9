package ru.geekbrains.Homework8;

import java.util.Arrays;

public class Sample01 {
    public static void main(String[] args) {
        String arr[][] = {{"q", "r", "q", "u"}, {"q", "r", "q", "u"}, {"q", "r", "q", "u"}, {"q", "r", "q", "u"}};
        createArray(arr);
}

public static void createArray(String[][] array){
        try {
            if (array.length != 4)
                throw new MyArraySizeException("Invalid array length");

            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException("Invalid array height");
                }
                for (int j = 0; j < array[i].length; j++) {

                    try {
                        int a = Integer.parseInt(array[i][j]);
                    } catch (MyArrayDataException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        catch (MyArraySizeException e)
        {
            e.printStackTrace();
        }
}

public static class MyArraySizeException extends Exception{
        public MyArraySizeException(String message)
        {
            System.out.println(message);
        }
    }
public static class MyArrayDataException extends NumberFormatException{
        public MyArrayDataException(String message)
        {
            System.out.println(message);
        }
    }
}
