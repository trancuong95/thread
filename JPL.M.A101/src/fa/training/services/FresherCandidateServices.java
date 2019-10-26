package fa.training.services;

import java.util.List;
import java.util.Scanner;

import fa.training.entities.Candidate;
import fa.training.entities.FresherCandidate;

/**
 * The Class FresherCandidateServices.
 */
public class FresherCandidateServices {

	/**
	 * Creates the fresher candidate.
	 *
	 * @param scanner the scanner
	 * @param list the list
	 * @return the fresher candidate
	 */
	public FresherCandidate createFresherCandidate(Scanner scanner, List<Candidate> list) {
		FresherCandidate fresherCandidate = new FresherCandidate();
		System.out.println("Enter first name: ");
		String firstName = scanner.nextLine();
		fresherCandidate.setFirstName(firstName);
		System.out.println("Enter last name: ");
		String lastName = scanner.nextLine();
		fresherCandidate.setLastName(lastName);
		System.out.println("Enter address: ");
		String address = scanner.nextLine();
		fresherCandidate.setAddress(address);
		System.out.println("Enter phone: ");
		String phone = scanner.nextLine();
		fresherCandidate.setPhone(phone);
		System.out.println("Enter email: ");
		String email = scanner.nextLine();
		fresherCandidate.setEmail(email);
		System.out.println("Enter birth date: ");
		String birthDate = scanner.nextLine();
		fresherCandidate.setBirthDate(birthDate);
		System.out.println("Enter graduadation date: ");
		String graduationDate = scanner.nextLine();
		fresherCandidate.setGraduationDate(graduationDate);
		System.out.println("Enter graduation Rank: ");
		String graduationRank = scanner.nextLine();
		fresherCandidate.setGraduationRank(graduationRank);
		System.out.println("Enter education: ");
		String education = scanner.nextLine();
		fresherCandidate.setEducation(education);
		
		list.add(fresherCandidate);
		return fresherCandidate;
	}
}
