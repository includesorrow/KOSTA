package ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanMain {
public static void main(String[] args) {
	ApplicationContext ctx = new GenericXmlApplicationContext("ex5/xml.xml");
	MyBeanInter mbi = ctx.getBean("pfBean",MyBeanInter.class);
	System.out.println(mbi.myGetMessage("±è±æµ¿"));
}
}

     