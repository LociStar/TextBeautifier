package fonts;

public enum Fonts {
    GOTHIC_STYLE("𝕬𝕭𝕮𝕯𝕰𝕱𝕲𝕳𝕴𝕵𝕶𝕷𝕸𝕹𝕺𝕻𝕼𝕽𝕾𝕿𝖀𝖁𝖂𝖃𝖄𝖅", "𝖆𝖇𝖈𝖉𝖊𝖋𝖌𝖍𝖎𝖏𝖐𝖑𝖒𝖓𝖔𝖕𝖖𝖗𝖘𝖙𝖚𝖛𝖜𝖝𝖞𝖟");
    private final String uppercase;
    private final String lowercase;

    Fonts(String uppercase, String lowercase) {
        this.uppercase = uppercase;
        this.lowercase = lowercase;
    }

    public String getUnicodeChar(int index, boolean isUppercase) {
        //convert String to unicode
        return isUppercase ? getUnicodeCharacterOfChar(uppercase.charAt(index)) : getUnicodeCharacterOfChar(lowercase.charAt(index));
    }

    public String getLowercase() {
        return lowercase;
    }

    private static String getUnicodeCharacterOfChar(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}
