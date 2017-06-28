package yyl.example.design_pattern.creation.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestUtil {
	@SuppressWarnings("unchecked")
	public static <T> T streamClone(T src) {
		try {
			ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(byteOut);
			out.writeObject(src);
			out.close();
			ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
			ObjectInputStream in = new ObjectInputStream(byteIn);
			Object result = in.readObject();
			in.close();
			return (T) result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
