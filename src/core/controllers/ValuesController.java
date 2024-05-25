/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Formatter;

/**
 *
 * @author Usuario
 */
public class ValuesController {
    public static Response format(double number) {
        try {
            String formatted = Formatter.format(number);
            return new Response("Format success", Status.CREATED, formatted);
        } catch(Exception e) {
            return new Response("Unexpected error formatting value: " + number, Status.INTERNAL_SERVER_ERROR, e);
        }
    }
}
