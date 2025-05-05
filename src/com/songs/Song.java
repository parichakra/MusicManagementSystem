package com.songs;

public class Song {
	String songName;
	String Singer;
	String genre;
	String language;
	String country;
	int releaseYear;
	
	public Song(String songName,String Singer,  String genre, String  language,String country, int releaseYear) {
		this.songName= songName;
		this.Singer= Singer;
		this.genre = genre;
		this.language = language;
		this.country = country;
		this.releaseYear = releaseYear;
	}
	public String getName() {
	    return songName;
	}

	public String getSinger() {
	    return Singer;
	}

	public String getGenre() {
	    return genre;
	}

	public String getLanguage() {
	    return language;
	}

	public String getCountry() {
	    return country;
	}
	
	public int getReleaseyear() {
		return releaseYear;
	}
	
	
	    public String toString() {
	        return songName + " - " + Singer + " - " + genre + " - " + language + " - "+  country + "- " + releaseYear;
	    } 
}