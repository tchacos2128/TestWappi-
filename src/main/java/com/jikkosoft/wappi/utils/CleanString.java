package com.jikkosoft.wappi.utils;

import java.text.Normalizer;

public class CleanString {

    public static String of(String string) {
        string = Normalizer.normalize(string, Normalizer.Form.NFD);
        string = string.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return string;
    }
}
