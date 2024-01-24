import java.util.*;
import java.lang.Math;
public class calci{
	public static int add(int a, int b){
		return a + b;
	}
	
	public static int sub(int a, int b){
		return a - b;
	}
	
	public static long mul(int a, int b){
		return a * b;
	}
	
	public static int div(int a, int b){
		if( b != 0 ){
		    return a / b;
		} else {
		    return -1;
		}
	}
	
	public static long square(int a){
		return a * a;
	}
	
	public static int cube(int a){
		return a * a * a;
	}
	
	public static double sqRoot(double a){
		if( a >= 0){
		     return Math.sqrt(a);
		} else{
		     return -1;
		}
		
	}
	
	public static double sin(int a){
		return Math.sin(a);
	}
	
	public static double cos(int a){
		return Math.cos(a);
	}
	
	public static void main(String args[]){
		
	}
}
