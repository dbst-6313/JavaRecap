package hrms.recap.entities.concretes;
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
@Table(name="images")
public class Image {
	@Id
	 @Column(name="image_id")
    private int id;
    
    @Column(name="image_url")
    private String url;
    
    @ManyToOne()
	@JoinColumn(name = "jobseeker_id", referencedColumnName = "user_id")
	private JobSeeker jobseeker;
    
}