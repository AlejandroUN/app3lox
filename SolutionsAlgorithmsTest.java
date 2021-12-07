import java.util.ArrayList;
import java.util.Random;


public class Algorithms{
    
    public void seventhPoint(){
        int int0 = 5;
        boolean isDivisibleBy5 = ((int0%5)==0);
        System.out.println("Variable: " + String.valueOf(int0) + " Is divisble by 5?: " + String.valueOf(isDivisibleBy5));
        
        int0 = 2;
        isDivisibleBy5 = ((int0%5)==0);
        System.out.println("Variable: " + String.valueOf(int0) + " Is divisble by 5?: " + String.valueOf(isDivisibleBy5));
        
        System.out.println("Respuesta: D");
    }
    
    public void eighthPoint(){
        for(int i=0; i<10; i++){
            i+=1;
            System.out.println("HelloWorld \n");
        }
        
        System.out.println("Respuesta: B");
    }
    
    public ArrayList<Integer> generateRandomArray(){
        ArrayList<Integer> list = new ArrayList<Integer>(100);
        Random random = new Random();
    
        for (int i = 0; i < 100; i++){
            list.add(random.nextInt(100000));
        }
        return list;
    }
        
    public ArrayList<Integer> insertionSort(ArrayList<Integer> array){
        int n = array.size();
        for (int i = 1; i < n; i++) {
            int key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) < key) {
                array.set(j+1, array.get(j));
                j = j - 1;
            }
            array.set(j+1, key);
        }
        return array;
    }
  

    public static void main(String args[]) {
        
        Algorithms algorithm = new Algorithms();
        System.out.println("\nCristian Alejandro Chávez Becerra: alejandrochb2001@gmail.com\n");
        System.out.println("\nSéptimo Punto\n");
        algorithm.seventhPoint();
        
        System.out.println("\nOctavo Punto\n");
        algorithm.eighthPoint();
        
        System.out.println("\n\nNoveno Punto\n");
        ArrayList<Integer> arrayNinthPoint = new ArrayList<Integer>(100);
        arrayNinthPoint = algorithm.generateRandomArray();
        int n = arrayNinthPoint.size();
        System.out.println("\nInicio\n");
        for (int i = 0; i < n; i++){
            System.out.print(arrayNinthPoint.get(i) + " ");
        }
        System.out.println();
        ArrayList<Integer> toher = algorithm.insertionSort(arrayNinthPoint);
        System.out.println("\nFinal\n");
        for (int i = 0; i < n; i++){
            System.out.print(toher.get(i) + " ");
        }
        System.out.println();
    }
}