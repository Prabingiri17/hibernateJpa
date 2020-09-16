
package com.neutroline.Prabinspringboot.utils;

import com.neutroline.Prabinspringboot.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

// when you use  hibernate.properties Configuration
public class HibernateUtil1 {
    // static member  only hold one instance of the HibernateUtil class
    // early instance will be created at load time: Early Instantiation
    private static SessionFactory sessionFactory = buildSessionFactory();

    //using singleton design pattern to build session factory
    private static SessionFactory buildSessionFactory() {
        try {
            // configuration holds all of our mapping information
            Configuration configuration = new Configuration();


/* we are going to add an annotated class (in our case our model classes) to our configuration,
            which will be registered to the configuration eventually */

            configuration.addAnnotatedClass(User.class); // since we arenot using hibernate.cfg.xml to do this task

            // now we begin to build our session factory using configuration object

/*   the configuration object will call the build session factory that accepts a service registry object as an argument
     donot call the build session factory method that doesn't accept any arguments cuz that is deprecated. And
     we will call a standard service registry builder and this builder need to call the build method. And this complete
     statement will return a session factory.  */


            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());


        } catch (Exception e) {
            e.printStackTrace();
            // we can have our method throw new runtime exception to alert us to any issues.
            throw new RuntimeException("There was an error building the session factory.");
        }

    }

/* after session factory is built, since the aforewritten method is private we create a public method getSessionFactory
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

