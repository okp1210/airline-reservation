/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.AirlineReservation;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;

/**
 *
 * @author omkar
 */
//@Entity
//@Table(name = "airline_details", catalog = "xe", schema = "")
//@NamedQueries({
  //  @NamedQuery(name = "AirlineDetails.findAll", query = "SELECT b FROM AirlineDetails b")
    
    //,// @NamedQuery(name = "AirlineDetails.findByAirlineNo", query = "SELECT b FROM AirlineDetails b WHERE b.airlineNo = :airlineNo")
    //, @NamedQuery(name = "AirlineDetails.findByMovement", query = "SELECT b FROM AirlineDetails b WHERE b.movement = :movement")
//    , @NamedQuery(name = "AirlineDetails.findByAirlineSource", query = "SELECT b FROM AirlineDetails b WHERE b.airlineSource = :airlineSource")
//    , @NamedQuery(name = "AirlineDetails.findByAirlineDest", query = "SELECT b FROM AirlineDetails b WHERE b.airlineDest = :airlineDest")
//    , @NamedQuery(name = "AirlineDetails.findByDepartDate", query = "SELECT b FROM AirlineDetails b WHERE b.departDate = :departDate")
//    , @NamedQuery(name = "AirlineDetails.findByDepartTime", query = "SELECT b FROM AirlineDetails b WHERE b.departTime = :departTime")
//    , @NamedQuery(name = "AirlineDetails.findByPrice", query = "SELECT b FROM AirlineDetails b WHERE b.price = :price")
//    , @NamedQuery(name = "AirlineDetails.findByTotalSeat", query = "SELECT b FROM AirlineDetails b WHERE b.totalSeat = :totalSeat")})
public class AirlineDetails implements Serializable {

//    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "id")
    private Integer id;
//    @Basic(optional = false)
//    @Column(name = "airline_no")
    private String airlineNo;
//    @Basic(optional = false)
//    @Column(name = "movement")
    private String movement;
//    @Basic(optional = false)
//    @Column(name = "airline_source")
    private String airlineSource;
//    @Basic(optional = false)
//    @Column(name = "airline_dest")
    private String airlineDest;
//    @Basic(optional = false)
//    @Column(name = "depart_date")
//    @Temporal(TemporalType.DATE)
    private Date departDate;
//    @Basic(optional = false)
//    @Column(name = "depart_time")
    private String departTime;
//    @Basic(optional = false)
//    @Column(name = "price")
    private String price;
//    @Basic(optional = false)
//    @Column(name = "total_seat")
    private String totalSeat;

    public AirlineDetails() {
    }

    public AirlineDetails(Integer id) {
        this.id = id;
    }

    public AirlineDetails(Integer id, String airlineNo, String movement, String airlineSource, String airlineDest, Date departDate, String departTime, String price, String totalSeat) {
        this.id = id;
        this.airlineNo = airlineNo;
        this.movement = movement;
        this.airlineSource = airlineSource;
        this.airlineDest = airlineDest;
        this.departDate = departDate;
        this.departTime = departTime;
        this.price = price;
        this.totalSeat = totalSeat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAirlineNo() {
        return airlineNo;
    }

    public void setAirlineNo(String airlineNo) {
        String oldAirlineNo = this.airlineNo;
        this.airlineNo = airlineNo;
        changeSupport.firePropertyChange("airlineNo", oldAirlineNo, airlineNo);
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        String oldMovement = this.movement;
        this.movement = movement;
        changeSupport.firePropertyChange("movement", oldMovement, movement);
    }

    public String getAirlineSource() {
        return airlineSource;
    }

    public void setAirlineSource(String airlineSource) {
        String oldAirlineSource = this.airlineSource;
        this.airlineSource = airlineSource;
        changeSupport.firePropertyChange("airlineSource", oldAirlineSource, airlineSource);
    }

    public String getAirlineDest() {
        return airlineDest;
    }

    public void setAirlineDest(String airlineDest) {
        String oldAirlineDest = this.airlineDest;
        this.airlineDest = airlineDest;
        changeSupport.firePropertyChange("airlineDest", oldAirlineDest, airlineDest);
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        Date oldDepartDate = this.departDate;
        this.departDate = departDate;
        changeSupport.firePropertyChange("departDate", oldDepartDate, departDate);
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        String oldDepartTime = this.departTime;
        this.departTime = departTime;
        changeSupport.firePropertyChange("departTime", oldDepartTime, departTime);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(String totalSeat) {
        String oldTotalSeat = this.totalSeat;
        this.totalSeat = totalSeat;
        changeSupport.firePropertyChange("totalSeat", oldTotalSeat, totalSeat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AirlineDetails)) {
            return false;
        }
        AirlineDetails other = (AirlineDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airline.management.AirlineDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
