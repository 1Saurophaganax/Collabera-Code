
class Thing{
    
    int integer;
    String str;
    Thing(int x){
        this.integer = x;

        method(integer);
    }

    Thing(String s){
        this.str = s;

        method(str);
    }

    static void method(int x){
        System.out.println(x);

    }

   void method(String s){
        System.out.print(s); 
    }
}

class constructor{
    public static void main(String[] args) {
        int x = 5;
        String s = "cow = ";
        
    Thing Stuff = new Thing(s);

    Thing Thingy = new Thing(x);
    }

    
}