package pl.sda.javastart2.enums.generics1.exceptions;

public class ExeptionsExample {

    public static void main(String[] args) {
        divide(2,4);
        divideManyTime(2,3,1,5);
    }
private static double divide (int x,int y) {
    try {
        System.out.println("Inside try");
        return x / y;
    } finally{
        System.out.println("Inside Finally block");
        return -1;//nie uemiszczaj return w finally  !!
    }
}

private static double divideManyTime(int x, int... divides){
        double result =x;
    for (int divider : divides) {
        result=(x/divider);

    }
    return x;
    }
}


