package pl.sda.javastart2.enums.generics1.exceptions;

public class SimplePositiveNumbersBox<T extends Number> {
    private T[] numbers;


    public SimplePositiveNumbersBox(T[] numbers) {

        this.numbers = numbers;
    }
   // public SimplePositiveNumbersBox(Class<T> tClass, int size) {
//
  //      this.numbers=ObjectArrays.newArray(tClass,size);
 //   }
    public void  setValue(int index, T value){
        if (value.doubleValue()<0){
      //      throw new OutOfBoxException("Nie ma takiego indeksu");

        }
    }
}

