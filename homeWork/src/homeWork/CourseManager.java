package homeWork;

public class CourseManager {
	public void Register(Course course ) {
	System.out.println("Kursa Kayıt olundu : " + course.courseName);
	}
	
	public void Login(Course course) {
		System.out.println("Kursa kayıt olmak için oturum aç : " +course.courseName );

	}
}
