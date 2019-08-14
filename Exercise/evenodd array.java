

public class Exercise {
    public static void main(String[] args){
     int intarray[] = {5,7,2,4,9};
   
     int even = 0 , odd = 0;
   
       for(int i = 0; i < intarray.length; i++){
   
         if (intarray[i] % 2 == 0 )
         even++;
   
         else
         odd++;
       }
   
       System.out.println(even);
       System.out.println(odd);
       }
     }