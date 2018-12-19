import java.util.Scanner;
import java.util.Random;
public class HowMany 
{

	public static void main(String[] args) 
	{
		Scanner keyboard  = new Scanner(System.in);
		Random rand = new Random();
		int diceroll = 0;
		int onecount = 0;
		int twocount = 0;
		int threecount = 0;
		int fourcount = 0;
		int fivecount = 0;
		int sixcount = 0;
		System.out.print("Enter how many times you will roll the dice: ");
		int rollnum = keyboard.nextInt();
		for (int i = 0; i < rollnum; i++)
		{
			diceroll = rand.nextInt(6) + 1;
			System.out.println(diceroll);
			switch(diceroll)
			{
			diceroll value_1;
			onecount += 1;
			break;
			diceroll value_2;
			twocount += 1;
			break;
			diceroll value_3;
			threecount += 1;
			break;
			diceroll value_4;
			fourcount += 1;
			break;
			diceroll value_5;
			fivecount += 1;
			break;
			diceroll value_6;
			sixcount += 1;
			break;
			default;
			break;
			}
		}
		
	}

}
