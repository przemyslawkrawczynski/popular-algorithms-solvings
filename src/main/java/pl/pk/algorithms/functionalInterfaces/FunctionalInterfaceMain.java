package pl.pk.algorithms.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FunctionalInterfaceMain {

 public static void main(String[] args) {

        MyFunInterfaceLikeConsumer my = System.out::println;
        MyFunInterfaceLikeFunction<Integer, String> likeFunction = FunctionalInterfaceMain::myFunction;

        List<Integer> list = generateList(25);

        list.forEach(my::eat);

        System.out.println("--------");
        list.forEach(a -> System.out.println(likeFunction.doSomethingWith(a)));
    }

    public static List<Integer> generateList(int number) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int nextInt = new Random().nextInt(15);
            result.add(nextInt);
        }

        return result;
    }

    //Methods which can by use as lambda function

    public static void printMessage(String a) {
        System.out.println(a);
    }

    private static String myFunction(Integer num) {
        return String.valueOf(num * 10);
    }

}
