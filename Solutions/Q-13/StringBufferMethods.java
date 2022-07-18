class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Human");
        System.out.println(str);

/*------------------------------------------------------------------------------------------------------------------------
	public synchronized StringBuffer append(String s)  --> Add specified string at the end of the existing string.
	And it modifies the existing string as StringBuffer creates mutable strings.
-------------------------------------------------------------------------------------------------------------------------*/ 
		str.append("Being");
		System.out.println(str);



/*	public synchronized StringBuffer insert(int offset, String s)  --> Inserts at specified string at specified index.	 */ 
		str.insert(0,"Hello");
		System.out.println(str);



/*------------------------------------------------------------------------------------------------------------------------
	public synchronized StringBuffer replace(int startIndex, int endIndex, String str)	
	It is used to replace the string from specified startIndex and endIndex.
	1. Here, from index 1 to 15 the substring is "HumanBeing" which is replaced with "World"
-------------------------------------------------------------------------------------------------------------------------*/ 
		str.replace(5,15,"World");
		System.out.println(str);



/*------------------------------------------------------------------------------------------------------------------------
	public synchronized StringBuffer delete(int startIndex, int endIndex)	
	It is used to delete the string from specified startIndex and endIndex-1.
-------------------------------------------------------------------------------------------------------------------------*/
		str.delete(5,9);
		System.out.println(str); 



/*	public synchronized StringBuffer reverse() --> It is used to reverse the string.	*/
	str.reverse();
	System.out.println(str);



/*	public int capacity() -->  It is used to return the current capacity.	*/
	System.out.println("Capacity:  " + str.capacity());



/*--------------------------------------------------------------------------------------------------------------
	*NOTE:  Some Methods of String class can also be used:
	1. charAt()
	2. length()
	3. substring() 
	4. indexOf()
----------------------------------------------------------------------------------------------------------------*/ 

	}
}