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
@Table(name="work_types")
public class WorkType {
	@Id
	@Column(name="work_types_id")
	private int id;
	
	@Column(name="work_types_name")
	private String name;
	
	 
}
