package socialNetwork;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Post {
	private String username;
	private LocalDateTime timeStamp;
	private int likes;
	ArrayList<Comments> comments = new ArrayList<>();
	ArrayList<Post> post= new ArrayList<>();
	
	public Post(String username, LocalDateTime timestamp, int likes, ArrayList<Comments> comments) {
		super();
		this.timeStamp = LocalDateTime.now();
		this.likes = likes;
		this.comments = comments;
	}

	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public LocalDateTime getTimestamp() {
		return timeStamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timeStamp = timestamp;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public ArrayList<Comments> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comments> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Post [timestamp=" + timeStamp + ", likes=" + likes + "]";
	}
	
	
	public void addLike(){
		this.likes ++;
	}
	public void removeLike(){
		if(this.likes>0) {
			this.likes --;
		}
		
	}
	
	public long timeStampOfPosts() {
		long timeOfPost = ChronoUnit.MINUTES.between(getTimeStamp(), LocalDateTime.now());
		if(timeOfPost < 60) {
			System.out.println("Wurde vor" + timeOfPost + "Minuten geposted");
		}else if(timeOfPost < 1440) {
			System.out.println("Wurde vor" + (timeOfPost/60) + "Stunden geposted");
		}

	}
	
	
}
