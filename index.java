import javax.swing.text.Style;

public class index{
    public static void main(String[] args){
        int num3 = 0; int num4 = 0;
        System.out.println("++num3" + (++num3) + "num4 : " + (num4++));
        System.out.println("a : " + num3 + " \nb : " + num4);     
        
        int x = 5;
        int x1 = x++ - ++x;
        System.out.println(x1);
        // System.out.println(++x);
        // System.out.println(x1);
    }
}