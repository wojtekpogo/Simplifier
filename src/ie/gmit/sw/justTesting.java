package ie.gmit.sw;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Map;

public class justTesting {

	public static void main(String[] args) {
		
		
		Parser p = new Parser();
		
		long endTime = System.currentTimeMillis();
		//long timeElapsed = endTime - startTime;
	//	System.out.println("Execution time in milliseconds : " + 
	//			timeElapsed );
		
		//Instant start = Instant.now();
		
		Path currentPath = Paths.get(System.getProperty("user.dir"));
		
		Map<String, String> map;
		
		Path googleWordsPath = Paths.get(currentPath.toString(), "google-1000.txt");
		
		Path thesaurusPath = Paths.get(currentPath.toString(), "MobyThesaurus2.txt");
		
		map = Parser.parse(googleWordsPath);
		
		System.out.println("Google 1000 words map size --> " + map.size());
		
		Map<String, String> map2 =Parser.parseThesaurus(map, thesaurusPath);
		
		System.out.println("Complete map size --> " + map2.size());
		
		//Instant finish = Instant.now();
		
		//long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		//System.out.printf("Took %sms to execute", timeElapsed);
		//System.out.println(map2);
		// Odpal sobie zeby zobaczyc wszystkie items z mapy ktore nie sa z 1000words
	//for(String key: map2.keySet()) {
//			if(key.equals(map2.get(key))) {
//				System.out.println(key + " --> " + map2.get(key));
//			}
//		}
		
	for(Map.Entry<String,String> entry : map2.entrySet()) {
	System.out.println(entry.getKey() + ": " + entry.getValue()); 
	}
	
	System.out.print(ConsoleColour.GREEN+" text jfdjf");
	

	}

}
