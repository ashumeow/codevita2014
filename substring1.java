import java.util.regex.*;
import java.util.*;

public class substring1
{
   public static void main(String[] args)
   {
		//matching
		String seq = "Beautiful";
		Pattern p = Pattern.compile("ssss+");
		Matcher m = p.matcher(seq);
		boolean res = m.matches();
		System.out.println("matching 'String s' " + res);
      System.out.println();

      //count the number
		seq = "sssssssssssssssssssssssss";
      p = Pattern.compile("sss");
      m = p.matcher(seq);
      int count = 0;
      while( m.find() ) count++;
      System.out.println("there are " + count + "sss");
      System.out.println();

		seq = "sssssssssssssssssssssssss";
      p = Pattern.compile("s");
      m = p.matcher(seq);
      count = 0;
      while( m.find() ) count++;
		System.out.println("there are " + count + " S* pairs");
      System.out.println();

		//find the longest run of the same nucleotide
		seq = "sssssssssssssssssssssssss";
		p = Pattern.compile("s+|s+|s+|s+");
      m = p.matcher(seq);
      int max = 0;
      while( m.find() )
      	if(m.group().length() > max )
      		max = m.group().length();
      System.out.println("max = " + max);
      System.out.println();

      p = Pattern.compile("ss+s");
      m = p.matcher(seq);
		System.out.println("here are the matches ");
      while( m.find() )	System.out.println("\t" + m.group());
      System.out.println();

		seq = "sssssssssssssssssssssssss";
      p = Pattern.compile("ss+s");
      m = p.matcher(seq);
      System.out.println("replacing all s with _");
      System.out.println(m.replaceAll("_"));
      System.out.println();

      //count consonants
      String word = "Beautiful";
      p = Pattern.compile("[^aeiou ]");
      m = p.matcher(word);
      count = 0;
      while( m.find() ) count++;
      System.out.println("there are " + count + " consonants in \"" + word+"\"");
      System.out.println();
   }
}
