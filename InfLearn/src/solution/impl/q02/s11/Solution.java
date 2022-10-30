package solution.impl.q02.s11;

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
			int[][] mat = new int[N][5];
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = in.nextInt();
				}
			}
			
			int[] arrCount = new int[N];
			for(int i=0; i<mat.length; i++) {
				int count = 0;
				for(int x=0; x<mat.length; x++) {
					if(x != i) {
						for(int j=0; j<mat[i].length; j++) {
							if(mat[i][j] == mat[x][j]) {
								count++;
							}
						}
					}
				}
				arrCount[i] = count;
			}
			
			int max = Integer.MIN_VALUE;
			for (int i=0; i<arrCount.length; i++) {
				if(max < arrCount[i]) {
					max = arrCount[i];
					ret = String.valueOf(i+1);
				}
			}
			
			//System.out.println(ret);
		}
		
		return ret;
	}

}
