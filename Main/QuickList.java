
package Main;

import java.util.ArrayList;
import java.util.List;

public class QuickList {

    public static void main(String[] args) {
      //int arreglo[]={4,3,1,2};
      List <Integer> arreglo=new ArrayList<Integer>();
       //List <Integer> arreglo2=new ArrayList<Integer>();
       //{9,1,4,3,10,7,5};
        arreglo.add(4);
        arreglo.add(3);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(6);
        arreglo.add(2);
      
        
      System.out.println("Lista desordenada: ");
      for(int j=0; j<arreglo.size(); j++){
          System.out.print(" "+arreglo.get(j));
      }
      int izq=0, der=arreglo.size()-1;
        //System.out.println(der);
      quicksort(arreglo, izq, der);
        System.out.println(" ");
      System.out.println("Lista ordenada: ");
      for(int j=0; j<arreglo.size(); j++){
          System.out.print(" "+arreglo.get(j));
      }
    }
    
    private static void quicksort(List<Integer> arreglo, int izq, int der){
        //int pivote=arreglo.get(izq), aux, i=izq, d=der;
       int pivote= arreglo.get(izq), aux, i=izq, d=der;
       //int a=arreglo.get(i);
       //int b=arreglo.get(d);
        //System.out.println(a);
       while(i<d){
           //int a= arreglo.get(i);
           while(arreglo.get(i)<=pivote && i<d)
              i++;
           //int b=arreglo.get(d);
           while(arreglo.get(d)>pivote)
              d--;
            
           if(i<d){
                //aux=arreglo[i];
               aux=arreglo.get(i);
               //arreglo[i]=arreglo[d];
               arreglo.set((i), arreglo.get(d));
               //arreglo[d]=aux;
               arreglo.set(d ,aux);
           }
       }
       //arreglo[izq]=arreglo[d];
       arreglo.set(izq ,arreglo.get(d));
       //arreglo[d]=pivote;
       arreglo.set(d ,pivote);
       if(izq<d-1)
           quicksort(arreglo, izq, d-1);
       
       if(d+1<der)
           quicksort(arreglo, d+1, der);
       
    }
    
    
}
