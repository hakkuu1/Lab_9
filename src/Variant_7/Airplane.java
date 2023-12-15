package Variant_7;

import java.util.Scanner;

public class Airplane extends Aircraft{
    private int ekipaj;
    public Airplane(){
        super();
        ekipaj = 0;
    }
    public Airplane(String nazv, int engine_power, String mesto, int kol_ekipaja){
        super(nazv, engine_power, mesto);
        ekipaj = kol_ekipaja;
    }

    public int getEkipaj() {
        return ekipaj;
    }

    public void setEkipaj(int kol_ekipaja) {
        ekipaj = kol_ekipaja;
    }
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название самолета: ");
        String nazv = sc.next();
        setName(nazv);
        System.out.println("Введите мощность двигателя: ");
        int kol = sc.nextInt();
        setPower(kol);
        System.out.println("Введите город завода: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("Введите количество экипажа: ");
        int ekipaj  = sc.nextInt();
        setEkipaj(ekipaj);
    }
    public String toString(){
        return ("\n\t"+"Название самолета: "+getName() +"\n\t"+"Мощность двигателя: "
                +getPower()+"\n\t"+"Город производства: " +getLocation()+"\n\t"
                + "Экипаж: " + ekipaj);
    }
}