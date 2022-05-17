package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String args[]) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			// List<City> cities = session.createQuery("from City c where c.countryCode='TUR'").getResultList();
			 
			// for (City city:cities) {
		//		 System.out.println(city.getName());
		//	 }
		/*
		 * List<String> countryCodes =
		 * session.createQuery("select c.countryCode from City c group by c.countryCode"
		 * ).getResultList(); for (String countryCode:countryCodes) {
		 * System.out.println(countryCode); }
		 */
//			City city = new City();
//			
//			city.setName("Duzce 10");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(100000);
//			session.save(city);
			
//			City city = session.get(City.class, 4083);
//			city.setPopulation(100);
//			session.save(city);
			
			City city = session.get(City.class, 4083);
			session.delete(city);
			session.getTransaction().commit();
			
			System.out.println("sehir silindi");
		}finally {
			factory.close();
		} 
	
	}
}
