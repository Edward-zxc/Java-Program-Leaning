package cn.zzx.obj.second;

/**
 * @author 33133
 */
public class Account {
    String uerName;
    private double balance;

    Account(String userName) {
        this.uerName=userName;
        this.balance=0;
    }
    // Methods of saving money 存钱方法
    public void depositMoney(int amount){
        balance += amount;
        System.out.println("余额为："+balance);
    }
    // Method of withdrawal 取钱方法
    public void withdrawMoney(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("取出："+amount+","+"余额为："+balance);
        }
        else {
            System.out.println("余额不足");
        }
    }

    public static void main(String[] args) {
        Account account = new Account("Sarah");
        //存钱
        account.depositMoney(200);
        //取钱
        account.withdrawMoney(100);
    }
}
