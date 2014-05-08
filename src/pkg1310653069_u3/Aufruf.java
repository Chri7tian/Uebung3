package pkg1310653069_u3;

import pkg1310653069_u3.Vehicle.color;

public class Aufruf {

    public static void main(String[] args) {
        
        Car bmw = new Car((short)4, color.SILVER, (short)220, (short)5, (short)4);
        System.out.println(bmw.toString());
        Car audi = new Car((short)4, color.BLACK, (short)180, (short)5, (short)8);
        System.out.println(audi.toString());
        Boat titanic = new Boat((short)0, color.BLUE, (short)51000, (short)0, 10.54, (short)3, 100000);
        System.out.println(titanic.toString());
        
        //Aufgabe 3
        BenennbarAbs namedCar = new Car((short)4, color.SILVER, (short)220, (short)5, (short)4);
        namedCar.setName("volkswagen");
        System.out.println(namedCar.getName());
        
    }
    
}
