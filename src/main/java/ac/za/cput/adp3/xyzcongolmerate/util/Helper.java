package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);


        final StringBuilder builder = new StringBuilder();
        for (final char cName : className.toCharArray())
            if(Character.isUpperCase(cName))
                builder.append(cName);
            return builder.toString();

      /*  char cName = className.charAt(className.toUpperCase().length() - 1);
        String clsName = String.valueOf(cName);

        return clsName; */
    }


}
