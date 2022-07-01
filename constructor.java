 class BankAc{
    String name,id;
    double balance;
    // Parametrized constructor
    BankAc(String s,String i,double b){
        name =s;
        id = i;
        balance = b;System.out.println("Name:"+name);
        System.out.println("ID:"+id);;
        System.out.println("Balance:"+balance);

    }
    // Default Constructor 
    BankAc(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);;
        System.out.println("Balance:"+balance);
    }
}
public class constructor {
    public static void main(String[] args) {
         // Parametrized constructor
        BankAc BA1 = new BankAc("Samiya Sultana","434343",23232);    
       // Default Constructor 
        BankAc BA2 = new BankAc();
    }
}
