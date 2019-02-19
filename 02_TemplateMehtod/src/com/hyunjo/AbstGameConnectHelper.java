package com.hyunjo;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);	
	protected abstract boolean authentication(String id, String pwd);	
	protected abstract int authorization(String string);	
	protected abstract String connection(String info);
	
	//템플릿 메소드
	public String requestConnection(String encodedInfo) {
		
		//보안작업 -> 암호화된 문자열을 복호화 한다
		String decodedInfo = doSecurity(encodedInfo);
		
		//반환된 것을 가지고 아이디 암호를 할당한다.
		String id = "aaa";
		String pwd = "bbb";
		if(!authentication(id, pwd)) {
			throw new Error("아이디 암호 불일치!");
		}
		
		String userName = "name";
		int i = authorization(userName);
		
		switch(i) {
		case -1:
			throw new Error("셧다운");
		case 0: //게임 매니저
			System.out.println("게임 매니저");
			break;
		case 1: //유료 회원
			System.out.println("유료 회원");
			break;
		case 2: //무료 회원
			System.out.println("무료 회원");
			break;
		case 3: //권한 없음
			System.out.println("권한 없음");
			break;
		default://기타 사황
			System.out.println("기타 사황");
			break;
		}
				
		return connection(decodedInfo);
	}
}
