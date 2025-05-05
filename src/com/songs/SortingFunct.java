package com.songs;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class SortingFunct {
	public  void sortbyAlphabet( List<Song> songlist) {
		System.out.println("sorting song Alphabetically");
		
		   Collections.sort(songlist, Comparator.comparing(Song::getName));
		   for (Song song : songlist) {

			   System.out.println(song);

			 }
	 }
	
	  public static void sortByReleaseDate( List<Song> songlist) {
		  System.out.println("Sorting song by release date");
			        Collections.sort(songlist, Comparator.comparing(Song::getReleaseyear));
	
			        // Display sorted songs
			        for (Song song : songlist) {
			            System.out.println(song);
			        }
			    }
}