package samples.aalamir.customcalendar;

import java.util.Date;

public class ConstantUtility {

	public static final String DATE_FORMATE = "dd/MM/yyyy";

	@SuppressWarnings("deprecation")
	public static boolean dateCompare(Date date1,Date date2) {
		if(date1.getDate() == date2.getDate() && date1.getMonth() == date2.getMonth() && date1.getYear() == date2.getYear())
			return true;
		
		return false;
	}
}
