package socialNetwork;

import java.util.ArrayList;

public class NewsFeed{

	ArrayList<Post> post;
	private int likes;
	private long timestamp;
	
	
	
	
	public NewsFeed() {
		this.post = new ArrayList<>();
	}
	
	public ArrayList<Post> getPost() {
		return post;
	}
	public void setPost(ArrayList<Post> post) {
		this.post = post;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "NewsFeed [post=" + post + ", likes=" + likes + ", timestamp=" + timestamp + "]";
	}
	

	public void addPost(Post post){
		if(this.post.contains(post)) {
			this.post.add(post);
		}
	}
	public void removePost(Post post){
		if(this.post.contains(post)) {
			this.post.remove(post);
		}
	}
		public void searchFunction(String username) {
			for(Post p : this.post) {
				if(p.getUsername().equals(username)) {
					System.out.println(p);
			}
		}
	}
		public void outputOfAllPost() {
		for(Post p : this.post) {
			System.out.println(p);
		}
		}
		
		
		}
	

