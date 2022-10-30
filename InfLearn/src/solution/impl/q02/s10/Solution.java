package solution.impl.q02.s10;

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
			int[][] mat = new int[N+2][N+2];
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if(i==0 || j==0 || i == mat.length-1 || j == mat[i].length-1) {
						continue;
					}
					else {
						mat[i][j] = in.nextInt();
					}
				}
			}
			
			int count = 0;
			for (int i = 1; i < mat.length-1; i++) {
				for (int j = 1; j < mat[i].length-1; j++) {
					boolean topFlag = true;
					if(mat[i][j] < mat[i-1][j]) {
						topFlag = false;
					}
					if(topFlag == true && mat[i][j] <= mat[i+1][j]) {
						topFlag = false;
					}
					if(topFlag == true && mat[i][j] <= mat[i][j-1]) {
						topFlag = false;
					}
					if(topFlag == true && mat[i][j] <= mat[i][j+1]) {
						topFlag = false;
					}
					
					if(topFlag == true) {
						count++;
					}
				}
			}
			
			ret = String.valueOf(count);
			
			//System.out.println(ret);
		}
		return ret;
	}

}
