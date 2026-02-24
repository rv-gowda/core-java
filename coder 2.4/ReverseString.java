class ReverseString{

public static void main(String[]args){
 
String alphabet="ABCDEF";
String reverse="";

for(int i =alphabet.length()-1; i >= 0; i--){
	reverse = reverse + alphabet.charAt(i);
	
}
System.out.println("The reverse string is "+reverse);
}
}