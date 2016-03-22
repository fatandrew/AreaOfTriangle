package com.company;

/**
 * Created by User on 11.03.2016.
 */
public class AreaOfTriangle {
    public AreaOfTriangle() {
    }

    public static void main(String[] args) {
        byte b = 2;
        byte h = 1;
        byte r = 1;
        boolean Radius = true;
        boolean base = true;
        boolean height = true;
        boolean AreaOfTriangle = true; //можно удалить, нигде не используется
        boolean AreaOfRectangle = true; //можно удалить, нигде не используется
        boolean AreaOfCircle = true;  //можно удалить, нигде не используется
        int c = b * h / 2;  //поменять цыфру на константу
        int v = b * h;
        double a = 2.0D;
        //
        double d = Math.pow((double)r, a);
        double k = 3.14D * d;   // использую не понятную цыфру 3.14, нужно поменять на PI
        System.out.println(c);
        System.out.println(v);
        System.out.println(k);
    }
}
