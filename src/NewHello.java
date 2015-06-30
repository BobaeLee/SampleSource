public class NewHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		try{
		Thread.sleep(1000); // 1s sleep
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Hello again!");
	}

}
