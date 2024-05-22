// Ошибка при вызове переменной devide. В ней отсутствует проверка деления на 0.
// Решение:
// 1. Проверка. Если делитель равен нулю - генерировать исключение IllegalArgumentException
// 2. Обрабатывать Exception при проведении операции деления

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}

