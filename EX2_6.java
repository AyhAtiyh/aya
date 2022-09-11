/**
 * Created by hanan on 9/6/2022.
 */
public class EX2_6 {
    public static void main(String[] args) {
        String s ="Hello";
        String t= "World";
        //a. s.length() + t.length()اعمل جمع لطول s,t
      System.out.println(s.length()+t.length());
      //  b. s.substring(1, 2)خذ جزء من النص hello
        System.out.println(s.substring(1,2));
        //خذ كامت helloوجعل النص حقها من الطو  قسمت 2 والطول مره اخر5
        System.out.println(s.substring(s.length() / 2 ,s.length()));
        //d. s + t
        System.out.println(s+t);
       // e. t + s
        System.out.println(t+s);

    }
}
