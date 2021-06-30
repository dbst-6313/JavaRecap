package hrms.recap.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_cover_letter")
@NoArgsConstructor
@AllArgsConstructor
public class CvCoverLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobseeker;
	
}
