package algorithm;

import java.util.*;

public class EnumAndAnnotation {
    /*
    * An enum type is a special data type that enables for a variable to be a set of predefined constants. The variable
    * must be equal to one of the values that have been predefined for it. Common examples include compass directions
    * (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.
    * Enums and annotations became available since Java 5
    * */

    public enum DaysInAWeek{
        MONDAY,
        TUESDAY,
        WENDESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public @interface AnnotationDemo{
        //with attributes
        String name();
    }

    public static boolean isWeekday(DaysInAWeek day){
        return day != DaysInAWeek.SATURDAY && day != DaysInAWeek.SUNDAY;
    }


    public static void main(String[] args){
        System.out.println(isWeekday(DaysInAWeek.MONDAY));

        Set<DaysInAWeek> daySet = EnumSet.allOf(DaysInAWeek.class);

        for(DaysInAWeek day : daySet){
            System.out.println("name: " + day.name() + " ordinal: " + day.ordinal());
        }

        Map<DaysInAWeek, String> dayMap = new EnumMap<DaysInAWeek, String>(DaysInAWeek.class);
        dayMap.put(DaysInAWeek.MONDAY, "this is monday!");

        //@AnnotationDemo(name = "name as a string");

    }


}
