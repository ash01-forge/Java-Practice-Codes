public class BankAccount {
    String name;
    int id;
    double balance;
    double deposit(double amount){
        balance+=amount;
        return balance;
    }
    double withdraw(double amount){
        if (amount<balance)
            balance-=amount;
        return balance;
    }

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {
        System.out.println("After Deposit:");
        BankAccount b1=new BankAccount("Adeeb",10,10000);
        b1.deposit(5000);
        b1.display();
        System.out.println("---------------------------");
        System.out.println("After Withdraw:");
        b1.withdraw(3255.689);
        b1.display();
    }
}
