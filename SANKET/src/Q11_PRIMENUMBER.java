
public class Q11_PRIMENUMBER {
public static void main(String[] args) {
	int no=68;
	boolean sj= false;
	for(int i=2;i<=no/2;++i) {
	if(no%i==0) {
		sj=true;
		break;
	}}
		if(sj) 
		System.out.println("number is not prime number");
	else 
		System.out.println("number is prime number");
	}}