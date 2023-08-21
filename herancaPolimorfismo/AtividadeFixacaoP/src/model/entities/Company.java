package model.entities;

public class Company extends TaxPayer {

    private Integer numberofEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberofEmployees) {
        super(name, anualIncome);
        this.numberofEmployees = numberofEmployees;
    }

    public int getNumberofEmployees() {
        return numberofEmployees;
    }

    public void setNumberofEmployees(Integer numberofEmployees) {
        this.numberofEmployees = numberofEmployees;
    }
    
    @Override
    public Double tax() {
        if (getNumberofEmployees() > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
    
}
