package dev;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.*;

public class IMTCalc {
    static double w, h, IMT;
    static String oldStrh, newStrh, oldStrw, newStrw;

    public static void main (String[] args){

        Scanner inw = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Введите свой вес в кг: ");
        oldStrw = inw.nextLine();
        newStrw = oldStrw.replace(',', '.');
        w = Double.parseDouble(newStrw);

        //w = inw.nextDouble();

        Scanner inh = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Введите свой рост в метрах: ");
        oldStrh = inh.nextLine();
        newStrh = oldStrh.replace(',', '.');
        h = Double.parseDouble(newStrh);

        //h = inh.nextDouble();

        calcIMT();
    }
    public static void calcIMT(){
        IMT = w / (h*h);
        if (w <= 0 || h <= 0)
            throw new IllegalArgumentException("Значение веса и/или роста не может быть <= 0.");
        if (h > 3)
            throw new IllegalArgumentException("Некорректно введен рост. Введите свой рост в метрах.");
        if (w > 600)
            throw new IllegalArgumentException("Некорректный вес.");
        if (IMT <= 16){
            System.out.println("Выраженный дефицит массы тела.\nТвой индекс массы тела= " + IMT);
        } else if (IMT > 16 && IMT <= 18.5){
            System.out.println("Недостаточная (дефицит) масса тела.\nТвой индекс массы тела = " + IMT);
        } else if (IMT > 18.5 && IMT < 25){
            System.out.print("Нормальный вес.\nТвой индекс массы тела = " + IMT);
        } else if (IMT >= 25 && IMT < 30){
            System.out.println("Избыточная масса тела (предожирение).\nТвой индекс массы тела = "+ IMT);
        } else {
            System.out.println("Ты - ЖИРНЫЙ.\nТвой индекс массы тела = " + IMT);
        }
    }
}
