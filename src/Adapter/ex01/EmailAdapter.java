package Adapter.ex01;

// 가짜객체
public class EmailAdapter implements EmailSend {

	@Override
	public String send() {
		
		return "고맙습니다.";
	}

}
