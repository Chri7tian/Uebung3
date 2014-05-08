package pkg1310653069_u3;

public class Vehicle extends BenennbarAbs {

    private short wheels, doors, speed, ps;
    private boolean started;
    private color c;
    protected String name;
    
    public enum color {BLACK, SILVER, RED, GREY, YELLOW, BLUE};
    
    void start() {
        started = true;
    }
    void stop() {
        started = false;
    }
    void acceleate(short speed) {
        if(started) {
            this.speed += speed;
        }
        if(speed > 250) {
            setSpeed((short)250);
        }    
    }
    void slowdown(short speed) {
        if(started) {
            this.speed -= speed;
        }
        if(speed < 0) {
            setSpeed((short)0);
        }    
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public color getC() {
        return c;
    }

    public void setC(color c) {
        this.c = c;
    }

    public Vehicle(short wheels, color c, short ps, short doors) {
        this.wheels = wheels;
        this.doors = doors;
        this.speed = 0;
        this.ps = ps;
        this.started = false;
        this.c = c;
    }
    
    /*
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String n) {
        name = n;
    }
    */
    
}
