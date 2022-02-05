package Exercies;

public class Q6_Fibonacci {
public static void main(String[] args) {
	int s1 = 0, s2 = 1, s3,i, count=12;
	System.out.println(s1+""+s2);
	for(i=2;i<count;++i) {
		s3=s1+s2;
		System.out.println(" "+s3);
		s1=s2;
		s2=s3;

	}
}
}
