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
        System.out.println("������� �������� ���������: ");
        String nazv = sc.next();
        setName(nazv);
        System.out.println("������� �������� ���������: ");
        int kol = sc.nextInt();
        setPower(kol);
        System.out.println("������� ����� ������: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("������� ���������� �������: ");
        int ekipaj = sc.nextInt();
        setTheme(ekipaj);
    }
    public String toString(){
        return ("\n\t"+"�������� ���������: "+getName() +"\n\t"+"�������� ���������: "+getPower()
                +"\n\t"+"����� ������������: "+getLocation()+"\n\t"
                + "������: " + ekipaj);
    }
}