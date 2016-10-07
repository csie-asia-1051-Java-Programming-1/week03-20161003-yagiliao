package hw;
/*
 * 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 */
import java.util.Scanner;
public class hw04_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("請輸入n");
		int n=scr.nextInt();
		int sum=1 , i=n ;
		while (i>=1){
			sum=sum*i;
			i--;
		}
		System.out.println("n!="+sum);
	}

}
