package hrms.recap.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_titles")
public class JobPositions {
	 @Id
	 @GeneratedValue
	 @Column(name="id")
	private int id;
	 @Column(name="title")
	private String title;
	
	 public JobPositions() {}
	 public JobPositions(int id,String title) {
		 super();
		 this.id = id;
		 this.title = title;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public int getId(){
		 return this.id;
	 }
	 public void setTitle(String title) {
		 this.title  = title;
	 }
	 public String getTitle() {
		 return this.title;
	 }
}
