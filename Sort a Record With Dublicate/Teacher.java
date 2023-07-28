
import java.util.Objects;

public class Teacher implements Comparable<Teacher>{
	int id;
	String name;
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Teacher other = (Teacher) obj;
		return id == other.id;
	}
	public Teacher(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return id+ "\t" + name + "\t" + address + "\n";
	}
	@Override
	public int compareTo(Teacher o) {
		// TODO Auto-generated method stub
		if(id<o.id)
		{
			return 1;
		}
		if(id>o.id)
		{
			return -1;
		}
		else {
			return 0;
		}
	}

}
