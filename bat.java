package View;

import java.util.Random;
import java.util.Scanner;

public class bat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� �г����� �Է��ϼ���. :");
		String name = scanner.next();
		System.out.println("�����Ǿ����ϴ�!");
		System.out.println("�߻��� ���Ͱ� ��Ÿ����!");
		System.out.println("");
		System.out.println("-------------------------");
		
		int life_1 = 100;
		int life_2 = 100;
		int heal_1 = 3;
		int heal_2 = 3;
		int turn= 1;			
		
		while(true) {
			if (life_1 <= 0 ) {
				System.out.println("������ �¸�");
				break;
			}
			
			if (life_2 <= 0 ) {
				System.out.println(name +"�� �¸�");
				break;
			}	
			
			System.out.println("���� �� �� :" + turn );
			System.out.println("*** " + name + "����� ü�� : " + life_1 + " ***");
			System.out.println("*** ������ ü�� : " + life_2 + " ***");
			System.out.println("*** ���� ȸ�� ���� Ƚ�� : " + heal_1 + " ***" );
			System.out.println("-------------------------");
			System.out.println("1. �����Ѵ�  2. ����Ѵ�  3. ȸ���Ѵ�");
			System.out.println("-------------------------");
			System.out.println("������ �ұ��?");
			
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
				System.out.println(name + "����� ����!");
				System.out.println("���Ϳ��� 20�� �������� ������!");
				System.out.println("������ ����!");
				System.out.println(name + "���� 10�� �������� �Ծ���!");
				turn++;
				
			}else if (how == 1 && num == 2) {
				System.out.println( "���ʹ� ����¼��� ����.");
				System.out.println( name +"����� ����!");
				System.out.println( "���ʹ� ������ ����ߴ�!");
				turn++;
			
			}else if (how == 1 && num == 3) {
				System.out.println("���ʹ� ȸ���ֹ��� ����ߴ�!.");
				System.out.println("���ʹ� ü���� ȸ���Ǿ���.");
				life_2 = life_2 + 15;
				heal_2--;
				System.out.println( name +"����� ����!");
				life_2 = life_2 - 20;
				turn++;
				
			}else if (how == 2 && num == 1) {
				System.out.println(name + "����� ���!");
				System.out.println( name + "(��)�� ����¼��� ����.");
				System.out.println("������ ����!");
				System.out.println("������" + name + "���� ������ ����ߴ�!");
				turn++;
				
			}else if (how == 2 && num == 2) {
				System.out.println( name + "(��)�� ����¼��� ����.");
				System.out.println("���ʹ� ����¼��� ����.");
				System.out.println("�ƹ��� ����.");
				turn++;
			
			}else if (how == 2 && num == 3) {
				System.out.println( name + "(��)�� ����¼��� ����.");
				System.out.println("���ʹ� ȸ���ֹ��� ����ߴ�!.");
				System.out.println("���ʹ� ü���� ȸ���Ǿ���.");
				life_2 = life_2 + 15;
				heal_2--;				
				turn++;
			
			}else if (how == 3 && num == 1) {
				System.out.println( name + "(��)�� ȸ���ֹ��� ����ߴ�!.");
				System.out.println( name + "(��)�� ü���� ȸ���Ǿ���.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("������ ����!");
				life_1 = life_1 - 10;
				System.out.println(name + "���� 10�� �������� �Ծ���!");
				turn++;
			
			}else if (how == 3 && num == 2) {
				System.out.println( name + "(��)�� ȸ���ֹ��� ����ߴ�!.");
				System.out.println( name + "(��)�� ü���� ȸ���Ǿ���.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("���ʹ� ����¼��� ����.");
				System.out.println("�ƹ��� ����.");
				turn++;
			
			}else if (how == 3 && num == 3) {
				System.out.println( name + "(��)�� ȸ���ֹ��� ����ߴ�!.");
				System.out.println( name + "(��)�� ü���� ȸ���Ǿ���.");
				life_1 = life_1 + 15;
				if (life_1 > 100) {
					life_1 = 100;
				}
				heal_1--;
				System.out.println("���ʹ� ȸ���ֹ��� ����ߴ�!.");
				System.out.println("���ʹ� ü���� ȸ���Ǿ���.");
				life_2 = life_2 + 15;
				heal_2--;
				turn++;
			
			}
			
		
	
			
			
			
		}
	}
	
	
}