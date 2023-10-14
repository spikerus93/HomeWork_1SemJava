public class main {
    public static void main (String[] args){
        Calculator('/',20,5);
    }

//    Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
//
//Пример

//n = 4 -> 10
//n = 5 -> 15
    public static int countNTriangle(int n){
        int result = 0;
        if (n == 0){
            return -1;

        }
        else{
            result = (n * (n+1) / 2);
        System.out.println(result);
        }
        return result;
    }

//    Напишите функцию printPrimeNums, которая выведет на экран все простые числа
//    в промежутке от 1 до 1000, каждое на новой строке.
//    Напишите свой код в методе printPrimeNums класса Answer.
    public static void printPrimeNums(){
        int n = 1000;
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; ++j) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(i);
            }

        }
    }
//Реализуйте простой калькулятор.
//
//Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат.
// В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.
//
//При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
//
//Аргументы, передаваемые в метод/функцию:
//
//'3'
//'+'
//'7'
//На выходе:
//
//
//10
    public static int Calculator(char op, int a, int b){
        int result = 0;
        switch (op){
            case '+': result = a + b;
            break;
            case '-': result = a - b;
            break;
            case '*': result = a * b;
            break;
            case '/': result = a / b;
            break;
            default: System.out.println("Некорректный оператор: 'оператор'");

        }
        System.out.println(result);
        return result;

    }


}


