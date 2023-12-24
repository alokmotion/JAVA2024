
public class GCD {
	public static int findGCD(int x , int y) {
		while(x!=0 && y !=0) {
			if(x>y) {
				x = x%y;
				
			}else {
				y=y%x;
			}
			
		}
		
		if(x!=0) {
			return x;
		}
		else {
			return y;
		}
		
	}

}





/* 
int min=0;
int max = 0;
if(x<y) {
	min = x;		
}else {
	max = y;
}
for (int i = min ; i>=1; i--) {
	if(x%i == 0 && y%i ==0) {
		System.out.println(i);
		break;
	}
}
 
 */

