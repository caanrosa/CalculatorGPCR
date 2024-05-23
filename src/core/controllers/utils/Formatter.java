/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers.utils;

import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class Formatter {

    public static String format(double num) {
        DecimalFormat formatter = new DecimalFormat("#0.000");
        return formatter.format(num).replace(",", ".");
    }
}
