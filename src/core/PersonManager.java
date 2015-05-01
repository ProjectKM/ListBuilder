package core;

import java.util.ArrayList;

import core.scholar.ConnectionFinder;
import dataContainer.Person;

public class PersonManager {
	private ArrayList<Person> proccesslist;
	private ArrayList<Person> persons;
	private String[] email;
	int counter =0;
	
	public PersonManager(ArrayList<Person> persons, String[] email) {
		this.persons = new ArrayList<Person>();
		this.proccesslist = persons;
		this.email = email;
		proccessList();
		System.out.println("connections found = " + counter);
	}
	
	private void proccessList(){
		Person procPerson = null;
		while (proccesslist.size() > 0 ){
			procPerson = proccesslist.get(0);
			proccesslist.remove(0);
			System.err.println("processing "+ procPerson.getName());
			for (Person person: persons){
				if (procPerson.getScholarId().equals(person.getScholarId())){
					return;
				}
			}
			ArrayList<Person> connections = ConnectionFinder.getPersonsToConnections(procPerson.getScholarId());
			procPerson.addConnection(connections);
			if (counter < 1000)
				for (Person connection: connections){
					String address = connection.getUniversity();
					//for (String mail: email){
						//if (address != null && address.equals(mail))
						//{
							proccesslist.add(connection);
							counter++;
						//}
					//}
				}
			persons.add(procPerson);
		}
	}

}
