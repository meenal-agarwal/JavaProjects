package basics;

import java.util.ArrayList;

public class CountData {

	ArrayList<String> arl;

	CountData() {
		arl = new ArrayList<>();
	}

	public void count(int n) {
		arl.add(0,"1");
		for(int i=0; i<n; i++){
			String str = arl.get(i);
			String s = "";
			int j = 0;
			while (j < str.length()) {
				int k = j;
				int counter = 1;
				char c = str.charAt(k);
				while (k<str.length() && c == str.charAt(k)) {
					counter++;
					k++;
				}
				s = s + counter + c;
				j = k;
			}
			arl.add(s);
		}
	}
	
	
	public void attempt2(int x){
		arl.add(0,"1");
		for(int i=0;i<x;i++){
			String num = arl.get(i);
			String str="";
			int count =1;
			for(int j=1;j<num.length();j++){
				
				if(num.charAt(j)==num.charAt(j-1)){
					count++;
				}else{
					str=str+count+num.charAt(j-1);
					count =1;
				}
			}
			str = str + count + num.charAt(num.length()-1);
			System.out.println(str);
			arl.add(i+1,str);
		}
	}
	
	public static void main(String[] args) {
		CountData cd = new CountData();
	//	cd.count(5);
//		System.out.println(cd.arl);
//		System.out.print("The Sequence is: ");
//		for(String ar : cd.arl){
//			System.out.print(ar + "\t");
//		}
		
		
		cd.attempt2(5);
		System.out.println(cd.arl);
	}
}
