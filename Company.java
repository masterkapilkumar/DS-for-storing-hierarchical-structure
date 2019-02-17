import java.util.*;

class Company {
	
	Employee ceo;
	ArrayList<ArrayList<LinkedList<Employee> > > levels;

	public Company() {
		ceo = null;
		levels = new ArrayList<>();
		levels.add(new ArrayList<>());
	}
	
	private Employee SearchEmployee(String name) {
		if(ceo.getName()==name)
			return ceo;
		else {
			for(int i=2; i<levels.size(); i++) {
				ArrayList<LinkedList<Employee> > leveli = levels.get(i);
				for(int j=0; j<leveli.size(); j++) {
					LinkedList<Employee> members = leveli.get(j);
					ListIterator iter = members.listIterator(0);
					while(iter.hasNext()){ 
						Employee e1 = (Employee) iter.next();
						if(e1.getName() == name) {
							return e1;
						}
					}
				}
			}
		}
		return null;
	}

	public void AddEmployee(String E, String E1) {
		
		if(ceo==null) {
			if(E1=="") {
				ceo = new Employee(E, 1);
				levels.add(new ArrayList<>());
				return;
			}
			else
				throw new NoSuchElementException("No CEO exists in the company.");
		}
		else if(E1=="")
			throw new IllegalArgumentException("Boss can't be empty");
		
		Employee foundE1 = SearchEmployee(E1);
		
		if(foundE1 == null) {
			throw new NoSuchElementException("No employee "+E1+" in the company.");
		}
		
		int newLevel = foundE1.getLevel()+1;
		Employee e = new Employee(E, newLevel);
		e.setBoss(foundE1);
		LinkedList<Employee> members = foundE1.getMembers();
		if(members.size()==0) {
			if(newLevel>=levels.size())
				levels.add(new ArrayList<>());
			levels.get(newLevel).add(members);
		}
		members.add(e);
	}

	public void DeleteEmployee(String E, String E1) {
		
		
	}

	public String LowestCommonBoss(String E, String E1) {
		
		return "";
	}

	public void printEmployees() {
		System.out.println(ceo.getName());
		for(int i=2; i<levels.size(); i++) {
			ArrayList<LinkedList<Employee> > leveli = levels.get(i);
			for(int j=0; j<leveli.size(); j++) {
				LinkedList<Employee> members = leveli.get(j);
				ListIterator iter = members.listIterator(0);
				while(iter.hasNext()){ 
					Employee e1 = (Employee) iter.next();
					System.out.print(e1.getName()+"-"+e1.getLevel()+",  ");
				}
			}
			System.out.println();
		}
	}
}
