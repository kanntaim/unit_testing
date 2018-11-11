package ngaleev;

import java.lang.reflect.Field;

/**
 * Contains methods to get private fields of Pen class' instances.
 */
class PenFields{

    static int getPenContainerValue(Pen pen) throws IllegalAccessException, NoSuchFieldException{
            Field containerValue = Pen.class.getDeclaredField("inkContainerValue");
            containerValue.setAccessible(true);
            return (int)containerValue.get(pen);
    }
    static double getPenSizeLetter(Pen pen) throws IllegalAccessException, NoSuchFieldException{
            Field sizeLetter = Pen.class.getDeclaredField("sizeLetter");
            sizeLetter.setAccessible(true);
            return (double)sizeLetter.get(pen);
    }
    static String getPenColor(Pen pen) throws IllegalAccessException, NoSuchFieldException{
            Field color = Pen.class.getDeclaredField("color");
            color.setAccessible(true);
            return (String) color.get(pen);
        }
    }