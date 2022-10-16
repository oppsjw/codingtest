import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import base.SolutionBase;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("ProbNo 입력 : ");
		String probNo = in.nextLine();
		System.out.println();
		
		try {
			SolutionBase sol = new SolutionBase(probNo);
			
			System.out.println(sol.getKlass().getMethod("getResult", null).invoke(probNo, args));
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}