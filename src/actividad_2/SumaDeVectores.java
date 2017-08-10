/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

/**
 *
 * @author JorgeRicardo
 */
public class SumaDeVectores {
    public static int suma (int[] vector, int n){
        if(n==0){
            return vector[0];
        }else{
            return suma(vector,n-1)+vector[n];
        }
       
    }
     
}
