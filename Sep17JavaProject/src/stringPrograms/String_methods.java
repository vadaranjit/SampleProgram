package stringPrograms;

public class String_methods {
	 public static void main(String[] args) {
		 String s = "my name is Ranjit";
		 String x = "    Happy    ";
		 String x5 = "harry potter and harry";

//________(All comments are Output)_____
		 int i = s.length();
		 System.out.println(i);
         //output=  17
		 
		 String s1= s.toUpperCase();
		 System.out.println(s1);
		 //MY NAME IS RANJIT
		 
		 String s2= s.toLowerCase();
		 System.out.println(s2);
		 //my name is ranjit
		 
		 String s3= x.trim();
		 System.out.println(s3);
		 //Happy

		 char j = s.charAt(4);
		 System.out.println(j);
		 //a
		 
		 boolean b = s.endsWith("it");
		 System.out.println(b);
		 //true
		 
		 int b1 = s.indexOf('a');
		 System.out.println(b1);
		 //4
		 
		 int b2 = s.indexOf('a',5);
		 System.out.println(b2);
		 //12
		 
		 int b3 = s.lastIndexOf('a');
		 System.out.println(b3);
		 //12
		 
		 int b4 = x5.indexOf("harry",5);
		 System.out.println(b4);
		 //17
		 
		 String b5 = x5.repeat(2);
		 System.out.println(b5); 
		 //harry potter and harryharry potter and harry
		 
		 String b6 = x5.replace('h','z');
		 System.out.println(b6);
		 //zarry potter and zarry
		 
		 String b7 = x5.replace("harry","velocity");
		 System.out.println(b7);
		 //velocity potter and velocity
		 
		 String b8 = x5.replaceAll("potter","velocity 17 sep");
		 System.out.println(b8);
		 //harry velocity 17 sep and harry
		 
		 String b9 = x5.replaceFirst("harry","velocity");
		 System.out.println(b9);
		 //velocity potter and harry
		 
		 String x1 = "harry potter";
		 String x2 = "HARRY POTTER";
		 
		 boolean s4 = x1.equals(x2);
		 boolean s5 = x1.equalsIgnoreCase(x2);
		 //equals = false
		 //equalsIgnoreCase = true
		  
		 System.out.println("equals = "+s4);
		 System.out.println("equalsIgnoreCase = "+s5);
		 
		 System.out.println(x1.concat(x2));
		 //harry potterHARRY POTTER
		 System.out.println("********************************************");
		 System.out.println(x1.contains("harry potter"));
		 //true
		 System.out.println(x1.contentEquals("harry potter"));
		 //true
		 
		 System.out.println(x1.compareTo(x2)); //32
		 System.out.println(x2.compareTo(x1)); //-32
		 System.out.println(x1.compareToIgnoreCase(x2)); // 0
		 
		// +ve = [x1 > x2]
		// -ve = [x1 < x2]
		//  0 =  [x1 == x2]
		 
		 String x3 = "      ";
		 String x4 = "";
		 
		 boolean s6 = x3.isBlank(); 
		 boolean s7 = x3.isEmpty();
		 
		 System.out.println(s6); // true
		 System.out.println(s7); // false
		 
		 boolean s8 = x4.isBlank();
		 boolean s9 = x4.isEmpty();
		 
		 System.out.println(s8); // true
		 System.out.println(s9); // true
		 
		 String x6 = "1234";
		 String x7 = "1234";
		 
		 int z = Integer.parseInt(x6);
		 int y = Integer.parseInt(x7);
		 System.out.println(z+y);      //2468
		 
		 int z1 = 12;
		 int y1 = 14;
		 
		 String x8 = String.valueOf(z1);
		 String x9 = String.valueOf(y1);
		 System.out.println(x8+x9);     // 1214
		 
		 StringBuffer sb = new StringBuffer("harry potter");
		 System.out.println(sb.reverse());
		 //rettop yrrah
		 
		 //String[] ran = x6.split(0,2);
		 //System.out.println("                      "+ran[0]);
		 
		 
		 
		 
		 
	 }
}
