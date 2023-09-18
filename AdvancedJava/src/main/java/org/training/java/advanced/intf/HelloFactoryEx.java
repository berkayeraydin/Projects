package org.training.java.advanced.intf;

public class HelloFactoryEx {


    public static IHello createHelloImpl(int index) {
        return ELanguage.getLanguage(index).getHelloImpl();
    }


    public static String getMenu() {
        // String menuStr = "1-İngilizce\n" + "2-Türkçe\n" + "3-İspanyolca\n" + "Seçiminiz\n";
        StringBuilder stringBuilder = ELanguage.ENGLISH.getMenu();
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
