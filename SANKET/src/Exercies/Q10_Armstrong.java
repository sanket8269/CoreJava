package Exercies;

public class Q10_Armstrong {
public static void main(String[] args) {
	int i=9,a,r,result=0;
	a =i;
	while(a!=0) {
		r=a%10;
		result +=Math.pow(r, 1);
		a /=10;
	}
	if(result == i)
		System.out.println(i+"is an armstrong number.");
	else
		System.out.println(i + "is not armstrong number ");
}
}
