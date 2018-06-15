package com.hk01;

import java.util.Scanner;

public class BinSearch {

	
	public static int binSearch(int[] a, int n , int key) {
		int pb, pe;
				
		pb = 0; pe = n - 1;
		
		for(int j = 0 ; j < n ; j++) {
			int pc = (pb + pe) / 2 ;
			
			if(a[pc] < key) {
				pb = pc + 1;
			}
			else if(a[pc] > key){
				pe = pc - 1;
			}else {
				return pc;
			}
			for(int i= pb ; i <= pe ; i ++) {
				
				
			}
		}
		
	/*	do {
			int pc = (pb + pe) / 2 ;
			if(a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pb = pc + 1;
			else
				pe = pc - 1;
		}while(pb < pe);*/
		
		return -1;
	}
	
	public static class GenClass<T>{
		private T xyz;
		GenClass(T t){
			this.xyz = t;
		}
		T getXyz() {
			return xyz;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner srint = new Scanner(System.in);
		
		GenClass<String> s = new GenClass<String>("ABC");
		GenClass<Integer> n = new GenClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
		
		System.out.println("index num");
		int num = srint.nextInt();
		int[] x = new int[num];
		
		System.out.println("input number by ascent");
		System.out.println("x[0]");
		x[0] = srint.nextInt();
		
		for( int i = 1 ; i < num ; i++) {
			do {
				System.out.println("X[" + i + "]");
				x[i] = srint.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.println("inupt serach num");
		int ky = srint.nextInt();
		
		int rtn = binSearch(x, num, ky);
		
		if(rtn == -1)
			System.out.println("no such a num");
		else
			System.out.println(ky+ "is x[" + rtn + "]");
		
		
	}

	
}
