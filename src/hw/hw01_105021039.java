package hw;
/*
 * topic:輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。 
 */
import java.util.Scanner;
public class hw01_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("請輸入一個正整數值(不包含0)");
		long a = scr.nextLong();
		int sum=0;
		while (a>0){
			sum=sum+1;
			a=a/10;
		}System.out.println(sum+"位數");
	}

}
