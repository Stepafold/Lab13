package org.example;

public class Tester {
    String name;
    String surname;
    int experienceInYears;
    String englishLevel;
    double salary;
    public Tester(String name, String surname) {
        this(name, surname, 0, "Beginner", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 3000.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void displayInfo(boolean showSalary) {
        displayInfo();
        if (showSalary) {
            System.out.println("Зарплата: $" + salary);
        }
    }

    public void displayInfo(boolean showSalary, boolean showExperience) {
        displayInfo(showSalary);
        if (showExperience) {
            System.out.println("Опыт: " + experienceInYears + " лет");
        }
    }
    public static void showTesterGreeting() {
        System.out.println("Добро пожаловать!");
    }
}
