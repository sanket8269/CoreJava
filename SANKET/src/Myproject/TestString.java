package Myproject;

public class TestString {
public static void main(String[] args) {
	String s = " I AM GOING TO GOA ";
	System.out.println(s.length());
	System.out.println(s.charAt(3));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.trim());
	System.out.println(s);
	String[]st=s.split(" ");
	for(String ss:st) {
		System.out.println((ss));	
}}}
