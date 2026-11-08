package Collections.Set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum Size {
    SMALL, MEDUIM, LARGE, EXTARLARGE;

    public static Set<Size> getAll(){
        // Set<Size> sizes = new HashSet<>();
        // sizes.add(Size.SMALL);
        // sizes.add(Size.MEDUIM);
        // sizes.add(Size.LARGE);
        // sizes.add(Size.EXTARLARGE);

        return EnumSet.allOf(Size.class);
    }
} 
