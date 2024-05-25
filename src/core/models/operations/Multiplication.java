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
public class Multiplication extends Operation {
    
    public Multiplication(double number1, double number2) {
        super(number1, number2, "*");
    }

    @Override
    public void evaluate() {
        this.setResult(this.number1 * this.number2);
    }
    
}
