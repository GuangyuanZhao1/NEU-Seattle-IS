import java.util.*;

public class Mreview implements Comparable<Mreview>
{
  // instance variables
  private String title;   // title of the movie
  private ArrayList<Integer> ratings; // list of ratings stored in a Store object

  public Mreview() {
	  this.title = "";
	  this.ratings = new ArrayList<>();
  }
  
  public Mreview(String title) {
	  this.title = title;
	  this.ratings = new ArrayList<>();
  }
  
  public Mreview(String title, int firstRating) {
	  this.title = title;
	  this.ratings = new ArrayList<>();
	  ratings.add(firstRating);
  }
  
  public void addRating(int r) {
	  ratings.add(r);
  }
  
  public double aveRating() {
	  int sum = 0;
	  for(int i = 0; i < ratings.size(); i++) {
		  sum += ratings.get(i);
	  }
	  double ave = (double)sum/ratings.size();
	  return ave;
  }
  
  public int compareTo(Mreview obj) {
	  return this.title.compareTo(obj.title);
  }
  
  public boolean equals(Mreview obj) {
	  return this.title.equals(obj.title);
  }
  
  public String getTitle() {
	  return this.title;
  }
  
  public int numRatings() {
	  return this.ratings.size();
  }
  
  public String toString() {
	  return this.getTitle() + " average " + this.aveRating() + " out of " + this.numRatings() + " ratings.";
  }
  
  public static void main(String[] args) {
		Mreview kb = new Mreview("Kill Bill", 2);
		kb.addRating(3);
		kb.addRating(4);
		kb.addRating(3);
		System.out.println(kb);
		System.out.println(kb.aveRating());
//		Mreview bk = new Mreview("Bill Kill", 5);
//		bk.addRating(3);
//		bk.addRating(4);
//		bk.addRating(3);
//		System.out.println(bk);
//		System.out.println(kb.compareTo(bk));
//		System.out.println(bk.equals(kb));
		
	}
}
