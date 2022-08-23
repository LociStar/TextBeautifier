import fonts.*;

public class Font {
    public static String toGothicStyle(String text) {
        return Converter.convertToFont(text, GothicStyle.A);
    }

    public static String toBlackSquareStyle(String text) {
        return Converter.convertToFont(text, BlackSquare.A);
    }

    public static String toMathScriptBoldStyle(String text) {
        return Converter.convertToFont(text, MathScriptBold.A);
    }

    public static String toMathSansBoldStyle(String text) {
        return Converter.convertToFont(text, MathSansBold.A);
    }

    public static String toEmojiStyle(String text) {
        return Converter.convertToFont(text, Emoji.A);
    }

    public static String toBubbleStyle(String text) {
        return Converter.convertToFont(text, Bubble.A);
    }

    public static String toWordWithDecoration(String text) {
        return Converter.addSuffixAndPrefixToWord(text, "【", "】");
    }

    public static String toLetterWithDecoration(String text) {
        return Converter.addSuffixAndPrefixToLetter(text, "⊢", "⊣");
    }

    public static String toLetterWithDecoration2(String text) {
        return Converter.addSuffixAndPrefixToLetter(text, "⊰", "⊱", "~~");
    }

    public static String toLetterWithDecoration3(String text) {
        return Converter.addSuffixAndPrefixToLetter(text, "[̲̅", "]");
    }

    public static String toTextWithDecoration4(String text) {
        return Converter.addSuffixAndPrefixToText(text, "(っ◔◡◔)っ ♥ ", " ♥");
    }

    public static String createCustomLetterDecoration(String text, String prefix, String suffix) {
        return Converter.addSuffixAndPrefixToLetter(text, prefix, suffix);
    }

    public static String createCustomLetterDecoration(String text, String prefix, String suffix, String placeholder) {
        return Converter.addSuffixAndPrefixToLetter(text, prefix, suffix, placeholder);
    }

    public static String createCustomWordDecoration(String text, String prefix, String suffix) {
        return Converter.addSuffixAndPrefixToWord(text, prefix, suffix);
    }

    public static String createCustomTextDecoration(String text, String prefix, String suffix) {
        return Converter.addSuffixAndPrefixToText(text, prefix, suffix);
    }

    public static String toCustomStyle(String text, EnumBase enumBase) {
        return Converter.convertToFont(text, enumBase);
    }

}
