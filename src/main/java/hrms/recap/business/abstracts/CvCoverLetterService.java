package hrms.recap.business.abstracts;

import java.util.List;



import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.CvCoverLetter;


public interface CvCoverLetterService {
	Result add(CvCoverLetter cvCoverLetter);
	Result update(CvCoverLetter cvCoverLetter);
	Result delete(int id);
	DataResult<List<CvCoverLetter>> getAll();
	DataResult<CvCoverLetter> getById(int id);	
	DataResult<List<CvCoverLetter>> getAllByJoBSeekerId(int id);
}
