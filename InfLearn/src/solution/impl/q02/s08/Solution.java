package solution.impl.q02.s08;

import java.util.Scanner;

import solution.base.SolutionInf;

public class Solution implements SolutionInf {

	@Override
	public String getResult() {
		String ret = "";
		{
			//String ret = "";
			
			Scanner in = new Scanner(System.in);
			
			int studentCount = in.nextInt();
			int[] arrInStudentScore = new int[studentCount];
			int[] arrIndex = new int[studentCount];
			for(int i=0; i<studentCount; i++) {
				arrInStudentScore[i] = in.nextInt();
				arrIndex[i] = i+1;
			}
			
			for(int i=0; i<studentCount-1; i++) {
				for(int j=i; j<studentCount-1; j++) {
					if(arrInStudentScore[i] < arrInStudentScore[j+1]) {
						swap(arrInStudentScore, i, j+1);
						swap(arrIndex, i, j+1);
					}
				}
			}
			
			for(int x : arrIndex) {
				if(!ret.isEmpty())
					ret += " " + String.valueOf(x);
				else
					ret += String.valueOf(x);
			}
			
			System.out.println(ret);
		}
		
		return ret;
	}
	
	public void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
