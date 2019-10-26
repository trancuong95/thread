package fa.training.entities;

/**
 * The Class Experience Candidate
 * 
 * @author CuongTV21
 *
 */
public class ExperienceCandidate extends Candidate {

	private static final long serialVersionUID = 1L;
	private double yearsExperience;
	private String professionalSkill;

	public ExperienceCandidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExperienceCandidate(String firstName, String lastName, String birthDate, String address, String phone,
			String email, double yearsExperience, String professionalSkill) {
		super(firstName, lastName, birthDate, address, phone, email);
		this.yearsExperience = yearsExperience;
		this.professionalSkill = professionalSkill;
	}

	public double getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(double yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	public String getProfessionalSkill() {
		return professionalSkill;
	}

	public void setProfessionalSkill(String professionalSkill) {
		this.professionalSkill = professionalSkill;
	}

	@Override
	public String toString() {
		return "ExperienceCandidate [yearsExperience=" + yearsExperience + ", professionalSkill=" + professionalSkill
				+ ", FirstName=" + getFirstName() + ", LastName=" + getLastName() + ", BirthDate="
				+ getBirthDate() + ", Address=" + getAddress() + ", Phone=" + getPhone() + ", Email="
				+ getEmail() + "]";
	}

}
