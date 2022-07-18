class StringMethods_1 { 	
	
	public static void main(String[] args) {
	String str1 = "welcome";
	String str2 = "human";

/*-----------------------------------------------------------------------------------------------------
	String concat(String str) ->  concatenates the specified string.
	As Strings are immutable so str1 can't be modified directly once it is created on string 
	constant pool. A whole new string is created after concatenating str1 & str2 and stored in str3.
-------------------------------------------------------------------------------------------------------*/
	String str3 = str1.concat(str2);
	System.out.println(str3);



/*  boolean contains(CharSequence s)  ->  returns true or false after matching the sequence of char value. */
	System.out.println(str1.contains("come"));




/*---------------------------------------------------------------------------------------------------
	public boolean endsWith(String suffix) -> return true or false 
	based on the String ends with the given sequence of character.
	1. welcome ends with "me"  ---> true
	2. welcome does not ends with "comes"  ---> false
----------------------------------------------------------------------------------------------------*/	
	System.out.println(str1.endsWith("me"));
	System.out.println(str1.endsWith("comes"));





/*----------------------------------------------------------------------------------------------------
	boolean equals(Object another) -> checks the equality of string with the given object.
	1. As str1 is "welcome" and str2 is "human", so it is not equal which evaluates to ----> false
-----------------------------------------------------------------------------------------------------*/
	System.out.println(str1.equals(str2));




/*	int length()  ->  returns length of the string 	*/
	System.out.println("Length of \""+str1+"\" is: "+str1.length());




/*-----------------------------------------------------------------------------------------------------
	char charAt(int index)  ->  returns char value for the particular index.
	Index count starts from 0.
	1. str1.charAt(3);  --->  returns 'c'; 
	2. str1.charAt(5);  --->  returns 'm'; 
-------------------------------------------------------------------------------------------------------*/
	System.out.println("Character at index 3 of \""+str1+"\" is:  "+str1.charAt(3));
	System.out.println("Character at index 5 of \""+str1+"\" is:  "+str1.charAt(5));




/*------------------------------------------------------------------------------------------------------
	int indexOf(int ch) ->	returns the index of first occurrence of specified char.
	If character does not present in the string, it returns -1
	1. str1.indexOf("e");  ---> returns 1;  Because first occurrence of 'e' is at index 1.
--------------------------------------------------------------------------------------------------------*/ 
	System.out.println("Index of first occurrence of 'e' in \""+str1+"\" is:  "+str1.indexOf("e"));




/*------------------------------------------------------------------------------------------------------
	int lastIndexOf(int ch)	-> returns the index of last occurrence of specified char.
	If character does not present in the string, it returns -1
	1. str1.lastIndexOf("e");  ---> returns 6;  Because first occurrence of 'e' is at index 6.
--------------------------------------------------------------------------------------------------------*/ 
	System.out.println("Index of last occurrence of 'e' in \""+str1+"\" is:  "+str1.lastIndexOf("e"));


/*--------------------------------------------------------------------------------------------------------	
	String toUpperCase()  ->   returns a string in uppercase.		
	As Strings are immutable so str1 can't be modified directly once it is created on string 
	constant pool. A whole new uppercase string is created. To modify the existing we need to assign
	converted string to str1:
	str1 = str1.toUpperCase();
----------------------------------------------------------------------------------------------------------*/ 
	str1 = str1.toUpperCase();
	System.out.println(str1);




/*	String trim() -> removes beginning and ending spaces of this string.		*/ 
	String trimStr = "   Hello World!   ";
	System.out.println(trimStr);
	System.out.println(trimStr.trim());




/*	static String valueOf(int value) -> converts given type into string. It is an overloaded method.		*/
	int binary = 1011101;
	String binaryString = String.valueOf(binary);
	System.out.println("Premitive integer:  "+binary);
	System.out.println("String:  "+binaryString);
	}
}