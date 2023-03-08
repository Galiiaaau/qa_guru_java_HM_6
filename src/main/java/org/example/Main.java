package org.example;

public class Main {
    public static void main(String[] args) {
        //Математические операторы
        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2; // Сложение
        System.out.println(sum);
        int subtraction = num1 - num2; // Вычитание
        System.out.println(subtraction);
        int multiply = num1 * num2; // Умножение
        System.out.println(multiply);
        int division = num1 / num2; // Деление
        System.out.println(division);
        int remainder = num1 % num2; // Остаток от деления
        System.out.println(remainder);

        //Логические операторы
        if (num1 > num2 && num1 + num2 == 15) {     // &&
            System.out.println("They're both equal");
        } else System.out.println("Wrong");

        if (num1 > num2 || num1 + num2 == 10) {     // ||
            System.out.println("One of them is equal");
        } else System.out.println("Wrong");

        if (num1 + num2 != 10) {     // !
            System.out.println("Correct");
        } else System.out.println("Wrong");

        //Тернарный оператор
        String answer = (num1 > num2) ? "10 is greater than 5" : "10 is not greater than 5";
        System.out.println(answer);

        // Переполнение при вычислениях
        int integer = Integer.MAX_VALUE;
        int result = 1000 + integer;
        System.out.println("Результат переполнения: " + result);

        // Комбинация типов данных int и double
        int int1 = 15;
        double double1 = 3.14;
        System.out.println(int1 + double1);
        System.out.println(int1 - double1);
        System.out.println(int1 * double1);
        System.out.println(int1 / double1);
    }
}