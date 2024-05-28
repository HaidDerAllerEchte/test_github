package socialNetwork;

public class Comments {
	private String comment;
	private String author;
	
	public Comments(String comment, String author) {
		super();
		this.comment = comment;
		this.author = author;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Comments [comment=" + comment + ", author=" + author + "]";
	}
	
	

}
