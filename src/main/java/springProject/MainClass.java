package springProject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		TransportationWalk walk = new TransportationWalk();
//		walk.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk walk = ctx.getBean("tWalk", TransportationWalk.class);
		walk.move();
		
		
		ctx.close();
		
		
	}
}
