package pkg1310653069_u3;

public class Main {

    public static void main(String[] args) {
        
        //für Aufgabe 4
        /*
        Liste l = new Liste(3);
        l.save(2.0);
        l.save(5.0);
        l.save(200.0);
        
        for(Object o : l.array) {
            System.out.println(o);
        }
        */
                
        //für Aufgabe 5
        Liste l = new Liste(3);
        Car bmw = new Car((short)4, Vehicle.color.SILVER, (short)220, (short)5, (short)4);
        l.save(bmw);
        
        Ship titanic = new Ship();
        l.save(titanic);
        
    }
    
}
