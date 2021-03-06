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
@Table(name = "employers")
@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User{

	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_website")
	private String webAdress;
	
	@Column(name="phone")
	private String phoneNumber;
	
	@Column(name="is_verified")
	private boolean isVerified;

	@Transient
	private String passwordCheck;
   
}
