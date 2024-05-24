package Study0401;

public class MinusAccount extends BankAccount{
    private String number;
    private String password;
    private String name;
    private long balance;
    private  long minusLimit;

    public MinusAccount(String number, String password, String name, long balance, long minusLimit) {
        this.number = number;
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.minusLimit = minusLimit;
    }

    @Override
    public void withdraw(long outputAccount) {
        this.withdraw(outputAccount);
        if(outputAccount>this.balance+minusLimit){
            System.out.println("한도초과로 출력되지 않습니다");
            System.exit(0);
        }
    }

    @Override
    public void deposit(long inputAccount) {
        super.deposit(inputAccount);
    }

    public void printAccount(){
        System.out.println("=".repeat(30));
        System.out.println("(마이너스) 계좌번호 : "+this.number);
        System.out.println("비밀번호 : "+this.password);
        System.out.println("예금주 : "+this.name);
        System.out.println("계좌잔액은 : "+this.balance);
        System.out.println("=".repeat(30));
    }
}
