
class Person {

    protected String ssn;
 
    void generateSSN(String s){
        ssn = s;
    }
    public String getssn() {
        return ssn;
    }
 }
 
 class Japan extends Person{
 
     void generateSSN(String s){
         ssn = "Japan " + s;
     }
 
 }
 
 class US extends Person{
 
     void generateSSN(String s){
         ssn = "US " + s;
     }
 
 }
 
 class Poly{
     public static void main(String[] args) {
 
     US Josiah = new US();
     Japan Jotaro = new Japan();
     Japan Jolyne = new Japan();
 
     Josiah.generateSSN("123");
     Jotaro.generateSSN("2384");
     Jolyne.generateSSN("353");
 
     System.out.println("Person Josiah's ssn is " + Josiah.getssn());
     System.out.println("Person Jolyne's ssn is " + Jolyne.getssn());
     System.out.println("Person Jotaro's ssn is " + Jotaro.getssn());
 
     }
 }
