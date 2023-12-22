package cn.zzx.obj.second;

/**
 * @author 33133
 */
public class Account {
    String uerName;
    private double Balance;

    Account(String userName) {
        this.uerName=userName;
        this.Balance=0;
    }
    // Methods of saving money 存钱方法
    public void depositMoney(int amount){
        Balance += amount;
        System.out.println("余额为："+Balance);
    }
    // Method of withdrawal 取钱方法
    public void withdrawMoney(int amount){
        if (Balance >= amount) {
            Balance -= amount;
            System.out.println("取出："+amount+","+"余额为："+Balance);
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
