package core;

import java.util.ArrayList;

import core.scholar.ConnectionFinder;
import dataContainer.Person;

public class PersonManager {
	private ArrayList<Person> proccesslist;
	private ArrayList<Person> persons;
	private String[] email;
	
	public PersonManager(ArrayList<Person> Startpersons, String[] email) {
		this.persons = new ArrayList<Person>();
		this.proccesslist = Startpersons;
		this.email = email;
		while (proccesslist.size() > 0 ){
			proccessList();
		}
		System.out.println("persons found = " + persons.size());
	}
	
	private void proccessList(){
		Person procPerson = null;
		while (proccesslist.size() > 0 ){
			procPerson = proccesslist.get(0);
			proccesslist.remove(0);
			for (Person person: persons){
				if (procPerson.getScholarId().equals(person.getScholarId())){
					return;
				}
			}
			//results.add(new Person("jaap dronkers", "p0ABWjAAAAAJ", "maastrichtuniversity.nl"));
			String address = procPerson.getUniversity();
			for (String mail: email){
				if (address != null && address.equals(mail)){
					System.err.println("results.add(new Person(\""+procPerson.getName()+"\", \""+procPerson.getScholarId()+"\", \""+procPerson.getUniversity()+"\"));");
				}
			}
			//System.err.println("processing "+ procPerson.getName() + " " + procPerson.getScholarId() + " "+ procPerson.getUniversity());
			ArrayList<Person> connections = ConnectionFinder.getPersonsToConnections(procPerson.getScholarId());
			procPerson.addConnection(connections);
			if (persons.size() < 10000)
				for (Person connection: connections){
					//String address = connection.getUniversity();
					//for (String mail: email){
						//if (address != null && address.equals(mail))
						//{
							proccesslist.add(connection);
						//}
					//}
				}
			persons.add(procPerson);
		}
	}

}
