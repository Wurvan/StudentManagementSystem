package StudentManagement.System.identity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "firstName", nullable = false)
	private String firstName;
	@Column(name = "secondName")
	private String secondName;
	@Column(name = "email")
	private String email;

	public Student() {
		super();
	}

	public Student(String firstName, String secondName, String email) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
