 
abstract class Car{

    abstract void start();
} 

class ChevyEngine{

    private String status = "Engine is running";

    String run(){

        return status;
    }

}
class Chevy extends Car{

    //i dunno what engines they have

    void start(){
    ChevyEngine V8 = new ChevyEngine();
        System.out.println(V8.run());
    }
}

class Comp{

 public static void main(String[] args) {

    Chevy car = new Chevy();

    car.start();
     
 }
}