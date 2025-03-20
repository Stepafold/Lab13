package org.example;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Stepa" );
        System.out.println();
        Tester tester1 = new Tester("Иван", "Сидоров", 4, "Beginner", 1500.23);
        tester1.displayInfo(true);
        Tester.showTesterGreeting();
        System.out.println();
        Tester tester2 = new Tester("Вася", "Петров", 4);
        tester2.displayInfo(false, true);
        System.out.println();
        Tester tester3 = new Tester("Никита", "Белов");
        tester3.displayInfo();
    }
}
