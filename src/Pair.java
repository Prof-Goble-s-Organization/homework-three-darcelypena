package hw03;

import java.util.ArrayList;

public class Pair <T, U> {
	
	private T val1;
	private U val2;
	
	public Pair(T val1, U val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public void setFirst(T val) {
		this.val1 = val;
	}
	
	public void setSecond(U val) {
		this.val2 = val2;
	}
	
	public T getFirst() {
		return val1;
	}
	
	public U getSecond() {
		return val2;
	}
	
	public static void main(String[] args) {
		Pair<Integer, Integer> intPair = new Pair<Integer, Integer>(1, 2);
		System.out.println("intPair:");
		System.out.println(intPair.getFirst());
		System.out.println(intPair.getSecond());
		
		Pair<Integer, String> mixPair = new Pair<Integer, String>(1, "hi");
		System.out.println("mixPair:");
		System.out.println(mixPair.getFirst());
		System.out.println(mixPair.getSecond());
		
		Pair<Pair, Pair> pairPair = new Pair<Pair, Pair>(intPair, mixPair);
		System.out.println("pairPair:");
		System.out.println(pairPair.getFirst().getFirst());
		System.out.println(pairPair.getFirst().getSecond());
		System.out.println(pairPair.getSecond().getFirst());
		System.out.println(pairPair.getSecond().getSecond());
	}
	
}
