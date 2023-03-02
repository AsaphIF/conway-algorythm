public class myconway {
    
    public static int grid[][] =    {   { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
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

    
    public static void print(int grid[][], int m, int n ){

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (grid[i][j] == 0 )
                    System.out.print("_");
                else
                    System.out.print("#");            
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void prox(int grid[][], int m , int n){
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
                
                alive -=grid[l][p];

                if((grid[l][p]==1)&&(alive < 2))
                    futuro[l][p] = 0; 

                if((grid[l][p]==1)&&(alive > 3))
                    futuro[l][p] = 0; 

                if((grid[l][p]==0)&&(alive == 3))
                    futuro[l][p] = 1; 
                else 
                    futuro[l][p] = grid[l][p];

            }
        }

        System.out.println("novo");

        print(futuro,m,n);

        grid = futuro;

    }
    
    public static void main(String[] args){

        int m = 10, n = 10 ;

        

        print(grid,m,n);

        
        for (int i = 0; i < 5; i++){
            
            
            prox(grid, m , n);

        }
            

    }



}
