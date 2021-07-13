package com.company.phase2;

public enum BioEnum {
    Vinay("Good", "20"),
    Meet("Nice", "21"),
    Manu("Artist", "21"),
    Maan("Fine", "19"),
    Poojan("Gamer", "20");

    private final String desc;
    private final String age;

    BioEnum(String desc, String age) {
        this.desc = desc;
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public String getAge() {
        return age;
    }
}
