package pgm1;
import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class CountWords
{
private static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException
{
Scanner file=new Scanner (new File(filename));
while(file.hasNext()){
String word=file.next();
Integer count=words.get(word);
if(count!=null)
count++;
else
count=1;
words.put(word,count);
}
file.close();
}
public static void main(String[] args)
{
Map<String,Integer> words=new HashMap<String, Integer>();
try {
	CountWords("C:\\Users\\tanay\\eclipse-workspace\\java training\\src\\main\\java\\story.txt",words);
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}
System.out.println(words);
}
}