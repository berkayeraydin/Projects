package org.training.java.advanced.intf;

public enum ELanguage {
    ENGLISH(1,
            "İngilizce",
            "İngilizce dili") {
        @Override
        public IHello getHelloImpl() {
            return new HelloEng();
        }
    },
    TURKISH(2,
            "Türkçe",
            "Türkçe dili") {
        @Override
        public IHello getHelloImpl() {
            return new HelloTr();
        }
    },
    SPANISH(3,
            "İspanyolca",
            "İspanyolca dili") {
        @Override
        public IHello getHelloImpl() {
            return new HelloEsp();
        }
    },
    JAPANESE(4,
             "Japonca",
             "Japonca dili") {
        @Override
        public IHello getHelloImpl() {
            return new HelloJp();
        }
    };

    private int index;
    private String shortDesc;
    private String desc;

    ELanguage(int index,
              String shortDesc,
              String desc) {
        this.index = index;
        this.shortDesc = shortDesc;
        this.desc = desc;
    }

    public static ELanguage getLanguage(int index) {
        ELanguage[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getIndex() == index) {
                return values[i];
            }
        }
        return ENGLISH;
//        switch (index) {
//            case 1:
//                return ENGLISH;
//            case 2:
//                return TURKISH;
//            case 3:
//                return SPANISH;
//            case 4:
//                return JAPANESE;
//            default:
//                return ENGLISH;
//        }
    }

    public StringBuilder getMenu() {
        StringBuilder stringBuilder = new StringBuilder(50);
        ELanguage[] values = values();
        for (int i = 0; i < values.length; i++) {
            ELanguage eLanguage = values[i];
            stringBuilder.append(eLanguage.getIndex())
                         .append("-")
                         .append(eLanguage.getShortDesc())
                         .append("\n");
        }
        return stringBuilder;
    }

    public int getIndex() {
        return index;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getDesc() {
        return desc;
    }

    public IHello getHelloImpl() {
        return new HelloEng();
    }
}
