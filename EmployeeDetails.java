/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.AirlineReservation;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Transient;

/**
 *
 * @ omkar
 */
//@Entity
//@Table(name = "employee_details", catalog = "xe", schema = "")
//@NamedQueries({
//    @NamedQuery(name = "EmployeeDetails.findAll", query = "SELECT e FROM EmployeeDetails e")
//    , @NamedQuery(name = "EmployeeDetails.findByEid", query = "SELECT e FROM EmployeeDetails e WHERE e.eid = :eid")
//    , @NamedQuery(name = "EmployeeDetails.findByE_Firstname", query = "SELECT e FROM EmployeeDetails e WHERE e.firstname = :firstname")
//    , @NamedQuery(name = "EmployeeDetails.findByE_Lastname", query = "SELECT e FROM EmployeeDetails e WHERE e.lastname = :lastname")
//    , @NamedQuery(name = "EmployeeDetails.findByphone_no", query = "SELECT e FROM EmployeeDetails e WHERE e.phone_no = :phone_no")
//})
public class EmployeeDetails implements Serializable {

//    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
//
    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "eid")
    private Integer eid;
//    @Basic(optional = false)
//    @Column(name = "e_firstname")
    private String e_firstname;
//    @Basic(optional = false)
//    @Column(name = "e_lastname")
    private String e_lastname;
//    @Basic(optional = false)
//    @Column(name = "phone_no")
    private String phone_no;
//    

    public EmployeeDetails() {
    }

    public EmployeeDetails(Integer eid) {
        this.eid = eid;
    }

    public EmployeeDetails(Integer eid, String e_firstname, String e_lastname, String phone_no) {
        this.eid = eid;
        this.e_firstname = e_firstname;
        this.e_lastname = e_lastname;
        this.phone_no = phone_no;
        
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        Integer oldEid = this.eid;
        this.eid = eid;
        changeSupport.firePropertyChange("eid", oldEid, eid);
    }

    public String getFirstname() {
        return e_firstname;
    }

    public void setFirstname(String e_firstname) {
        String oldFirstname = this.e_firstname;
        this.e_firstname = e_firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, e_firstname);
    }

    public String getLastname() {
        return e_lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.e_lastname;
        this.e_lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getPhoneno1() {
        return phone_no;
    }

    public void setPhoneno1(String phone_no) {
        String oldPhoneno1 = this.phone_no;
        this.phone_no= phone_no;
        changeSupport.firePropertyChange("phoneno1", oldPhoneno1, phone_no);
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eid != null ? eid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeDetails)) {
            return false;
        }
        EmployeeDetails other = (EmployeeDetails) object;
        if ((this.eid == null && other.eid != null) || (this.eid != null && !this.eid.equals(other.eid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.EmployeeDetails[ eid=" + eid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
