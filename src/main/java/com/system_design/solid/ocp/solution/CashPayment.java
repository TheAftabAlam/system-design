package com.system_design.solid.ocp.solution;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by Cash");
    }
}
