
public class Q12_Palindrome {
public static void main(String[] args) {
	int num = 2;
	int i= num;
	int j=0;
	int c;
	while(i!=0) {
		c=i%10;
		j=(j*10)+c;
		i=1/10;
	}
	if(num==j) {
		System.out.println("is not palidrome");
	}
	else {
		System.out.println("is palidrome ");
	}
}  

}
