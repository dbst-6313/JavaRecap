package hrms.recap.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "job_seekers")
@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor

public class JobSeeker extends User{
   
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_date")
	private int birthDate;

    @Transient
	private String passwordCheck;
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<School> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ProgrammingSkill> programingSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<Link> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<Language> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<JobExperience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<CvCoverLetter> coverLetters;	

	@JsonIgnore
	@OneToOne(mappedBy = "jobseeker")
	private Image image;
}
