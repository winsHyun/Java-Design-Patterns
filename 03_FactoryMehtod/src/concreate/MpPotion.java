package concreate;

import framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력회복!");
	}

}
