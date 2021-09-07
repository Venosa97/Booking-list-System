package exClasa;

import java.util.ArrayList;
import java.util.Arrays;

public class ssss {


	public static void main(String[] args) {
		
		int dim = 5;
		int[][] heights = new int[dim][dim];
		int[] row = {1, 2, 3, 4, 5};
		 
		for (int i=0; i<heights.length; i++) {
		  heights[i] = row; 
		}
		 
		for (int i=0; i<row.length; i++) {
		  heights[0][i] = i%2;
		}
		 
		for (int i=0; i<heights.length; i++) {
		  for (int j=0; j<heights[i].length; j++) {
		    System.out.print(heights[i][j] + " ");
		  }
		  System.out.println();
		}
	}
}
