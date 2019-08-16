 
public class StringReverse { 
    public static void main(String[] args) {

        String str = "how much wood could a woodchuck chuck";
        StringBuilder reverseString = new StringBuilder();
         
        String[] words = str.split(" ");  
         
        for (String word : words){
            String reverseWord = new StringBuilder(word).reverse().toString();      
            reverseString.append(reverseWord + " ");                                
        }

        System.out.println( "Original String: \n" + str);   
         
        System.out.println("\nReversed string: \n" + reverseString.toString().trim() );      
    }
 }