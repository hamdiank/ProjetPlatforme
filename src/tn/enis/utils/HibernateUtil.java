package tn.enis.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tn.enis.model.Categoris;


public class HibernateUtil {
	public static SessionFactory sessionFactory;

		static {
			try {
				sessionFactory = new Configuration()
						.addAnnotatedClass(tn.enis.model.Client.class)
						.addAnnotatedClass(tn.enis.model.EntetFacture.class)
						.addAnnotatedClass(tn.enis.model.LigneFacture.class)
						.addAnnotatedClass(tn.enis.model.Produit.class)
						.addAnnotatedClass(tn.enis.model.Categoris.class)
						.configure("hibernate.cfg.xml")
						.buildSessionFactory();
			} catch (Throwable t) {
				t.printStackTrace();
			}

		}

		public static SessionFactory getSession() {
			return sessionFactory;
		}
	}