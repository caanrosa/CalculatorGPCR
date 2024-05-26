/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.operations;

import core.models.Operation;

/**
 *
 * @author Usuario
 */
public class Addition extends Operation {
    
    public Addition(double number1, double number2) {
        super(number1, number2, "+");
    }

    @Override
    public boolean evaluate() {
        double result = this.number1 + this.number2;
        
        if(Double.isInfinite(result)) return false;
        
        this.setResult(result);
        return true;
    }
    
}
