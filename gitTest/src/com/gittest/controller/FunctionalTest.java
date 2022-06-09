package com.gittest.controller;

public class FunctionalTest {

		public void printTest() {
			String name="test"; //ctrl + s, 저장한다고 해서 곧바로 git에 의해 관리가 되는 건 아님! commit을 해야만 함!
			//그저 modifed상태로서, unstaged changes임을 확인할 수 있다 -
		}
	
		public String getGoodee() {
			return "goodee";
		}
		public void conflict() {
			System.out.println("충돌충돌!");
		}
}
