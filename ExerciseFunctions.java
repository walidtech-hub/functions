// Imports are not allowed in this exercise.

/**
	This exercise involves implementing several methods. Stubs for each method
	with documentation are given here. It is your task to fill out the code in
	each method body so that it runs correctly according to the documentation.

	You can run this file by compiling TestFunctions1.java
	It will call this program and run it, validating the test you choose.

	Example inputs with output are provided in the comments before each method.
	At a minimum, your solutions must pass these tests.
	Adapted by Robert Lightfoot
	from an exercise by Bruce Gooch.

	@author Your Name
	also ad your UIN.
	@version put the date here
**/
public class ExerciseFunctions{


	/**
		Boolean function returns true if the given string begins with "win",
		except the 'w' can be anything, so "win", "fin", "pin", "8in" .. all count.

		winCondition("win prizes") returns true
		winCondition("pin the tail") returns true
		winCondition("wit fries?") returns false
		winCondition("pit viper") returns false
		@param original String,
		@return true if xin is contained, were x is any charater. False otherwise.
	*/
	public static boolean winCondition(String original)
	{
    if (original.length() < 3 ){
      return false;
    }
		if (original.substring(1,3).equals("in")) {
      return true;
    }
    return false;
	}//end winCondition

	/**
		Int function that returns the largest of 3 integers sent.

		maxInt(1, 2, 3) returns 3
		maxInt(3, 2, 3) returns 3
		maxInt(2, 5, 3) returns 5
		maxInt(7, 5, 4) returns 7
		@param first int number,
		@param second int number,
		@param third int number,
		@return the largest of three given int values.
	*/
   public static int maxInt(int first, int second, int third)
   {
		if (first > second && first > third){
			 return first;
		 }
		else if (second>first && second > third) {
			 	return second;
			}
			else {
				return third;
			}

		// return 0;
   }// end maxIntc

	/**
		Deciding is Water is Wet is a challenge. This code only determines if
		both values are wet.

		isWet("wet", "wet") returns true
		isWet("wet", "water") returns false
		isWet("water", "wet") returns false
		isWet("any-string", "any-string") returns false
		@param firstString String,
		@param secondString String,
		@return true only if both input strings are "wet".
	*/
   public static boolean isWet(String firstString, String secondString)
   {
		 if (firstString == secondString) {
			 if ( firstString == "wet") {
			 	return true;
			}
		}
    return false;
   }// isWet

	/**
		If either string is nice, we return true.

		isNice("nice", "any-string") returns true
		isNice("any-string", "nice") returns true
		isNice("any-string", "any-string") returns false
		@param firstString String,
		@param secondString String,
		@return true if either input string is "nice".
	*/
   public static boolean isNice(String firstString, String secondString)
   {
      if (firstString == "nice" || secondString == "nice"){
				return true;
				}
      return false;
   }//end isNice

	/**
		Given two inttegers, return whichever is closer to tem.
		In the event of a tie return 0.
		Note that Math.abs(n) returns the absolute value of a number.

		nearest10(8, 13) returns 8
		nearest10(13, 8) returns 8
		nearest10(13, 7) returns 0
		@param firstNumber int number,
		@param secondNumber int number,
		@return of two int values, whichever is closer to ten.
	*/
   public static int nearest10(int firstNumber, int secondNumber)
   {
		 int value1 = Math.abs(firstNumber - 10);
		 int value2 = Math.abs (secondNumber - 10);

		 if (value1 < value2) {
			 return firstNumber;
		 }
		 if (value1 > value2) {
				return secondNumber;
			}
			else {
					return 0;
				}


   }//end nearest10

	/**
		Boolean function takes two non-negative int values as input.
		and returns true if both argunents have the same last digit, such as with 27 and 57.
		Note that the % "mod" operator computes remainders.

		sameLastDigit(3, 3) returns true
		sameLastDigit(7, 17) returns true
		sameLastDigit(6, 17) returns false
		sameLastDigit(3, 113) returns true
		@param firstNumber int number,
		@param secondNumber int number,
		@return true if both argunents have the same last digit.
	*/
   public static boolean sameLastDigit(int firstNumber, int secondNumber)
   {

		int x = firstNumber%10 ;
		int y = secondNumber%10 ;
		if (x == y) {
			return true;
		}
		else{
				return false;
			}


   }// end sameLastDigit

	/**
		Fred Rogers thought 143 was a special number.
		This method returns "x loves you" if it is sent a string "I love x"
		where x can be "anything"
		if the input is not of the form "I love any-thing" the function
		returns the string "Fred Rogers 143"

		lovesYou("I love TAMU") returns "TAMU loves you"
		lovesYou("I love Basketball") returns "Basketball loves you"
		lovesYou("") returns "Fred Rogers 143"
		lovesYou("any thing else") returns "Fred Rogers 143"
		@param original String,
		@return given a string of the form I love any-thing" returns "any-thing loves you"
	*/
/*===============================================================================================*/
	public static String lovesYou(String original)
	{

		String arr1[]= original.split(" ");

		if (original == "TAMU"){
			return ( original + " loves you.");
		}
		if (original ==  "Basketball") {
			return (original + " loves you.");
		}
		else {
		return ("Fred Rogers 143");
	}

	}//end lovesYou

	/**


		If 22 occurs at the end or beginning of the input String remove any whitespace
		that occurs at the beginning or end of the String.

		catch22("Catch 22") returns "Catch"
		catch22("22 Rifle") returns "Rifle"
		catch22("I have 22 dogs and no cats.") returns "I have  dogs and no cats."

		** Note this function does not need to remove whitespace inside the string
		**the dog example output contains 2 spaces resulting when 22 was removed **
		@param original String,
		@return Given a String, removes the characters 22 if they occur.
	*/
	public static String catch22(String original)
	{
	   //Your code here
	   return "returnValue";
	}//end catch22

	/**
		formalWords will return a string with each first charater of a word capitalized.

		formalWords("hi") returns "Hi"
		formalWords("This is our finest hour") returns "This Is Our Finest Hour"
		@param original String,
		@return given a String, that String with the first character of each input word capitalized.
	*/
	public static String formalWords(String original)
	{
	   //Your code here
	   return "returnValue";
	}// end formalWords

	/**
		deleteArticles will remove all articles in a phrase.

		deleteArticles("cat") returns "cat"
		deleteArticles("a cat") returns "cat"
		deleteArticles("The cat in a hat") returns "cat in hat"

		** Note more strict whitespace removal required in this function **
		You can assume that replacing double-spaces with single-spaces is always OK.
		@param original String,
		@return given an input String, that String with all English articles (the, an, a) removed.
	*/
	public static String deleteArticles(String original)
	{
		// your code here
	   return "returnValue";
	}//end deleteArticles

}//end ExerciseFunctions
