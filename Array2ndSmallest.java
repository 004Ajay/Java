import java.util.Arrays;
public class Array2ndSmallest {
public static void main(String[] args) {
int[] array = {1, 4, 7, 3, 6, 10};
Arrays.sort(array);  
System.out.println("2nd smallest array element is " +array[1]);
    }
}

/*
public class arrays{
    public static void main(String args[]){  
int temp, array[]={1, 2, 3, 6, 3, 9};  
for (int i = 0; i < 5; i++){  
                if (array[i] > array[i + 1]){  
                    
                    temp = array[i];  
                    array[i] = array[i + 1];  
                    array[i + 1] = temp;  
                    
                }  
            }  
System.out.println("Second smallest element: "+array[1]);  
   }
 }  
 */