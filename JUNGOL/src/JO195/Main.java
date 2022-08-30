package JO195;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Member member = new Member(s.next(),s.next(),s.next());
		s.close();
		System.out.println(member);
	}

}

class Member {
	private String name;
	private String tel;
	private String addr;
	
	public Member() {
		
	}
	public Member(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "name : " + name + "\ntel : " + tel + "\naddr : " + addr;
	}

}
