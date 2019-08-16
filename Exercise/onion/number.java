import java.lang.*;

class Cut{ 

   private String cut = "I have cut the onion! ";
   
   public String slice = "I have sliced the onion! ";
   
   
}

class Fry extends Cut{

    public String fry = "I have fried the onion! ";
}

class Dinner extends Fry{

    void cook(){
        System.out.println(cut + fry + "Together, we have cooked onion!");
    }

}

class number {

    public static void main(String[] args) {

        Dinner onion = new Dinner();

        onion.cook();

    }
}