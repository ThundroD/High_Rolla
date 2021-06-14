package highRoller;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) { //
		// TODO Auto-generated method stub
		
		
		//Create variables
		int max = 6; 
        int min = 1; 
        int range = max - min + 1;
        
        System.out.println("Would you like to challenge me to a dice game? Y/N");
        Scanner sd = new Scanner(System.in);
		String scan = sd.next();
		if(scan.equalsIgnoreCase("Y")) {
        
			Boolean play = true;
			//Create While loop to play game again
			while (play) {
        	//Initiate counting variables
				int win = 0;
				int lose = 0;
				int draw = 0;
				//for loop to set 3 rounds of the game
				for(int i = 0; i < 3; i++) {
					System.out.println("Enter 'roll' into the console to roll the dice.");
					//Ask user to enter roll if they do start the game
					Scanner sc = new Scanner(System.in);
					String scanned = sc.next();
					/*if they enter roll give random number for dice roll, tell them if it's a good roll or if computer
        			thinks it's going to win*/
					if (scanned.equals("roll")) {
						int rand = (int)(Math.random() * range) + min; //create random number then print
						System.out.println(rand);
						if (rand >= 4) {
							System.out.println("Good roll!");
						}
						else {System.out.println("Ha! I'm going to win");
						}
					
						//Print out statement that it's the computers turn and their roll.
						System.out.println("Now it's my go!");
						int rand2 = (int)(Math.random() * range) + min; //create random number
						System.out.println(rand2);
					
						//Print out if user won, computer won or if it was a draw by comparing values of variables
						if(rand > rand2) {
							System.out.println("Oh no! You win!");
							win += 1;
						}
						else if (rand < rand2) {
							System.out.println("Haha! I win!");
							lose +=1;
						}
						else {System.out.println("It's a draw");
						draw+=1;
						}
       
					}
        
				}
				//If statements to show tell user who won the game
				if(win - lose > 0 || win + draw == 3)  {
					System.out.println("You win the game!");
				}
				else if(win - lose < 0 || lose + draw == 3)  {
					System.out.println("I win, you loose the game!");
				}
				else if((draw == 1 && lose == 1 && win == 1) || (draw == 3 && lose == 0 && win == 0))
				{System.out.println("Looks like we have no winner. The game is a draw");
				}
				//Ask user if they'd like to play again. If yes, game starts over. If no, game ends.
				System.out.println("Would you like to play again? Y/N?");
				Scanner sc = new Scanner(System.in);
				String scanned = sc.next();
				if(scanned.equalsIgnoreCase("Y")){
					play = true;
				}
				else {
					play = false;
					System.out.println("See you next time");
					sc.close();
				}
				
			} //end of if while loop
			
		} //end of if statement
		
	} //end of public static void
} //end of class