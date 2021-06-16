package hrms.recap.entities.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import hrms.recap.entities.concretes.CvCoverLetter;
import hrms.recap.entities.concretes.Image;
import hrms.recap.entities.concretes.JobExperience;
import hrms.recap.entities.concretes.JobSeeker;
import hrms.recap.entities.concretes.Language;
import hrms.recap.entities.concretes.Link;
import hrms.recap.entities.concretes.ProgrammingSkill;
import hrms.recap.entities.concretes.School;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDto {
	  @JsonIgnore
	    public JobSeeker jobSeeker;

	    private List<School> schools;
	    private List<JobExperience> jobExperiences;
	    private List<Language> languages;
	    private List<Image> images;
	    private List<Link> links;
	    private List<ProgrammingSkill> programmingSkills;
	    private List<CvCoverLetter> cvCoverLetters;
}
