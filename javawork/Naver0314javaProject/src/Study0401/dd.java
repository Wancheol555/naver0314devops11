package Study0401;

 interface Remote {

    public void turnOn();
}
public class dd implements Remote {
    @Override
    public void turnOn() {
        System.out.println("tv를 켰어");
    }
    public static void main(String[] args) {
        dd tv = new dd();
        tv.turnOn();
    }
}

