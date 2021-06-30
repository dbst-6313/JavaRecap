package hrms.recap.entities.concretes;

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

@Data
@Entity
@Table(name="favorites")
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	public int id;
    
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private JobSeeker jobSeeker;
    
    @ManyToOne()
    @JoinColumn(name = "job_advert_id")
    private JobAdvert jobAdvert;
}
