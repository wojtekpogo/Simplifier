package ie.gmit.sw;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class Runner {

	public static void main(String[] args) throws Exception {
		//
		//HashMap<String, String> map = new HashMap<String, String>();
		Scanner myObj = new Scanner(System.in);
		Converter c = new Converter();
		//addKeyListener(this);
		
		//HashMap<String, List<String>> large_map = new HashMap<String, List<String>>();
		System.out.println(ConsoleColour.BLUE_BRIGHT);
		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept. Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*             Text Simplifier V0.1                *");
		System.out.println("*       (AKA Orwellian Language Compliance)       *");		
		System.out.println("*                                                 *");
		System.out.println("***************************************************");
		
		System.out.print("Enter Text>");
		String fullSentence;
		fullSentence = myObj.nextLine();	
		
		System.out.println(c.swapSentence(fullSentence));
		
		System.out.println(ConsoleColour.RESET);	//reset the color
		
		
		myObj.close();
		
		
		
//		System.out.print(ConsoleColour.BLACK_BOLD_BRIGHT);
//		
//
//-----------------------------------------------------------------------------------------------------------------
//
		
		long startTime = System.currentTimeMillis();
		//Parser p = new Parser();
	
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in milliseconds : " + 
				timeElapsed );
		
		//Instant start = Instant.now();
		
		Path currentPath = Paths.get(System.getProperty("user.dir"));
		
		//Map<String, String> map;
		
		//Path googleWordsPath = Paths.get(currentPath.toString(), "google-1000.txt");
		
		//Path thesaurusPath = Paths.get(currentPath.toString(), "MobyThesaurus2.txt");
		
		//map = Parser.parse(googleWordsPath);
		
		//System.out.println("Google 1000 words map size --> " + map.size());
		
		//Map<String, String> map2 =Parser.parseThesaurus(map, thesaurusPath);
		
		//System.out.println("Complete map size --> " + map2.size());
		
		Instant finish = Instant.now();
		
		//long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.printf("Took %sms to execute", timeElapsed);
		//System.out.println(map2);
		// Odpal sobie zeby zobaczyc wszystkie items z mapy ktore nie sa z 1000words
	//for(String key: map2.keySet()) {
//			if(key.equals(map2.get(key))) {
//				System.out.println(key + " --> " + map2.get(key));
//			}
//		}
		
	/*for(Map.Entry<String,String> entry : map2.entrySet()) {
	System.out.println(entry.getKey() + ": " + entry.getValue()); 
	}
	*/
		
		
		
	}

	
	
}