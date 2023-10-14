
/*
 * Example class on how comments are used
 * this is a block comment, same as how c++ uses comments
 */


public class Main {

  // hey mom look! im a end of line comment
  public static void main(String[] args) {
    System.out.println(add(1,5)); /* prints the sum of 1&5 to stdout; I am a trailing comment */
  }

  /**
   *
   * @param a one of the arguments to be added together
   * @param b the other arguement that gets added to a
   *
   * @return the sum of a and b
   *
   *
   */
  public static int add(int a, int b) {
      return a+b;
    
  }
  // end of line comments can also used to comment out code
  //
  // TODO: fix, idk why its not working :(
  //int add(int a, int b) {
  //    return a*b;
  //}


}
