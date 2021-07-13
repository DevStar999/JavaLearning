package com.company.arrays;

public class Multi_Dimensional_Arrays {

	public static void main(String[] args) {
		int rows = 4 , cols = 5 ;
		int grid[][] = new int[rows][cols] ;
		int grid1[][] = { {1,2,3} , {37,41} } ;	
		
		System.out.println("The elements of the grid are as follows :") ;
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				grid[i][j] = i*cols + j ;
				System.out.print(grid[i][j] + "\t") ;
			}
			System.out.println() ;
		}
	}

}
