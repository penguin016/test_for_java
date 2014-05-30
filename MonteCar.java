import java.util.Scanner;


public class text {
	public static void main(String[] args){
		final int number = 10000000;
		int num = 0;
		for(int i =0;i<number;i++){
			double x = Math.random()*2.0-1;
			double y = Math.random()*2.0-1;
			if(x*x+y*y<=1)
				num++;
		}
		double pi = 4.0*num/number;
		System.out.println(pi);
	
		
	}

}