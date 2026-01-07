package com.system_design.solid.ocp.solution;

public class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by UPI");
    }
}
