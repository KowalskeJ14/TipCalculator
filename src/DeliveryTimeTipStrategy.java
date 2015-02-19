/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKowalske2
 */
public class DeliveryTimeTipStrategy implements TipCalculator{
    private double deliveryTime;
    private double tip;
    private double bill;
    
    public DeliveryTimeTipStrategy(double time, double bill){
        setDeliveryTime(time);
        setBill(bill);
    }

    public double getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(double deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }
    
    @Override
    public double getTip() {
        if(deliveryTime < 30){
            tip = bill * .20;
        }
        else{
            tip = bill * .10;
        }
        return tip;
    }
    
    
}
