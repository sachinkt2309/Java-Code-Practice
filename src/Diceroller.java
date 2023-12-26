import java.util.*;

public class Diceroller {

	Diceroller(){
		Random random =new Random();
		int number= 0;
		roll(random,number);
		
	}
	void roll(Random random,int number) {
		number=random.nextInt(6)+1;// +1 means start the number with 1 to 6
		System.out.println(number);
	}
}
