package fa.training.main;

import fa.training.thread.ShowCandidatesThread;

import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Candidate;
import fa.training.services.IOServices;
import fa.training.thread.ReadThread;
import fa.training.thread.WriteThread;
import fa.training.utils.Constant;

public class CandidateManagement {

	public static void main(String[] args) {

		IOServices ioServices = new IOServices();
		List<Candidate> candidates = new ArrayList<Candidate>();
		App app = new App();
		app.runMainMenu();

		ioServices.setStatus(Constant.STATUS_WRITE);

		WriteThread thread1 = new WriteThread(ioServices);
		ReadThread thread2 = new ReadThread(ioServices, candidates);
		ShowCandidatesThread thread3 = new ShowCandidatesThread(ioServices, candidates);

		thread1.setName("Thread Save File");
		thread2.setName("Thread Read File");
		thread3.setName("Thread Show File");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
