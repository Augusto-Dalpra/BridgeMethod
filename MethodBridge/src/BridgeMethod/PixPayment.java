package BridgeMethod;




public class PixPayment extends Payment {
    public PixPayment(PaymentGateway gateway) {
        super(gateway);
    }

    public String pay(double amount) {
        return "[Pix] " + gateway.processPayment(amount);
    }
}
