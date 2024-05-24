/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.models.DecimalChecker;
import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.Operation;
import core.models.operations.Subtraction;

/**
 *
 * @author croja
 */
public class SubtractionController {    
     public static Response subtract(String n1, String n2) {
        History history = History.getInstance();
        double number1, number2;

        try {
            number1 = Double.parseDouble(n1);
        } catch (NumberFormatException err) {
            return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
        }

        try {
            number2 = Double.parseDouble(n2);
        } catch (NumberFormatException err) {
            return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
        }

        if (!DecimalChecker.check(number1)) {
            return new Response("Number 1 must have less than " + DecimalChecker.getDecimalLength() + " decimals", Status.BAD_REQUEST);
        }
        if (!DecimalChecker.check(number2)) {
            return new Response("Number 2 must have less than " + DecimalChecker.getDecimalLength() + " decimals", Status.BAD_REQUEST);
        }

        Operation operation = new Subtraction(number1, number2);
        history.addOperation(operation);

        return new Response("Substraction done successfully", Status.OK, operation);
    }
}
