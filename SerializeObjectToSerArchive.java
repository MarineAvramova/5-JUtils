import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeObjectToSerArchive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat caty = new Cat("Sweety", 4, 5);
		serializeObject(caty);
		deserializeObject();

	}

	public static void serializeObject(Cat caty) {

		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cat.dat"))) {
			outputStream.writeObject(caty);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deserializeObject() {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cat.dat"))) {
			Cat caty = (Cat)in.readObject();
			
			System.out.println(caty.toString());
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
