package com.company.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static List<String> giveAllMatchesOfGroup(String regexPattern, String text, Integer groupNumber) {
        List<String> ans = new ArrayList<>();

        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            ans.add(matcher.group(groupNumber));
        }

        return ans;
    }

    public static <T> void printList(List<T> list) {
        String ans = "";
        ans += "[" ;
        for(T el: list) {ans += el.toString() + ", " ;}
        ans = ans.substring(0,ans.length()-2);
        ans += "]" ;
        System.out.println(ans) ;
    }

    public static void main(String[] args) {
        // Simple example
        String river1 = "Mississippi";
        String river2 = "MississippiMississippiMississippi";
        String regexPattern1 = "Mi(.*?)pi";
        List<String> ans1 = giveAllMatchesOfGroup(regexPattern1, river1, 1);
        List<String> ans2 = giveAllMatchesOfGroup(regexPattern1, river2, 1);

        // Example of working with HTML of a site
        String text = "<img alt=\"Arnold Schwarzenegger\" height=\"209\" " +
                "src=\"https://m.media-amazon.com/images/M/MV5BMTI3MDc4NzUyMV5BMl5BanBnXkFtZTcwMTQyMTc5MQ@@._V1_UY209_CR13,0,140,209_AL_.jpg\"" +
                " width=\"140\">";
        String regexPattern2 = "<img alt=\"(.*?)\"(.*?)src=\"(.*?)\"(.*?)>";
        List<String> name = giveAllMatchesOfGroup(regexPattern2, text, 1);
        List<String> url = giveAllMatchesOfGroup(regexPattern2, text, 3);
        printList(name);
        printList(url);
    }
}
