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
        System.out.println("������� �������� ��������: ");
        String nazv = sc.next();
        setName(nazv);
        System.out.println("������� �������� ���������: ");
        int kol = sc.nextInt();
        setPower(kol);
        System.out.println("������� ����� ������: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("������� ���������� �������: ");
        int ekipaj  = sc.nextInt();
        setEkipaj(ekipaj);
    }
    public String toString(){
        return ("\n\t"+"�������� ��������: "+getName() +"\n\t"+"�������� ���������: "
                +getPower()+"\n\t"+"����� ������������: " +getLocation()+"\n\t"
                + "������: " + ekipaj);
    }
}