package hrms.recap.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_experiences")
public class JobExperience {
       
	@Id
	@Column(name="job_experience_id")
	private int id;
	@Column(name="company_name")
	private String companyName;
	@Column(name="start_date")
	private LocalDate startDate = LocalDate.now();
	@Column(name="end_date" ,nullable=true)
	private LocalDate endDate;
	@Column(name="position")
	private String position;
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobseeker;
}
