package lamdaDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashmapiteration {
	public static void main(String[] args) {
		
 /*Map<Integer, String> hm=new HashMap<>();
 hm.put(1, "India");
 hm.put(2, "America");
 hm.put(3, "England");
 hm.put(4, "Australia");
 hm.forEach((k,v)->System.out.println(k+":"+v));*/
 String s="yy Time to code in java";
 String ar=new String();
 String[] s1=s.split(" ");
 int i=0;
 int max=0;
 for(String cm:s1){
	 if(cm.length()%2==0&&cm.length()>max){
		 ar=cm;
		 max=cm.length();
	 }
 }
 

/* int ind=0;
 for(int j=0;j<s1.length;j++){
	 if(ar[j].length()>max){
		 ind=j;
		 max=ar[j].length();
	 }
 }*/
 System.out.println(ar);
	}
}
