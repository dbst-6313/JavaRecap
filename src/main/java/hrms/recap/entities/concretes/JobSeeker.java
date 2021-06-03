package hrms.recap.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;



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
}
