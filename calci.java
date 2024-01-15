import java.util.*;
public class calci{
	static Scanner sc = new Scanner(System.in);
	public static int add(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		return a + b;
	}
	
	public static int sub(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		return a - b;
	}
	
	public static int mul(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		return a * b;
	}
	
	public static int div(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( b != 0 ){
		    return a / b;
		} else {
		    return -1;
		}
	}
	
	public static int mod(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( b != 0 ){
		    return a % b;
		} else {
		    return -1;
		}
	}
	
	public static void main(String args[]){
		System.out.println(add());
		System.out.println(sub());
		System.out.println(mul());
		System.out.println(div());
		System.out.println(mod());
	}
}
