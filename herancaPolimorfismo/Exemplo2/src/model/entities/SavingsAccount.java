package model.entities;

public final class SavingsAccount extends Account {
//final class nao pode ter subclasse
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public final void withdraw(double amount) {
//final metodo nao pode ser sobrescrito        
        balance -= amount;
    }
}
