package com.system_design.solid.ocp.solution;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("paid by card");
    }
}
