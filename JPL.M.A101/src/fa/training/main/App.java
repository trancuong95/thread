package fa.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.entities.Candidate;
import fa.training.services.ExperienceCandidateServices;
import fa.training.services.FresherCandidateServices;

public class App {

	public static List<Candidate> list = new ArrayList<>();
	
	public void runMainMenu() {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		while (check) {
			showMenu();
			System.out.println("Your choose: ");
			int choose = Integer.parseInt(scanner.nextLine());
			switch (choose) {
			case 1:
				ExperienceCandidateServices experienceCandidateServices = new ExperienceCandidateServices();
				experienceCandidateServices.createExperienceCandidate(scanner, list);
				break;
			case 2:
				FresherCandidateServices fresherCandidateServices = new FresherCandidateServices();
				fresherCandidateServices.createFresherCandidate(scanner, list);
				break;
			case 3:
				System.out.println("Exit program !!!");
				scanner.close();
				check = false;
				break;
			default:
				System.out.println("Please choose again !!!");
				break;
			}
		}
	}

	static void showMenu() {
		System.out.println("=========== Candidate Management ===========");
		System.out.println("1. Input data Experience Candidate");
		System.out.println("2. Input data Fresher Candidate");
		System.out.println("3. Exit !");
	}
}
