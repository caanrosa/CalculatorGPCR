/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

/**
 *
 * @author edangulo
 */
public abstract class Operation {

    protected double number1;
    protected double number2;
    protected String operator;
    protected double result;

    public Operation(double number1, double number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return number1 + " " + operator + " " + number2 + " = " + result;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }    
    
    public abstract void evaluate();
}
