package dateandtime;

public class Time {
	private int hour, minute, second ;
	
	public Time() { this(0,0,0) ; }
	public Time(int h, int m, int s) {
		set_time(h,m,s) ;
	}
	
	public void set_hour(int h) { hour = ( (h>=0 && h<24) ? h : 0 ) ; }
	public int get_hour() { return hour ; }
	
	public void set_minute(int m) { minute = ( (m>=0 && m<60) ? m : 0 ) ; }
	public int get_minute() { return minute ; }
	
	public void set_second(int s) { second = ( (s>=0 && s<60) ? s : 0 ) ; }
	public int get_second() { return second ; }
	
	public void set_time(int h, int m, int s) {
		hour = ( (h>=0 && h<24) ? h : 0 ) ;
		minute = ( (m>=0 && m<60) ? m : 0 ) ;
		second = ( (s>=0 && s<60) ? s : 0 ) ;
	}
	
	public String to_military() {
		return String.format("%02d:%02d:%02d", hour, minute, second) ;
	}
	
	public String to_normal_time() {
		return String.format("%d:%02d:%02d %s", (hour==0 || hour==12) ? 12 : hour%12, 
				minute, second, (hour < 12) ? "AM" : "PM") ;
	}
}
