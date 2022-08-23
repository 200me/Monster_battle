package View;

import java.util.Random;
import java.util.Scanner;

public class bat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사용자 닉네임을 입력하세요. :");
		String name = scanner.next();
		System.out.println("설정되었습니다!");
		System.out.println("야생의 몬스터가 나타났다!");
		System.out.println("");
		System.out.println("-------------------------");
		
		int life_1 = 100;
		int life_2 = 100;
		int heal_1 = 3;
		int heal_2 = 3;
		int turn= 1;			
		
		while(true) {
			if (life_1 <= 0 ) {
				System.out.println("몬스터의 승리");
				break;
			}
			
			if (life_2 <= 0 ) {
				System.out.println(name +"의 승리");
				break;
			}	
			
			System.out.println("현재 턴 수 :" + turn );
			System.out.println("*** " + name + "기사의 체력 : " + life_1 + " ***");
			System.out.println("*** 몬스터의 체력 : " + life_2 + " ***");
			System.out.println("*** 남은 회복 가능 횟수 : " + heal_1 + " ***" );
			System.out.println("-------------------------");
			System.out.println("1. 공격한다  2. 방어한다  3. 회복한다");
			System.out.println("-------------------------");
			System.out.println("무엇을 할까요?");
			
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
				System.out.println(name + "기사의 공격!");
				System.out.println("몬스터에게 20의 데미지를 입혔다!");
				System.out.println("몬스터의 공격!");
				System.out.println(name + "기사는 10의 데미지를 입었다!");
				turn++;
				
			}else if (how == 1 && num == 2) {
				System.out.println( "몬스터는 방어태세에 들어갔다.");
				System.out.println( name +"기사의 공격!");
				System.out.println( "몬스터는 공격을 방어했다!");
				turn++;
			
			}else if (how == 1 && num == 3) {
				System.out.println("몬스터는 회복주문을 사용했다!.");
				System.out.println("몬스터는 체력이 회복되었다.");
				life_2 = life_2 + 15;
				heal_2--;
				System.out.println( name +"기사의 공격!");
				life_2 = life_2 - 20;
				turn++;
				
			}else if (how == 2 && num == 1) {
				System.out.println(name + "기사의 방어!");
				System.out.println( name + "(은)는 방어태세에 들어갔다.");
				System.out.println("몬스터의 공격!");
				System.out.println("하지만" + name + "기사는 공격을 방어했다!");
				turn++;
				
			}else if (how == 2 && num == 2) {
				System.out.println( name + "(은)는 방어태세에 들어갔다.");
				System.out.println("몬스터는 방어태세에 들어갔다.");
				System.out.println("아무일 없음.");
				turn++;
			
			}else if (how == 2 && num == 3) {
				System.out.println( name + "(은)는 방어태세에 들어갔다.");
				System.out.println("몬스터는 회복주문을 사용했다!.");
				System.out.println("몬스터는 체력이 회복되었다.");
				life_2 = life_2 + 15;
				heal_2--;				
				turn++;
			
			}else if (how == 3 && num == 1) {
				System.out.println( name + "(은)는 회복주문을 사용했다!.");
				System.out.println( name + "(은)는 체력이 회복되었다.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("몬스터의 공격!");
				life_1 = life_1 - 10;
				System.out.println(name + "기사는 10의 데미지를 입었다!");
				turn++;
			
			}else if (how == 3 && num == 2) {
				System.out.println( name + "(은)는 회복주문을 사용했다!.");
				System.out.println( name + "(은)는 체력이 회복되었다.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("몬스터는 방어태세에 들어갔다.");
				System.out.println("아무일 없음.");
				turn++;
			
			}else if (how == 3 && num == 3) {
				System.out.println( name + "(은)는 회복주문을 사용했다!.");
				System.out.println( name + "(은)는 체력이 회복되었다.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("몬스터는 회복주문을 사용했다!.");
				System.out.println("몬스터는 체력이 회복되었다.");
				life_2 = life_2 + 15;
				heal_2--;
				turn++;
			
			}
			
		
	
			
			
			
		}
	}
	
	
}