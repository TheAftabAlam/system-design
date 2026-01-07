package com.system_design.solid.ocp.solution;

public class PaymentService {
    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {
        Payment payment= new CardPayment();

        PaymentService paymentService =new PaymentService();
        paymentService.processPayment(payment,100);


    }
}
