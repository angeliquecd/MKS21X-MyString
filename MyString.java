public class MyString implements CharSequence, Comparable<CharSequence> {
  private char[] data;
public MyString(CharSequence a){//places each value into slot in array
  data= new char[a.length()];
  for (int b=0;b<a.length();b++){
    data[b]=a.charAt(b);
  }
}
public char charAt(int index){//returns certain array value
  if (index<0||index>=data.length) throw new ArrayIndexOutOfBoundsException();
  return data[index];
}
public int length(){//finds length of array
  return data.length;
}
public String subSequence(int start, int end){//loops through only part of data
  if (start<0||end<0||end>=data.length||start>end) throw new ArrayIndexOutOfBoundsException();
  String value="";
  for (int a = start;a<end;a++){
    value+=""+data[a];
  }
  return value;
}
public String toString(){
  String value ="";
  for (int a =0;a<data.length;a++){//loops through data and adds to print statement
    value+=""+data[a];
  }
  return value;
}
public int compareTo(CharSequence b){
  if (b==null) throw new NullPointerException("Input cannot be null.");
  MyString a = new MyString(this);
  MyString z = new MyString(b);
  int comparison=0;
  int len = a.length();
  int shorter = a.length();
  if (a.length()>z.length()){
    len = a.length();
    shorter=z.length();
    comparison=1;//if equal but one is shorter
  }
  else{
    len= z.length();
    shorter=a.length();
    if (a.length()<z.length()){
    comparison=-1;}//if equal but one is shorter
    else{
      comparison=0;}//if fully equal
  }
  for (int c = 0;c < len ; c++){
    if (c<z.length() && c<a.length()){
      if (z.charAt(c)>a.charAt(c)){
        return -1;}//reports first change
      else{
        if (z.charAt(c)<a.charAt(c)){
        return 1;}//reports first change
      }
  }
}
  return comparison;//reports what to do when no changes(Longer or equal)
  }
public static void main (String args[]){//test cases
MyString guy = new MyString("hello");
MyString bro = new MyString("i am but a chimney sweep.");
MyString man = new MyString(guy);
System.out.println(guy);
System.out.println(man);
System.out.println(guy.length());
System.out.println(guy.charAt(3));
System.out.println(guy.subSequence(1,3));
System.out.println(bro);
System.out.println("hello".compareTo("america"));
System.out.println(guy.compareTo("america"));//compares a mystring to a string
//should return a positive number
System.out.println();
System.out.println(guy.compareTo(guy));
System.out.println(guy.compareTo("hello"));//should return 0
System.out.println();
System.out.println("hello".compareTo("i am but a chimney sweep."));
System.out.println(guy.compareTo(bro));//compares two mystrings
//should return a negative number
System.out.println(guy.compareTo("helloo"));
System.out.println(guy.compareTo(null));
  }
}
