package collection;

import java.util.*;

public class Sample3 {
	public static void main(String [] args) {
		//set	:순서가 없는 데이터 집합, 데이터의 중복을 허락하지 않는다.
		//set역시 interface 이미로 implements가 된 class로 이용해야 한다.
		//속도가 굉장히 빠름
		//Hash: 되게 빠른 것
		
		HashSet<String> s=new HashSet<String>();
		boolean result;
		s.add("1.apple");
		s.add("2.mango");
		s.add("3.grape");
		s.add("4.orange");
		result=s.add("apple");//기존 중복 데이터가 있어서 데이터가 입력되지 않은 경우 false
		//set은 데이터를 중복을 하지 않기 때문에 14번째 줄에 apple이 있었기 때문에
		
		s.add(null);//toString 되서 표기됨
		s.add("null");//가급적 테이터에 문자 null 입력 하지 말 것! 진짜 null인지 문자 null 알 수 없음
		System.out.println(s);
		System.out.println(result);
		result=s.add("bird");
		System.out.println(result);//새로 데이터가 잘 들어간 경우 true
		
		//set의 for문을 통한 운행, 일반적인 방법으로는 불가능
		//배열로 변경해서 for문으로 출력하는 방법
		String[] array=new String[s.size()];	//set과 동일한 크기의 배열을 준비
		s.toArray(array);//toArray메서드의 매개변수 array
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//List로 변환해서 for문으로 출력하는 방법
		List<String> L=new ArrayList<String>(s);	//생성자를 통해 set데이터를 전달해서 list제작
		System.out.println(L);
		for(int i=0; i<L.size(); i++) {
			System.out.println(L.get(i));
		}
		
		//향상된 for문을 이용하는 방법
		//set데이터도  iterator가 존재하므로 향상된 for문 사용 가능
		for(String str:s) {
			System.out.println(str);
		}
		//iterator를 이용해서 출력하는 방법
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+"---");
		}
	}
}
