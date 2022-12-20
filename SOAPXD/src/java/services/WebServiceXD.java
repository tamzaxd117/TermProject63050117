/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import model.Table117;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DEMON SH4DOW
 */
@WebService(serviceName = "WebServiceXD")
public class WebServiceXD {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("soapdbPU");
    /**
     * Web service operation
     * @param year
     * @return 
     */
    @WebMethod(operationName = "findbyyear")
    public Table117 findbyyear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Table117 cov = em.find(Table117.class, year);
        return cov;
    }

    /**
     * This is a sample web service operation
     */
   
}
