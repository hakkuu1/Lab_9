package Variant_7;
import java.util.ArrayList;
public class Aircompany {
    private ArrayList<Aircraft> masAir = new ArrayList<Aircraft>();
    public void addAir(Aircraft m){
        masAir.add(m);
    }
    public Boolean findAir(Aircraft m){
        return masAir.contains(m);
    }
    public Aircompany(){
    }
    public Aircompany(ArrayList<Aircraft> n){
        masAir=n;
    }
    public void printCount(){
        int b = 0;
        int m = 0;
        for(Aircraft p:masAir){
            if(p instanceof Airplane){
                b+=1;
            } else if (p instanceof Helicopter) {
                m+=1;
            }
        }
        System.out.println("В авиакомпании: "+b+" самолетов и "+m+" вертолетов");
    }
}
