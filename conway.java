package conway;

public class Conway {
    // quantas vezes o loop se repete
    public static int roda = 20;
    // tamanho da grade
    public static int m = 20, n = 20 ;
    //padrão padrão
    public static int grade[][] =    {      { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
                                    };
//metodo de apagar a tela no cmd
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
	

    //metodo de printar a grid
    public static void print(int grid[][], int m, int n ){

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (grid[i][j] == 0 )
                    System.out.print("\u001B[30m"+"_"+"\u001B[0m");
                else
                    System.out.print("■");            
            }
            System.out.println();
        }
        System.out.println();

    }
//metodo que preve a proxima grad
    public static int[][] prox(int grid[][], int m , int n){
        //proxima grade
        int[][] futuro = new int[m][n];
        //linha da grid
        for(int l = 0; l < m; l++)
        {
            //coluna da grid
            for(int p = 0; p < m; p++)
            {
                //variavel que verifica quantas celulas estão vivas
                int alive = 0;
                //linha
                for (int i = -1; i <= 1; i++)
                    //coluna
                    for(int j = -1; j <= 1; j++)
                        //se tiver uma celula dentro da grid
                        if((l+i>=0&&l+i<m)&&(p+j>=0&&p+j<n))
                            //conta a celula
                         alive += grid[l+i][p+j];
                            
                //tira a celula lida
                alive -= grid[l][p];
                
                //regras
                
                //Qualquer célula viva com menos de dois vizinhos vivos morre como se causada por subpopulação. 
                if( ( grid[l][p] == 1 ) && ( alive < 2 ) )
                    futuro[l][p] = 0; 
                //Qualquer célula viva com mais de três vizinhos vivos morre, como se por superpopulação.
                else if( ( grid[l][p] == 1 ) && ( alive > 3 ) )
                    futuro[l][p] = 0; 
                //Qualquer célula morta com exatamente três vizinhos vivos torna-se uma célula viva, como se por reprodução.
                else if( ( grid[l][p] == 0 ) && ( alive == 3 ) )
                    futuro[l][p] = 1; 
                //Qualquer célula viva com dois ou três vizinhos vivos passa para a próxima geração.
                else 
                    futuro[l][p] = grid[l][p];

            }
        }
        //retorna a nova grid
        return futuro;
    }
    
    public static void main(String[] args) throws InterruptedException{
        
        int grid[][] =  grade;
        print(grid,m,n);
            Thread.sleep(150);
            cls();
        for (int i = 0; i < roda; i++){
            
            grid = prox(grid, m , n);
            System.out.println("");
            print(grid,m,n);
            Thread.sleep(150);
            cls();
            
           
        }
        
        
    }
    
    
    
}
