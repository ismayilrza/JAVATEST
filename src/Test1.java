import java.sql.SQLOutput;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println(testtest("ddvsndsvd","dadada","fafag"));
//        System.out.println("ddff");


        String str = "The quick  fox jumps over the lazy dog.";
        if (str.matches(".*(w|u).*")) {
            System.out.println("The string contains the words 'brown' and 'lazy'");

        }


    }





    public static String testtest(String... data){
       return Arrays.toString(data);
    }

}
