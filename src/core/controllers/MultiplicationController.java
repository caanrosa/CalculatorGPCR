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
import core.models.operations.Multiplication;

/**
 *
 * @author croja
 */
public class MultiplicationController {

    public static Response mult(String n1, String n2) {
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

        if (Double.isInfinite(number1)) {
            return new Response("Number 1 is too large", Status.INTERNAL_SERVER_ERROR);
        }
        if (Double.isInfinite(number2)) {
            return new Response("Number 2 is too large", Status.INTERNAL_SERVER_ERROR);
        }

        if (!DecimalChecker.check(number1)) {
            return new Response("Number 1 must have less than 3 decimals", Status.BAD_REQUEST);
        }
        if (!DecimalChecker.check(number2)) {
            return new Response("Number 2 must have less than 3 decimals", Status.BAD_REQUEST);
        }

        Multiplication operation = new Multiplication(number1, number2);
        operation.evaluate();
        double result = operation.getResult();

        if (Double.isInfinite(result) || Double.isNaN(result)) {
            return new Response("Multiplication error: Math err", Status.INTERNAL_SERVER_ERROR);
        } else {
            history.addOperation(operation); // LISKOV’S
            return new Response("Multiplication done successfully", Status.OK, operation);
        }

    }
}
