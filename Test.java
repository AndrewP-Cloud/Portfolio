//Main interface

/* This page includes an illustration of abstraction. While
 * the methods in this program are incredibly simple
 * we can still see the common method call of get###
 * in the getOwnerBalance method.
 */
public class Test {

    public static void main(String[] args)      {
        CheckingAccount c1 = new CheckingAccount("Sam", 100);
        SavingsAccount s1 = new SavingsAccount("John", 500, 100);

        System.out.println("Account Information #1");
        System.out.println(c1.getOwnerBalance());
        System.out.println(s1.getOwnerBalance());

        System.out.println("\n\nTransactions on c1:");
        System.out.println("Withdraw $200 from c1: " + c1.withdraw(200));
        System.out.println(c1.getOwnerBalance());
        System.out.println("Withdraw $60 from c1: " + c1.withdraw(60));
        System.out.println(c1.getOwnerBalance());
        System.out.println("makeDeposit $500 to c1: " + c1.makeDeposit(500));
        System.out.println(c1.getOwnerBalance());
        System.out.println("Withdraw $200 from c1: " + c1.withdraw(200));
        System.out.println(c1.getOwnerBalance());

        System.out.println("\n\nTransactions on s1:");
        System.out.println("Withdraw $400: " + s1.withdraw(400));
        System.out.println(s1.getOwnerBalance());
        System.out.println("Withdraw $200: " + s1.withdraw(200));
        System.out.println(s1.getOwnerBalance());
        System.out.println("makeDeposit $600: " + s1.makeDeposit(600));
        System.out.println(s1.getOwnerBalance());
        System.out.println("Withdraw $400: " + s1.withdraw(400));
        System.out.println(s1.getOwnerBalance());
        System.out.println("Apply Interest"); 
        s1.applyInterest();
        System.out.println(s1.getOwnerBalance());
    }
}