package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class AnnotationAssignment2 {

	public static void main(String[] args) {
		
		Project p=new Project();
		Class cl=p.getClass();
		Annotation an=cl.getAnnotation(Info.class);
		Info i=(Info) an;
		
		System.out.println(i.authorID());
		System.out.println(i.authorName());
		System.out.println(i.supervisor());
		System.out.println(i.date());
		System.out.println(i.time());
		System.out.println(i.version());
		System.out.println(i.description());
		

	}

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	String authorID() default "Rahul@123";
	String authorName() default "Rahul Mane";
	String supervisor() default "Reports";
	String date() default "28-09-1997";
	String time() default "05:15:30";
	String version() default "v8.0";
	String description() default "This Program done by Rahul ";
}

@Info
class Project{
	
}
