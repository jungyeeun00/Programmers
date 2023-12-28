import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
			System.out.println(PositionCount(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		sc.close();
	}
	public static int PositionCount(int x1,int y1, int r1, int x2, int y2, int r2) {
		double d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));	
			
		if(d==0) {
			if(r1==r2) return -1;
			else return 0;
		}
		
		if(Math.abs(r1-r2)>d) return 0;
		
		if(Math.abs(r1+r2)==d||Math.abs(r1-r2)==d)
			return 1;
		else if(Math.abs(r1+r2)<d) 
			return 0;		
		else return 2;
	}
}
