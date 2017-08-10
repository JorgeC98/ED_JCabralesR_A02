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
public class factorial {
    public static int fac(int a){
        if (a==0){
            return 1;
        }else{
                return a*fac(a-1);    
                    }      
    }
    int vector[] = {30,20,10};
}
