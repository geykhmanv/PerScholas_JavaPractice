package com.perscholas.java_basics;
import java.util.*;
public class ArrayDemo {

		public static void prompt1() {
			int[] array = {1, 2, 3};
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}//for
		}//prompt1
		
		public static void prompt2() {
			int[] array = {13, 5, 7, 68, 2};
			System.out.println(array[2]);
		}//prompt2
		
		public static void prompt3() {
			String[] array = {"red", "green", "blue", "yellow"};
			System.out.println(array.length);
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}//for
			String[] arrayCopy = array.clone();
			for(int i = 0; i < arrayCopy.length; i++) {
				System.out.println(arrayCopy[i]);
			}//for
		}//prompt3
		
		public static void prompt4() {
			int[] array = {1, 2, 3, 4, 5};
			System.out.println(array[0]);
			System.out.println(array[array.length-1]);
		}//prompt4
		
		public static void prompt5() {
			int[] array = new int[5];
			for(int i = 0; i < array.length; i++) {
				System.out.println(i);
			}//for
		}//prompt5
		
		
		public static void prompt6() {
			int[] array = {1, 2, 3, 4, 5};
			for(int i = 0; i < array.length; i++) {
				array[i] = i*2;
				System.out.println(array[i]);
			}//for
		}//prompt6
		
		public static void prompt7() {
			int[] array = {1, 2, 3, 4, 5};
			for(int i = 0; i < array.length; i++) {
				if(i == 2) {
					continue;
				}//if
				else {System.out.println(array[i]);}
			}//for
		}//prompt7
		
		public static void prompt8() {
			String[] array = {"one", "two", "three", "four", "five"};
			String x = array[0];
			array[0] = array[2];
			array[2] = x;
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}//for
		}//prompt8
		
		public static void prompt9() {
			int[] array = {4, 2, 9, 13, 1, 0};
			int temp = 0;
			
			for(int i = 0; i < array.length; i++) {
				for(int j = i+1; j < array.length; j++) {
					if(array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}//if
				}//for(int j = 0; j < array.length; j++)
				System.out.println(array[i]);
			}//for(int i = 0; i < array.length; i++) 
			System.out.println("Smallest number is: " + array[0]);
			System.out.println("Biggest number is: " + array[5]);
		}//prompt9
		
		public static void prompt10() {
			//Object[] array = new Object[] {"string1", new Integer(5), "string2", "string3", new Double(10.45)};
			Object[] array = new Object[] {"string1", "string2", "string3", new Integer(5), new Double(10.45)};
			System.out.println(Arrays.toString(array));
		}//prompt10
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//prompt1();
			//prompt2();
			//prompt3();
			//prompt4();
			//prompt5();
			//prompt6();
			//prompt7();
			//prompt8();
			//prompt9();
			//prompt10();
			
		}//public static void main(String[] args)

}//ArrayDemo
