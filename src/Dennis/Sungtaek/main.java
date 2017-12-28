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

		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 눗셈");

		choice = sc.next().charAt(0); //Scanner에서 받을 때 char형은 따로 받는 .nextChar()이 없기 때문에
									 //String 입력인 .next()로 받고, charAt(index)를 통해 받는다. 0번째 입력란을 받음
									 //즉, choice에 '123'을 입력할 경우 1번이 선택. '314'을 입력하면 3번 선택

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
			System.out.println("잘못 입력하셨습니다.");

		}
	}

}
