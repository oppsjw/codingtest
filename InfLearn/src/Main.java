import java.util.Scanner;

import solution.base.SolutionInf;
import solution.base.SolutionManager;

public class Main {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String qNo = String.format("%02d", in.nextInt());
			String sNo = String.format("%02d", in.nextInt());
			System.out.println();
			
			SolutionManager sm = SolutionManager.getInstance(qNo, sNo);
			SolutionInf solution = sm.getSelectedSolutionClass();
			
			System.out.println(solution.getResult());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}