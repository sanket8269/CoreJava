package Exercies;

public class Q13_HARMONIC {
public static void main(String[] args) {
	int no=5;
	int s=1;
	int j=1;
	double result =0;
	System.out.println("the harmonic series is");
	for(int i=0;i<=no;i++) {
		result=((double)1/(s*i+j));
		System.out.println(result);
	}
}
}
