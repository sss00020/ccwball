/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionccw;

import ccw.Departmentht;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tan
 */
@Stateless
public class DepartmenthtFacade extends AbstractFacade<Departmentht> {

    @PersistenceContext(unitName = "ccwballPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartmenthtFacade() {
        super(Departmentht.class);
    }
    
}
