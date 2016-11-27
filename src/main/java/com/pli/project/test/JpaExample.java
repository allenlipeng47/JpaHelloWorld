package com.pli.project.test;

import com.pli.project.test.entity.JpaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by lipeng on 2016/11/26.
 */
public class JpaExample {

    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction().begin();

        JpaEntity jEntity = new JpaEntity();
        jEntity.setId(2);
        jEntity.setName("aaa");

        entitymanager.persist(jEntity);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();
    }

}
