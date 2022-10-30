package solution.impl.q02.s09;

import java.util.ArrayList;
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
			int[][] mat = new int[N][N];
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = in.nextInt();
				}
			}
			ArrayList<Integer> listSum = new ArrayList<>(N + N + 2);
			
			for (int i = 0; i < N; i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
					sum += mat[i][j];
				}
				
				listSum.add(sum);
			}
			for (int i = 0; i < N; i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
					sum += mat[j][i];
				}
				
				listSum.add(sum);
			}
			for (int i = 0; i < N; i++) {
				int sum = 0;
				sum += mat[i][i];
				
				listSum.add(sum);
			}
			for (int i = 0; i < N; i++) {
				int sum = 0;
				sum += mat[i][N-1-i];
				
				listSum.add(sum);
			}
			
			int max = Integer.MIN_VALUE;
			for(Integer sum : listSum) {
				if(max < sum) {
					max = sum;
				}
			}
			
			ret = String.valueOf(max);
			
			//System.out.println(ret);
		}
		
		return ret;
	}

}
