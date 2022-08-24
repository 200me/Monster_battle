package View;

import java.util.Random;
import java.util.Scanner;

public class bat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your username. :");
		String name = scanner.next();
		System.out.println("Ready");
		System.out.println("A wild monster appeared!");
		System.out.println("");
		System.out.println("-------------------------");
		
		int life_1 = 100;
		int life_2 = 100;
		int heal_1 = 3;
		int heal_2 = 3;
		int turn= 1;			
		
		while(true) {
			if (life_1 <= 0 ) {
				System.out.println("Monster's Win");
				break;
			}
			
			if (life_2 <= 0 ) {
				System.out.println(name +"'s Win");
				break;
			}	
			
			System.out.println("Number of turns now :" + turn );
			System.out.println("*** " + name + "'s Physical strength : " + life_1 + " ***");
			System.out.println("*** Monster's Physical strength : " + life_2 + " ***");
			System.out.println("*** Number of recoverable remaining : " + heal_1 + " ***" );
			System.out.println("-------------------------");
			System.out.println("1. Attack  2. Defense  3. Recovery");
			System.out.println("-------------------------");
			System.out.println("What should I do?");
			
			Random random = new Random();
			int num = 0;
			
			if(life_2 > 50) {
				 num = random.nextInt(2)+1;
			}else if(life_2 < 50) {
				 num = random.nextInt(3)+1;
			}
			int how = scanner.nextInt();
			
			if (how == 1 && num == 1) {
				life_2 = life_2 - 20;
				life_1 = life_1 - 10;
				System.out.println(name + "'s Attack!");
				System.out.println("The monster was damaged 20!");
				System.out.println("Monster's Attack!");
				System.out.println(name + "'s was damaged 20");
				turn++;
				
			}else if (how == 1 && num == 2) {
				System.out.println( "The monster is on the defensive.");
				System.out.println( name +"'s Attack!");
				System.out.println( "The monster defended the attack!");
				turn++;
			
			}else if (how == 1 && num == 3) {
				System.out.println("The monster used a recovery spell!.");
				System.out.println("The monster has recovered his strength.");
				life_2 = life_2 + 15;
				heal_2--;
				System.out.println( name +"'s Attack!");
				life_2 = life_2 - 20;
				turn++;
				
			}else if (how == 2 && num == 1) {
				System.out.println(name + "'s defense!");
				System.out.println( name + "'s is on the defensive.");
				System.out.println("Monster's Attack!");
				System.out.println("But" + name + "'s defended the attack!");
				turn++;
				
			}else if (how == 2 && num == 2) {
				System.out.println( name + "'s is on the defensive.");
				System.out.println("The monster is on the defensive.");
				System.out.println("Nothing happened.");
				turn++;
			
			}else if (how == 2 && num == 3) {
				System.out.println( name + "'s is on the defensive.");
				System.out.println("The monster used a recovery spell!.");
				System.out.println("The monster has recovered his strength.");
				life_2 = life_2 + 15;
				heal_2--;				
				turn++;
			
			}else if (how == 3 && num == 1) {
				System.out.println( name + "'s used a recovery order!.");
				System.out.println( name + "'s have recovered my strength.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("Monster's Attack!");
				life_1 = life_1 - 10;
				System.out.println(name + "'s was damaged by 10");
				turn++;
			
			}else if (how == 3 && num == 2) {
				System.out.println( name + "'s used a recovery order!.");
				System.out.println( name + "'s have recovered my strength.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("The monster is on the defensive.");
				System.out.println("Nothing happened.");
				turn++;
			
			}else if (how == 3 && num == 3) {
				System.out.println( name + "'s used a recovery order!.");
				System.out.println( name + "'s have recovered my strength.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("The monster used a recovery spell!.");
				System.out.println("The monster has recovered his strength.");
				life_2 = life_2 + 15;
				heal_2--;
				turn++;
			
			}
			
		
	
			
			
			
		}
	}
	
	
}
