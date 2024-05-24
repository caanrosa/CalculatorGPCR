/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.DecimalChecker;
import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.Operation;

/**
 *
 * @author Usuario
 */
public class CalculatorSumController {

    public static Response sum(String n1, String n2) {
        History history = History.getInstance();
        double number1, number2, result;

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
            return new Response("Number 1 must have less than 3 decimals", Status.BAD_REQUEST);
        }
        if (!DecimalChecker.check(number2)) {
            return new Response("Number 2 must have less than 3 decimals", Status.BAD_REQUEST);
        }

        result = number1 + number2;

        Operation operation = new Operation(number1, number2, "+", result);
        history.addOperation(operation);

        return new Response("Sum done successfully", Status.OK, operation);
    }

}
