package com.evergent.corejava.Strings1;

import java.util.Arrays;

public class StringSamples {
	public static void main(String args[]) {
		String a;
		String b;
		System.out.println('a'+'b');
		System.out.println('a'+3);
		System.out.println('a'+'b');
		System.out.println((char)('a'+3));
		System.out.println("a"+"b");
		String series=" ";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series=series+ch;
		}
		System.out.println(series);
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
			System.out.println(ch);
		}
		String name="Java Technologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('+'));
		System.out.println("     JAVA     ".strip());
				

		
	}
	

}
