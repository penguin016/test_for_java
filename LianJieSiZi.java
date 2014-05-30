import java.util.Scanner;


public class lianJieSiZi {
	public static void main(String[] args){
		char[][] play = new char[6][7];
		
		int count = 1;
		Scanner input = new Scanner(System.in);
		int userinput;
		boolean won = false;
		while(true){
			for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(play[i][j]);
			}
			System.out.print("\n");
		}
			
			if(won){
				break;
			}
		if(count%2 !=0){
			System.out.print("Drop a red disk at column (0-6):");
			userinput = input.nextInt();
			int i=5;
			while(play[i][userinput]-'\u0000' != 0)i--;
			if(i<0){
				System.out.print("Repeat drop a red disk at column (0-6):");
			}
			else{
				play[i][userinput] = 'R';
				count++;
			}
				
		}
		else{
			System.out.print("Drop a yellow disk at column (0-6)");
		    userinput = input.nextInt();
		    int i=5;
		    while(play[i][userinput]-'\u0000' != 0)i--;
		    if(i<0){
		    	System.out.print("Repeat drop a red disk at column (0-6):");
		    }
		    else{
		    	play[i][userinput] = 'Y';
			    count++;
		    }
		}
		//ÅÐ¶ÏÊäÓ®
		
		for(int i=0;i<6;i++){
			for(int j=0;j<4;j++){
				if(play[i][j]-'Y' == 0&&play[i][j+1]-'Y' == 0&&play[i][j+2]-'Y' == 0&&play[i][j+3]-'Y' == 0){
					System.out.println("The yellow player won");
					won = true;
				}
				if(play[i][j]-'R' == 0&&play[i][j+1]-'R' == 0&&play[i][j+2]-'R' == 0&&play[i][j+3]-'R' == 0){
					System.out.println("The red player won");
					won = true;
				}
			}
		}
		
		for(int j=0;j<7;j++){
			for(int i=0;i<3;i++){
				if(play[i][j]-'Y' == 0&&play[i+1][j]-'Y' == 0&&play[i+2][j]-'Y' == 0&&play[i+3][j]-'Y' == 0){
					System.out.println("The yellow player won");
					won = true;
				}
				if(play[i][j]-'R' == 0&&play[i+1][j]-'R' == 0&&play[i+2][j]-'R' == 0&&play[i+3][j]-'R' == 0){
					System.out.println("The red player won");
					won = true;
				}
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				if(play[i][j]-'Y' == 0&&play[i+1][j+1]-'Y' == 0&&play[i+2][j+2]-'Y' == 0&&play[i+3][j+3]-'Y' == 0){
					System.out.println("The yellow player won");
					won = true;
				}
				if(play[i][j]-'R' == 0&&play[i+1][j+1]-'R' == 0&&play[i+2][j+2]-'R' == 0&&play[i+3][j+3]-'R' == 0){
					System.out.println("The red player won");
					won = true;
				}
			}
		}
		

			
		
			

		}
	}

}
