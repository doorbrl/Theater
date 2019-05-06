package sqlTest;

import java.util.List;

public class GoMethodMillion{
	public static void main(String[] args) {
		DaoMillion daoMillion = new DaoMillion();
		List<DtoMillion> sd = daoMillion.findAll();

		for(DtoMillion dM: sd) {
			System.out.println("No." +(dM.getId()));
			System.out.println("名前：" +(dM.getName()));
			System.out.println("年齢："+(dM.getYear()));
			System.out.println("出身："+(dM.getFrom()));
			System.out.println("利き手："+(dM.getHand()));
			System.out.println("誕生日："+(dM.getBirthday()));
			System.out.println("血液型："+(dM.getBlood()));
			System.out.println("属性："+(dM.getAttribute()));
			System.out.println("SSR1枚目:あり");
			if( dM.getSsr_fes() == 1) {
				System.out.println("フェス限SSR：あり");
			}else {
				System.out.println("フェス限SSR：これから");
			}
			if(dM.getMainstory_1() == 1) {
				System.out.println("メインコミュ：あり");
			}else {
				System.out.println("メインコミュ：これから");
			}
			if(dM.getId() == 29) {
				System.out.println("-------------------ζﾉ ･ิᴗ･ิ)-------------------" );
			}else {
				System.out.println("---------------------------------------");
			}
		}
	}
}