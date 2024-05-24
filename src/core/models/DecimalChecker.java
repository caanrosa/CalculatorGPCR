/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

/**
 *
 * @author Usuario
 */
public class DecimalChecker {
    
    private static int decimalLenght = 3;

    public static Boolean check(double number) {
        String s = String.valueOf(number);
        String[] splitted = s.split("[.]");

        String decimalPart = splitted[1];

        return decimalPart.length() <= decimalLenght;
    }
    
    public static int getDecimalLength() {
        return decimalLenght;
    }
}
