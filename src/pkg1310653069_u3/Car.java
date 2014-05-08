package pkg1310653069_u3;

public class Car extends Vehicle {

    private boolean aircondition;
    private short airbag;
    void startAircondition() {
        if(aircondition) {
            System.err.println("Klimaanlage läuft bereits");
        }
        else {
            setAircondition(true);
        }
    }
    void stopAircondition() {
        if(aircondition) {
            setAircondition(false);
        }
        else {
            System.err.println("Klimaanlage bereits aus");
        }
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    public Car(short wheels, color c, short ps, short doors, short airbag) {
        super(wheels, c, ps, doors);
        this.aircondition = aircondition;
        this.airbag = airbag;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+this.getPs()+" PS und fährt mit "+this.getSpeed()+" km/h";
    }
}
