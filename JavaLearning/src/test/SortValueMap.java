package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortValueMap {

	Map<String, Integer> grp;	

	public SortValueMap(){
		this.grp = new HashMap<>();
	}

	public void initialize() {
		grp.put("Animesh", 10);
		grp.put("Bobby", 10);
		grp.put("Anu", 12);
		grp.put("ijay", 10);
		grp.put("naina", 16);
		grp.put("heena", 15);
		grp.put("cersie", 4);
		System.out.println(grp);
	}

	public List<String> getSortedKeys() {
		List<String> keys = new ArrayList<>(grp.keySet());
		Collections.sort(keys);
		return keys;
	}

	public List<Integer> getSortedValues() {
		List<Integer> val = new ArrayList<>(grp.values());
		Collections.sort(val);
		return val;
	}

	public Map<String,Integer> sortMap(){
		Map<String, Integer> res = new LinkedHashMap<>();
		List<Integer> sortedValues = getSortedValues();
		List<String> sortedKeys = getSortedKeys();
		for(Integer i : sortedValues){
			for(String str : sortedKeys){
				if((grp.get(str)) == i){
					sortedKeys.remove(str);
					res.put(str, i);
					break;
				}
			}
		}
	return res;	
	}

	public static void main(String[] args) {
		SortValueMap srtmap = new SortValueMap();
		srtmap.initialize();
		System.out.println("Keys in List: "+srtmap.getSortedKeys());
		System.out.println("Vales in list: "+srtmap.getSortedValues());
		System.out.print("Sorted Map: "+srtmap.sortMap());
	}
}
