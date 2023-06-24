package Mathi.Examples;

import java.util.ArrayList;

import com.sun.tools.javac.code.Attribute.Array;

public class gitHubExercise1 {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		Integer count = 0;
		String[] splitText;
		ArrayList<String> splitTextWithoutDuplicate = new ArrayList<String>();
		
		
		splitText = text.split(" ");	
		count = splitText.length;
		System.out.println("Count is "+ count);
				
		for (String splitWords: splitText) {
			System.out.println(splitWords);
		}
		
		for(int i=0; i<splitText.length;i++) {
			System.out.println(i + " - " + splitText[i].toString());
			
			if(!splitTextWithoutDuplicate.contains(splitText[i].toString())){
				splitTextWithoutDuplicate.add(splitText[i].toString());
			}
			
		}
		
		count = splitTextWithoutDuplicate.size();
		System.out.println("Count is "+ count);
		
		for (String splitWords: splitTextWithoutDuplicate) {
			System.out.println(splitWords);
		}
		
		

	}

}
