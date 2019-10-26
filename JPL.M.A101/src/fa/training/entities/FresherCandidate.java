package fa.training.entities;

/**
 * The Fresher Candidate
 * 
 * @author CuongTV21
 *
 */
public class FresherCandidate extends Candidate {
	private static final long serialVersionUID = 1L;
	private String graduationDate;
	private String graduationRank;
	private String education;

	public FresherCandidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FresherCandidate(String firstName, String lastName, String birthDate, String address, String phone,
			String email, String graduationDate, String graduationRank, String education) {
		super(firstName, lastName, birthDate, address, phone, email);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "FresherCandidate [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
				+ ", education=" + education + ", FirstName=" + getFirstName() + ", LastName=" + getLastName()
				+ ", getBirthDate()=" + getBirthDate() + ", Address=" + getAddress() + ", Phone=" + getPhone()
				+ ", Email=" + getEmail() + "]";
	}

}
