package api;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class api {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\User\\Desktop\\Words.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            
            //initialise variables
            String line;
            int wordCount = 0;
            int characterCount = 0;
            int paraCount = 0;
            int whiteSpaceCount = 0;
            int sentenceCount = 0;
            
            

            //if this condition evaluates to true then the body of the loop will be executed
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) {
                    paraCount += 1;
            	 
                    //This will be executed if the test expression is evaluated to false
                } else {
            characterCount += line.length();
            String words[] = line.split("\\s+");
            wordCount += words.length;
            whiteSpaceCount += wordCount - 1;
            String sentence[] = line.split("[!?.:]+");
            sentenceCount += sentence.length;
            	
            //initialise variables        
            double sum = 0;
            int count = 0;
            for (String word : words) {
            	double wordLength = word.length();
            	sum += wordLength;
            	count++;
            }
            
            String str = ("C:\\Users\\User\\Desktop\\Words.txt");
 
            List <String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());
     
            Map <String, Integer > wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
     
            System.out.println("Frequency of words:" + wordCounter);

            // calculate the average at the end
            double average = 0;
            if (count > 0) {
            	average = sum / count;
            
            	System.out.println("Average word length = " + average);
            	if (sentenceCount >= 1) {
            		paraCount++;
            	}
            	System.out.println("Total word count = "+ wordCount);
            	System.out.println("Total number of sentences = "+ sentenceCount);
            	System.out.println("Total number of characters = "+ characterCount);
            	System.out.println("Number of paragraphs = "+ paraCount);
            	System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
            
                
    }
        }
       
        }
        
            	
            String name = ("C:\\Users\\User\\Desktop\\Words.txt"); //arbitrary sentence
            
            int numWords = (name.split("\\s+")).length; //split string based on whitespace
                                                    //split returns array - find legth of array
            
            System.out.println("List of words:"+ numWords);
} 
            }
            

            	 
            	}
        
		
	
