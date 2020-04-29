package TechnicaltestJava;

public class TimeDuration {
	/**
	 *  argument of the number of seconds
	 */
	int nbrSeconds;

	
	/**
	 * @param nbrSeconds
	 *  constructor taking as argument a number of seconds as an int
	 * @throws BadBadValueException 
	 */
	public TimeDuration(int nbrSeconds) throws BadBadValueException {
		super();
		this.nbrSeconds = nbrSeconds;
		ResultInHours(nbrSeconds);
	}
	
	/**
	 * @param totalSecs
	 * @return 
	 *  method displaying the result under the format {hours}h {minutes}m {seconds}s
	 */
	public String ResultInHours (int totalSecs) throws BadBadValueException{
		String result = null;
		int hours = totalSecs / 3600;
		int minutes = (totalSecs % 3600) / 60;
		int seconds = totalSecs % 60;
		if(totalSecs <0) {
			 throw new BadBadValueException("Inserted number is negative, It needs to be positive !");
		}else if(totalSecs == 0) {
			result ="0s";
		}else if(totalSecs > 0 && totalSecs <= 999 ){
			result =  String.format("%02dm %02ds",minutes, seconds);
		}else if(totalSecs > 999 ) {
			result = String.format("%02dh %02dm %02ds", hours, minutes, seconds);
		}
		return result;
	}

}
