package strategy_00;

/**
 * xxxxxx 관한 클래스를 정의한다.
 * @author hyunjo
 * @since 2019. 1. 31. 
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일             수정자            수정내용
 *  -------       --------    ---------------------------
 *  2019.01.31    hyunjo   최초 생성
 *   
 * </pre>
 */
public class Main {

	public static void main(String[] args) {
		Ainterface ainterface = new AinterfaceImpl();
		
		//통로
		ainterface.funcA();
		
		AObj aObj = new AObj();
		aObj.funcAA();
		
		GameCharacter character = new GameCharacter();
		character.attac();
		
		character.setWeapon(new Knife());
		character.attac();
		
		character.setWeapon(new Sword());
		character.attac();
		
		character.setWeapon(new Ax());
		character.attac();
		
	}
}
