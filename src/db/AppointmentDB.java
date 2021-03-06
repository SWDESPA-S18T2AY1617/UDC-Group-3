package db;

public class AppointmentDB {
	
	public static final String TABLE_NAME = "appointment"; 
	public static final String COL_APPOINTMENTID = "appointment_id"; 
	public static final String COL_STARTTIME = "start_time"; 
	public static final String COL_ENDTIME = "end_time"; 
	public static final String COL_DATE = "date"; 
	public static final String COL_TYPE = "type"; 
	public static final String COL_CLIENTID = "client_id"; 
	public static final String COL_DOCTORID = "doctor_id"; 
	
	private int appointment_id;
	private String start_time;
	private String end_time;
	private String date;
	private int client_id;
	private int doctor_id;
	
	public AppointmentDB() { }
	
	//didnt include client id in constructor kasi may possibility na walang client
	//setClient_id n lng if meron
	public AppointmentDB(int appointment_id, String start_time, String end_time, 
					   String date, int doctor_id) {
		super();
		this.appointment_id = appointment_id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.date = date;
		this.doctor_id = doctor_id;
	}

	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

}
