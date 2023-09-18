package org.training.java.advanced.intf;

public class HelloFactory {

    public static final int LANGUAGE_ENGLISH = 1;
    public static final int LANGUAGE_TURKISH = 2;
    public static final int LANGUAGE_SPANISH = 3;
    public static final int LANGUAGE_JAPANESE = 4;

    public static IHello createHelloImpl(int index) {
        IHello hello = null;
        switch (index) {
            case LANGUAGE_ENGLISH:
                hello = new HelloEng();
                break;
            case LANGUAGE_TURKISH:
                hello = new HelloTr();
                break;
            case LANGUAGE_SPANISH:
                hello = new HelloEsp();
                break;
            case LANGUAGE_JAPANESE:
                hello = new HelloJp();
                break;

            default:
                hello = new HelloEng();
                break;
        }
        return hello;
    }


    public static String getMenu() {
        // String menuStr = "1-İngilizce\n" + "2-Türkçe\n" + "3-İspanyolca\n" + "Seçiminiz\n";
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append(LANGUAGE_ENGLISH + "-İngilizce\n");
        stringBuilder.append(LANGUAGE_TURKISH + "-Türkçe\n");
        stringBuilder.append(LANGUAGE_SPANISH + "-İspanyolca\n");
        stringBuilder.append("Seçiminiz\n");
//        String str = "str";
//        for (int i = 0; i < 100; i++) {
//            str += " " + i;
//        }

//        String menuStr = "1-İngilizce\n";
//        menuStr += "2-Türkçe\n";
//        menuStr += "3-İspanyolca\n";
//        menuStr += "Seçiminiz\n";
//        String concat = menuStr.concat("2-Türkçe\n").concat("3-İspanyolca\n");
        return stringBuilder.toString();
    }

}
