package pl.sda.javastart2.enums.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
    public static void main(String[] args) {
        //napisz generyczna metode ktora przyjmuje liste elementow
        // bedacych numerami i zwraca ich sume
        List<String> listString = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        listString.add("AC");
        listInteger.add(2);

        sumGenericsNumber(listInteger);
    //    sumGenericsNumber(listString);
        sumGenericsNumberWIthStream(listInteger);
    }

  private static <T extends Number> void sumGenericsNumberWIthStream(List<T>list) {
        list.stream().mapToDouble(e -> e.doubleValue()).sum();
    }

    private static <T extends Number> Long sumGenericsNumber(List<T> list) {
        Long result=0L;
        for (T t : list) {
            result+=t.longValue();
        }
        return result;
    }
}
