package controller;

import java.io.IOException;
import java.util.ArrayList;

import db.ClientDB;
import db.ClientManager;
import db.DoctorDB;
import db.DoctorManager;
import model.CalendarModel;
import model.Client;
import model.Converter;
import model.Doctor;

public class MainController {
	private CalendarModel model;
	private ArrayList<ViewController> views;
	
	public MainController() {
		// TODO Auto-generated constructor stub
		model = new CalendarModel();
		views = new ArrayList<>();
		
		//initiateViews();
		//initializeAppointments();
	}
	
	private void initiateViews() {
		// get info from DB for clients and doctors
		initiateSecretary();
		initiateClient();
		initiateDoctor();
	}
	
	private void initiateSecretary() {
		SecretaryController secretaryController = new SecretaryController(this);
		views.add(secretaryController);
	}
	
	private void initiateClient() {
		ClientManager manager = new ClientManager();
		try {
			ArrayList<ClientDB> list = manager.getAllClients();
			for(int i = 0; i < list.size(); i++) {
				Client client = Converter.toClient(list.get(i));
				ClientController clientController = new ClientController(this, client);
				views.add(clientController);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void initiateDoctor() {
		DoctorManager manager = new DoctorManager();
		try {
			ArrayList<DoctorDB> list = manager.getAllDoctors();
			System.out.println(list.size());
			for(int i = 0; i < list.size(); i++) {
				Doctor doctor = Converter.toDoctor(list.get(i));
				model.addDoctor(doctor);
				DoctorController dc = new DoctorController(this, doctor);
				views.add(dc);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void initializeAppointments() {
		
	}
	
	//called by client or secretary
	public void cancelAppointment() {
		
	}
	
	//called by doctor
	public void deleteAppointment() {
		
	}
	
	//called by client or secretary
	public void setAppointment() {
		
	}
	
	//called by doctor
	public void addAppointment() {
		
	}
}
