//229. Exercício de fixação, 230. Correção do exercício de fixação PARTE 1, 231. Correção do exercício de fixação PARTE 2
package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) {
        return (amount * 0.01) * months;
    }
    
}
