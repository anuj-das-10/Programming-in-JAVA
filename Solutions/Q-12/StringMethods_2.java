class StringMethods_2 {

	public static void main(String[] args) {
	String str = "welcome to GCCxCSD";
	System.out.println(str);


/*---------------------------------------------------------------------------------------------------------
	public boolean startsWith(String prefix)  --> returns true or false based on prefix is matched or not
		or
	public boolean startsWith(String prefix, int offset)  

	**Parameters:
	prefix: Sequence of character
	offset: The index from where the matching of the string prefix starts.

	1. str.startsWith("W");  --->  returns false as "W" is not same as "w" beacause of case sensitivity.
	2. str.startsWith("GCC",11);   ---> returns true as from index 11 there is "GCC"
-----------------------------------------------------------------------------------------------------------*/ 
	System.out.println(str.startsWith("W"));
	System.out.println(str.startsWith("GCC",11));





/*-----------------------------------------------------------------------------------------------------------------
	String substring(int beginIndex) --> returns substring for given begin index.
		or
	String substring(int beginIndex, int endIndex) --> returns substring for given begin index and end index-1.
-------------------------------------------------------------------------------------------------------------------*/ 
	System.out.println(str.substring(11));
	System.out.println(str.substring(0,6));		// It will not return substring from index between 0 to 6-1
	


/*	String toLowerCase()  --->   returns a string in lowercase.			*/ 
	String str1 = "WORLD";
	System.out.println(str1);
	str1 = str1.toLowerCase();			// Converting to lower case and assigning to same variable
	System.out.println(str1);




/*--------------------------------------------------------------------------------------------------------------------
	static boolean equalsIgnoreCase(String another)	 --->  compares another string but it doesn't check case.
	It returns true or false based on the strings compared are matched or not.
	1. str2.equalsIgnoreCase(str3);  ---> returns true!
----------------------------------------------------------------------------------------------------------------------*/ 
	String str2 = "HEllO";
	String str3 = "heLLo";
	System.out.println(str2.equalsIgnoreCase(str3));



/*----------------------------------------------------------------------------------------------------------------------
	String replace(char old, char new) --> replaces all occurrences of the specified char value.
		or
	String replace(CharSequence old, CharSequence new) --> replaces all occurrences of the specified CharSequence.
------------------------------------------------------------------------------------------------------------------------*/ 
	System.out.println(str2.replace('l','L'));
	System.out.println(str3.replace("heLL","hell"));

	}
}