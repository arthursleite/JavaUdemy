//229. Exercício de fixação, 230. Correção do exercício de fixação PARTE 1, 231. Correção do exercício de fixação PARTE 2
package model.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);
}
