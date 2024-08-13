package flowcontrolstatementspack.selectionstatementspack;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		//String foodItem = "pasta";
		//String foodItem = "pizza";
		String foodItem = "noodles";
		//String foodItem = "sandwitch";
		//String foodItem = "donut";
	
		switch(foodItem) {

			case "pizza":
				System.out.println("Here is your Pizza.");
				break;
			case "noodles":
				System.out.println("Here are your noodles.");
				break;
			case "pasta":
				System.out.println("Here is your pasta.");
				break;
			case "sandwitch":
				System.out.println("Here is your sandwitch");
				break;
			default:
				System.out.println("We only serve pizza/pasta/noodles/sandwitch.");

		}
		
////		if(foodItem.equals("pizza")) {
////			System.out.println("Here is your pizza");
////		}else if(foodItem.equals("noodles")) {
////			System.out.println("Here are your noodles");
////		}else if(foodItem.equals("pasta")) {
////			System.out.println("Here is your pasta");
////		}else if(foodItem.equals("sandwitch")) {
////			System.out.println("Here is your sandwitch");
////		}else {
////			System.out.println("We only server pizza/pasta/noodles/sandwitch");
//		}
		
		System.out.println("End of this program.");

	}

}
