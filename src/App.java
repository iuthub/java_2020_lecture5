import employee.BasePlusCommissionEmployee;
import employee.CommissionEmployee;

public class App {
    public static void main(String[] args){
        CommissionEmployee ce1 = new CommissionEmployee("John",
                "Smith",
                 "232-232-2322", 120, 0.2);

        CommissionEmployee ce2 = new CommissionEmployee("John",
                "Smith",
                "232-232-2322", 120, 0.2);


        System.out.println(ce1.equals(ce2));

        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("Adam",
                "Smith",
                "232-232-2322", 120, 0.2, 100.00);

        System.out.println(ce1);
        System.out.println();
        System.out.println(bce);
    }
}
