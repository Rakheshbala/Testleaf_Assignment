package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("sendMessage");
	}
	public void shareDocument() {
		System.out.println("shareDocument");
	}
	public void call() {
		System.out.println("call");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile option=new Mobile();
		option.sendMessage();
		option.shareDocument();
		option.call();
	}

}
