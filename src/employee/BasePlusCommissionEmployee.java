package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double basePayment;
    public double getBasePayment() {
        return basePayment;
    }

    public BasePlusCommissionEmployee(String first, String last, String ssn,
                              double sales, double rate, double basePayment){
        super(first, last, ssn, sales, rate); //creating the parent
        this.basePayment=basePayment;

    }

//
    @Override
    public double earnings(){
        return this.basePayment + this.getCommissionRate()*this.getGrossSales();
    }
//
    @Override // indicates this method overrides a superclass method
    public String toString(){
        return String.format("%s\n%s\n%s: %.2f",
                "commission+base employee",
                super.toString(),
                "base payment", this.getBasePayment());
    }
}
