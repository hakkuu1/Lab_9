package Variant_7;

import java.util.Scanner;

public class Helicopter extends Aircraft{
    private int ekipaj;
    public Helicopter(){
        super();
        ekipaj = 0;
    }
    public Helicopter(String nazv, int engine_power, String mesto, int kol_ekipaj){
        super(nazv, engine_power, mesto);
        ekipaj = kol_ekipaj;
    }

    public int getEkipaj() {
        return ekipaj;
    }

    public void setTheme(int kol_ekipaj) {
        ekipaj = kol_ekipaj;
    }
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название вертолета: ");
        String nazv = sc.next();
        setName(nazv);
        System.out.println("Введите мощность двигателя: ");
        int kol = sc.nextInt();
        setPower(kol);
        System.out.println("Введите город завода: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("Введите количество экипажа: ");
        int ekipaj = sc.nextInt();
        setTheme(ekipaj);
    }
    public String toString(){
        return ("\n\t"+"Название вертолета: "+getName() +"\n\t"+"Мощность двигателя: "+getPower()
                +"\n\t"+"Город производства: "+getLocation()+"\n\t"
                + "Экипаж: " + ekipaj);
    }
}