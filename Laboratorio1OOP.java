/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1oop;
/**
 *
 * @author Julian
 */
public class Laboratorio1OOP {

    /**
     * @param args the command line arguments
     */
    public static int[] crearArregloEnteros(int n){
      int[] A= new int[n];
      return A;
    }
     
    public static double[] crearArregloReales(int n){
      double[] A= new double[n];
      return A;
    }
    
    public static int[] votos(int n){
      java.util.Scanner lectura= new java.util.Scanner(System.in);
      int[] A= crearArregloEnteros(n);
      for(int i=0; i<n; i++){
        System.out.print("Ingrese los votos del candidato " + (i+1) + ": ");
        A[i]=lectura.nextInt();
      }
      return A;  
    }
    
    public static double[] porcentajesVotos(int[] A, int n){
      int c=0;
      for(int i=0; i<n; i++){
        c+=A[i];      
      }
      double[] porcentajes= crearArregloReales(n);
      for(int i=0; i<n; i++){
        porcentajes[i]=(A[i]*100)/c;    
      }
      return porcentajes;    
    }
    
    public static int ganadorMitadVotos(double A[], int n){
      int ganador=0;
      for(int i=0; i<n; i++){
        if(A[i]>50){
          ganador=i;    
        }    
      }    
      return ganador;    
    }
    
    public static boolean paraTodoArreglosReales(double a, int n, double A[]){
      boolean c= true;
      for(int i=0; i<n && !c; i++){
        c&=(a>A[i]);    
      }
      return c; 
    }
    
    public static double[] ordenarArregloReales(double A[], int n){
      if(n==1){
        return A[0];  
      }else{
        if(n==2)    
      }    
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
      int n=3;
      int[] municipio= votos(n);
      int m=2;
      System.out.print("Municipio " + m + "{" + municipio[0] + ",");
      for(int i=1; i<n-1; i++){
        System.out.print(municipio[i]+",");
      };
      System.out.println(municipio[n-1]+"}");
    }
    
}
