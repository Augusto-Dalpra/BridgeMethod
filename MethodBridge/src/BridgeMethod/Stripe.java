package BridgeMethod;



public class Stripe implements PaymentGateway {
    public String processPayment(double amount) {
        return "Pagamento de R$ " + amount + " processado via Stripe.";
    }
}
