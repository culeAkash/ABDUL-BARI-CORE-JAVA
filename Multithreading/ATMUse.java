

class ATM{
   synchronized public void checkBalance(String customerName){
        System.out.print(customerName+" is checking ");
        try{
            Thread.sleep(100);
            System.out.println("balance");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

   synchronized public void withdraw(String customerName, int amount){
        System.out.print(customerName+" wants to withdraw ");
        try{
            Thread.sleep(100);
            System.out.println("balance");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Customer extends Thread{

    String name;
    int amount;
    ATM atm;

    Customer(String n, ATM a, int amt){
        name=n;
        atm=a;
        amount=amt;
    }

    public void useATM(){
        atm.checkBalance(this.name);
        atm.withdraw(name, amount);
    }

    public void run(){
        useATM();
    }
}


public class ATMUse{
public static void main(String[] args) {
    ATM atm= new ATM();
    Customer c1= new Customer("Akash", atm, 5000);
    Customer c2= new Customer("Kuki", atm, 200);
    c1.start();
    c2.start();
}
}