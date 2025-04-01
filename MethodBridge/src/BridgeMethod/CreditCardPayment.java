package BridgeMethod;



public class CreditCardPayment extends Payment {
    public CreditCardPayment(PaymentGateway gateway) {
        super(gateway);
    }

    public String pay(double amount) {
        return "[Cartão] " + gateway.processPayment(amount);
    }
}