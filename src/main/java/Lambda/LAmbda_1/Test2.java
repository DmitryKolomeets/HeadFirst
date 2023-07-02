package Lambda.LAmbda_1;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;


@FunctionalInterface
interface GenericInterface<T>  {
    // абстрактный метод
    T func(T t);
}



public class Test2 {

    public static void main(String[] args) {


        // Объявление ссылки на параметризированный интерфейс
        // который принимает String
        // и присвоение ей лямбды
        GenericInterface<String> reverse = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        // Объявление ссылки на параметризированный интерфейс
        // который принимает Integer
        // и присвоение ей лямбды
        GenericInterface<Integer> factorial = (n) -> {

            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("factorial of 5 = " + factorial.func(5));

    }

}
