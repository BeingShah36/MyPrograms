import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Akash");
		names.add("Ambani");
		names.add("Don");
		names.add("Ravan");
		names.add("Adani");
		
 //   Long c =		names.stream().filter(s->s.startsWith("A")).count();
    
    
// Long c =   Stream.of("Abhi","Ambi","Don").filter(s->s.startsWith("A")).count();
 //   System.out.println(c);
    
//    Long d =		names.stream().filter(s->s.length()>4).count();
//    System.out.println(d);
    
 // 	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));  //using forEach
  //    List<String>  name1 = Arrays.asList("Azbhi","Aumbi","Don","Abmbani");
// Stream.of("Azbhi","Aumbi","Don","Abmbani").filter(s->s.endsWith("i")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));  //using sorted, maps
      
      //connecting two streams
      
//  Stream<String> newStream =   Stream.concat(names.stream(), name1.stream());
  
 // newStream.sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
  
// Assert.assertTrue( (newStream.anyMatch(s->s.equalsIgnoreCase("Don"))) );

// List<String>  ls =  Stream.of("Azbhi","Aumbi","Don","Abmbani").filter(s->s.endsWith("i")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());  ///collect will collect all data from previous string n converts it into string
// System.out.println(ls.get(0));
// System.out.println(ls.get(1) );
// System.out.println(ls.get(2));


// distinct the nos and sort it
      

   List<Integer>  value = Arrays.asList(1,2,2,4,5,6,3,5,4,6,8,9,0);
 //  value.stream().distinct().sorted().forEach(s->System.out.println(s));
   
  List<Integer> l = value.stream().distinct().sorted().collect(Collectors.toList());
  
 System.out.println("distinct no is " + l.get(1) );


	}

}
