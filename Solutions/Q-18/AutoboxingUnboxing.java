public class AutoboxingUnboxing {
    
    public static void main(String[] args) {

// AUTOBOXING - Converting a primitive value into an object of the corresponding wrapper class
       
        byte a=10;
        Byte b = Byte.valueOf(a);                           // Boxing using valueOf() static method
        System.out.println("After Autoboxing:  " + b);
       
        int x=100;
        Integer y = Integer.valueOf(x);                     // Boxing using valueOf() static method
        System.out.println("After Autoboxing:  " + y);


// UNBOXING - Converting an object of a wrapper type to its corresponding primitive value
      
        int z = y;                                          // Unboxing
        System.out.println("After Unboxing:  " + z);
    
    }
}
