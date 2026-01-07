package com.system_design.solid.ocp.violation;

public class PaymentService {

    public void pay(String type, double amount) {
        if (type.equals("CASH")) {
            System.out.println("Paid by Cash "+amount);
        } else if (type.equals("UPI")) {
            //modify
            System.out.println("Paid by UPI "+amount);
        } else if (type.equals("CARD")) {
            System.out.println("Paid by Card "+amount);
        } else if(type.equals("WALLET")){
            System.out.println("PAID by wallet");
        }
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.pay("UPI",1000);

    }
}
