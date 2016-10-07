package hw;
/*
 * 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 */
import java.util.Scanner;
public class hw05_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("請輸入n");
		int n = scr.nextInt();
		int sum=0;
		for(int i=n;i>=1;i--){
			sum=sum+i*(i+1);
		}System.out.println("總值為:"+sum);
	}

}