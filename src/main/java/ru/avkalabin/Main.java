package ru.avkalabin;

public class Main {
    public static void main(String[] args) {

        byte aByte = 127;
        aByte++;
        System.out.println(aByte);

        short aShort = 10000;
        var aVar = (aShort * 10.0);
        System.out.println(aVar);

        float aFloat = (float)(aVar + 10.1);
        System.out.println(aFloat);

        int a = 10;
        double b = 7.1;

        var c = a + b;
        System.out.println("a + b = " + c);
        var d = a - b;
        System.out.println("a - b =  " + d);
        var e = a * b;
        System.out.println("a * b =   " +  e);
        int f = (int)(a / b);
        System.out.println("(int)(a / b)=  " + f);

        boolean aBoolean = ((true) && (4 / 2 < 3) ^ (4 / 2 < 3));
        System.out.println(aBoolean);

        int x=3;
        int y=2;
        int z = x<y? (x+y) : (x-y);
        System.out.println(z);

    }
}