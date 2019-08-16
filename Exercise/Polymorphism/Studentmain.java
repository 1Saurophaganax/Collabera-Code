
class Student {

   protected String id;

   void generateID(String s){
       id = s;
   }
   public String getId() {
       return id;
   }
}

class Undergrad extends Student{

    void generateID(String s){
        id = "u" + s;
    }

}

class Grad extends Student{

    void generateID(String s){
        id = "g" + s;
    }

}



class Studentmain{
    public static void main(String[] args) {

    Grad Josuke = new Grad();
    Undergrad Jotaro = new Undergrad();
    Undergrad Jolyne = new Undergrad();

    Josuke.generateID("123");
    Jotaro.generateID("2384");
    Jolyne.generateID("353");

    System.out.println("Student Josukes ID is " + Josuke.getId());
    System.out.println("Student Jolyne's ID is " + Jolyne.getId());
    System.out.println("Student Jotaro's ID is " + Jotaro.getId());

    }
}