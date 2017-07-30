package collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	String str;
	int counter = 0;
	int s;
	HashSet<String> hs ;
	
	public MyHashSet(){
		hs = new HashSet<>();
	}
	

	
	public void read() throws FileNotFoundException, IOException {

		BufferedReader br = new BufferedReader(new FileReader("/Users/meenal/Downloads/Naman/tem"));
		while ((str = br.readLine())!=null) {
			counter++;
			String parts[] = str.split(",");
//			System.out.println("parts " + Arrays.toString(parts));
			String result = parts[parts.length -1];
//			System.out.println("res " + result);

			hs.add(result);
//			s = hs.hashCode();
//			System.out.println(s);			
//			System.out.println(hs);
		}

		s = hs.size();
		System.out.println(counter + " " + s);
		br.close();
	}
	
	
	

//	public void readIt(){
//		FileOutputStream out = new FileOutputStream("/Users/meenal/Downloads/Naman/tem");
//		Iterator ite = hs.iterator();
//		while(ite.hasNext()){
//			System.out.println("Value ite : " + ite.next());
//			Object obj = ite.next();
//			byte b = obj.byteValue();
//			out.write(b);
//		}
//		out.close();
//	}
	
	
	public void writeit() throws Exception{
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("/Users/meenal/Downloads/Naman/tem1"));
		
		for(String str: hs){
			
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {

		MyHashSet md = new MyHashSet();
		md.read();
		md.writeit();
//		List<String> al = new ArrayList<String>();
//		al.add()
	}
	
	/**
	 * 1. Count the number of unique users using set.
	 * 2. Implement the above functionality by ArrayList. Take care to enter only unique values.
	 * 3. Read the set and list and write into file.
	 * 4. Count the number of entries for each user. Use HashMap
	 */
}

