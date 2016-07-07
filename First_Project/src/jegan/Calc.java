package jegan;

import java.util.Scanner;

public class Calc implements calculator {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		System.out.println(val1 + val2);
		return (val1 + val2);
	}

	@Override
	public Integer sub(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return (val1 - val2);
	}

	@Override
	public Long mult(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return new Long(val1 * val2);
		// return res;
	}

	@Override
	public Integer div(Integer val1, Integer val2) throws ArithmeticException {
		// TODO Auto-generated method stub
		return (val1 / val2);
	}

	public static void main(String[] args) {
		Integer val1, val2, selection;
		Boolean flag = true;
		calculator cal = new Calc();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Jegan's Calculator");
		while (flag) {
			System.out.println("Enter Val1 and VAl2:");
			val1 = input.nextInt();
			val2 = input.nextInt();
			System.out.println(
					"\nPress 1 for Addition\nPress 2 for Subtraction\nPress 3 for Multiplication\nPress 4 for Division\nEnter Your Choice:");
			selection = input.nextInt();
			switch (selection) {
			case 1: {
				System.out.println(cal.add(val1, val2));
				break;
			}
			case 2: {
				System.out.println(cal.sub(val1, val2));
				break;
			}
			case 3: {
				System.out.println(cal.mult(val1, val2));
				break;
			}
			case 4: {
				try {
					System.out.println("Quotient:" + cal.div(val1, val2));
					System.out.println("Reminder:" + cal.mod(val1, val2));
				} catch (ArithmeticException e) {
					e.printStackTrace();
				}
				break;
			}
			}
			System.out.println("\nPress true to continue\nPress false to end\nDo you wish to continue:");
			flag = input.nextBoolean();
		}
		System.out.println("Thank You");
	}

	@Override
	public Integer mod(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return (val1 % val2);
	}

}
