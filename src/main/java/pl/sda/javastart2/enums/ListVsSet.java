package pl.sda.javastart2.enums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args) {

        removeAllCompare();
    }
    private static void removeAllCompare(){
        Set<Book>booksSet = new HashSet<>();
        int howManyBooks= 500_000;
        for (int i =0; i<howManyBooks; i++){
            booksSet.add(new Book(i));
        }
        List<Book>bookList=new ArrayList<>();
        for (int i =0;i<howManyBooks+1;i++){
            bookList.add(new Book(i));

        }
        long start= System.currentTimeMillis();
        bookList.removeAll(booksSet);
        long finish=System.currentTimeMillis();
        System.out.println("bookList.removeAll(bookSet): "+(finish-start)+"ms");
    }
}
