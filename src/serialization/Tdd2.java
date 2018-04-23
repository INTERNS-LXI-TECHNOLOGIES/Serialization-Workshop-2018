package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Tdd2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Intern interns[] = new Intern[5];
		interns[1] = null;
		interns[2] = null;
		interns[3] = null;
		interns[4] = null;
		interns[0] = null;
		FileInputStream fis = new FileInputStream("s1s1s.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		String s[] = (String[]) ois.readObject();

		for (int i = 0; i < 5; i++) {

			try {
				fis = new FileInputStream(s[i]);
				ois = new ObjectInputStream(fis);
				interns[i] = (Intern) ois.readObject();
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("NAME: " + interns[i].getName() + " ID: " + interns[i].getId() + " ADDRESS: "
					+ interns[i].getAddress());

		}

	}

}
