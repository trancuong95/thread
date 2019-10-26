package fa.training.thread;

import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Candidate;
import fa.training.services.IOServices;
import fa.training.utils.Constant;

/**
 * The Class ReadThread.
 */
public class ReadThread extends Thread {

	IOServices ioServices = new IOServices();
	List<Candidate> candidates = new ArrayList<Candidate>();

	public ReadThread(IOServices ioServices, List<Candidate> candidates) {
		super();
		this.ioServices = ioServices;
		this.candidates = candidates;
	}

	@Override
	public void run() {
		synchronized (ioServices) {
			int status = ioServices.getStatus();

			try {
				if (status == Constant.STATUS_READ) {
					System.out.println("Starting read file ...");
					candidates.addAll(ioServices.readFile());
					ioServices.setStatus(Constant.STATUS_DISPLAY);
					ioServices.notifyAll();
				}
				while (status != Constant.STATUS_READ) {
					ioServices.wait();
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
