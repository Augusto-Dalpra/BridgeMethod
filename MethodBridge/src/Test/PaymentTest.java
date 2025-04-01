package Test;

import BridgeMethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {


    @Test
    public void testPaymentProcessing() {
        Payment payment = new CreditCardPayment(new PayPal());
        String result = payment.pay(100.0);
        assertTrue(result.contains("PayPal"));
    }


    @Test
    public void testPixPaymentProcessing() {
        Payment payment = new PixPayment(new Stripe());
        String result = payment.pay(50.0);
        assertTrue(result.contains("Stripe"));
    }


    @Test
    public void testCreditCardPaymentWithStripe() {
        Payment payment = new CreditCardPayment(new Stripe());
        String result = payment.pay(200.0);
        assertTrue(result.contains("Stripe"));
    }


    @Test
    public void testPixPaymentWithPayPal() {
        Payment payment = new PixPayment(new PayPal());
        String result = payment.pay(150.0);
        assertTrue(result.contains("PayPal"));
    }


    @Test
    public void testPaymentAmountInResult() {
        Payment payment = new CreditCardPayment(new PayPal());
        String result = payment.pay(300.0);
        assertTrue(result.contains("R$ 300.0"));
    }
}
