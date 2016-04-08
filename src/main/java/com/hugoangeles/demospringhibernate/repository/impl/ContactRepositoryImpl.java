/*
 * The MIT License
 *
 * Copyright 2016 Hugo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.hugoangeles.demospringhibernate.repository.impl;

import com.hugoangeles.demospringhibernate.entity.Contact;
import com.hugoangeles.demospringhibernate.repository.ContactRepository;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hugo
 */
@Repository
public class ContactRepositoryImpl implements ContactRepository{
    
    @Autowired
    private SessionFactory sessionFactory;

    public void save(Contact contact) {
        contact.setCreated(new Date());
        getSession().save(contact);
    }

    public void update(Contact contact) {
        getSession().update(contact);
    }

    public List<Contact> listAll() {
        Criteria criteria = getSession().createCriteria(Contact.class);
        return criteria.list();
    }

    public void delete(Contact contact) {
        getSession().delete(contact);
    }
    
    private Session getSession() {
        return sessionFactory.openSession();
    }
    
}
