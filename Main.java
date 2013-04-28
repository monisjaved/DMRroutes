import java.util.*;

public class Main
{
	public static int search(int k, int i, String b[], String a[][])
	{
		int j=0,col3=0;
		while(j < a[i].length)
		{
			if(a[i][j].equals(b[k]))
			{
				col3=j;
				break;
			}
			j++;
		}
		return col3 ;
	}

	public static void main(String[] args)
	{	
		//main obj=new main();
		//0violet
		//1yellow
		//2orange
		//3blue..dwarka to ncc
		//4blue..vaishali to yamuna bank
		//5green
		//6red
		String[][] a= new String[][]{  {"badarpur","tughlakabad","mohan estate","sarita vihar","jasola apollo","okhla","govind puri","kalkaji mandir","nehru place","kailash colony","moolchand","lajpat nagar","jangpura","jln stadium","khan market","central secretariate"},
				{"huda city centre","iffco chowk","mg road","sikanderpur","guru dronacharya","arjangarh","ghitorni","sultanpur","chhattarpur","qutab minar","saket","malviya nagar","hauz khas","green park","aiims","ina","jor bagh","race course","udyog bhawan","central secretariate","patel chowk","rajiv chowk","new delhi","chawri bazar","chandni chowk","kashmere gate","tis hazari","civil lines","vidhan sabha","vishwavidyalaya","gtb nagar","model town","azadpur","adarsh nagar","jahangir puri"},
			     	{"dwarka sector 21","igi airport","delhi aero city","dhaula kuan","shivaji stadium","new delhi"},
				{"dwarka sector 21","dwarka sector 8","dwarka sector 9","dwarka sector 10","dwarka sector 11","dwarka sector 12","dwarka sector 13","dwarka sector 14","dwarka","dwarka more","nawada","uttam nagar west","uttam nagar east","janakpuri west","janakpuri east","tilak nagar","subhash nagar","tagore garden","rajouri garden","ramesh nagar","moti nagar","kirti nagar","shadipur","patel nagar","rajendra place","karol bagh","jhandewalan","ramakrishna ashram marg","rajiv chowk","barakhamba road","mandi house","pragati maidan","indraprastha","yamuna bank","akshardham","mayur vihar 1","mayur vihar extn.","new ashok nagar","noida sector 15","noida sector 16","noida sector 18","botanical garden","golf course","noida city centre"},
				{"vaishali","kaushambi","anand vihar isbt","karkardooma","preet vihar","nirman vihar","laxmi nagar","yamuna bank"},
				{"mundka","rajdhani park","nangloi railway station","nangloi","surajmal stadium","udyog nagar","peeragarhi","paschim vihar west","paschim vihar east","madipur","shivaji park","punjabi bagh","ashok park main","satguru ram singh marg","kirti nagar"},
				{"rithala","rohini west","rohini east","pitampura","kohat enclave","netaji subhash place","keshav puram","kanhaiya nagar","inderlok","shastri nagar","pratap nagar","pulbangash","tis hazari","kashmere gate","shastri park","seelampur","welcome","shahdara","mansarovar park","jhilmil","dilshad garden"}
			     };
		String[] b={"central secretariate","rajiv chowk","kashmere gate","dwarka sector 21","new delhi","kirti nagar","yamuna bank","ashok park main","inderlok"};
		//System.out.println("a[2][9] = " + a[2][9]);
		//String[] b={"e"};
		//String[][] a={{"a","b","c","d","e","f","g","h","i","j"},{"k","l","m","n","e","p","q","r","s","t"}};
		System.out.println("Enter start & stop stations");
		Scanner s=new Scanner (System.in);
		String start,stop;
		start=s.nextLine();
		stop=s.nextLine();
		start = start.toLowerCase();
		stop = stop.toLowerCase(); 
		int i=0,j,k=0,row1=0,count=1,row2=0,col1=0,col2=0,flag=0,flag1=0;
		for(i=0;i<7;i++)
		{
			j=0;
			while(j < a[i].length)
			{	
				if(a[i][j].equals(start))
				{
					flag=1;
					row1=i;
					col1=j;
					//break;
				}
				if(a[i][j].equals(stop))
				{
					flag1=1;
					row2=i;
					col2=j;
				//	break;
				}
				j++;
			}
		}
					
		if(flag==0 || flag1==0)
			System.out.println("wrong input");
		 

		System.out.println("\n\n\n\nYour route is as follows: ");
//main logic
	if(row1 == row2)
	{
		if(col1 < col2)
		{       col1++;
			while(col1!=col2)
			{
				System.out.println(count+". "+a[row1][col1] + "\t");
				col1++;
				count++;
			}

		}
		else if(col1>col2)
		{       col1--;
			while(col1!=col2)
			{
				System.out.println(count+". "+a[row1][col1] + "\t");
				col1--;
				count++;
			}
		}
		else
			System.out.println("Source And Destination Stations are the same\n");
	}
	else
	{
		if(row1==0)
			k=0;
		else if((row1==3&&row2==4) || (row1==4&&row2==3))
			k=6;
		else if((row1==3&&row2==1) || (row1==1&&row2==3))
			k=1;
		else if((row1==3&&row2==2) || (row1==2&&row2==3))
			k=3;
		else if((row1==3&&row2==5) || (row1==5&&row2==3))
			k=5;
		else if((row1==1&&row2==6) || (row1==6&&row2==1))
			k=2;
		
	
	

		//	col3=15;
		
		int col3=search(k,row1,b,a);
		//int col3=15;
		if(col1 < col3)
		{       col1++;
			while(col1!=col3)
			{
				System.out.println(count+". "+a[row1][col1] + "\t");
				col1++;
				count++;
			}

		}
		else if(col1>col3)
		{       col1--;
			while(col1!=col3)
			{
				System.out.println(count+". "+a[row1][col1] + "\t");
				col1--;
				count++;
			}

		}
		count++;
		System.out.println(count+". "+"Change at "+a[row1][col3]);
		col3=search(k,row2,b,a);
		//col3=19;
			if(col3 < col2)
		{       col3++;
			while(col3!=col2)
			{
				System.out.println(count+". "+a[row2][col3] + "\t");
				col3++;
				count++;
			}

		}
		else if(col3>col2)
		{       col3--;
			while(col3!=col2)
			{
				System.out.println(count+". "+a[row2][col3] + "\t");
				col3--;
				count++;
			}

		}
		count++;
		System.out.println(count+". "+"Get off at "+a[row2][col2]);

			
	}

		 

}
}