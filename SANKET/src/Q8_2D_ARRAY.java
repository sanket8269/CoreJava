
public class Q8_2D_ARRAY {
public static void main(String[] args) {
  int[][] value = new int[5][5];	   
  value = Table(11,20);
    
    for(int row=0;row<value.length;row++) {
    	for(int column=0;column<value[row].length;column++)	{
    		System.out.printf("%2d\t",value[row][column]);
    }
    System.out.println();
    } 
}
    public static int[][] Table(int r, int c)
    {
    	int[][] a = new int[r][c];
    	for(int row=0;row<a.length;row++){
    		for(int column=0;column<a[row].length;column++){
    			a[row][column]=(row+1)*(column+1);
  	}
    	}
    	return a;
    }
}

