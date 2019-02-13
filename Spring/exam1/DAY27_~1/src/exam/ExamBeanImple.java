package exam;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;


public class ExamBeanImple implements ExamBeanInter,BeanFactoryAware {
	private BeanFactory bf; 
	// BeanFactoryAware로 받을 BeanFactory를 미리 선언해둔다.
	private ExamTypeInter eti;
	// ExamTypeInter를 객체로 받아옴.
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		bf=beanFactory;
	}

	@Override
	public void callExecutebean(String condition) {
		
		// 이 method는 String condition을 가져와서
		// 그 condition에 따라서 eti에 TypeA,B,C를 넣어준다.		
		if(condition.equals("type1")) {
			eti=bf.getBean("examA",ExamTypeA.class);}
		else if(condition.equals("type2")) {
			eti=bf.getBean("examB",ExamTypeB.class);}
		else if(condition.equals("type3")) {
			eti=bf.getBean("examC",ExamTypeC.class);}
		//	eti=bf.getBean(condition,ExamTypeInter.class);
	}

	@Override
	public String getMessageBean() {
		// ExamTypeInter에 있는 message()메서드 실행
		// Type A, B, C에 있는 message()메서드가 실행이 되어서
		// 각각의 객체에 따른 message String를 리턴하여 그 값을 바로 리턴한다.
		return eti.message();
	}
	
}



