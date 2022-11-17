package classobject;

class Coin {
	private int value;
	private int count;
	
	Coin() {}
	Coin(int value, int count) {
		this.value = value;
		this.count = count;
	}
	
	int getValue() {return value;}
	int getCount() {return count;}
	void setValue(int value) {this.value = value;}
	void setCount(int count) {this.count = count;}
}

class Purse {
	private String owner;
	private Coin coin[];
	
	Purse() {}
	Purse(String owner, Coin coin[]) {
		this.owner = owner;
		this.coin = coin;
	}
	
	String getOwner() {return owner;}
	Coin[] getCoin() {return coin;}
	void setOwner(String owner) {this.owner = owner;}
	void setCoin(Coin[] coin) {this.coin = coin;}
}


public class Code62 {
	public static void main(String[] args)
	{
		Coin coin1 = new Coin(500, 4);
		Coin coin2 = new Coin(100, 3);
		Coin coin3 = new Coin(50, 6);
		Coin coin4 = new Coin(10, 7);
		
		Coin coin[] = {coin1, coin2, coin3, coin4};
		
		Purse purse = new Purse("Alice", coin);
		
		int total = 0;
		
		System.out.println(purse.getOwner() + " has coin below");
		for (Coin c : purse.getCoin()) {
			System.out.println(c.getValue() + "coin: " + c.getCount());
			total += c.getValue() * c.getCount();
		}
		System.out.println(purse.getOwner() + " has total " + total);
	}
}
