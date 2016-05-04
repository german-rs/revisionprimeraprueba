

package PrimeraPrueba;
import java.util.Scanner;
/**
 *
 * @author German Riveros S.
 */
public class Respuestas 
{
    private Scanner leer;
    
    public void _7()  // TOTAL  PUNTOS (4-DIMENSIONES 8 PUNTOS)
    {
        
        int[][][][] arreglo = new int[3][3][5][5]; // 4 puntos
        int n = 0;
        
        for (int fil = 0; fil < arreglo.length; fil++) // Total for's 4 puntos
        
            for (int col = 0; col < arreglo[fil].length; col++) 
            
                for (int i = 0; i < arreglo[fil][col].length; i++) 
                
                    for (int j = 0; j < arreglo[fil][col][i].length; j++) 
                    {
                        arreglo[fil][col][i][j] = n; // 4 puntos
                        n++;
                    }
                
        //Clonando...
        
        int[][][][] arreglo_B = arreglo.clone(); // 2 puntos
        
        System.out.println("Elementos del primer arreglo: ");
        
        for(int[][][] arregl : arreglo) // Total for's 4 puntos
        
            for(int[][] arreg : arregl)
                
                for(int[] arre : arreg)
                    
                    for(int arr : arre) 
        
                        System.out.println(arr); // 1 punto
        
        
        System.out.println("\nElementos del arreglo clonado: ");
        
        for(int[][][] arregl_B : arreglo_B) // Total for's 4 puntos
            
            for(int[][] arreg_B : arregl_B)
                
                for(int[] arre_B : arreg_B)
                    
                    for(int arr_B : arre_B)
        
                        System.out.println(arr_B); // 1 punto
        
        
    }//..
    
    public void _6() // TOTAL 20 PUNTOS (3-DIMENSIONES 6 PUNTOS)
    {
        
        int[][][] mlt_5 = new int[2][2][4]; // 3 puntos
        int par = 2;
        int c = 0;
        
        for (int fil = 0; fil < mlt_5.length; fil++) // 2 puntos
        
            for (int col = 0; col < mlt_5[fil].length; col++) // 2 puntos
                 
                for (int i = 0; i < mlt_5[fil][col].length ; i++) // 2 puntos
                {
                    mlt_5[fil][col][i] = par; // 3 puntos
                    par += 2;
                    c ++;
                }
            
        System.out.println("Elementos arreglo: ");
        
        for (int fil = 0; fil < mlt_5.length; fil++) // 2 puntos
        
            for (int col = 0; col < mlt_5[fil].length; col++) // 2 puntos
                 
                for (int i = 0; i < mlt_5[fil][col].length ; i++) // 2 puntos
        
                    System.out.println(mlt_5[fil][col][i]); // 1 punto
        
        System.out.println("La cantidad de elementos es : " + c ); // 1 punto
        
                    
    }//..
    
    public void _5() // TOTAL 12 PUNTOS
    {
        
        double[][] notas = new double[3][2]; // 2 puntos
        leer = new Scanner(System.in); // 1 punto
        double s = 0;
        double prom;
        
        
        for (int fil = 0; fil < notas.length; fil++) // 2 puntos
                  
            for (int col = 0; col < notas[fil].length; col++) // 2 puntos
            {
                
                System.out.println("Ingrese nota: ");
                notas[fil][col] = leer.nextDouble(); // 2 puntos
                s += notas[fil][col];
            }
        
        System.out.println("Sus notas son :");
        
        for(double[] nts : notas)
            
            for(double nt : nts)
                
                System.out.println(nt);
        
        prom = s / 6; 
        
        System.out.println("El promedio es : " + prom); // 1 punto
        
        if(prom >= 4.0) System.out.println("Aprobado"); // 2 puntos
            
            else System.out.println("Reprobado");
            
                
        
    }//..
    
    public void _4() // TOTAL 9 PUNTOS ( 4 PUNTOS POR MATRIZ )
    {
        
        String[][] juegos = new String[][]
        {
            {"aaa", "bbb", "ccc"},
            {"ddd", "eee", "fff"}  // 4 puntos
        }; 
        int fil = 0;
        int col = 0;
        
        System.out.println("Elementos de la matriz: ");
      
        while(fil < juegos.length) // 2 puntos
        {
            col = 0;
            
            while(col < juegos[fil].length) // 2 puntos
            {
                System.out.println(juegos[fil][col]); // 1 punto
                col++;
            }
            
            fil++;
        }
        
    }//..
    
    public void _3() // TOTAL 10 PUNTOS
    {
        int[] numeros = new int[5]; // 1 punto
        leer = new Scanner(System.in); // 1 punto
        int myr = 0;
        
        for (int i = 0; i < numeros.length; i++) // 2 puntos 
        {
         
            System.out.println("Ingrese número: ");
            numeros[i] = leer.nextInt(); // 1 punto
        }
        
        for (int j = 0; j < numeros.length; j++) // 2 puntos
               
            if(myr < numeros[j]) // 2 puntos
            
                myr = numeros[j];
        
        System.out.println("Elementos del vector: ");
        
        for(int nmr : numeros) 
            
            System.out.println(nmr); 
        
        // solo determinar el mayor:
        System.out.println("El mayor es : " + myr); // 1 punto
        
    }//..
    
    public void _2() // TOTAL 13 PUNTOS
    {
        
        int[] mlt = new int[20]; // 1 punto
        int c = 0;
        int s = 0;
        
        for (int i = 1; i < 101; i++) // 2 puntos
            
            if(i % 5 == 0) // 2 puntos
            {
                mlt[c] = i; // 1 punto
                s += mlt[c]; // 1 punto
                c++;
            }
        
        System.out.println("Vector elements: ");
        
        for(int ml : mlt) // 2 puntos
            System.out.println(ml); // 1 punto
        
        
        System.out.println("La suma es: " + s); // 1 punto
        System.out.println("La cantidad de elemento es: " + c); // 1 punto
        
    }//..
    
    public void _1() // TOTAL 5 PUNTOS
    {
        String[] nombres = {"Juan","Pedro","Mateo","Lucas",
            "Isaias","David","Josue"}; // 2 puntos
        
        for(String nm : nombres) //2 puntos
            
            System.out.println(nm); // 1 punto
    }//..
    
    
}//.
