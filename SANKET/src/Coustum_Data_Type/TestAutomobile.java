package Coustum_Data_Type;

public class TestAutomobile {
	public static void main(String[] args) {
		AutoMobile am = new AutoMobile("red", 40, "ODD");
		am.setColor("GREY");
		am.setMake("BMW");
		am.setSpeed(60);
		
		System.out.println(am.getColor());
		System.out.println(am.getMake());
		System.out.println(am.getSpeed());
		System.out.println(AutoMobile.Gear);
	}

}
