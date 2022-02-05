package Oop;
//parents overridden method..
public class Employee extends Person1{
	public void changeAddress() {
		System.out.println("bhagirathpura");
		super.changeAddress();
		System.out.println("Emlpyoee change Address ");
		}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.changeAddress();
}
	

	
	
	
	
	//		private String desgination = null;
//	
//	public Employee() {
//		System.out.println("Defult constructer");
//	}
//	public Employee(String fn, String ln, String devlopers) {
//		super(fn, ln);
//		desgination = devlopers;
//		System.out.println("3 parameter");
//	}
//		
	
	

}
