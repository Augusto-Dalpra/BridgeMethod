package BridgeMethod;



public abstract class Payment {
    protected PaymentGateway gateway;

    public Payment(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public abstract String pay(double amount);
}
