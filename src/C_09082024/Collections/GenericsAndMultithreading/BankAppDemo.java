package Threading21Aug;
//Synchronization
public class BankAppDemo {
    public static void main(String[] args) {
        Bank at=new Bank();

        Runnable runnable=new AccountThread(at);
        Thread th1=new Thread(runnable,"Person1");
        th1.start();

        Thread th2=new Thread(runnable, "Person2");
        th2.start();
    }
}

class AccountThread implements Runnable{
    Bank bank1;
public  AccountThread(Bank bank1){
    this.bank1=bank1;
}
    @Override
    public void run() {
for (int i = 0; i <=5; i++) {
    bank1.withdraw(200);
    if (bank1.getBalance()<0){
        System.out.println("Amount is overdrawn");
    }
}
    }
}
class Bank {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        Thread th = Thread.currentThread();
        if (balance >= amount) {
            System.out.println("Withdraw -> " + amount + "\t " + th.getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                ;
            }
            balance = balance - amount;
            System.out.println(balance + " remaining -> " + th.getName());
        } else {
            System.out.println("Insufficient funds");
        }

    }

    public int getBalance() {
        return balance;
    }
}

