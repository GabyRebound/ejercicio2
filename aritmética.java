/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author SAUL
 */
public class aritmética {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=suma(5,1);
        int resta=resta(6,2);
        int division=division(5,4);
    }
    public static int suma(int x, int y)
    {   int res=x+y;
        return res;
    }
    public static int resta(int x, int y)
    {   int res=x-y;
        return res;
    }
    
    public static int division(int x, int y){
        int res=x/y;
        return res;
    }
}
