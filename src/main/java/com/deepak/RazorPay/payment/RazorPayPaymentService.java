package com.deepak.RazorPay.payment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//@Component                          ///   Component baanen  ka mtlb been ban jaa raha hai  (jab object bana rahe ho to component hata shakte ho)
                                      ///     //    been baane se mtlb hai ki ab iska control spring framework ke pass jaa chuka hai ab isse user manage nahi kare ga
//public class RazorPayPaymentService {
//
//    public String pay() {
//        String payment = "RazorPay Payment";
//        System.out.println("payment: " + payment);
//        return payment;


@Component                          ///   interface use karne ke liye
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class RazorPayPaymentService implements PaymentService {

    @Override
    public String pay() {
        String payment = "RazorPay Payment";
        System.out.println("payment: " + payment);
        return payment;
    }
}

