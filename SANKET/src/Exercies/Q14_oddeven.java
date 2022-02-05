package Exercies;

public class Q14_oddeven {
public static void main(String[] args) {
	int no=345;
	int evencount =0,oddcount=0, evensum=0,oddsum=0;
	while(no>0) {
		if(no%2==0) {
			evencount++;
			evensum= evensum+no;
		}else {
			oddcount++;
			oddsum=oddsum+no;	
		}
			no--;
	} int avgeven,avgodd;
	avgeven= evensum/evencount;
	avgodd= oddsum/oddcount;
	System.out.println("avg of even number "+avgeven);
	System.out.println("avg of odd number" +avgodd);
}
}
