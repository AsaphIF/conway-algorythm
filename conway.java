public class Conway {
    
    public static int m = 10, n = 10 ;
    public static int grade[][] =    {   { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
                                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
                                    };

    public static void cls()
{
	try
	{	
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E)
		{
			System.out.println(E);
		}
}
	

    
    public static void print(int grid[][], int m, int n ){

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (grid[i][j] == 0 )
                    System.out.print("  ");
                else
                    System.out.print("■");            
            }
            System.out.println();
        }
        System.out.println();

    }

    public static int[][] prox(int grid[][], int m , int n){
        int[][] futuro = new int[m][n];

        for(int l = 0; l < m; l++)
        {
            for(int p = 0; p < m; p++)
            {
                int alive = 0;
                for (int i = -1; i <= 1; i++)
                    for(int j = -1; j <= 1; j++)
                        if((l+i>=0&&l+i<m)&&(p+j>=0&&p+j<n))
                         alive += grid[l+i][p+j];
                
                alive -= grid[l][p];

                if( ( grid[l][p] == 1 ) && ( alive < 2 ) )
                    futuro[l][p] = 0; 

                else if( ( grid[l][p] == 1 ) && ( alive > 3 ) )
                    futuro[l][p] = 0; 

                else if( ( grid[l][p] == 0 ) && ( alive == 3 ) )
                    futuro[l][p] = 1; 
                else 
                    futuro[l][p] = grid[l][p];

            }
        }

        return futuro;
    }
    
    public static void main(String[] args) throws InterruptedException{
        
        int grid[][] =  grade;
        print(grid,m,n);
            Thread.sleep(232);
            cls();
        for (int i = 0; i < 30; i++){
            
            grid = prox(grid, m , n);
            System.out.println("");
            print(grid,m,n);
            Thread.sleep(232);
            cls();
            
           
        }
        
        
    }
    
    
    
}
