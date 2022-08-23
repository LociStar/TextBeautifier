package com.loci.textbeautifier.fonts;

//𝗔𝗕𝗖𝗗𝗘𝗙𝗚𝗛𝗜𝗝𝗞𝗟𝗠𝗡𝗢𝗣𝗤𝗥𝗦𝗧𝗨𝗩𝗪𝗫𝗬𝗭 𝗮𝗯𝗰𝗱𝗲𝗳𝗴𝗵𝗶𝗷𝗸𝗹𝗺𝗻𝗼𝗽𝗾𝗿𝘀𝘁𝘂𝘃𝘄𝘅𝘆𝘇
public enum MathSansBold implements EnumBase {
    A("𝗔"),
    B("𝗕"),
    C("𝗖"),
    D("𝗗"),
    E("𝗘"),
    F("𝗙"),
    G("𝗚"),
    H("𝗛"),
    I("𝗜"),
    J("𝗝"),
    K("𝗞"),
    L("𝗟"),
    M("𝗠"),
    N("𝗡"),
    O("𝗢"),
    P("𝗣"),
    Q("𝗤"),
    R("𝗥"),
    S("𝗦"),
    T("𝗧"),
    U("𝗨"),
    V("𝗩"),
    W("𝗪"),
    X("𝗫"),
    Y("𝗬"),
    Z("𝗭"),
    a("𝗮"),
    b("𝗯"),
    c("𝗰"),
    d("𝗱"),
    e("𝗲"),
    f("𝗳"),
    g("𝗴"),
    h("𝗵"),
    i("𝗶"),
    j("𝗷"),
    k("𝗸"),
    l("𝗹"),
    m("𝗺"),
    n("𝗻"),
    o("𝗼"),
    p("𝗽"),
    q("𝗾"),
    r("𝗿"),
    s("𝘀"),
    t("𝘁"),
    u("𝘂"),
    v("𝘃"),
    w("𝘄"),
    x("𝘅"),
    y("𝘆"),
    z("𝘇");

    private final String unicode;

    MathSansBold(String unicode) {
        this.unicode = unicode;
    }

    @Override
    public String convert(char c) {
        try {
            return MathSansBold.valueOf(String.valueOf(c)).unicode;
        } catch (IllegalArgumentException e) {
            return String.valueOf(c);
        }
    }

    @Override
    public String getName(){
        return "Math Sans Bold";
    }
}
