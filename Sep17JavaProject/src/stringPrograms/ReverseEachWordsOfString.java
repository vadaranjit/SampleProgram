package stringPrograms;
//21.Java program to reverse each words of string
public class ReverseEachWordsOfString {

	public static void main(String[] args) {

		String str = "i am ranjit";
        str = str+ " ";
        String word = "";
        String rev = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            
            if(ch!=' ')
            {
                word = ch + word;
            }
           
            else 
            {
                rev = rev +" "+ word; 
                word="";
            } 
        }
        System.out.println("Normal Method = "+rev);
	}

}
