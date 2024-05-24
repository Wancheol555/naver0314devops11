package anno.study.ex4;

public class Car {
    private String carName;
    private Tire tire;
    public Car(Tire tire){
        this.tire=tire;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void carInfo()
    {
        System.out.println("자동차명: "+carName);
        System.out.println("타이어: "+tire.getTireName());

    }
}

