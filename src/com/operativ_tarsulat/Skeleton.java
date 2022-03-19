package com.operativ_tarsulat;
import java.util.Scanner;

public class Skeleton {

	public static int AskQuestion(String question, String[] options) {
		System.out.print(question+"\t");
		int i = 0;
		for(String option : options) {
			System.out.print(i+" "+option);
			i++;
		}
		try(Scanner scan = new Scanner(System.in)){
			while(true) {
				int num = scan.nextInt();
				if(num<options.length&&num>=0) {
					return num;
				}
			}
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
