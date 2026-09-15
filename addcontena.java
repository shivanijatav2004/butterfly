import java.util.*;

public class addcontena {

    public static void main(String[] args) {
        //concatenation
        String name1 = "Shivani";
        String name2 = "Shivani";

        //1 sl > s2 : +ve value
        //2 sl == s2 : 0
        //3 sl < s2 : -ve value

        //hello callo string me campare me hello string bada h agar aahello aacall hota to ham compare karte next letter se

        if(name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
       } else {
        System.out.println("String are not equal");
       }

        if(name1 == name2) {
            System.out.println("String are equal");
       } else {
        System.out.println("String are not equal");
      }
    }
    
}
