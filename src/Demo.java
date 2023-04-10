import java.util.regex.Pattern;

public class Demo {
    static String name="";
    static {name="Yoll Academy";}
    public static void main(String args []){
        System.out.println("Name of school :"+ name);
        System.out.println(Pattern.compile("[aeiou]").matcher("tapp").find());
    }

            }