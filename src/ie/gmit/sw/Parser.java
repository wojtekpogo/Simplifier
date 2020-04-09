package ie.gmit.sw;
import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.Instant;
import java.util.*;

public class Parser {
	
	Instant start = Instant.now();
	
	Path currentPath = Paths.get(System.getProperty("user.dir"));
	
	Map<String, String> map;
	
	Path googleWordsPath = Paths.get(currentPath.toString(), "google-1000.txt");
	Path thesaurusPath = Paths.get(currentPath.toString(), "MobyThesaurus2.txt");
	
		
	//System.out.println("full map size:"+map.size());
	
	public static Map<String, String> parse(Path filePath) {
		
			BufferedReader reader;
			
			Map<String, String> googleMap = new HashMap<String, String>();
			
			try {	
				reader = new BufferedReader(new FileReader(filePath.toString()));
				String line = reader.readLine();
				
				while (line != null) {
					googleMap.put(line, line);	//matching words to itself
					line = reader.readLine();
				}
				reader.close();
				return googleMap;
			} catch (IOException e) {
				
				e.printStackTrace();
				return null;
			}
		} // parse Google

public static Map<String, String> parseThesaurus(Map<String, String> map, Path filePath){
	BufferedReader reader;
	try {	
		reader = new BufferedReader(new FileReader(filePath.toString()));
		String line = reader.readLine();
		
		Map<String, String> full_map = new HashMap<String, String>();
		
		while (line != null) {
			String[] current_line = line.split(",");
			String bingo = "";
			for(String word: current_line) {
				if(map.containsKey(word)) {
					bingo = map.get(word);
				}
			}
			for(String s: current_line) {
				if(bingo.equals("")) {
					bingo = s;
				}
				full_map.put(s, bingo);
			}
			
			line = reader.readLine();
		}
		
		reader.close();
		
		full_map.putAll(map);
		return full_map;
		
	} catch (IOException e) {
		e.printStackTrace();
		return null;
	}
} //parse Thesaurus



} //class
