
public class chararray {
public static void main(String[] args) {
	char[]ch ={'A','B','C','D','E','F','G','H','I','J'};
			char[]cp =new char[7];
	System.arraycopy(ch,1,cp,0,7);
			for(char c:cp){
				System.out.println(c);	
			}
			
			
}
}
