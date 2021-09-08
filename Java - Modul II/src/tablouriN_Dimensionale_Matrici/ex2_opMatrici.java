package tablouriN_Dimensionale_Matrici;

public class ex2_opMatrici {

	public static void main(String[] args) {
		System.out.println(" Matricea A: \n");
		int a[][]={{6,32,40},{12,44,23},{10,14,15}}; 
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				System.out.print(a[i][j]+" ");    
			}    
			System.out.println();   
		}   
		System.out.println("\n Matricea B: \n");
		int b[][]={{12,27,89},{32,85,52},{42,66,99}};  
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				System.out.print(b[i][j]+" ");    
			}    
			System.out.println();    
		}   
		    
		int c[][]=new int[3][3]; 
		    
		System.out.println("\n Adunarea a doua matrici:  Matricea C = A + B: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=a[i][j]+b[i][j];     
				System.out.print(c[i][j]+" ");    
			}    
			System.out.println();//new line    
		}    
		
		int d[][]=new int[3][3]; 
	    
		System.out.println("\n Scaderea a doua matrici: Matricea D = B - A: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				d[i][j]=b[i][j] - a[i][j];     
				System.out.print(d[i][j]+" ");    
			}    
			System.out.println(); 
		}    
		
		int e[][]=new int[3][3]; 
	    
		System.out.println("\n Inmultirea a doua matrici: Matricea E = A * B: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				e[i][j]=a[i][j] * b[i][j];     
				System.out.print(e[i][j]+" ");    
			}    
			System.out.println(); 
		}    
		
		int f[][]=new int[3][3]; 
	    
		System.out.println("\n Inmultirea cu un scalar:  Matricea F = 5 * A: \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				f[i][j]= 5 * a[i][j];     
				System.out.print(f[i][j]+" ");    
			}    
			System.out.println(); 
		}    

	}

}
