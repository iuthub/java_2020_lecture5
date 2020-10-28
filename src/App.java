import community.CommunityMember;
import community.Student;
import employee.BasePlusCommissionEmployee;
import employee.CommissionEmployee;

public class App {
    public static void main(String[] args){
        CommunityMember m = new CommunityMember("Sarvar Abdullaev");
        Student s1 = new Student("Sanjar Khakimov", 2, "SOCIE", "u190038");
        Student s2 = new Student("Sanjar Khakimov", 2, "SOCIE", "u190038");

        System.out.println(s1.equals(s2));


//        System.out.println(m.getNameTag());
//        System.out.println(s.getNameTag());


//        CommissionEmployee ce1 = new CommissionEmployee("John",
//                "Smith",
//                 "232-232-2322", 120, 0.2);
//
//        CommissionEmployee ce2 = new CommissionEmployee("John",
//                "Smith",
//                "232-232-2322", 120, 0.2);
//
//
//        System.out.println(ce1.equals(ce2));
//
//        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("Adam",
//                "Smith",
//                "232-232-2322", 120, 0.2, 100.00);
//
//        System.out.println(ce1);
//        System.out.println();
//        System.out.println(bce);
    }
}
