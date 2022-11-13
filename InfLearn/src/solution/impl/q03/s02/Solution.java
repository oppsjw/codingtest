package solution.impl.q03.s02;

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
			
			
			int count = countEqual(arrN, arrM);
			
			int[] arrNM = new int[count];
			mergeIfequalArr(arrNM, arrN, arrM);
			sortArr(arrNM);
			
			for(int i : arrNM) {
				ret += String.valueOf(i) + " ";
			}
			ret.trim();
			
			//System.out.println(ret);
		}
		
		return ret;
	}
	
	public int countEqual(int[] arrN, int[] arrM) {
		int count = 0;
		for(int i=0; i<arrN.length; i++) {
			for(int j=0; j<arrM.length; j++) {
				if(arrN[i] == arrM[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public void mergeIfequalArr(int[] arrNM, int[] arrN, int[] arrM) {
		int index = 0;
		for(int i=0; i<arrN.length; i++) {
			for(int j=0; j<arrM.length; j++) {
				if(arrN[i] == arrM[j]) {
					arrNM[index++] = arrN[i];
				}
			}
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
