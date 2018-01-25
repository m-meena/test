package com.niit.config;

import java.util.Properties;
import org.hibernate.SessionFactory;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class HibernateConfig {
	@Autowired
    @Bean(name ="dataSource")
    public DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:tcp://localhost/~/test10");
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;
    }

    private Properties getHibernateProperties() {
        Properties prop = new Properties();
         prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        prop.put("hibernate.hbm2ddl.auto", "update");
        return prop;
    }

    @Autowired
    @Bean
    public SessionFactory sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
        builder.addProperties(getHibernateProperties());
        builder.scanPackages("com.niit.mback");
        builder.addAnnotatedClass(User.class);
         
        return builder.buildSessionFactory();
    }

    // Create a transaction manager
    @Bean
    @Autowired
    public HibernateTransactionManager txManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}
