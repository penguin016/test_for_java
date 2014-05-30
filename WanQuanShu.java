import java.util.Scanner;


public class text {
	public static void main(String[] args){
		final int number = 10000;
		int sum=0;
		for(int i=1;i<number;i++){
			for(int j=1;j<=i/2;j++){
				if(i%j == 0)
					sum += j;
			}
			if(sum == i)
				System.out.println(i);
			sum = 0;
		}
	}

}
