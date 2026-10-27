package Payment;
abstract class AbstractPaymentProcessor {
    abstract void validate();

    abstract void authorise();

    abstract void capture();

    abstract void refund();
}





















public class Main {
}
