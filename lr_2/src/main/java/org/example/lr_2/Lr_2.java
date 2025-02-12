package org.example.lr_2;

import java.util.Scanner;

public class Lr_2 {


     public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose exercise:");
            System.out.println("1. First exercise");
            System.out.println("2. Second exercise");
            System.out.println("3. Exit");
    
            choose = scanner.nextInt();
    
            switch (choose) {
                case 1 -> exercise_1();
                case 2 -> exercise_2();
                case 3 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }

    public static void exercise_1() {
        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI;
            
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
            
        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();
            
        double result = x + 2 * (Math.pow(y, 3) - 4 * x) - PI * (Math.pow(x, 3) + Math.pow(y, 2));
            
        System.out.printf("Результат: %.2f\n", result);

        scanner.close();
    }

    public static void exercise_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите внешний радиус кольца (R): ");
        double outerRadius = scanner.nextDouble();
            
        System.out.print("Введите внутренний радиус кольца (r): ");
        double innerRadius = scanner.nextDouble();
            
        System.out.print("Введите центральный угол сектора в градусах: ");
        double angleDegrees = scanner.nextDouble();
            
        double angleRadians = Math.toRadians(angleDegrees);
            
        double area = 0.5 * (Math.pow(outerRadius, 2) - Math.pow(innerRadius, 2)) * angleRadians;
            
        System.out.printf("Площадь сектора кольца: %.2f\n", area);

        scanner.close();
    }
}
