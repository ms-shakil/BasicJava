class BankAccount{
    String name;
    int id;
    int balance;
    void deposit(double ammount){
        balance +=ammount;
    }
    void PrintInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(balance);
    }
}
public class bank_account {
    public static void main(String[] args) {
        BankAccount Ac =new BankAccount();
        Ac.name ="Samiya Sultana";
        Ac.id = 01121;
        Ac.balance= 500;
        Ac.deposit(1000);
        Ac.PrintInfo();
    }
    
}
