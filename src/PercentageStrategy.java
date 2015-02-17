/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKowalske2
 */
public class PercentageStrategy implements TipStrategy{

    private double billAmount;
    private double percentage;
    
    public PercentageStrategy(double amount, double percent){
        setBillAmount(amount);
        setPercentage(percent);
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    @Override
    public double getTip() {
        return billAmount * (percentage / 100);
    }
    
}
