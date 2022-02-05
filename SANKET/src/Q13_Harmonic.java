
public class Q13_Harmonic {
public static void main(String[] args) {
	double s=5;
	double a=1;
	double b=1;
	double result = 0;
	System.out.println("This harmonic series is");
	for(int i=0;i<=s;i++){
		result=(a*i+b);
		System.out.println(1/result);
	}
}
}
