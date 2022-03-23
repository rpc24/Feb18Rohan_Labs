package feb18.maven.demo.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

			@Id
			//@GeneratedValue(strategy=GenerationType.AUTO)
			private int author_Id;
			
			private String first_Name;
			private String last_Name;
			private String middle_Name;
			private String phone_no;
			
			
			public int getAuthorId() {
				return author_Id;
			}
			public void setAuthorId(int authorId) {
				this.author_Id = authorId;
			}
			public String getFirstName() {
				return first_Name;
			}
			public void setFirstName(String firstName) {
				this.first_Name = firstName;
			}
			public String getLastName() {
				return last_Name;
			}
			public void setLastName(String lastName) {
				this.last_Name = lastName;
			}
			public String getMiddleName() {
				return middle_Name;
			}
			public void setMiddleName(String middleName) {
				this.middle_Name = middleName;
			}
			public String getPhoneno() {
				return phone_no;
			}
			public void setPhoneno(String phoneno) {
				this.phone_no = phoneno;
			}
			@Override
			public String toString() {
				return "Author [authorId=" + author_Id + ", firstName=" + first_Name + ", lastName=" + last_Name + ", middleName=" + middle_Name  + ", phoneNo=" + phone_no + "]";
			
			
		}}





