package framework;

public abstract class ItemCreator {
	
	public Item create() {
		Item item;
		
		//step1
		requestItemsInfo();
		//step2
		item = createItem();
		//step3
		createItemLog();
		
		return item;
	}
	
	//아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청한다.
	abstract protected void requestItemsInfo();
	
	//아이템 생성후 불법복제를 방지하기위해 데이터베이스에 이력을 생성
	abstract protected void createItemLog();
	
	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();	

}
