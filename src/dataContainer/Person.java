/**
 * 
 */
package dataContainer;

import java.util.ArrayList;

/**
 * @author ing. R.J.H.M. Stevens
 *
 */
public class Person {
	
	private int id;
	private String name;
	private String scholarId;
	private String university;
	private boolean expand = false;
	
	private ArrayList<Person> connections;
	/**
	 * 
	 */
	public Person(int id) {
		init();
		this.id = id;
	}
	public Person(int id, String name) {
		init();
		this.id = id;
		setName(name);
	}
	public Person(int id, String name, String scholarId) {
		init();
		this.id = id;
		setName(name);
		setScholarId(scholarId);
	}
	public Person(String name, String scholarId, String university) {
		init();
		setName(name);
		setScholarId(scholarId);
		setUniversity(university);
	}
	private void init(){
		connections = new ArrayList<Person>();
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setScholarId(String scholarId){
		this.scholarId = scholarId; 
	}
	
	public void setUniversity(String university){
		this.university = university; 
	}
	
	public void addConnection(Person connection){
		connections.add(connection);
	}
	public void addConnection(ArrayList<Person> person){
		connections.addAll(person);
	}
	
	/**
	 * @return the expand
	 */
	public boolean isExpand() {
		return expand;
	}
	/**
	 * @param expand the expand to set
	 */
	public void setExpand(boolean expand) {
		this.expand = expand;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the scholarId
	 */
	public String getScholarId() {
		return scholarId;
	}
	/**
	 * @return the university
	 */
	public String getUniversity() {
		return university;
	}
	/**
	 * @return the connections
	 */
	public ArrayList<Person> getConnections() {
		return connections;
	}

}
