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


/**
 *
 * @author omkar
 */
//@Entity
//@Table(name = "airline_booking", catalog = "xe", schema = "")
//@NamedQueries({
//    @NamedQuery(name = "AirlineBooking.findAll", query = "SELECT b FROM AirlineBooking b")
//    , @NamedQuery(name = "AirlineBooking.findByBookingId", query = "SELECT b FROM AirlineBooking b WHERE b.bookingId = :bookingId")
//    , @NamedQuery(name = "AirlineBooking.findByBookingUser", query = "SELECT b FROM AirlineBooking b WHERE b.bookingUser = :bookingUser")
//    , @NamedQuery(name = "AirlineBooking.findByJourneyDate", query = "SELECT b FROM AirlineBooking b WHERE b.journeyDate = :journeyDate")
//    , @NamedQuery(name = "AirlineBooking.findByAirlineNo", query = "SELECT b FROM AirlineBooking b WHERE b.airlineNo = :airlineNo")
//    , @NamedQuery(name = "AirlineBooking.findBySeat", query = "SELECT b FROM AirlineBooking b WHERE b.seat = :seat")
//    , @NamedQuery(name = "AirlineBooking.findByIdNo", query = "SELECT b FROM AirlineBooking b WHERE b.idNo = :idNo")
//    , @NamedQuery(name = "AirlineBooking.findByFirstName", query = "SELECT b FROM AirlineBooking b WHERE b.firstName = :firstName")
//    , @NamedQuery(name = "AirlineBooking.findByLastName", query = "SELECT b FROM AirlineBooking b WHERE b.lastName = :lastName")})
public class AirlineBooking implements Serializable {

//    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "booking_id")
    private Integer bookingId;
//    @Basic(optional = false)
//    @Column(name = "booking_user")
    private String bookingUser;
//    @Basic(optional = false)
//    @Column(name = "journey_date")
//    @Temporal(TemporalType.DATE)
  private Date journeyDate;
//    @Basic(optional = false)
//    @Column(name = "airline_no")
    private String airlineNo;
//    @Basic(optional = false)
//    @Column(name = "seat")
    private String seat;
//    @Basic(optional = false)
//    @Column(name = "id_no")
    private String idNo;
//    @Basic(optional = false)
//    @Column(name = "first_name")
   private String firstName;
//    @Basic(optional = false)
//    @Column(name = "last_name")
   private String lastName;

    public AirlineBooking() {
    }

    public AirlineBooking(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public AirlineBooking(Integer bookingId, String bookingUser, Date journeyDate, String airlineNo, String seat, String idNo, String firstName, String lastName) {
        this.bookingId = bookingId;
        this.bookingUser = bookingUser;
        this.journeyDate = journeyDate;
        this.airlineNo = airlineNo;
        this.seat = seat;
        this.idNo = idNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        Integer oldBookingId = this.bookingId;
        this.bookingId = bookingId;
        changeSupport.firePropertyChange("bookingId", oldBookingId, bookingId);
    }

    public String getBookingUser() {
        return bookingUser;
    }

    public void setBookingUser(String bookingUser) {
        String oldBookingUser = this.bookingUser;
        this.bookingUser = bookingUser;
        changeSupport.firePropertyChange("bookingUser", oldBookingUser, bookingUser);
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate) {
        Date oldJourneyDate = this.journeyDate;
        this.journeyDate = journeyDate;
        changeSupport.firePropertyChange("journeyDate", oldJourneyDate, journeyDate);
    }

    public String getAirlineNo() {
        return airlineNo;
    }

    public void setAirlineNo(String airlineNo) {
        String oldAirlineNo = this.airlineNo;
        this.airlineNo = airlineNo;
        changeSupport.firePropertyChange("airlineNo", oldAirlineNo, airlineNo);
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        String oldSeat = this.seat;
        this.seat = seat;
        changeSupport.firePropertyChange("seat", oldSeat, seat);
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        String oldIdNo = this.idNo;
        this.idNo = idNo;
        changeSupport.firePropertyChange("idNo", oldIdNo, idNo);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingId != null ? bookingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AirlineBooking)) {
            return false;
        }
        AirlineBooking other = (AirlineBooking) object;
        if ((this.bookingId == null && other.bookingId != null) || (this.bookingId != null && !this.bookingId.equals(other.bookingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airline.management.AirlineBooking[ bookingId=" + bookingId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
