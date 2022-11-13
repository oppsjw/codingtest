package solution.impl.q03.s01;

import java.util.Scanner;

import solution.base.SolutionInf;

public class Solution implements SolutionInf {

	@Override
	public String getResult() {
		String ret = "";
		{
			//String ret = "";
			Scanner in = new Scanner(System.in);
			
			int n = in.nextInt();
			int[] arrN = new int[n];
			for(int i=0; i<n; i++) {
				arrN[i] = in.nextInt();
			}
			int m = in.nextInt();
			int[] arrM = new int[m];
			for(int i=0; i<m; i++) {
				arrM[i] = in.nextInt();
			}
			
			
			
			int[] arrNM = new int[n+m];
			mergeArr(arrNM, arrN, arrM);
			sortArr(arrNM);
			
			for(int i : arrNM) {
				ret += String.valueOf(i) + " ";
			}
			ret.trim();
			
			//System.out.println(ret);
		}
		
		return ret;
	}
	
	public void mergeArr(int[] arrNM, int[] arrN, int[] arrM) {
		int i=0;
		for(int a=0; a<arrN.length; a++) {
			arrNM[i++] = arrN[a];
		}
		for(int b=0; b<arrM.length; b++) {
			arrNM[i++] = arrM[b];
		}
	}
	
	public void sortArr(int[] arrNM) {
		for(int i=0; i<arrNM.length-1; i++) {
			for(int j=i; j<arrNM.length-1; j++) {
				if(arrNM[i] > arrNM[j+1]) {
					swap(arrNM, i, j+1);
				}
			}
		}
	}
	
	public void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
