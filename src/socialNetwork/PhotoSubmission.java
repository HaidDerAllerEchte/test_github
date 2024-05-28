package socialNetwork;

public class PhotoSubmission extends Post{

	private String headLine;
	private String picture;
	
	public PhotoSubmission(String username, String headLine, String picture) {
		super();
		this.headLine = headLine;
		this.picture = picture;
	}
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "PhotoSubmission [headLine=" + headLine + ", picture=" + picture + "]";
	}
	
	
	
	
}
