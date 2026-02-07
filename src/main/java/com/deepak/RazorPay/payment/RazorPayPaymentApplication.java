package com.deepak.RazorPay.payment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class RazorPayPaymentApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication.run(RazorPayPaymentApplication.class, args);
//	}
//
//    private RazorPayPaymentService PaymentService = new RazorPayPaymentService();        ///  yaha object banaya gaya hai
//
//    @Override
//    public void run(String... args) throws Exception {
//        String payment =  PaymentService.pay();
//        System.out.println("payment done" + payment);
//    }
//
//}

                                                          ///       OR  (same work)

//@SpringBootApplication
//public class RazorPayPaymentApplication implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(RazorPayPaymentApplication.class, args);
//    }
//
//    private final RazorPayPaymentService PaymentService;        ///   (jab component bana liya tab object banane ki jarurat nahi hai )
//
//    public RazorPayPaymentApplication(RazorPayPaymentService PaymentService) {
//        this.PaymentService = PaymentService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        String payment =  PaymentService.pay();
//        System.out.println("payment done" + payment);
//    }
//
//}



@SpringBootApplication                               ///    Use Payment Service

public class RazorPayPaymentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RazorPayPaymentApplication.class, args);
    }

    private final PaymentService PaymentService;

    public RazorPayPaymentApplication(PaymentService PaymentService) {
        this.PaymentService = PaymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment =  PaymentService.pay();
        System.out.println("payment done " + payment);
    }

}
