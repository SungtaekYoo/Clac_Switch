package Dennis.Sungtaek;

import java.util.Scanner;

public class main {
	public static int sum(int x, int y) {
		return x+y;
	}
	public static int minus(int x, int y) {
		return x-y;
	}
	public static int multiple(int x, int y) {
		return x*y;
	}
	public static int divide(int x, int y) {
		return x/y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char choice;
		int a, b;

		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");

		choice = sc.next().charAt(0); //Scanner���� ���� �� char���� ���� �޴� .nextChar()�� ���� ������
									 //String �Է��� .next()�� �ް�, charAt(index)�� ���� �޴´�. 0��° �Է¶��� ����
									 //��, choice�� '123'�� �Է��� ��� 1���� ����. '314'�� �Է��ϸ� 3�� ����

		switch(choice) {
		case '1':
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(sum(a, b));
			break;

		case '2':
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(minus(a, b));
			break;

		case '3':
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(multiple(a, b));
			break;

		case '4':
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(divide(a, b));
			break;

		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");

		}
	}

}
