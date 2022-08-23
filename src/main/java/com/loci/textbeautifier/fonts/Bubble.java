package com.loci.textbeautifier.fonts;

//ⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓂⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏ   ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ
public enum Bubble implements EnumBase {
    A("Ⓐ"),
    B("Ⓑ"),
    C("Ⓒ"),
    D("Ⓓ"),
    E("Ⓔ"),
    F("Ⓕ"),
    G("Ⓖ"),
    H("Ⓗ"),
    I("Ⓘ"),
    J("Ⓙ"),
    K("Ⓚ"),
    L("Ⓛ"),
    M("Ⓜ"),
    N("Ⓝ"),
    O("Ⓞ"),
    P("Ⓟ"),
    Q("Ⓠ"),
    R("Ⓡ"),
    S("Ⓢ"),
    T("Ⓣ"),
    U("Ⓤ"),
    V("Ⓥ"),
    W("Ⓦ"),
    X("Ⓧ"),
    Y("Ⓨ"),
    Z("Ⓩ"),
    a("ⓐ"),
    b("ⓑ"),
    c("ⓒ"),
    d("ⓓ"),
    e("ⓔ"),
    f("ⓕ"),
    g("ⓖ"),
    h("ⓗ"),
    i("ⓘ"),
    j("ⓙ"),
    k("ⓚ"),
    l("ⓛ"),
    m("ⓜ"),
    n("ⓝ"),
    o("ⓞ"),
    p("ⓟ"),
    q("ⓠ"),
    r("ⓡ"),
    s("ⓢ"),
    t("ⓣ"),
    u("ⓤ"),
    v("ⓥ"),
    w("ⓦ"),
    x("ⓧ"),
    y("ⓨ"),
    z("ⓩ");

    private final String unicode;

    Bubble(String unicode) {
        this.unicode = unicode;
    }

    @Override
    public String convert(char c) {
        try {
            return Bubble.valueOf(String.valueOf(c)).unicode;
        } catch (IllegalArgumentException e) {
            return String.valueOf(c);
        }
    }
}
