package com.company.utility;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class utilityFunctionsSet2 {

    public static void main(String[] args) {
        // Getting html content of a website using JSoup as follows -
        String url = "https://www.imdb.com/list/ls052283250/";
        String result = "";
        try {
            Document document = Jsoup.connect(url).get();
            Element element = document.select("div.lister-list").first();
            result = element.html();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing the received content to a file on Desktop
        try {
            File resultInFile = new File("/Users/development/Desktop/WebsiteContent.txt");
            FileWriter writer = new FileWriter(resultInFile);
            writer.write(result);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
