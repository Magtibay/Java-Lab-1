
public class SingerTest {

	public static void main(String[] args) {
		//object
		Singers singer1 = new Singers();
		
		//display default values
		System.out.println("Singer ID:" + singer1.getIntId());
		System.out.println("Singer Name:" + singer1.getStringName());
		System.out.println("Singer Address:" + singer1.getStringAddress());
		System.out.println("Singer Date of Birth:" + singer1.getStringBirth());
		System.out.println("Singer Albums:" + singer1.getStringAlbum());
		
		//setting values
		singer1.setId(123);
		singer1.setName("Michael Jackson");
		singer1.setAddress("USA");
		singer1.setBirth("August 29th, 1958");
		singer1.setAlbum("10");
		
		//displaying set values
		System.out.println("Singer ID:" + singer1.getIntId());
		System.out.println("Singer Name:" + singer1.getStringName());
		System.out.println("Singer Address:" + singer1.getStringAddress());
		System.out.println("Singer Date of Birth:" + singer1.getStringBirth());
		System.out.println("Singer Albums:" + singer1.getStringAlbum());

	}

}
