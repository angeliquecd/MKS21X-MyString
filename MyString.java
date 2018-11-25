public class MyString implements CharSequence, Comparable<CharSequence> {
  private char[] data;
public MyString(CharSequence a){//places each value into slot in array
  data= new char[a.length()];
  for (int b=0;b<a.length();b++){
    data[b]=a.charAt(b);
  }
}
public char charAt(int index){//returns certain array value
  return data[index];
}
public int length(){//finds length of array
  return data.length;
}
public String subSequence(int start, int end){//loops through only part of data
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
  MyString b2 = new MyString(b);//converts other vaue to mystring
  return this.toString().compareTo(b2.toString());//converts both to strings and then compares them
}
  public static void main (String args[]){//test cases
MyString guy = new MyString("hello");
MyString bro = new MyString("i am but a chimney sweep.");
System.out.println(guy);
System.out.println(guy.length());
System.out.println(guy.charAt(3));
System.out.println(guy.subSequence(1,3));
System.out.println(bro);
System.out.println(guy.compareTo("america"));
System.out.println(guy.compareTo("hello"));
System.out.println(guy.compareTo(bro));
  }
}
