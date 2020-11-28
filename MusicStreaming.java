import java.util.*;
import java.util.Map.Entry;
public class MusicStreaming { //
	private String serviceName;
	private HashMap<Integer, Listener> accounts;
	
	//creates a new MusicStreaming service
	public MusicStreaming() {
		setServiceName("N/A");
		setAccounts(new HashMap<Integer, Listener>());
	}
	public MusicStreaming(String name) {
		setServiceName(name);
		setAccounts(new HashMap<Integer, Listener>());
	}
	
	
	
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public HashMap<Integer, Listener> getAccounts() {
		return accounts;
	}
	public void setAccounts(HashMap<Integer, Listener> accounts) {
		this.accounts = accounts;
	}
	
	//adding and removing accounts to the service
	
	//adds new listener
	public void addNewAccount(int accountID, Listener listener) {
		accounts.put(accountID, listener);
	}
	//adds new artist
	public void addNewAccount(int accountID, Artist artist) {
		accounts.put(accountID, artist);
	}
	public void removeAccount(int accountID) {
		accounts.remove(accountID);
	}
	
	//PrintInfo for test
	public void printInfo() {
		for (Entry<Integer, Listener> entry : accounts.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicStreaming spotify = new MusicStreaming("Spotify");
		Listener michael = new Listener("Michael");
		spotify.addNewAccount(michael.id, michael);
		Artist ariana = new Artist("Ariana Grande");
		spotify.addNewAccount(ariana.id, ariana);
		//spotify.printInfo();
		
		Album positions = new Album("positions", "Ariana Grande", "American Pop", 3435, 2);
		String[] list = {"positions", "34+35"};
		positions.setTracks(list);
		//positions.printInfo();
		
		ariana.addToCatalogue(positions);
		
		Album thankYou = new Album("thank u, next", "Ariana Grande", "American Pop", 1123, 3);
		String[] thank = {"imagine", "7 rings", "thank u, next"};
		thankYou.setTracks(thank);
		
		ariana.addToCatalogue(thankYou);
		
		ariana.addFollower(michael);
		
		Playlist meow = new Playlist(1, "current favs", "stuff i am into right now");
		 
		ariana.addNewPlaylist(meow);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to: ");
		
		System.out.println("\t 1. Create a new playlist");
		System.out.println("\t 2. Add a new album to your profile");
		
		int next = input.nextInt();
		
		if (next == 1) {
			System.out.println("What would you like the Playlist to be called?");
			String nameOfPlaylist = input.next();
			System.out.println("What do you want as the description of the playlist?");
			input.nextLine();
			String descriptionOfPlaylist = input.nextLine();
			System.out.println("What should the ID number of the playlist be?");
			int playlistID = input.nextInt();
			Playlist test = new Playlist(playlistID, nameOfPlaylist, descriptionOfPlaylist);
			ariana.addNewPlaylist(test);
			
			System.out.println("Would you like to add songs to the playlist? Input Y/N");
			if (input.next().charAt(0) == 'Y') {
				int yes = 0;
				while (yes == 0) {
					
				}
				
				System.out.println("Please enter the name of the song.");
				String song = input.next();
				test.addSong(song);
			}
			else if (input.next().charAt(0) == 'N') {
				System.out.println("Would you like the remove a song? Input Y/N");
				if(input.next().charAt(0) == 'Y') {
					System.out.println("Please enter the name of the song you wuld like to remove.");
					String song = input.next();
					test.removeSong(song);
				}
				else if (input.next().charAt(0) == 'N') {
					System.out.println("End");
				}
				else {
					System.out.println("Error, you did not input a Y or N, please restart.");
				}
			}
			else {
				System.out.println("Error, you did not input a Y or N, please restart.");
			}
			
			test.printInfo();
			
			
			
		}
		else if (next == 2) {
			System.out.println("What is the name of the album?");
			String name = input.nextLine();
			input.next();
			System.out.println("Who is the artist?");
			String artist = input.nextLine();
			input.next();
			System.out.println("What genre is the album?");
			String genre = input.nextLine();
			input.next();
			System.out.println("What is the album ID?");
			int albumID = input.nextInt();
			System.out.println("How many tracks are on the album?");
			int trackCount = input.nextInt();
			
			Album test = new Album(name, artist, genre, albumID, trackCount);
			ariana.addToCatalogue(test);
			
		}
		else
			System.out.println("Error");
		
		
		
		
		
		input.close();
		
		
		
		
		

	}
	
}
