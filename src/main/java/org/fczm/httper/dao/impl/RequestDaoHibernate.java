package org.fczm.httper.dao.impl;

import org.fczm.common.support.PageHibernateDaoSupport;
import org.fczm.httper.dao.RequestDao;
import org.fczm.httper.domain.Request;
import org.springframework.stereotype.Repository;

@Repository("requestDao")
public class RequestDaoHibernate extends PageHibernateDaoSupport<Request> implements RequestDao {

    public RequestDaoHibernate() {
        super();
        setClass(Request.class);
    }

}