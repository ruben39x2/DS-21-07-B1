package ejercicio1;

/**
 * @autor Grupo 21-07
 * Diseño de Software
 */
public class Collatz {
    private int counter;
    private int[] aux;
    
    public int lengthCollatz(int[] list){
        int counter = 0;
        for(int i =0; i<list.length; i++){
            if(list[i] !=0){
                counter++;
            }else{
                break;
            }
        }
        
        return counter;
    }
    
    private int[] serieCollatz(int n){
        
        if(esPar(n)){
            //Si es Par lo dividimos entre 2
            n = n/2;
            aux[counter] = n;
            counter++;
            serieCollatz(n);
        }else if((!esPar(n)) && (n != 1)){
            //Si es impar lo multiplicamos por 3 y sumamos 1
            n = (n*3)+1;
            aux[counter] = n;
            counter++;
            serieCollatz(n);
        }else{
            return aux;
        }
        
        return aux;
    }
    
    public int[] collatz(int n) throws IllegalArgumentException{
        
        if(n <= 0){
            throw new IllegalArgumentException();
        }else{
            counter = 0;
            aux = new int[300];
            aux[counter] = n;
            counter++;
            return serieCollatz(n);
        }
    }
    
    
    private boolean esPar(int n){
        if ((n % 2) == 0) {
            return true;
        }else{
            return false;
        }
    }
}
