package pl.sda.javastart2.enums.files;

import java.util.Arrays;

public class FileOperations {
    private static  String filePath = "C:\\projects\\pan.txt";

    public static void main(String[] args) {
      //  rewriteFilesFormOneToAnotherNewWay();
        //readFileWithBufferedREader();
    //countWords();
        spliLine();
    }

    private static void spliLine() {
    String invocation = "Litwo! Ojczyzno moja! Ty jesteś jak zdrowie:";
    String[] splittedBySpaceBar = invocation.split(" ");
        System.out.println(Arrays.toString(splittedBySpaceBar));
        String[] splittedByS =invocation.split("\\s+");
        System.out.println(Arrays.toString(splittedByS));
        String[] splittedByNonWords =invocation.split("[^\\p{L}]+");
        System.out.println(Arrays.toString(splittedByNonWords));

    }

   /* private static void countWords() {
        File file= (Paths.get(filePath).toFile());
        try{
            List<String> lines= Files.readAllLines(file, Charset.forName("UNICODE"));;
            System.out.println();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
*/

    private static void readFileWithBufferedREader() {
      //  FileReader fileReader = new FileReader(filePath);
    }

    private static void rewriteFilesFormOneToAnotherNewWay() {

  //      FileInputStream fileInputStream = new FileInputStream(filePath);
    //    FileOutputStream fileOutputStream = new FileOutputStream(filePath.replace("pan.txt","pan-kopia.txt"));
        int b;

    }
}
