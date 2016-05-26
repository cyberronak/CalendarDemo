package samples.aalamir.customcalendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalendarData {
	
	public static List<CalendarData> events= new ArrayList<CalendarData>();
	
	private String eventId;
	private String eventTitle;
	private String eventType;
	private String eventDesc;
	private Date eventDate;
	
//	public List<CalendarData> getEvents() {
//		return events;
//	}
//	public void addEvents(CalendarData eventObj) {
//		events.add(eventObj);
//	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
}
