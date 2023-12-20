package Variant_7;
import java.util.Scanner;

public class Main_air {
    public static void main(String[] args){
        Aircompany Yakutia = new Aircompany();
        Helicopter mi8 = new Helicopter("Ми-8",2*1620,"Улан-Удэ",2);
        System.out.println(mi8.toString());
        Airplane an2 = new Airplane("Aн-2",746,"Ташкент",3);
        System.out.println(an2.toString());
        Airplane boeing777 = new Airplane("Boeing 777", 128800,"USA",2);
        System.out.println(boeing777.toString());
        Yakutia.addAir(boeing777);
        Yakutia.addAir(mi8);
        Yakutia.addAir(an2);
        Yakutia.printCount();
    }
}
   /* Базовый класс – летательный аппарат. Производные – самолет и вертолет. Создать класс Авиакомпания, который
        может содержать оба вида объектов. Предусмотреть метод подсчета отдельно самолетов и вертолетов
        (использовать оператор instanceof)*/