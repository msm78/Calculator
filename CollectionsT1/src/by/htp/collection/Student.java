package by.htp.collection;

public class Student {
	private String name;
	private int dateBirth;
	
	public Student(String name, int dateBirth) {
		this.name = name;
		this.dateBirth = dateBirth;
	}
	

	public String getName() {
		return name;
	}



	public int getDateBirth() {
		return dateBirth;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", dateBirth=" + dateBirth + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dateBirth != other.dateBirth)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dateBirth;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	

}
