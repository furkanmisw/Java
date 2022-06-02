import java.util.ArrayList;

public class MathClass {
    public static void main(String[] args) {

        ArrayList chars = new ArrayList();

        //0-1 between generator number
        Math.random();

        //Char -> String
        String f = String.valueOf('F');
        String s = String.valueOf('S');

        // f = f+s
        System.out.println(f.concat(s));
        ;

        String keyword = new String(f + s);
        //keyword = f+s;
        System.out.println(keyword);
    }

}
