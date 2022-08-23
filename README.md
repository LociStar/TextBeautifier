[![](https://jitpack.io/v/LociStar/TextBeautifier.svg)](https://jitpack.io/#LociStar/TextBeautifier)

# TextBeautifier
Convert your strings into a more beautiful version

## Usage
Use the Font class to change the font of your string and/or add a decor to your string.<br>
(Up to 6 font presets are available)

Example:
```java
Font.toEmojiStyle("Hello World");
Font.toLetterWithDecoration("Hello World");
```
output:<br>
```
"♓🎗👢👢⚽  🔱⚽🌱👢🌛"
"⊢H⊣⊢e⊣⊢l⊣⊢l⊣⊢o⊣ ⊢W⊣⊢o⊣⊢r⊣⊢l⊣⊢d⊣"
```
<br>
You can also use your own custom Fonts.<br>
For this case, create your own Enum and let it implement EnumBase. <br>
Then use the Font class to change the font of your string.

Example:
```java
public enum MyFont implements EnumBase {
    A("A"),
    B("B"),
    C("C"),
    ...;
    
    final String unicode;
    
    MyFont(String unicode){
        this.unicode = unicode;
    }
    
    @Override
    public String convert(char c) {
        try {
            return MyFont.valueOf(String.valueOf(c)).unicode;
        } catch (IllegalArgumentException e) {
            return String.valueOf(c);
        }
    }
}
```
```java
Font.toCustomFontStyle("Hello World", MyFont.A);
```

## Installation
Maven dependency (via jitpack):
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependency>
    <groupId>com.github.LociStar</groupId>
    <artifactId>TextBeautifier</artifactId>
    <version>v1.0.0</version>
</dependency>
```
