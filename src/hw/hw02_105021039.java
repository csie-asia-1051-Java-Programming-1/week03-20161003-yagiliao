package hw;
/*
 * topic:讓使用者輸入多個數，統計正數、負數及零各有多少個。  
 */
import java.util.Scanner;
public class hw02_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int a=0 , b=0 , c=0;
		int i=1;
		while(i==1){
			System.out.println("請輸入數字");
			int m = scr.nextInt();
			if(m>0){
			a=a+1;
			}else
				if(m==0){
					b=b+1;
				}else
					if(m<0){
					c=c+1;
					}System.out.println("是否繼續輸入數字，是輸入1、否輸入2");
					int t = scr.nextInt();
					if(t==2){
						i=0;
				}
			}System.out.println("正數有:"+a+"個"+ "\n" +"零有:"+b+"個"+ "\n" +"負數:"+c+"個");
		}
	}
