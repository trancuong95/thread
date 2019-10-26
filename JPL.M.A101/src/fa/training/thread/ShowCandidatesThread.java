package fa.training.thread;

import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Candidate;
import fa.training.services.IOServices;
import fa.training.utils.Constant;

/**
 * The Class DisplayListCandidatesThread.
 */
public class ShowCandidatesThread extends Thread {

	IOServices ioServices = new IOServices();
	List<Candidate> candidates = new ArrayList<Candidate>();

	public ShowCandidatesThread(IOServices ioServices, List<Candidate> candidates) {
		super();
		this.ioServices = ioServices;
		this.candidates = candidates;
	}

	@Override
	public void run() {

		synchronized (ioServices) {
			int status = ioServices.getStatus();
			try {
				if (status != Constant.STATUS_DISPLAY) {
					ioServices.wait();
				} else {
					System.out.println("Display information after read file !!!");
					candidates.stream().forEach(System.out::println);
					ioServices.setStatus(Constant.STOP_THREAD);
					ioServices.notify();
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
