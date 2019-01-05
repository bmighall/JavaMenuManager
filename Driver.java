/* 
 * University of Mississippi - CSCI 112
 * Project 2
 * Ben Mighall
 * July 10th, 2016
 */

package project2;

public class Driver {

	public static void main(String[] args) {
	
		//Restaurant 1
		Location loca = new Location("Oxford, MS");
		loca.addRestaurant("Private Peder Peterson's Pancake Pond");
		loca.addRestaurantEntree(0, "Plain Pancakes", "three classic buttermilk pancakes for the boring amongst us", 3.99);
		loca.addRestaurantEntree(0, "Blueberry Pancakes", "three buttermilk pancakes with fresh blueberries", 5.49);
		loca.addRestaurantEntree(0, "Banana Nut Pancakes", "three buttermilk pancakes with bananas and walnuts", 4.99);
		loca.addRestaurantEntree(0, "Strawberry Pancakes", "three buttermilk pancakes with fresh strawberries", 5.49);
		loca.addRestaurantEntree(0, "Bacon Pancakes", "three buttermilk pancakes with maple and bacon cooked inside, for drunk or hungover folks", 5.99);
		loca.addRestaurantEntree(0, "Early Delight Omelette", "omelette with bacon, tomato, onion and cheddar cheese, for those with good taste", 5.99);
		loca.addRestaurantEntree(0, "Healthy Breakfast Plate", "fresh seasonal fruit, yogurt, and granola", 2.99);
		loca.addRestaurantEntree(0, "The Joey Carlisle", "a ridiculous-but-not-actually-funny amount of scrambled eggs with spam and two slices of dry toast", 4.99);
		loca.addRestaurantEntree(0, "French Toast", "three slices of toast that surrendered immediately after war was declared on it", 2.99);
		loca.addRestaurantEntree(0, "Storming The Beach", "bottomless steak and eggs and unlimited buttered toast", 12.99);
		//Restaurant 2
		loca.addRestaurant("Jim Bob's Bacon Shack");
		loca.addRestaurantEntree(1, "Bacon Burger", "two 1/3 pound patties with applewood smoked bacon and Wisconsin cheddar cheese", 7.99);
		loca.addRestaurantEntree(1, "BLT", "applewood smoked bacon, fresh local tomatoes and crisp organic lettuce, served on sourdough with Hellman's mayonnaise", 5.99);
		loca.addRestaurantEntree(1, "Cobb Club", "marinated grilled chicken, applewood smoked bacon, avocado, tomato, romaine, blue cheese and Hellman's mayonnaise, served on sourdough", 6.99);
		loca.addRestaurantEntree(1, "Bacon Pancakes", "three buttermilk pancakes with maple and bacon cooked inside", 6.99);
		loca.addRestaurantEntree(1, "Bacon Omelette", "simple yet awesome omelette with bacon and cheddar cheese", 5.99);
		loca.addRestaurantEntree(1, "Bacon and Cheese Quiche", "bacon and cheese egg bake with homemade crust", 6.99);
		loca.addRestaurantEntree(1, "The Great Egg White North", "egg white omelette with lean Canadian bacon, green pepper, grilled onions and cheddar cheese", 5.99);
		loca.addRestaurantEntree(1, "Bacon Poutine", "fries, gravy, cheese curds and bacon", 7.99);
		loca.addRestaurantEntree(1, "Bacon Chili Cheese Fries", "fries, chili, cheese and bacon", 7.99);
		loca.addRestaurantEntree(1, "Bacon", "we literally just give you a pile of bacon", 6.99);
		//Restaurant 3
		loca.addRestaurant("Gluttonburger");
		loca.addRestaurantEntree(2, "Hamburger", "simple yet delicious 1/3 pound hamburger", 2.99);
		loca.addRestaurantEntree(2, "Cheeseburger", "1/3 pound burger with your choice of genuine Wisconsin cheese", 3.49);
		loca.addRestaurantEntree(2, "Chili Cheeseburger", "1/3 pound burger with genuine Hormel Chili and your choice of genuine Wisconsin cheese", 4.49);
		loca.addRestaurantEntree(2, "Double Cheeseburger", "two 1/3 pound burger patties with Wisconsin cheese", 4.09);
		loca.addRestaurantEntree(2, "Triple Cheeseburger", "three 1/3 pound burger patties with Wisconsin cheese", 7.49);
		loca.addRestaurantEntree(2, "Chili Double Cheeseburger", "two 1/3 pound burger patties with genuine Hormel chili Wisconsin cheese", 6.49);
		loca.addRestaurantEntree(2, "Grilled Chicken Sandwich", "marinated free-range chicken breast, lettuce, tomato, and a slice of Wisconsin cheese", 4.99);
		loca.addRestaurantEntree(2, "Chili Cheese Fries", "freshly hand-cut fries, your choice of melty genuine Wisconsin cheese and genuine Hormel chili", 4.29);
		loca.addRestaurantEntree(2, "You Bouta Get Fat AF", "three 1/3 pound patties, genuine Hormel chili, and your choice of Wisconsin cheese", 8.99);
		loca.addRestaurantEntree(2, "YOU GONNA DIE", "four 1/2 pound patties, bacon, onion rings, drenched in your choice of Wisconsin cheese and served with our special sauce", 12.99);
		//Restaurant 4
		loca.addRestaurant("The 'Tube Gamer Pub and Grill");
		loca.addRestaurantEntree(3, "The WoodysGamertag", "a huge plate of the best damn Carolina BBQ in the multiverse, because money is no object to sellouts", 17.99);
		loca.addRestaurantEntree(3, "The FPSKyle", "Four pounds of lobster, three pounds of crab, and a filet mignon, served with a bottle of vodka and topped with gold flakes", 85.49);
		loca.addRestaurantEntree(3, "The GoldGloveTV", "a massive 36-ounce beef steak with caramelized onions and all the fixin's- for the man who feels the need to overcompensate", 24.99);
		loca.addRestaurantEntree(3, "The WingsofRedemption", "four 1-pound beef patties, drenched in cheddar cheese- he does love cow after all", 25.49);
		loca.addRestaurantEntree(3, "The IIjerIIchoII", "three Chesapeake crab salad sliders and a particularly salty side of french fries, for the man who dies in episode 3", 12.99);
		loca.addRestaurantEntree(3, "The CaptainSparklez", "a 12-inch all-natural pepperoni pizza that will take you to flavortown", 12.99);
		loca.addRestaurantEntree(3, "The MurkaDurkah", "a giant plate of hot wings that will not fix your being cranky about the St. Louis Blues not winning the Stanley Cup", 10.99);
		loca.addRestaurantEntree(3, "The TmarTn", "week-old, hand-battered chicken that makes people sick and is currently facing legal action (because we lied about it being fresh)", 12.99);
		loca.addRestaurantEntree(3, "The HarleyPlays", "a huge bowl of poutine with as much bacon as the owner allowed us to top it with", 12.99);
		loca.addRestaurantEntree(3, "The Sky Williams", "A plate of fresh, delicious rotisserie chicken (and all the fixins) that will sadly never reach platinum in League of Legends", 10.99);
		//Restaurant 5
		loca.addRestaurant("Jim's Sandwich Shop");
		loca.addRestaurantEntree(4, "Tuna", "tuna salad made fresh in-house, served on french bread", 5.99);
		loca.addRestaurantEntree(4, "Reuben", "the classic- sauerkraut, corned beef, Thousand Island dressing, Swiss cheese, served on rye", 5.99);
		loca.addRestaurantEntree(4, "BLT", "Bacon, lettuce, tomato, Hellmann's mayo, sourdough- simple, yet amazing", 4.99);
		loca.addRestaurantEntree(4, "French Dip", "freshly shaved roast beef on french bread, served with your choice of fixins and au jus", 7.99);
		loca.addRestaurantEntree(4, "Po Boy", "Fried crawfish, creole mayo, lettuce, tomato, french bread....heaven", 8.99);
		loca.addRestaurantEntree(4, "Steak sandwich", "Marinated strips of grilled tenderloin, grilled onions and peppers, special sauce, pepper jack, served on sourdough", 9.99);
		loca.addRestaurantEntree(4, "Chicken Salad", "Chicken salad made fresh, lettuce, tomato, served on french bread", 6.99);
		loca.addRestaurantEntree(4, "Turkey Club", "Turkey, mayo, bacon, lettuce, tomato, served on sourdough", 7.99);
		loca.addRestaurantEntree(4, "Crab salad", "Crab salad made fresh in-house, lettuce, tomato, served on french bread", 10.99);
		loca.addRestaurantEntree(4, "Italian sub", "Salami, pepperoni, ham, mayo, peppers, onions, lettuce, tomato, vinagrette", 7.99);
		
		//Greeting
		System.out.println("Hello, and welcome to the restaurant info program.");
		System.out.println("All of the following restaurants are located in: " + loca.getLocationName());
		System.out.println("\n*******************************************************************************************");
		System.out.println("\nHere is the currently stored restaurant information:");
		loca.printRestaurants();
		System.out.println("\n*******************************************************************************************");
		System.out.println("\nEntrees sorted by cost in descending order:");
		loca.sortEntrees();
		loca.printRestaurants();
		System.out.println("\n*******************************************************************************************");
		System.out.println("\nListing each restaurant's entrees under $10 in price:");
		loca.underTen();
		System.out.println("\nThanks for using this program, goodbye!");
		
	}

}
