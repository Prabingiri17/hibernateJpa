package com.neutroline.Prabinspringboot.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

//when you use hibernate.cfg.xml configuration
public class HibernateUtil {
    // static member  only hold one instance of the HibernateUtil class
    // early instance will be created at load time: Early Instantiation
    private static SessionFactory sessionFactory = buildSessionFactory();

    //using singleton design pattern to build session factory
    private static SessionFactory buildSessionFactory() {
        try {
            // configuration holds all of our mapping information
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            // now we begin to build our session factory using configuration object
         /* now we need to pass in the configuration to the standard service registry builder, to do that we call Applysetting method
         * and we grab our configuration and we call getProperties method in a format that will pass in our configuration to the standard
         * service registry builder and then builder pattern will invoke the build method and pass the service registry into the build
         * method and we will end up with the session factory.*/

            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;

            //OR return configuration.buildSessionFactory(new StandardServiceRegistryBuilder()
            // .applySettings(configuration.getProperties()).build());

        } catch (Exception e) {
            e.printStackTrace();
            // we can have our method throw new runtime exception to alert us to any issues.
            throw new RuntimeException("There was an error building the session factory.");
        }

    }

        /* after session factory is built, since the above written method is private we create a public method getSessionFactory
         and we just return the session factory which was build above */

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }
}
    /* the field and buildsessionfactory method is private so we cannot access them from outside. However our public method
        getSessionfactory within the Singleton can access the private fields of this class so it can return our Singleton implementation
         of the session factory. */
