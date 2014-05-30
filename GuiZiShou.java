import java.util.Scanner;

public class CopyOfGuiZiShou {
	public static void main(String[] args){
		String[] words = {"write","that","program","love","you","success","number","read","android"};
		String yOrN = "y";
		
		while(yOrN.equals("y")){
			int squ = (int)(Math.random()*words.length);
		    char[] temp = new char[words[squ].length()];
		    for(int i=0;i<temp.length;i++)
		    	temp[i] = '*';
		    Scanner input = new Scanner(System.in);
		    int miss = 0;
		    for(int i=0;i<words[squ].length();i++){
		    	System.out.print("(Guess) Enter a letter in word "+String.valueOf(temp)+">");
			    String get = input.next();
			    int result = words[squ].indexOf(get);
		        int count = 0;
		        while(result!=-1){
		        	if(temp[result]-get.charAt(0) != 0)
		        		temp[result] = get.charAt(0);
		        	else{
		        		System.out.println(get+"is already in the word");
		        		break;
		        	}
		        	result = words[squ].indexOf(get, result+1);
			        count++;
		        }
		        if(count == 0){
		        	System.out.println(get+" is not in the word");
		        	i--;
			        miss++;
		        }
		        else
		        	i +=(count-1);
		    }
		    System.out.println("The word is "+words[squ]+"."+"You missed "+miss+" time");
		    System.out.print("\n");
		    System.out.print("Do you want to guess for another word? Enter y or n>");
		    yOrN = input.next();
		}
	}
}
