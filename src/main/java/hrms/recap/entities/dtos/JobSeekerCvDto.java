package hrms.recap.entities.dtos;

import java.util.List;

import hrms.recap.entities.concretes.CvCoverLetter;
import hrms.recap.entities.concretes.Image;
import hrms.recap.entities.concretes.JobExperience;
import hrms.recap.entities.concretes.JobSeeker;
import hrms.recap.entities.concretes.Language;
import hrms.recap.entities.concretes.ProgrammingSkill;
import hrms.recap.entities.concretes.School;
import hrms.recap.entities.concretes.Link;

public class JobSeekerCvDto {

	public JobSeeker jobSeeker;
	public List<Language> languages;
	public List<ProgrammingSkill> programmingSkills;
	public List<Link> Links;
	public List<JobExperience> jobExperiences;
	public List<CvCoverLetter> coverLetters;
	public List<School> schools;
	public Image image;
}
