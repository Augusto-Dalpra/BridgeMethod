package BridgeMethod;

import BridgeMethod.PaymentGateway;

public class PayPal implements PaymentGateway {
    public String processPayment(double amount) {
        return "Pagamento de R$ " + amount + " processado via BridgeMethod.PayPal.";
    }
}
