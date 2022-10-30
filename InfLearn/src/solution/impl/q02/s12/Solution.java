package solution.impl.q02.s12;

import java.util.Scanner;

import solution.base.SolutionInf;

public class Solution implements SolutionInf {

	@Override
	public String getResult() {
		String ret = "";
		{
			//String ret = "";
			Scanner in = new Scanner(System.in);
			
			int N = in.nextInt();
			int M = in.nextInt();
			int[][] mat = new int[M][N];
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = in.nextInt();
				}
			}
			
			
			
			//System.out.println(ret);
		}
		
		return ret;
	}

}
