class BankAccount{
    private double checking_Balance;
    private double savings_balance;
    public static int numberOfAccount = 0;
    public static double total_amount_of_money  = 0;
    private double sum =checking_Balance+savings_balance;


    public BankAccount(double checking_Balance,double savings_balance){
        this.checking_Balance=checking_Balance;
        this.savings_balance=savings_balance;
        numberOfAccount++;
        sum = checking_Balance + savings_balance;


    }
    public double getbalance(){
        return this.checking_Balance;
    }
    public double getsavings_balance(){
        return this.savings_balance;

    }
    public void deposit( double amount,String accountType) {
        if (accountType.equals("checking")) {
            checking_Balance += amount;
        } else if (accountType.equals("savings")) {
            savings_balance += amount;
        }
        sum += amount;
    }
    public  double withdraw(double amount, String accountType){
        double withdrawn = 0;
        if (accountType.equals("checking") && checking_Balance >= amount) {
            checking_Balance -= amount;
            withdrawn = amount;
        } else if (accountType.equals("savings") && savings_balance >= amount) {
            savings_balance -= amount;
            withdrawn = amount;
        }
        sum -= withdrawn;
        return withdrawn;
    }
    public double gettotal(){
        return this.sum;
    }
    public static int getnumberOfAccount() {
        return numberOfAccount;
    }
    
    

}