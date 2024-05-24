/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import java.math.BigDecimal;
/**
 *
 * @author Usuario
 */
public class DecimalChecker {
    
    private static int decimalLenght = 3;

    public static Boolean check(double number) {
        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.stripTrailingZeros();
        int scale = bd.scale();
        return scale <= decimalLenght;
    }
    
    public static int getDecimalLength() {
        return decimalLenght;
    }
}
