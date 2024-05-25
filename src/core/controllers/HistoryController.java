/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Formatter;
import core.models.History;
import core.models.Operation;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author croja
 */
public class HistoryController {
    
    public static Response getHistory() {
        
        History history = History.getInstance();
        ArrayList<Operation> operationHistory = history.getOperations(); 
        
        try {
            
            DefaultListModel model = new DefaultListModel();
            ArrayList<String> formattedOperations = new ArrayList<>();
            
            for (Operation op : operationHistory) {
                String formattedNumber1 = Formatter.format(op.getNumber1());
                String formattedNumber2 = Formatter.format(op.getNumber2());
                String formattedResult = Formatter.format(op.getResult());
                
                String formattedOperation = formattedNumber1 + " " + op.getOperator() + " " + formattedNumber2 + " = " + formattedResult;
                formattedOperations.add(formattedOperation);
            }
            
            Collections.reverse(formattedOperations);
            
            model.addAll(formattedOperations);
            return new Response("History operations success", Status.CREATED, model);
        } catch (Exception e) {
            return new Response("Unexpected error in history: " , Status.INTERNAL_SERVER_ERROR, e);
        }
    }
}
