import java.util.*;

class Employee {
	private String name;
	private int level;
	private Employee boss;
	private LinkedList<Employee> members;

	public Employee() {
		this.name = "";
		this.level = -1;
		this.boss = null;
		this.members = new LinkedList<>();
	}
	
	public Employee(String name, int level) {
		this.name = name;
		this.level = level;
		this.boss = null;
		this.members = new LinkedList<>();
	}

	public String getName() { return name; }
	public int getLevel() { return level; }
	public LinkedList<Employee> getMembers() { return members; }
	public Employee getBoss() { return boss; }

	public void setName(String name) { this.name = name; }
	public void setLevel(int level) { this.level = level; }
	public void setBoss(Employee boss) { this.boss = boss; }
}
