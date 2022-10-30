package solution.impl.q02.s07;

import java.util.Scanner;

import solution.base.SolutionInf;

public class Solution implements SolutionInf {	
	@Override
	public String getResult() {
		String ret = "";
		{
			//String ret = "";
			
			Scanner in = new Scanner(System.in);
			
			int probCount = in.nextInt();
			int[] arrInOX = new int[probCount];
			boolean[] arrOX = new boolean[probCount];
			for(int i=0; i < probCount; i++) {
				arrInOX[i] = in.nextInt();
				arrOX[i] = arrInOX[i] == 0 ? false : true;
			}
			in.close();
			
			int[] arrScore = new int[probCount];
			int resultScore = 0;
			for(int i=0; i < probCount; i++) {
				if(arrOX[i]) {
					if(i!=0 && arrOX[i-1]) {
						resultScore = arrScore[i-1];
					}
					else {
						resultScore = 0;
					}
					
					resultScore += 1;
					
					arrScore[i] = resultScore;
				}
			}
			
			int sum = 0;
			for(int i=0; i<arrScore.length; i++) {
				sum += arrScore[i];
			}
			ret = String.valueOf(sum);
			
			//System.out.println(ret);
		}
		return ret;
	}
}
