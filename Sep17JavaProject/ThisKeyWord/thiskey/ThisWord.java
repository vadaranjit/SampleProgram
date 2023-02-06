package thiskey;

public class ThisWord {
	int a=20;
	ThisWord()
	{
		System.out.println(a);
	}

	ThisWord(int a)
	{
		this();
		System.out.println(a);
	}
	ThisWord(String b)
	{
		this(100);
		System.out.println(b);
	}
	public static void main(String[]args)
	{
		ThisWord c=new ThisWord(30);
		ThisWord h=new ThisWord(40);
 		ThisWord t=new ThisWord("abcd");	

	}
	
}

