
public class Scenerios {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
				
		double costOfMilk = 2.99;
		double moneyInWallet = 25.00;
		int thirstLevel = 5;
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday; 
		boolean willBuyMilk = isHotOutside && thirstLevel >=3 && moneyInWallet >= costOfMilk * 2;
		

	}

}
