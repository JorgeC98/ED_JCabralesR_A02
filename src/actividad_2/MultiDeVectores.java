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
public class MultiDeVectores {
    public static int multi (int[] vector, int n){
        if(n==0){
            return vector[0];
        }else{
            return multi(vector,n-1)* vector[n];
        }
    }
}

