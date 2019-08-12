class Fish{
    public int co2 = 50, o2 = 60;

    private class Gill{
        public void breath(){
            o2 += 50;
            co2 -= 50;
            System.out.println("O2 level: " + o2);
            System.out.println("CO2 level: " + co2);
        }
    }

    public void takeABreath(){
        Gill newGill = new Gill();
        newGill.breath();
    }
}

public class Fishyclasses{
    public static void main(String args[]){
        Fish betta  = new Fish();
        betta.takeABreath();
    }
}