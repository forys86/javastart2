package pl.sda.javastart2.enums.homeWork;

import org.junit.platform.commons.util.StringUtils;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collections1 {
    public static void main(String[] args) {
        String[] animals=new String[] {"dog","parrot","cat","pig","hamster", "","mouse","rat","cat"};
    changToSet(animals);
  //  changToSetWithStream(animals);
    }

  //  private static Set<String> changToSetWithStream(String[] animals) {
    //    Set<String> result = new LinkedHashSet<>();
      //  Arrays.stream(animals).filter(e -> StringUtils.isNotBlank(e)).map(e -> e.trim()).
        //        collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
    //}

    private static Set<String> changToSet(String[]animals) {
       Set<String> result= new LinkedHashSet<>();
        for (String animal : animals) {
            if (StringUtils.isBlank(animal)){
                continue;
            }
            result.add(animal.trim());
        }
        return result;
    }


}
