package Study0401;

public class BankAccount {
    private String number;
    private String password;
    private String name;
    private long balance;

    public BankAccount(){

    }

    public BankAccount(String number, String password, String name, long balance) {
        this.number = number;
        this.password = password;
        this.name = name;
        this.balance = balance;
    }


    public void deposit(long inputAccount){
       if(inputAccount<=0){
           System.out.println("0원 이하의 금액을 입금할 수 없습니다");
           System.exit(0);
       } else {

           System.out.println(inputAccount+"원이 입금되었습니다");
           this.balance += inputAccount;
           System.out.println("계좌잔액은 :" + this.balance);
       }

    }
    public void withdraw(long outputAccount){
        if(outputAccount<=0){
            System.out.println("0원 이하의 금액을 입금할 수 없습니다");
            System.exit(0);
        } else if(
           outputAccount >= this.balance){
            System.out.println("잔액이 부족합니다");
            System.exit(0);
        } else{
            this.balance -=outputAccount;
            System.out.println(outputAccount+"원이 출금되었습니다");
            System.out.println("계좌잔액은 :" + this.balance);
        }
    }
    public void printAccount(){
        System.out.println("=".repeat(30));
        System.out.println("(일반) 계좌번호 : "+this.number);
        System.out.println("비밀번호 : "+this.password);
        System.out.println("예금주 : "+this.name);
        System.out.println("계좌잔액은 : "+this.balance);
        System.out.println("=".repeat(30));

    }


}
