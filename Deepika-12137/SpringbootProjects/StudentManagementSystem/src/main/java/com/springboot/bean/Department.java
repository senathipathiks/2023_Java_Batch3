package com.springboot.bean;
    import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToMany;
	import jakarta.persistence.Table;
	import java.util.List;
	 
	@Entity
	@Table
	public class Department {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int did;
	    
	    private String dname;
	    
	    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true) // mappedBy refers to the field name in the Student entity
	    private List<Student> students;
	 
	    public Department() {
	        super();
	    }
	 
	    public Department(int did, String dname) {
	        super();
	        this.did = did;
	        this.dname = dname;
	    }
	 
	    // Getters and setters for did and dname
	 
	    public int getDid() {
			return did;
		}

		public void setDid(int did) {
			this.did = did;
		}

		public String getDname() {
			return dname;
		}

		public void setDname(String dname) {
			this.dname = dname;
		}
	 
	    @Override
	    public String toString() {
	        return "Department [did=" + did + ", dname=" + dname + "]";
	    }
	
}
