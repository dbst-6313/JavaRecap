package hrms.recap.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_adverts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvert {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job;
    
    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;
    
    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employer;
	
    
    @Column(name="available_position_count")
    private int availablePositionCount;
    
    @Column(name="max_salary")
    private int maxSalary;
    
    @Column(name="min_salary")
    private int minSalary;
    
    @Column(name="description")
    private String description;
    
    @Column(name="release_date")
    private LocalDate releaseDate = LocalDate.now();
    
    @Column(name="advert_deadline")
    private LocalDate advertDeadline;
    
    @Column(name="is_active")
    private boolean isActive;
}