package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
	
	String str;
	ArrayList<String> al = new ArrayList<>();
	ArrayList res = new ArrayList();
	
	public void read() throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/meenal/Downloads/Naman/tem"));
		
		while((str = br.readLine())!=null) {
			String parts[] = str.split(",");
			System.out.println("parts " + Arrays.toString(parts));
			String result = parts[parts.length -1];
			al.add(result);
			
			if (!res.contains(result))
				res.add(result);
		}
		
		System.out.println("al size " + al.size());
		System.out.println("res size " + res.size());
	}

	public static void main(String[] args) throws IOException {
		MyArrayList mal = new MyArrayList();
		mal.read();
	}
}
