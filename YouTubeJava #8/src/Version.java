import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Version {
	public static void main(String[] args) {
		int version = getVersion("E:\\Users\\Dennis\\Desktop\\FileRenamer.jar");
		switch (version) {
        case 45:
            System.out.println("JDK 1.1");
            break;
        case 46:
            System.out.println("JDK 1.2");
            break;
        case 47:
            System.out.println("JDK 1.3");
            break;
        case 48:
            System.out.println("JDK 1.4");
            break;
        case 49:
            System.out.println("JDK 1.5");
            break;
        case 50:
            System.out.println("JDK 1.6");
            break;
        case 51:
            System.out.println("JDK 1.7");
            break;
        case 52:
            System.out.println("JDK 1.8");
            break;
        default:
            System.out.println(version);
            break;
        }
	}
	
	public static int getVersion(String path) {
		try {
			JarFile jar = new JarFile(path);
			for (JarEntry file : Collections.list(jar.entries())) {
				if (file.getName().endsWith(".class")) {
					DataInputStream dis = new DataInputStream(jar.getInputStream(file));
					
					int magic = dis.readInt();
					if (magic == 0xcafebabe) {
						int minor = dis.readUnsignedShort();
						int major = dis.readUnsignedShort();
						
						return major;
					}
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return 0;
	}
}
