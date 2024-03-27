package day0325;

public class Phone2 
{
	private String model;
	private String color;
	
	public Phone2(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model=model;
		
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
}
}

class SmartPhone2 extends Phone2
{
	private String wifi;

	public SmartPhone2(String model, String color, String wifi) {
		super(model, color);
		this.wifi = wifi;
	}
	
	public void info()
	{
		System.out.println("모델명: "+this.getModel());
		System.out.println("색상 : "+this.getColor());
		System.out.println("와이파이 : "+ wifi);
		System.out.println();
		
	}
}
