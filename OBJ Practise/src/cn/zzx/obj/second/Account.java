package cn.zzx.obj.second;

/**
 * @author 33133
 */
public class Account {
    String uerName;
    private int Balance;

    Account(String userName ,int Balance) {
        this.uerName=userName;
        this.Balance=0;
    }

    public void depositMoney(String Balance){
        System.out.println("余额为"+Balance+"元");
    }
    public void withdrawMoney(String Balance){
        System.out.println("取出"+Balance+"元");
    }
    Account account = new Account();
}
