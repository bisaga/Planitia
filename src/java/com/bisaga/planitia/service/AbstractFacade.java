/*
 * Copyright (C) 2016 igorb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.bisaga.planitia.service;

import java.util.List;
import javax.sql.DataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.UpdatableRecordImpl;


/**
 *
 * @author igorb
 */
public abstract class AbstractFacade<T extends UpdatableRecordImpl> {
    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract DataSource getDataSource();
    
    public void create(T entity) {
        DSLContext db = DSL.using(getDataSource(), SQLDialect.POSTGRES);
        db.attach(entity);
        entity.store();
    }

    public void edit(T entity) {
        //getDb().merge(entity);
    }

    public void remove(T entity) {
        //getDb().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        
       // return getDb().find(entityClass, id);
        return null;
    }

    public List<T> findAll() {
        /*
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
        */
        return null;
    }

    public List<T> findRange(int[] range) {
        /*
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
        */
        return null;
    }

    public int count() {
        /*
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
        */
        return 0;
    }
    
}
