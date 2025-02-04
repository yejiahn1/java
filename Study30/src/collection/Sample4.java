package collection;

import java.util.*;

public class Sample4 {
	public static void main(String [] args) {
		//LinkedHashSet:인접한 데이터간에 링크가 존재하는 방식
		LinkedHashSet LHS=new LinkedHashSet();
		LHS.add("A");
		LHS.add("B");
		LHS.add("C");
		LHS.add("D");
		LHS.add("E");
		LHS.add("E");
		System.out.println(LHS);//순서대로 부여되고 중복데이터는 추출안됨
		
		//TreeSet:데이터를 저장할 때 정렬하여 저장함.옛날 기술임 하드웨어가 발전하다보니 다시 사용하게 됨
		TreeSet TS=new TreeSet();
		TS.add(9); //돔 트리 구조로 데이터 값을 기준으로 정렬하여 데이터 저장 한다 (중복은 안됨)
		TS.add(12);
		TS.add(1);
		TS.add(10);
		System.out.println(TS);
	}
}
