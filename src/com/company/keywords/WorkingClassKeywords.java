package com.company.keywords;

public class WorkingClassKeywords {
    public static void main(String[] args) {
        Club mem1 = new Club("Ironman");
        Club mem2 = new Club("Thor");
        Club mem3 = new Club("Wolverine");
        Club mem4 = new Club("Doctor Strange");
        Club mem5 = new Club("Spider Man");
        Club mem6 = new Club("Vision");

        System.out.println("The total members in the club = " + mem1.members_count());
    }
}
