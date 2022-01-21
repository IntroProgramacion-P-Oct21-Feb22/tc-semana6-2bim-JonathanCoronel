/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import org.apache.commons.lang3.RandomUtils;
/**
 *
 * @author JonathanCoronel
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int par1=100;
        int par2=110;
        obtenerRandonNuemeros(par1, par2);

    }
    public static void obtenerRandonNuemeros(int num1, int num2) {
        int num; 
        int[] a = new int[10];
        for (int i =0; i<a.length;i++){
        num=(RandomUtils.nextInt( num1, num2));
        a[i]=num;
            System.out.printf("a[%d]=%d\n",i,a[i]);
        }
    }
   }