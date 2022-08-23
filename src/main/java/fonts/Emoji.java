package fonts;

import java.util.Locale;

public enum Emoji implements EnumBase {
    A("\uD83C\uDD70"),
    B("\uD83C\uDD71"),
    C("\uD83C\uDF1C"),
    D("\uD83C\uDF1B"),
    E("\uD83C\uDF97"),
    F("\uD83C\uDF8F"),
    G("\uD83C\uDF00"),
    H("♓"),
    I("\uD83C\uDF90"),
    J("\uD83C\uDFB7"),
    K("\uD83C\uDF8B"),
    L("\uD83D\uDC62"),
    M("〽️"),
    N("\uD83C\uDFB5"),
    O("⚽"),
    P("\uD83C\uDD7F️"),
    Q("\uD83C\uDF73"),
    R("\uD83C\uDF31"),
    S("\uD83D\uDCB2"),
    T("\uD83C\uDF34"),
    U("⛎"),
    V("✅"),
    W("\uD83D\uDD31"),
    X("❎"),
    Y("\uD83C\uDF78"),
    Z("\uD83D\uDCA4");


    private final String unicode;

    Emoji(String unicode) {
        this.unicode = unicode;
    }

    public String convert(char c) {
        try {
            return Emoji.valueOf(String.valueOf(c).toUpperCase(Locale.ROOT)).unicode;
        } catch (IllegalArgumentException e) {
            return String.valueOf(c);
        }
    }
}
