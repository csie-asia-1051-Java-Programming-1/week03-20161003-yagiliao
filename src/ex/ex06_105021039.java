package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex06_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("請輸入x值");
		int x =scr.nextInt() ;
		int y ;
		if(x<-1){
			y=3* x*x;
			System.out.println("y值為:"+ y);
		}else{
			if(-1 <= x && x <= 1){
				y=(x*x*x)+(3*x)-3;
				System.out.println("y值為:"+ y);
			}else{
				if(x>1){
					y=2*x+3;
					System.out.println("y值為:"+ y);
				}
			}
		}
	}

}
