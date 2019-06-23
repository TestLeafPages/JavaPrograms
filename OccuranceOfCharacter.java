package coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class OccuranceOfCharacter extends BaseTestNg{
	String str = "welcome to automation";
	 int count =0;
	@Test(priority=1)
	public void main() {
		char[] char_array =str.toCharArray();
		Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);
			} 
			else{
				charCounter.put(ch, 1);
			}
		}
		System.out.println(charCounter);
	}
	@Test(priority=2)
	public void occuranceOfString() {
		char c = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(c + " occurs " + count + " times in " + str);
	}
	@Test(priority=3)
	public void occurance() {
		 String string=""; 
		 int temp =0;
		Map<Integer,String> map =new LinkedHashMap<Integer,String>();
		for (int i = 0; i < str.length(); i++) {
			map.put(temp, ""+str.charAt(i));
			temp++;
		}
		for (int eachChar : map.keySet()) {
			count=0;
			string =map.get(eachChar);
			for (Integer eachKey : map.keySet()) {
				if (string.equals(map.get(eachKey))) {
					count++;
				}
			}
			System.out.println(map.get(eachChar)+"-->"+count);
		}
	}

}








