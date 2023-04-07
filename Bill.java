import java.io.*;
import java.util.*;
import java.lang.*;

class Bill 
{
	static 
	{
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------------");
    	System.out.println("********* WELCOME TO BASKIN ROBBINS ICE CREAM ********* ");
		System.out.println("--------------------------------------------------------");
	}
	public static void main(String args[])throws Exception
	{
	  int rupe[] ={0,100,120,140,160,180,200,220,240,260,280,300,320,340};
	  Scanner sc = new Scanner(System.in);
	  String flavours[] = {"0","Gelato","Kulfi","Sherbet","Sorbet","Frozen Yogurt"
	  ,"Soft Serve","Philadelphia ","Rolled ",
	  "Snow Cream","Italian Ice","Dondurma","Mochi","Vanilla"};
      System.out.printf("%1$-18s %2$10s %3$26s\n", "SNO.", "ITEMS", "PRICE");  
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "1.", "Gelato", "100"); 
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "2.", "Kulfi", "120"); 
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "3.", "Sherbet", "140"); 
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "4.", "Sorbet", "160"); 
	  System.out.printf("%1$-18s %2$10s %3$22s\n", "5.", " Frozen Yogurt", "180"); 
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "6.", "Soft Serve", "200"); 
	  System.out.printf("%1$-18s %2$10s %3$14s\n", "7.", "Philadelphia Ice Cream", "220"); 
	  System.out.printf("%1$-18s %2$10s %3$20s\n", "8.", "Rolled Ice Cream", "240"); 
	  System.out.printf("%1$-18s %2$10s %3$25s\n", "9.", " Snow Cream", "260"); 
	  System.out.printf("%1$-18s %2$10s %3$25s\n", "10.", "Italian Ice", "280"); 
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "11.", "Dondurma", "300"); 
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "12.", "Mochi", "320"); 
	  System.out.printf("%1$-18s %2$10s %3$26s\n", "13.", "Vanilla", "340"); 
	  System.out.println("--------------- Press 0 to end shopping ---------------");
	  System.out.println("--------------------------------------------------------");
	  System.out.println();
      System.out.print("HOW MANY ITEMS U WANT : ");
      int m = sc.nextInt();
	  int n = m+1;
	  int choice[] = new int[m+1];
		int quant[] = new int[n];
	 for(int i=1;i<=m;i++)
	  {
	  System.out.print("WHAT WOULD YOU LIKE TO HAVE? (select numbers 1-13) : ");
	   choice[i] = sc.nextInt();
	  if(choice[i] == 0)
	   {
		   break;
	   }
	   else if(choice[i] > 13)
	   {
		   System.out.println("YOU ENTERED THE WRONG NUMBER");
	   }
	   else
	   {
          System.out.print("ENTER THE QUANTITY : ");
	       quant[i] = sc.nextInt();
		   if(quant[i] == 0)
		   {
			   System.out.println("WRONG SELECTION TRY AGAIN");
			   System.out.print("ENTER THE QUANTITY : ");
	           quant[i] = sc.nextInt();
		   }  			
	   }
	  } 
	System.out.println();System.out.println();System.out.println();
	System.out.print("--------------------------------------------------------\n");
	System.out.printf("%30s","RECEIPT\n");
    System.out.println("--------------------------------------------------------");
	System.out.printf("%1$-38s %2$9s %3$8s"," ITEMS","QTY","PRICE\n\n");
    int sum = 0;
	for(int p=1;p<choice.length;p++)
	{
		if(flavours[choice[p]].length() <= 6)
	    {
		System.out.println(" "+flavours[choice[p]]+"\t\t\t\t\t      "+quant[p]+"\t   "+(quant[p]*rupe[choice[p]]));
	    sum += (quant[p]*rupe[p]);
	    }
		else
		{
		System.out.println(" "+flavours[choice[p]]+"\t\t\t\t      "+quant[p]+"\t   "+(quant[p]*rupe[choice[p]]));
	    sum += (quant[p]*rupe[p]);
		}
			
	}
	
	System.out.println("--------------------------------------------------------");
	System.out.println("--------------------------------------------------------");
    System.out.printf("%1$-49s %2$s", "Sub Total :"," "+sum+"\n");
	System.out.printf("%1$-49s %2$s", "Servise Tax(3%) : "," "+(float)(0.03*sum)+"\n");
	System.out.printf("%1$-50s %2$s", "GST(4%) :",""+(float)(0.04*sum)+"\n");
	System.out.printf("%1$-50s %2$s", "Total Amount :",""+Math.round((float)(0.03*sum)+(float)(0.04*sum)+sum)+"\n");
	System.out.println("--------------------------------------------------------");
	  PrintReceipt pr = new PrintReceipt();
	  pr.details();
	}
}
class PrintReceipt
{
	void details()
	{
		System.out.println("*  *  *  *  *  THANK YOU VISIT AGAIN  *  *  *  *  *  *");
	}
}
