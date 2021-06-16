package hrms.recap.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="work_times")
public class WorkTime {
	@Id
	@Column(name="work_times_id")
	private int id;
	
	@Column(name="work_times_name")
	private String name;
	
}
