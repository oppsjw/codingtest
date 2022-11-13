package solution.impl.q03.s03;

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
			int K = in.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = in.nextInt();
			}
			
			int[] arrMax = new int[arr.length-K+1];
			for(int i=0; i<arr.length-K+1; i++) {
				for(int j=0; j<K; j++) {
					arrMax[i] += arr[i+j];
				}
			}
			
			int max = Integer.MIN_VALUE;
			for(int i : arrMax) {
				if(i > max) {
					max = i;
				}
			}
			
			ret = String.valueOf(max);
			
			//System.out.println(ret);
		}
		
		return ret;
	}

}
