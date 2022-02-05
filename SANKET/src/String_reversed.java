
public class String_reversed {
public static void main(String[] args) {
	String S = "Mahendra patidar";
	String r = "";
	for(int i=S.length()-1;i>=0;i--)
	{r=r + S.charAt(i);	
	}
System.out.println(r);
}
}