// Bubble Sort
package codingbat;
import java.util.Random;

public class BubbleSort {
    static int set[] = new int[10]; 

    public static void generateRandom(){
        Random r = new Random();
        System.out.println("Unsorted array:");
        for(int i = 0; i < set.length; i++){
            int ran = r.nextInt(100);
            set[i] = ran;
            System.out.print(set[i] + "  ");
        }
    }
    
    public static void sortArray(){
        for(int i = 0; i < set.length; i++){
            for(int j = 0; j < set.length-1; j++){
                if(set[j] > set[j+1]){
                    int temp = set[j];
                    set[j] = set[j+1];
                    set[j+1] = temp;
                }
            }
        }
        System.out.println("\n\nSorted Array:");
        for(int a = 0; a < set.length; a++){
            System.out.print(set[a]+"  ");
        }
    }

    public static void main(String[] args) {
        generateRandom();
        sortArray();    
    }
}
