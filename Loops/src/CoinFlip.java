import java.util.Scanner;
public class CoinFlip
{
static int headsCounter=0;
static int tailsCounter=0;
public static void main(String[] args)
	{
	for(int i=1; i<11; i++)
		{
		int dice1=(int)(Math.random()*2)+1;
		switch (dice1)
			{
			case 1:
				{
				System.out.println(i + ") Heads");
				headsCounter++;
				break;
				}
			default:
				{
				System.out.println(i + ") Tails");
				tailsCounter++;
				}
	
			}
		}
	System.out.println("The coin landed heads " + headsCounter++ + " times");
	System.out.println("The coin landed tails " + tailsCounter++ + " times");
	}
}
