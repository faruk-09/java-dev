package homeWork;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course (1 , "Engin Demiroð" , 50 , "Sekiz hafta sürücek" , "Yazýlým Geliþtirici yetiþtirme kampý C#" );
		Course course2 = new Course (2 , "Faruk Aydýn" , 20 , "dört hafta sürücek" , "Programlamaya giriþ için temel kurs" );
		Course course3 = new Course (3 , "Fatih Serdar Aydemir" , 100 , "on hafta sürücek" , "Yazýlým Geliþtirici yetiþtirme kampý Java" );
	
		Course[] courses = { course1 , course2 , course3  }; 
	for (Course course : courses) {
		
		System.out.println("Kurs Adý : " +course.courseName);
		System.out.println("Eðitmen Adý : " +course.instructorName);
		System.out.println("Eðitim detayý : " +course.detail);
		System.out.println("Eðitim ücreti : " +course.price);
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
