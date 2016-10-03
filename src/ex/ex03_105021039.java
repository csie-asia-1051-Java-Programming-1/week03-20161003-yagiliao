package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex03_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		char ch1 = scr.next().charAt(0);
		if(65<=ch1 && ch1<=90){
			System.out.println(Character.toLowerCase(ch1));
		}else{
			if(97<=ch1 && ch1<=122){
				System.out.println(Character.toUpperCase(ch1));
			}
		}
		}
	}
