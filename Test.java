class Test {
	public static void main(String [] args) {
		Company c = new Company();
		c.AddEmployee("Kapil","");
		c.AddEmployee("Raj","Kapil");
		c.AddEmployee("Naveen","Kapil");
		c.AddEmployee("Mohit","Naveen");
		c.AddEmployee("Rohit","Naveen");
		c.AddEmployee("Lalit","Naveen");
		c.AddEmployee("Ankit","Lalit");
		c.AddEmployee("Deepak","Raj");
		c.AddEmployee("Ayush","Raj");
		c.AddEmployee("Vinay","Kapil");
		System.out.println(c.LowestCommonBoss("Mohit","Ankit"));
		c.printEmployees();
	}
}
