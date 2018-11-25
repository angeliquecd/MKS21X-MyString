public class MyString implements CharSequence, Comparable<CharSequence> {
  private char[] data;
public MyString(CharSequence a){
  data= new char[a.length()];
  for (int b=0;b<a.length();b++){
    data[b]=a.charAt(b);
  }
}
public char charAt(int index){
  return data[index];
}
public int length(){
  return data.length;
}
public String subSequence(int start, int end){
  String value="";
  for (int a = start;a<end;a++){
    value+=""+data[a];
  }
  return value;
}
public String toString(){
  String value ="";
  for (int a =0;a<data.length;a++){
    value+=""+data[a];
  }
  return value;
}
public int compareTo(CharSequence b){
  MyString b2 = new MyString(b);
  return this.toString().compareTo(b2.toString());
}
  public static void main (String args[]){
MyString guy = new MyString("hello");
MyString bro = new MyString("i am but a chimney sweep.");
System.out.println(guy);
System.out.println(guy.length());
System.out.println(guy.charAt(3));
System.out.println(guy.subSequence(1,3));
System.out.println(bro);
  }
}
