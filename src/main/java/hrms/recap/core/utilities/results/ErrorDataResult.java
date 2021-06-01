package hrms.recap.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {
	 public ErrorDataResult(T data) {
    	 super(data,true);
     }
     public ErrorDataResult(T data,String message) {
    	 super(data,true,message);
     }
     public ErrorDataResult() {
    	 super(null,false);
     }
}
