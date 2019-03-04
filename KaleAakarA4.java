public class KaleAakarA4 {
    private double balance;
    private String account;

    public KaleAakarA4(String account,double balance) {
        this.balance = balance;
        this.account = account;
        System.out.println("Account Name: "+getAccount());
        System.out.println("Account Balance: "+getBalance());
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void AcceptDeposit (double x){
        if(x>0&&x<9999999){//assuming a rule that allows only deposit till seven digits in one go
            setBalance(getBalance()+x);
            System.out.println("Deposit ammount "+x);
        }
        else
            System.out.println("You can deposit an amount from zero to seven digits in one go");
        System.out.println("Account Balance: "+getBalance());
    }
    public void WithdrawlAmount (double x){
        if(x>0&&x<(getBalance()-10)){
            setBalance(getBalance()-x);
            System.out.println("Withdrawl ammount "+x);
        }
        else
            System.out.println("You can withdraw an amount from zero to amount in your account with 10 to spare");
        System.out.println("Account Balance: "+getBalance());
    }


    public static void main(String args[]){
        KaleAakarA4 Obj1= new KaleAakarA4("Jerry",30);
        Obj1.AcceptDeposit(500);
        Obj1.WithdrawlAmount(70);
        System.out.println("Account Name: "+Obj1.getAccount());
        System.out.println("Account Balance: "+Obj1.getBalance());
    }
}
