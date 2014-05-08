package pkg1310653069_u3;

public class Boat extends Vehicle {

    private double draft, cargo;
    private short propeller;
    void unload() throws InterruptedException {
        Thread.sleep(5000);
        setCargo(0);
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public Boat(short wheels, color c, short ps, short doors, double draft, short propeller, double cargo) {
        super(wheels, c, ps, doors);
        this.draft = draft;
        this.cargo = cargo;
        this.propeller = propeller;
    }
    
    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat "+this.getPs()+" PS und einen Tiefgang von "+this.getDraft()+" m";
    }
    
}
