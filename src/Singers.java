
public class Singers
	{	
		
		private int id;
		private String name;
		private String address;
		private String birth;
		private String album;
		
		//no-arg
		public Singers()
		{
	
		}
		
		//1-arg
		public Singers(int id)
		{
			this.id = id;		
		}
		
		//2-arg
		public Singers(int id, String name)
		{
			this.id = id;
			this.name = name;
			
			
		}
		
		//3-arg
		public Singers(int id, String name, String address)
		{
			this.id = id;
			this.name = name;
			this.address = address;		
			
		}
		
		//4-arg
		public Singers(int id, String name, String address, String birth)
		{
			this.id = id;
			this.name = name;
			this.address = address;
			this.birth = birth;
			
		}
		
		//5-arg
		public Singers(int id, String name, String address, String birth, String album)
		{
			this.id = id;
			this.name = name;
			this.address = address;
			this.birth = birth;
			this.album = album;
			
		}
		
		
		//Setters and Getters
		public void setId(int id)
		{
			this.id = id;
		}
		
		public int getIntId()
		{
			return id;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getStringName()
		{
			return name;
		}
		
		public void setAddress(String address)
		{
			this.address = address;
		}
		
		public String getStringAddress()
		{
			return address;
		}
		
		public void setBirth(String birth)
		{
			this.birth = birth;
		}
		
		public String getStringBirth()
		{
			return birth;
		}
		
		public void setAlbum(String album)
		{
			this.album = album;
		}
		
		public String getStringAlbum()
		{
			return album;
		}
		//Set all in one
		public void setSinger(int id, String name, String address, String birth, String album)
		{
			this.id = id;
			this.name = name;
			this.address = address;
			this.birth = birth;
			this.album = album;
		}
		
		
	}
		
		