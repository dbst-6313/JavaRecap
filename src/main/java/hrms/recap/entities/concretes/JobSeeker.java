package hrms.recap.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")
public class JobSeeker {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="id")
	private int id;
	 @Column(name="firstname")
	private String firstName;
	 @Column(name="lastname")
	 private String lastName;
	 @Column(name="identity_number")
	 private String nationalityId;
	 @Column(name="birth_date")
	 private int birthDate;
	 @Column(name="email")
	 private String email;
}
