

public class Album {
	public String album;
	public String artist;
	public String genre;
	public int albumID; //can auto gen but might be better not to
	public String[] tracks;
	
	//constructors
	public Album() {
		album = "";
		artist = "";
		genre = "";
		albumID = 0;
	}
	
	public Album(String album, String artist, String genre, int albumID, int numTracks) {
		this.album = album;
		this.artist = artist;
		this.genre = genre;
		this.albumID = albumID;
		tracks = new String[numTracks];
	}
	
	public String getAlbumName() {
		return album;
	}
	public void setAlbumName(String albumName) {
		this.album = albumName;
	}
	
	public String getArtistName() {
		return artist;
	}
	public void setArtistName(String artistName) {
		this.artist = artistName;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getAlbumID() {
		return albumID;
	}
	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}
	
	public String[] getTracks() {
		return tracks;
	}
	public void setTracks(String[] tracks) {
		this.tracks = tracks;
	}
	public String printTracks() {
		String tracklist = "";
		//List to Comma Separated thing neat
		tracklist = String.join(", ", tracks);
		return tracklist;
	}
	
	public void printInfo() {
		System.out.println("Album ID: " + albumID);
		System.out.println("Artist Name: " + album);
		System.out.println("Album Genre: " + genre);
		System.out.println("Album Tracks: " + printTracks());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album positions = new Album("positions", "Ariana Grande", "American Pop", 3435, 2);
		String[] list = {"positions", "34+35"};
		positions.setTracks(list);
		positions.printInfo();

	}

}
