package Exercies;

public class Q5_Reversed {
public static void main(String[] args) {
	int i = 78969, s=0;
	System.out.println(+i);
	while(i!=0) {
		int ss= i%10;
		s=s*10+ss;
		i=i/10;
		}
		System.out.println(s);
	}
}
