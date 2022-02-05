package Exercies;

public class Q7_Sumofallintegers {
public static void main(String[] args) {
	int sum = 0;
	for(int i=101;i<200;i++) {
		if (i%7==0)
			sum = sum+i; 	 	
		}
	System.out.println(sum);
	}
}
