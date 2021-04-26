package homeWork;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course (1 , "Engin Demiro�" , 50 , "Sekiz hafta s�r�cek" , "Yaz�l�m Geli�tirici yeti�tirme kamp� C#" );
		Course course2 = new Course (2 , "Faruk Ayd�n" , 20 , "d�rt hafta s�r�cek" , "Programlamaya giri� i�in temel kurs" );
		Course course3 = new Course (3 , "Fatih Serdar Aydemir" , 100 , "on hafta s�r�cek" , "Yaz�l�m Geli�tirici yeti�tirme kamp� Java" );
	
		Course[] courses = { course1 , course2 , course3  }; 
	for (Course course : courses) {
		
		System.out.println("Kurs Ad� : " +course.courseName);
		System.out.println("E�itmen Ad� : " +course.instructorName);
		System.out.println("E�itim detay� : " +course.detail);
		System.out.println("E�itim �creti : " +course.price);
		System.out.println("-----------------------------");
		
	}
	
	CourseCategory category1= new CourseCategory();
	category1.id = 1;
	category1.name = "Programlama";
	
	CourseManager courseManager = new CourseManager();
	courseManager.Login(course1);
	courseManager.Register(course1);
	System.out.println("-----------------------------");
	courseManager.Login(course2);
	courseManager.Register(course2);
	System.out.println("-----------------------------");
	courseManager.Login(course3);
	courseManager.Register(course3);
	System.out.println("-----------------------------");
	
	
			
	
	
	
	}
	

}
