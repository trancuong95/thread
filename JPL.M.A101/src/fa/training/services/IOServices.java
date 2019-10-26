package fa.training.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Candidate;
import fa.training.utils.Constant;

/**
 * The Class IOServices.
 */
public class IOServices {

	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Save file.
	 *
	 * @param list the list
	 */
	public void saveFile(List<Candidate> list) {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(Constant.FILE_PATH));
			outputStream.writeObject(list);
			System.out.println("Save file success !!!");
		} catch (IOException e) {
			System.out.println("Save file not success !!!");
		} finally {
			if (outputStream != null)
				try {
					outputStream.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				}
		}
	}

	/**
	 * Read file.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public List<Candidate> readFile() {
		List<Candidate> list = new ArrayList<Candidate>();
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream(Constant.FILE_PATH));
			list = (List<Candidate>) inputStream.readObject();
			System.out.println("Read file success !!!");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Read file not success !!!");
		} finally {
			if (inputStream != null)
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				}
		}

		return list;
	}

}
