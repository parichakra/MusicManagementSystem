package com.songs;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FilterSong {
	Scanner sc = new Scanner( System.in);
	public  void filterBySongName(String value, List<Song> songlist) {

	     for(Song s: songlist) {
	      	if(s.getName().equalsIgnoreCase(value)) {
	      		System.out.println("Song Name: " + s.getName());
	      		System.out.println("Singer: " + s.getSinger());
	            System.out.println("Genre: " + s.getGenre());
	            System.out.println("Language: " + s.getLanguage());
	            System.out.println("Country: " + s.getCountry());
	            System.out.println("----------------------");
	      	}
	      }
	}
	
	public  void filterBySinger(String value, List<Song> songlist) {

	     for(Song s: songlist) {
	      	if(s.getSinger().equalsIgnoreCase(value)) {
	      		System.out.println("Song Name: " + s.getName());
	      		System.out.println("Singer: " + s.getSinger());
	            System.out.println("Genre: " + s.getGenre());
	            System.out.println("Language: " + s.getLanguage());
	            System.out.println("Country: " + s.getCountry());
	            System.out.println("----------------------");
	      	}
	      }
	}
	
	public  void filterByGenre(String value, List<Song> songlist) {

	     for(Song s: songlist) {
	      	if(s.getGenre().equalsIgnoreCase(value)) {
	      		System.out.println("Song Name: " + s.getName());
	      		System.out.println("Singer: " + s.getSinger());
	            System.out.println("Genre: " + s.getGenre());
	            System.out.println("Language: " + s.getLanguage());
	            System.out.println("Country: " + s.getCountry());
	            System.out.println("----------------------");
	      	}
	      }
	}
	
	public  void filterByLanguage(String value, List<Song> songlist) {

	     for(Song s: songlist) {
	      	if(s.getLanguage().equalsIgnoreCase(value)) {
	      		System.out.println("Song Name: " + s.getName());
	      		System.out.println("Singer: " + s.getSinger());
	            System.out.println("Genre: " + s.getGenre());
	            System.out.println("Language: " + s.getLanguage());
	            System.out.println("Country: " + s.getCountry());
	            System.out.println("----------------------");
	      	}
	      }
	}
	
	public  void filterByCountry(String value, List<Song> songlist) {

	     for(Song s: songlist) {
	      	if(s.getCountry().equalsIgnoreCase(value)) {
	      		System.out.println("Song Name: " + s.getName());
	      		System.out.println("Singer: " + s.getSinger());
	            System.out.println("Genre: " + s.getGenre());
	            System.out.println("Language: " + s.getLanguage());
	            System.out.println("Country: " + s.getCountry());
	            System.out.println("----------------------");
	      	}
	      }
	}
	
	
	
	
	
	
	
	
	
	
	
}