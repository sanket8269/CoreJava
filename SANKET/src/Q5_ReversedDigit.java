
public class Q5_ReversedDigit {
public static void main(String[] args) {
	int i=6789;
	int j=0;
	while (i!=0) {
		int digit =i%10;
		j=j*10+digit;
		i=i/10;
	}
System.out.println(j);
}}
