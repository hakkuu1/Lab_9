package Variant_7;
public class Aircraft {
    private String name;
    private int power;
    private String location;
    public String getName() {
        return name;
    }
    public void setName(String naim) {
        name = naim;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int engine_power) {
        power = engine_power;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String mesto) {
        location = mesto;
    }
    public Aircraft() {
        name = "-";
        power = 0;
        location = "-";
    }
    public Aircraft(String naim, int engine_power, String mesto_zavoda) {
        name = naim;
        power = engine_power;
        location = mesto_zavoda;
    }
}