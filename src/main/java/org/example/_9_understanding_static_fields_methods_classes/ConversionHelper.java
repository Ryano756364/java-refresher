package org.example._9_understanding_static_fields_methods_classes;

public class ConversionHelper {
    private static int metersInOneNm;

    static {
        metersInOneNm = 1852;
    }

    public static int fromFeetToFL(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nm) {
        return nm * metersInOneNm;
    }
}
