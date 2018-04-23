package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Tdd1 {

	public static void main(String[] args) throws IOException {
		String s[] = { "f1.txt", "f2.txt", "f3.txt", "f4.txt", "f5.txt" };
		Intern[] intern = new Intern[5];
		intern[0] = new Intern(new StringBuffer("jesily"), 1, new StringBuilder("alathur"));
		intern[1] = new Intern(new StringBuffer("neeraja"), 2, new StringBuilder("kottayi"));
		intern[2] = new Intern(new StringBuffer("sooraj"), 3, new StringBuilder("ppully"));
		intern[3] = new Intern(new StringBuffer("thasly"), 4, new StringBuilder("erkm"));
		intern[4] = new Intern(new StringBuffer("najla"), 5, new StringBuilder("thrsr"));
		for (int i = 0; i < 5; i++) {
			try {

				FileOutputStream fs = new FileOutputStream(s[i]);
				ObjectOutputStream os = new ObjectOutputStream(fs);
				os.writeObject(intern[i]);
				os.close();
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
		FileOutputStream fs = new FileOutputStream("s1s1s.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(s);
		os.close();
	}

}
