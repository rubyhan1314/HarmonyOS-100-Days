package com.cxk.demo06;

import java.util.Map;
import java.util.TreeMap;
/**
 * TreeMap
 * @author hanru
 *
 */
public class Demo30TreeMap {

	public static void main(String[] args) {
		//1.使用TreeMap，Integre作为key
		Map<Integer, String> map1 = new TreeMap<>();
		map1.put(1, "面朝大海，春暖花开");
		map1.put(3, "学IT，先搜程序咖。");
		map1.put(2, "Jerry爱大米");
		System.out.println(map1);
		
		
		map1.put(3, "床前明月光");
		System.out.println(map1);
		
		//2.String作为key
		Map<String, String> map2 = new TreeMap<>();
		map2.put("C", "地上鞋三双");
		map2.put("B", "举头望明月");
		map2.put("A", "疑是地上霜");
		System.out.println(map2);
	}

}
