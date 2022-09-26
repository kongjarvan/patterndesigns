package Adapter.ex01;

// 고객 클레임이 들어오면, 
// 사과 이메일 보내기
// 이메일 답장을 DB에 저장하기
public class CustomerService {
	
	private EmailSend email;
	
	public CustomerService(EmailSend email) {
		this.email = email;
	}
	
	public void AcceptClaim(String msg) {
		// 1. 클레임받기
		String acceptMsg = msg;
		System.out.println("클레임 내용: " + acceptMsg);
		// 1. 이메일보내기
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();
		InsertResultEmail(result);
	}
	
	public void InsertResultEmail(String result) {
		System.out.println("답장을 DB에 저장했습니다: "+result);
	}

}
