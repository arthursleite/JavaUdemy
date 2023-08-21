//224. Interfaces, 225. Solução do problema - PARTE 1, 226. Solução do problema - PARTE 2 (sem interface
package model.services;

public class BrazilTaxService implements TaxService{

    @Override
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
