
import java.util.HashMap; 
  
class RMelements{ 

    static void rmDuplicate(int[] arr, int n) { 
  
        HashMap<Integer, Boolean> appear = new HashMap<>(); 
  
        for (int i = 0; i < n; ++i){ 
  
            // This will print the element if it is not in hash map 
            if (appear.get(arr[i]) == null) 
                System.out.print(arr[i] + " ");

            appear.put(arr[i], true); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args){ 
        int[] numbers = {2, 7, 3, 9, 4, 3, 8}; 
        int n = numbers.length; 
        rmDuplicate(numbers, n); 
    } 
} 