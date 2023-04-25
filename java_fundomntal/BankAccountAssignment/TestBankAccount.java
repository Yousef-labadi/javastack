public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc1= new BankAccount(150,100);
        BankAccount acc2= new BankAccount(1500,1000);
        BankAccount acc3= new BankAccount(1500,1000);
        System.out.println(acc1.getbalance());
        System.out.println(acc1.getsavings_balance());
        
        acc1.deposit(500,"checking");
        System.out.println( acc1.gettotal());
        System.out.println(acc1.withdraw(500,"checking"));
        System.out.println(acc1.getnumberOfAccount());

}
}
