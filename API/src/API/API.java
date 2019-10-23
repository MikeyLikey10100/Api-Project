package API;
import java.util.Scanner;
public class API {

	public static void main(String[] args) {
		//firstThree();
		//middleWord();
		//length();
		//firstUseOfE();
		//lastUseOfE();
		//concatinate();
		//x();
		//upperCase();
		//noSpaces();
		
		
	}
	public static void firstThree()
	{	
		String name = "Myname is Michael ";
		String firstThree = (name.substring(0,3));
		System.out.println(firstThree);
		
	}
	public static void middleWord()
	{
		String name = "My name Michael";
		int middleFinder = name.indexOf(" ");
		String middle = (name.substring(name.indexOf(" "), 7));
		System.out.println(middle);
	}
	public static void length()
	{
		String name = "My name Michael";
		int length = name.length();
		System.out.println(length);
	}
	public static void firstUseOfE()
	{
		String name = "My name Michael";
		int firstNumber = name.indexOf("e");
		System.out.println(firstNumber);
	}
	public static void lastUseOfE()
	{
		String name = "My name Michael";
		int lastNumber = name.lastIndexOf("e");
		System.out.println(lastNumber);
	}
	public static void concatinate()
	{
		String phrase1 = "computer";
		String phrase2 = "Mr.Mcguire";
		String combine = phrase1.concat(phrase2);
		System.out.println(combine);
	}
	public static void x()
	{
		String phrase = " hello everyone, eat";
		String replace = phrase.replaceAll("[e]","x");
		System.out.println(replace);
	}
	public static void upperCase()
	{
		String phrase = "cool beans";
		String upper = phrase.toUpperCase();
		System.out.println(upper);
	}
	public static void noSpaces()
	{
		String phrase = "Hello there sir, how may I help you";
		int index = 0;
		for(int i = 0; i < phrase.length(); i++ )
		{
		if(phrase.substring(i,i+1).equals(" "))
		{
			System.out.print(phrase.substring(index,i));
			index = i+1;
		}
			
		}
		System.out.println();
	}
	public static void lexi()
	{
		
	}
	
		
	}

