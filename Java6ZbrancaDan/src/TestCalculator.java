/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class TestCalculator test
 * @author Michel D. Zbranca
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Calculator instance
        Calculator computer = new Calculator();
        // start the Calculator
        computer.start();
        // test the add of 123 + 223
        computer.add();
        // test 233 - 122
        computer.decreace();
        // test  123*12
        computer.multiply();
        // test 122 / 2
        computer.divide();
        
    }
    
}
