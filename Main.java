import generics.Box1P;

/**
 * @author Tegneryadnov_VI
 * @version 11
 * @ Java Первый дженерик-класс
 */

public class Main {
    public static void main(String[] args) {
        // параметризируем класс типом String
        Box1P<String> sample1 = new Box1P<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        // В примере тип дженерика String не соответствует типу значения,
        // передаваемому в качестве аргумента в конструктор.
        // Ожидался тип Integer
        //Box1P<String> sample2 = new Box1P<>(1);
        // Правильно:
        Box1P<Integer> sample2 = new Box1P<>(1);
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box1P<Boolean> sample3 = new Box1P<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
