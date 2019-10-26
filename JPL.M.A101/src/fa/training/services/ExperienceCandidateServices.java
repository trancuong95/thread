package fa.training.services;

import java.util.List;
import java.util.Scanner;

import fa.training.entities.Candidate;
import fa.training.entities.ExperienceCandidate;

/**
 * The Class ExperienceCandidateServices.
 */
public class ExperienceCandidateServices {

	/**
	 * Creates the experience candidate.
	 *
	 * @param scanner the scanner
	 * @param list the list
	 * @return the experience candidate
	 */
	public ExperienceCandidate createExperienceCandidate(Scanner scanner, List<Candidate> list) {
		ExperienceCandidate experienceCandidate = new ExperienceCandidate();
		System.out.println("Enter first name: ");
		String firstName = scanner.nextLine();
		experienceCandidate.setFirstName(firstName);
		System.out.println("Enter last name: ");
		String lastName = scanner.nextLine();
		experienceCandidate.setLastName(lastName);
		System.out.println("Enter address: ");
		String address = scanner.nextLine();
		experienceCandidate.setAddress(address);
		System.out.println("Enter phone: ");
		String phone = scanner.nextLine();
		experienceCandidate.setPhone(phone);
		System.out.println("Enter email: ");
		String email = scanner.nextLine();
		experienceCandidate.setEmail(email);
		System.out.println("Enter birth date: ");
		String birthDate = scanner.nextLine();
		experienceCandidate.setBirthDate(birthDate);
		System.out.println("Enter year's Experience: ");
		double yearsExperience = Double.parseDouble(scanner.nextLine());
		experienceCandidate.setYearsExperience(yearsExperience);
		System.out.println("Professional Skill: ");
		String professionalSkill = scanner.nextLine();
		experienceCandidate.setProfessionalSkill(professionalSkill);
		
		list.add(experienceCandidate);
		return experienceCandidate;
	}
}
