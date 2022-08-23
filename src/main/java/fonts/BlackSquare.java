package fonts;

import java.util.EnumSet;
import java.util.Locale;

//🅰🅱🅲🅳🅴🅵🅶🅷🅸🅹🅺🅻🅼🅽🅾🅿🆀🆁🆂🆃🆄🆅🆆🆇🆈🆉
public enum BlackSquare implements EnumBase{
    A("\uD83C\uDD70"),
    B("\uD83C\uDD71"),
    C("\uD83C\uDD72"),
    D("\uD83C\uDD73"),
    E("\uD83C\uDD74"),
    F("\uD83C\uDD75"),
    G("\uD83C\uDD76"),
    H("\uD83C\uDD77"),
    I("\uD83C\uDD78"),
    J("\uD83C\uDD79"),
    K("\uD83C\uDD7A"),
    L("\uD83C\uDD7B"),
    M("\uD83C\uDD7C"),
    N("\uD83C\uDD7D"),
    O("\uD83C\uDD7E"),
    P("\uD83C\uDD7F"),
    Q("\uD83C\uDD80"),
    R("\uD83C\uDD81"),
    S("\uD83C\uDD82"),
    T("\uD83C\uDD83"),
    U("\uD83C\uDD84"),
    V("\uD83C\uDD85"),
    W("\uD83C\uDD86"),
    X("\uD83C\uDD87"),
    Y("\uD83C\uDD88"),
    Z("\uD83C\uDD89");

    private final String unicode;

    BlackSquare(String unicode) {
        this.unicode = unicode;
    }

    public String convert(char c) {
        try {
            return BlackSquare.valueOf(String.valueOf(c).toUpperCase(Locale.ROOT)).unicode;
        } catch (IllegalArgumentException e) {
            return String.valueOf(c);
        }
    }
}
