package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex05_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("輸入一正整數:");
		int a = scr.nextInt();
		if(a%2==0){
			System.out.println("是偶數");
			}else{
				if(a%2==1){
					System.out.println("是奇數");
				}
		}
	}

}
