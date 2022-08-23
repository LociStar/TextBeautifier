package com.loci.textbeautifier.fonts;

//𝒜𝐵𝒞𝒟𝐸𝐹𝒢𝐻𝐼𝒥𝒦𝐿𝑀𝒩𝒪𝒫𝒬𝑅𝒮𝒯𝒰𝒱𝒲𝒳𝒴𝒵 𝒶𝒷𝒸𝒹𝑒𝒻𝑔𝒽𝒾𝒿𝓀𝓁𝓂𝓃𝑜𝓅𝓆𝓇𝓈𝓉𝓊𝓋𝓌𝓍𝓎𝓏
public enum MathScriptBold implements EnumBase {
    A("𝒜"),
    B("𝐵"),
    C("𝒞"),
    D("𝒟"),
    E("𝐸"),
    F("𝐹"),
    G("𝒢"),
    H("𝐻"),
    I("𝐼"),
    J("𝒥"),
    K("𝒦"),
    L("𝐿"),
    M("𝑀"),
    N("𝒩"),
    O("𝒪"),
    P("𝒫"),
    Q("𝒬"),
    R("𝑅"),
    S("𝒮"),
    T("𝒯"),
    U("𝒰"),
    V("𝒱"),
    W("𝒲"),
    X("𝒳"),
    Y("𝒴"),
    Z("𝒵"),
    a("𝒶"),
    b("𝒷"),
    c("𝒸"),
    d("𝒹"),
    e("𝑒"),
    f("𝒻"),
    g("𝑔"),
    h("𝒽"),
    i("𝒾"),
    j("𝒿"),
    k("𝓀"),
    l("𝓁"),
    m("𝓂"),
    n("𝓃"),
    o("𝑜"),
    p("𝓅"),
    q("𝓆"),
    r("𝓇"),
    s("𝓈"),
    t("𝓉"),
    u("𝓊"),
    v("𝓋"),
    w("𝓌"),
    x("𝓍"),
    y("𝓎"),
    z("𝓏");

    private final String unicode;

    MathScriptBold(String unicode) {
        this.unicode = unicode;
    }

    public String convert(char c) {
        try {
            return MathScriptBold.valueOf(String.valueOf(c)).unicode;
        } catch (IllegalArgumentException e) {
            return String.valueOf(c);
        }
    }

    @Override
    public String getName(){
        return "Math Script Bold";
    }
}
