package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMap{

	HashMap<String,String> hm;
	
	int a =5;
	Integer b = a;
	
	public void myHashMap(){
		hm = new HashMap<>();
	}
	public void read() throws FileNotFoundException, IOException{
		
		String str;
		BufferedReader br = new BufferedReader(new FileReader("/Users/meenal/Downloads/Naman/tem"));
		String i = "1";
		while((str=br.readLine())!=null){
			String parts[] = str.split(",");
			String result = parts[parts.length-1];
			if (!hm.containsKey(result))
					hm.put(result,i);
			else{
				String n = hm.get(result);
				int nm = Integer.parseInt(n);
				nm++;
				String st = Integer.toString(nm);
				hm.put(result,st);
			}			
		}
		//read Map
		br.close();
	}
	
	public void writeit(){
		
		Set s = hm.entrySet();
		Iterator ite = s.iterator();
		while(ite.hasNext()){
			Map.Entry me = (Map.Entry)ite.next();
//			String key = me.getKey();
//			String val = me.getValue();
			System.out.println(me.getKey() + ":" + me.getValue());
		}
	}
	
	public static void main(String[] args) throws Exception {
		MyHashMap  mp = new MyHashMap();
		mp.read();
		mp.writeit();
	}
}
