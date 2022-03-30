package fundamentals;

public class HelloWorld { 
//{} are called squiggly brackets
//() are brackets
//[] are square brackets
 @SafeVarargs
 static <T> void print(T... ts){for (T t : ts){System.out.print(t + " ");}System.out.println("");}
 public static void main(String [] args) {
   print("Hello world!");
   print(1+1);
   print(0.1+0.2);
 }
}