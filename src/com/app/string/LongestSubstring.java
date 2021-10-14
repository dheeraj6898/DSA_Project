package com.app.string;

public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("Dheeraj"));
	}
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int res=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(checkRepetation(s,i,j)) {
					res = Math.max(res,j-i+1);
				}
			}
		}
		return res;
	}
	
	public static boolean checkRepetation(String s,int start,int end) {
		int chars[]=new int[128];
		
		for(int i=start;i<=end;i++) {
			char ch=s.charAt(i);
			chars[ch]++;
			if(chars[ch]>1) {
				return false;
			}
		}
		
		
		return true;
	}
}
