package feb18.maven.demo.jpa.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book_table {

	@Id
	@Column(name = "ISBN")
	private String ISBN;

	@Column(name = "title")
	private String title;

	@Column(name = "price")
	private double price;

	@ManyToMany(targetEntity = Author_table.class)
	private List author;

	public List getAuthor() {
		return author;
	}

	public void setAuthor(List author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book_table(String iSBN, String title, double price) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
	}

	public Book_table(String iSBN, String title, double price, List author) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public Book_table() {
		super();
	}

}
