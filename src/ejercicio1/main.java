
package ejercicio1;

import sun.org.mozilla.javascript.internal.ast.ForInLoop;


public class main {
    
    public static void main(String[] args){
        
        Collatz coll = new Collatz();
        
        int[] collnumber = coll.collatz(6);
        
        int size = coll.lengthCollatz(collnumber);
        
        for (int i = 0; i < size; i++) {
            System.out.print(collnumber[i]+" ");
        }
    }

}
