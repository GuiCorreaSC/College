package application;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new TreeSet<>();

		System.out.print("How many students for course A? ");
		int na = sc.nextInt();

		for (int i = 1; i <= na; i++) {
			set.add(sc.nextInt());
		}
		
		
		System.out.print("How many students for course B? ");
		int nb = sc.nextInt();
		for(int i = 1 ;i <= nb ; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int nc = sc.nextInt();
		for(int i = 1 ; i <= nc ;i++) {
			set.add(sc.nextInt());
		}
		
		
		System.out.println("Total students: "   +set.size());

	}

}
