/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKowalske2
 */
public class DeliveryTimeStrategy implements CalculateTip{
    private double deliveryTime;
    private double tipPercent;
    
    public DeliveryTimeStrategy(double time, double percent){
        setDeliveryTime(time);
        setTipPercent(percent);
    }

    public double getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(double deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }
    
    @Override
    public double getTip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
