/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers.utils;

/**
 *
 * @author Usuario
 */
public class DecimalChecker {

    public static Boolean check(double number) {
        String s = String.valueOf(number);
        String[] splitted = s.split("[.]");

        String decimalPart = splitted[1];

        return decimalPart.length() <= 3;
    }
}
