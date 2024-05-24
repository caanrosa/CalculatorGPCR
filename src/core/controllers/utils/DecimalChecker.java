/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers.utils;

import java.math.BigDecimal;
/**
 *
 * @author Usuario
 */
public class DecimalChecker {

    public static Boolean check(double number) {
        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.stripTrailingZeros();
        int scale = bd.scale();
        return scale <= 3;
    }
}
