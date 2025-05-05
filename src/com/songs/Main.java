package com.songs;
import java.util.Scanner;

public class Main {
	public static void main ( String [] args) {
		//creating instance of song service 
		SongService s = new SongService();	
		
		Scanner scan = new Scanner( System.in);
		boolean continu = true;
		
		while(continu) {
			System.out.println("Choose any Operations");
			
			System.out.println("1 . Add New Songs " );
	        System.out.println("2. Filter songes: " );
	        System.out.println("3.  Display All Songs: ");
	        System.out.println("4. Sort Song ");
	        System.out.println("5. Exit !!: " );
	        
	        int choose = scan.nextInt();
	        
	        switch(choose) {
	        case 1 :
	        	System.out.println("Adding new song");
	        	s.AddSong();
	        	break;
	        case 2 : 
	        	System.out.println("Filtering song");
	        	s.filterSongs();
	        	break;
	        case 3 :
	        	System.out.println("Displaying all song");
	        	s.displayAllSong();
	        	break;
	        
	        case 4 :
	        	System.out.println("Sorting song ");
	        	s.sortSong();
	        	break;	
	        
	        case 5 :
	        	System.out.println("Exiting!!! ThankYou");
	        	continu = false;
	        	break;
	        default :
	        	System.out.println("invalid Choices !! Choose  betn 1,2,3");
	        	break;
	        }
		}
	
	}

}