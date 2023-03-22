package conway;

public class Conway {
    // quantas vezes o loop se repete
    public static int roda = 150;
    // tamanho da grade
    public static int maxLinha = 20, maxColuna = 20 ;
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
    public static int grade2[][] =    {     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
                                            { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                                            { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0 },
                                            { 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                                            { 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
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
        for(int glinha = 0; glinha < m; glinha++)
        {
            //coluna da grid
            for(int gcoluna = 0; gcoluna < n; gcoluna++)
            {
                //variavel que verifica quantas celulas estão vivas
                int alive = 0;
                //linha
                for (int alinha = -1; alinha <= 1; alinha++)
                    //coluna
                    for(int acoluna = -1; acoluna <= 1; acoluna++){
                        //se tiver uma celula dentro da grid
                        if(( glinha + alinha >= 0 && glinha + alinha < m )&&( gcoluna + acoluna >= 0 && gcoluna + acoluna < n))
                            //conta a celula
                         alive += grid[glinha+alinha][gcoluna+acoluna];
                        
                        else if(( glinha + alinha >= 0 && glinha + alinha < m )&& gcoluna + acoluna >= n)
                            alive += grid[glinha+alinha][0];
                        
                        else if(( glinha + alinha >= 0 && glinha + alinha < m )&& gcoluna + acoluna <= -1)
                            alive += grid[glinha+alinha][n-1];
                        
                        else if( glinha + alinha <= -1 && ( gcoluna + acoluna >= 0 && gcoluna + acoluna < n))
                            alive += grid[m-1][gcoluna+acoluna];
                        
                        else if( glinha + alinha >= m && ( gcoluna + acoluna >= 0 && gcoluna + acoluna < n))
                            alive += grid[0][gcoluna+acoluna];
                        
                        else if( glinha + alinha >= m && gcoluna + acoluna <= -1)
                            alive += grid[0][n-1];
                        
                        else if( glinha + alinha >= m && gcoluna + acoluna >= n)
                            alive += grid[0][0];
                        
                        else if( glinha + alinha <= -1 && gcoluna + acoluna <= -1)
                            alive += grid[m-1][n-1];
                        
                        else if( glinha + alinha <= -1 && gcoluna + acoluna >= n)
                            alive += grid[m-1][0];
                         
                    }     
                //tira a celula lida
                alive -= grid[glinha][gcoluna];
                
                //regras
                
                //Qualquer célula viva com menos de dois vizinhos vivos morre como se causada por subpopulação. 
                if( ( grid[glinha][gcoluna] == 1 ) && ( alive < 2 ) )
                    futuro[glinha][gcoluna] = 0; 
                //Qualquer célula viva com mais de três vizinhos vivos morre, como se por superpopulação.
                else if( ( grid[glinha][gcoluna] == 1 ) && ( alive > 3 ) )
                    futuro[glinha][gcoluna] = 0; 
                //Qualquer célula morta com exatamente três vizinhos vivos torna-se uma célula viva, como se por reprodução.
                else if( ( grid[glinha][gcoluna] == 0 ) && ( alive == 3 ) )
                    futuro[glinha][gcoluna] = 1; 
                //Qualquer célula viva com dois ou três vizinhos vivos passa para a próxima geração.
                else 
                    futuro[glinha][gcoluna] = grid[glinha][gcoluna];

            }
        }
        //retorna a nova grid
        return futuro;
    }
    
    public static void main(String[] args) throws InterruptedException{
        
        int grid[][] =  grade2;
        print(grid,maxLinha,maxColuna);
        Thread.sleep(100);
        cls();
        for (int i = 0; i < roda; i++){
            
            grid = prox(grid, maxLinha , maxColuna);
            System.out.println("");
            print(grid,maxLinha,maxColuna);
            Thread.sleep(100);
            cls();
            
           
        }
        
        
    }
    
    
    
}
