package Collections.Set;

import java.security.SignatureException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetDemo {
    public static void main(String[] args) {

        // Set<Size> size = new HashSet<>();
        // System.out.println(Size.getAll());

        //method get all the value from Enum using EnumSet
        // EnumSet<Size> sizes2 = EnumSet.allOf(Size.class);

        //method create an empty enum set
        // EnumSet<Size> sizes3 = EnumSet.noneOf(Size.class);
        // sizes3.add(Size.EXTARLARGE);
        // System.out.println(sizes3);//the output is EXTRALARGE

        //get the value using method range
        EnumSet<Size> sizes4 = EnumSet.range(Size.MEDUIM, Size.EXTARLARGE);
        System.out.println(sizes4);

        //get exact value 
        EnumSet<Size> sizes5 = EnumSet.of(Size.MEDUIM, Size.EXTARLARGE);
        System.out.println(sizes5);
    }
}
