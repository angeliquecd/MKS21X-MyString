public class MyString implements CharSequence {
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
  return this.length();
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
  public static void main (String args[]){
MyString guy = new MyString("hello");
System.out.println(guy);
System.out.println(guy.length());
System.out.println(guy.charAt(3));
System.out.println(guy.subSequence(1,3));
  }
}