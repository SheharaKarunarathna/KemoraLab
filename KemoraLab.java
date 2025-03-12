public class KemoraLab {
    public static void main(String args[]){
        System.out.println("Hello World!"); //String literals
        System.out.println(8+2); //integer literals
        int num1 = 3;
        int num2 = 4;
        int result = num1 + num2;
        System.out.println(result);
        boolean B = true;
        
        // Boolean contains only true and false
        System.out.println(B);
        byte c = -128;  //bytes are for -128 to 127 ranged values
        // int for 4bytes values , long for 8bytes values , short for 2bytes values
        long l = 324234l;
        System.out.println(l);
        System.out.println(c);
        double x = 8.9;
        // double can have 8bytes values
        System.out.println(x);
        float y = 9.3f;
        //floats can have only 4bytes values. And the default form of java is double so when we try to code a float value we should convert it to a float by adding a f at the end 
        System.out.println(y);
        char o = 'o'; //we can't add "" instead of ''
        // char type only contain a single character it can be any character in the world since it is got by the unicode values. It is written by two bytes
        System.out.println(o);

        //LITERALS
        int integer = 0b101; //This method is workable for any binary, octal or hexadecimal data types
        System.out.println(integer);
        int num3 = 100_00_00_000; //this _ can't add at the end , the beginning , next to the . or at the exponent part
        System.out.println(num3);
        double num4 = 45; //this double notation makes it 45.0
        System.out.println(num4);

        //TYPE CONVERSION
        byte num5 = 23;
        int num6 = num5;
        System.out.println(num6); //This works since the range that int can have is more larger than the range of byte can have
        // int num7 = 235;
        // byte num8 = num7;
        // System.out.println(num8); //This wont work since byte data type is smaller than int data types
    }
}
