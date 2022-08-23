package com.loci.textbeautifier.fonts;

public interface EnumBase {
    String convert(char c);

    static String getName() {
        return "Font Name";
    }
}
