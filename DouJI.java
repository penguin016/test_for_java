import java.util.Scanner;

public class text {
	public static void main(String[] args){
		int number,lenth;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop:");
		number = input.nextInt();
		System.out.print("Enter the number 0f slots in the bean machne:");
		lenth = input.nextInt();
		int[] slots = new int[lenth];
		for(int j=0;j<number;j++){
			int left = 0,right = 0;
			for(int i=0;i<lenth-1;i++){
				double count = Math.random();
			    if(count<0.5){
				    left++;
				    System.out.print("L");
			    }
			    else if(count>0.5){
				    right++;
				    System.out.print("R");
			    }
			    else 
				    return;
				}
		     slots[right] = slots[right]+1;
		     System.out.print("\n");
		}
		int max = slots[0];
		for(int i=0;i<slots.length;i++){
			if(slots[i]>max)max=slots[i];
		}
		System.out.print("\n");
		for(int j=max;j>0;j--){
			for(int i=0;i<slots.length;i++){
				if(slots[i]<max)System.out.print(" ");
				else System.out.print(0);
			}
			max--;
			System.out.print("\n");	
		}
	}
}