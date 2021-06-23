package com.company.rough;

import javafx.util.Pair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rough17 {

	public static List<Pair<String, String>> giveAllMatchesOfGroup(String regexPattern, String text,
																   Integer groupNumber1, Integer groupNumber2) {
		List<Pair<String, String>> ans = new ArrayList<>();

		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			ans.add(new Pair<> (matcher.group(groupNumber1), matcher.group(groupNumber2)));
		}

		return ans;
	}

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

		// Parsing the html to create a pair of (Name, Image Src) as follows -
		String regexPattern = "<img alt=\"(.*?)\"(.*?)src=\"(.*?)\"(.*?)>";
		List<Pair<String, String>> celebsInfo = giveAllMatchesOfGroup(regexPattern, result, 1, 3);
		for (Pair<String, String> element: celebsInfo) {
			System.out.println("Name = " + element.getKey() + ", ImageSrc = " + element.getValue());
		}

        /*
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
        */
	}

}