package solution.impl.q03.s04;

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
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = in.nextInt();
			}
			
			
			int retCount = 0;
			for(int i=0; i<arr.length; i++) {
				int dest = M;
				int a = 0;
				while(dest >= 0 || i+a < arr.length) {
					if(dest == 0) {
						retCount++;
						break;
					}
					
					dest -= arr[i+a];
					a++;
				}
			}
			
			ret = String.valueOf(retCount);
			
			//System.out.println(ret);
		}
		
		return ret;
	}

}
