package com.songs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SongService {
	Scanner scan = new Scanner( System.in );
	List<Song> songList = new ArrayList<>();
	
	public void AddSong() {
		System.out.print("Enter number of song you wanna add : ");
		int song_num= scan.nextInt();
		
		for ( int i= 1 ; i<= song_num; i++ ) {
			System.out.println( "<<<<<<<<<< "+i + " Enter Song Detais >>>>>>>>>");
			
			System.out.print("1. Enter song name : ");
			String sname = scan.next();
			
			System.out.print("2. Enter singer name :");
			String singer = scan.next();
			
			System.out.print("3. Enter genre : ");
			String genre = scan.next();
			
			System.out.print("4 .Enter language : ");
			String language = scan.next();
	
			System.out.print("5 .Enter country name :");
			String country = scan.next();
			
			System.out.print("6. Enter release year :");
			int releaseYear= scan.nextInt();
;		    songList.add(new Song(sname, singer, genre, language, country, releaseYear));
		}

	}
	
	public void displayAllSong() {
	      for (Song s : songList) {
	    	System.out.println("----------------------");
	        System.out.println("Song Name: " + s.getName());
	        System.out.println("Singer: " + s.getSinger());
	        System.out.println("Genre: " + s.getGenre());
	        System.out.println("Language: " + s.getLanguage());
	        System.out.println("Country: " + s.getCountry());
	        System.out.println("----------------------");
	    }
	}
	
	public void filterSongs() {
		FilterSong fs = new FilterSong();

		System.out.println("---Choose filter operrations---");
		
		System.out.println("1 . Filter by Name " );
        System.out.println("2. Filter by singer: " );
        System.out.println("3.  Filter by Genre: ");
        System.out.println("4. Filter by language: " );
        System.out.println("5. Filter by country: " );
		
		int choices = scan.nextInt();
		
		
		System.out.print("Enter Name value for filteration: ");
		String check_value = scan.next();
		switch( choices) {
		case 1 :
			System.out.println(" filtering by song name ");
			fs.filterBySongName(check_value, songList );
			break;
		case 2 : 
			System.out.println(" Filtering by singer: " );
			
			fs.filterBySinger(check_value, songList );
			break;
		case 3 :
			System.out.println(" Filtering by genre: " );
			
			fs.filterByGenre(check_value, songList );
			break;
		case 4 :
			System.out.println(" Filtering  by language: " );
			
			fs.filterByLanguage(check_value, songList );
			break;
		case 5 :
			System.out.println(" Filtering by country: " );
			
			fs.filterByCountry(check_value, songList );
			break;
		default:
			System.out.println(" !! invalid choices  " );
			return ;
			
		}
		
	}
	
	public void sortSong() {
		SortingFunct sf = new SortingFunct();
		sf.sortbyAlphabet(songList);
		sf.sortByReleaseDate(songList);
	}
	
	
	
	
}
