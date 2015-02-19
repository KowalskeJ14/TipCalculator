/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKowalske2
 */
public class Test {
    public static void main(String[] args) {
        TipCalculatorStrategy delivery = new DeliveryTimeTipStrategy(31, 55);
        TipCalculatorStrategy percent = new PercentageTipStrategy(100, 20);
        
//        TipCalculatorStrategy[] strats = {delivery, percent};
        
//        TipService ts = new TipService();
        
        System.out.println(delivery.getTip());
        System.out.println(percent.getTip());
    }
}
