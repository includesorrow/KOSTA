package exam;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;


public class ExamBeanImple implements ExamBeanInter,BeanFactoryAware {
	private BeanFactory bf; 
	// BeanFactoryAware�� ���� BeanFactory�� �̸� �����صд�.
	private ExamTypeInter eti;
	// ExamTypeInter�� ��ü�� �޾ƿ�.
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		bf=beanFactory;
	}

	@Override
	public void callExecutebean(String condition) {
		
		// �� method�� String condition�� �����ͼ�
		// �� condition�� ���� eti�� TypeA,B,C�� �־��ش�.		
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
		// ExamTypeInter�� �ִ� message()�޼��� ����
		// Type A, B, C�� �ִ� message()�޼��尡 ������ �Ǿ
		// ������ ��ü�� ���� message String�� �����Ͽ� �� ���� �ٷ� �����Ѵ�.
		return eti.message();
	}
	
}



