package fa.training.thread;

import java.util.List;

import fa.training.entities.Candidate;
import fa.training.main.App;
import fa.training.services.IOServices;
import fa.training.utils.Constant;

/**
 * The Class WriteThread.
 */
public class WriteThread extends Thread {

	private List<Candidate> candidates = App.list;
	private IOServices ioServices = new IOServices();

	public WriteThread(IOServices ioServices) {
		super();
		this.ioServices = ioServices;
	}

	@Override
	public void run() {
		synchronized (ioServices) {
			int status = ioServices.getStatus();

			try {
				if (status == Constant.STATUS_WRITE) {
					System.out.println("Starting save File ...");
					ioServices.saveFile(candidates);
					ioServices.setStatus(Constant.STATUS_READ);
					ioServices.notifyAll();
				} 
				while(status != Constant.STATUS_WRITE){
					ioServices.wait();
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
