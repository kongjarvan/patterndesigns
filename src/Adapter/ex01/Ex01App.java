package Adapter.ex01;

import Adapter.lib.Email;

public class Ex01App {
	
	public static void main(String[] args) {
		CustomerService cs = new CustomerService(new Email());
		cs.AcceptClaim("맘에 안들어");		
	}

}
