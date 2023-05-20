package oop;
public class Hello {
    public static void main(String[] args) {
      System.out.println("Hello World");
      char a = '\u007f';
      System.out.println(a);
      int i = 6;
      long l = i;
      i = (int)l; // ep 8 byte ve 4 byte kieu thu hep
      short h = 3;
      long k = 4;
      long j = (short)(h + k);
      System.out.println(j);
  }
}