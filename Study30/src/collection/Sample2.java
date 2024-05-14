package collection;

import java.util.LinkedList;

public class Sample2 {
	public static void main(String [] args) {
		//ArrayList	:배열과 유사한 형태로 구현된 리스트 //ArrayList 기초 //중요 더 많이 사용
		//LinkedList:인근값의 검색에 특화된 리스트
		//			첫값과 끝값을 처리하는데 개발자가 편하다.
		LinkedList LL=new LinkedList();
		LL.add("A");
		LL.add("B");
		LL.add("C");
		LL.add("D");
		LL.add("E");
		
		//링크드리스트에만 가능함
		LL.addFirst("Z");//번호를 할당되지 않았는데 첫번째 값을 연결하는 메서드
		LL.addLast("가");//마지막 값을 연결하는 메서드
		LL.removeFirst();//첫번째 것을 지워줘
		LL.removeLast();
		System.out.println(LL);
	}
}
