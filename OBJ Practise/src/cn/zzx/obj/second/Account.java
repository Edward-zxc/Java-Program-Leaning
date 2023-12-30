package cn.zzx.obj.second;

/**
 * @author 33133
 */
public class Account {
    String userName;
    private int balance;
    Account(String userName,int balance){
        this.balance=balance;
        this.userName=userName;
    }
    public void depositMoney(int deposit){
        balance += deposit;
        System.out.println("余额为："+balance);
    }
    public void withdrawMoney(int drawMoney){
        if (balance < drawMoney) {
            System.out.println("余额不足");
        }
        else if (balance > drawMoney) {
            balance -= drawMoney;
            System.out.println("余额为："+balance);
        }
    }

    public static void main(String[] args) {
        Account account1 = new Account("Sarah",8000);
        Account account2 = new Account("Cathy",8000);
        account1.withdrawMoney(9000);
        account2.depositMoney(1000);
    }
}
