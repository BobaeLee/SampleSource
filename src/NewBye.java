public class NewBye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bye!");
		try{
		Thread.sleep(10000); // 10s sleep
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Bye again!");
	}

}
