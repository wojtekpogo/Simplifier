package ie.gmit.sw;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;


public class Converter {
	
	Path currentPath = Paths.get(System.getProperty("user.dir"));
	Path googleWordsPath = Paths.get(currentPath.toString(), "google-1000.txt");
	//Map<String, String> map = new HashMap<String, String>();
	
	Path thesaurusPath = Paths.get(currentPath.toString(), "MobyThesaurus2.txt");
	
	
	Parser p = new Parser();
	Map<String, String> map= Parser.parse(googleWordsPath); 
	//map = Parser.parse(googleWordsPath);
	Map<String, String> map2 =Parser.parseThesaurus(map, thesaurusPath);
	
	
	
	public StringBuilder swapSentence(String sentence) {
		
		String swappedSentence;
		int i=0;
		StringBuilder out = new StringBuilder();
		//sentence.split("//s+"); //splitting sentence by white spaces
		
		String[] splittedSentence = sentence.split("\\s+");

		//System.out.println(splittedSentence[1].toString());
		
		for(String eachWord: splittedSentence) {
			if(map2.containsKey(eachWord)) {
				
				
				splittedSentence[i] = map2.get(eachWord);
				out.append(ConsoleColour.GREEN).append(splittedSentence[i]).append(" ").append(ConsoleColour.RESET);
				
				//System.out.print(ConsoleColour.BLACK);
				
		
				
			}
			else
			{
				//System.out.print(ConsoleColour.RED);
				splittedSentence[i] = eachWord;//stays the same
				out.append(ConsoleColour.RED).append(splittedSentence[i]).append(" ").append(ConsoleColour.RESET);
				//swappedSentence = String.join(" ", splittedSentence);
				
				
				
				
			}
			
			//System.out.print(ConsoleColour.RESET);
			i++;
			//System.out.print(ConsoleColour.RESET);
			
			//System.out.println(ConsoleColour.RESET);
		}
		
		swappedSentence = String.join(" ", splittedSentence);
		
		
		//return splittedSentence.toString();
		return out;
	}
	
}//class
