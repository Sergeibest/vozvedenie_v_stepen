/*package ru.non_stop;// не удачная попытка калькулятора
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int a;
        String b;
        int c;
        System.out.println("Введите число ");
        a = enter.nextInt();
        System.out.println("действие");
        b = enter.next(+,-);
        System.out.println("Введите число");
        c = enter.nextInt();
        System.out.println(b);
    }
}*/

//прога дlя возведения в степерь
package ru.non_stop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    double a,b;
        System.out.println("Введите число для возведения в степнь");
        a = enter.nextDouble();
        System.out.println("Введите степень возведения");
        b =enter.nextDouble();
        System.out.println(Math.pow(a,b));
    }
}

/*System.out.println(Math.abs(-51));// модуль числа вызвращает положительное число
        System.out.println(Math.ceil(2.1)); // (потолок числа)  округлят большую сторону
        System.out.println(Math.floor (2.7)); // противоположность потолка числа )
        System.out.println(Math.max (2.7, 4.2 )); // выводит наиболе\шее  из этих двух чисел)
        System.out.println(Math.min (2.7, 4.2 )); // выводит наименьшее  из этих двух чисел)
        System.out.println(Math.pow (2.7, 4.2 )); // первое число возведения, 2- степнь )
        System.out.println(Math.sqrt (2.7); // квадратный корень*/