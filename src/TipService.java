/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKowalske2
 */
public class TipService {
    public double getTipAmount(TipCalculatorStrategy ts){
        return ts.getTip();
    }
}
