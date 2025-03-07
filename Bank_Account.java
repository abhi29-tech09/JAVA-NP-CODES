class Bank_Account {
    private String accname;
    private int acno;
    private float balance;

    
    public Bank_Account(String accname, int acno, float balance) {
        this.accname = accname;
        this.acno = acno;
        this.balance = balance;
    }

    
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + accname);
        }
    }

    
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. Updated balance: " + balance);
    }

    
    public void displayDetails() {
        System.out.println("Account Name: " + accname);
        System.out.println("Account Number: " + acno);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank_Account s = new Bank_Account("Anil", 34571, 25000);
        s.withdraw(20000);
        s.deposit(2000);
        s.displayDetails();
System.out.println(); 
        

        Bank_Account s1 = new Bank_Account("Jeevan", 333226, 25000);
        s1.withdraw(2500);
        s1.deposit(250000);
        s1.displayDetails();
    }
}
