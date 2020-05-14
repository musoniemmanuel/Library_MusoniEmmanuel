/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sudo
 */
@Entity
public class Operations implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Book buk;
    @ManyToOne
    private Client client;
    @Temporal(TemporalType.DATE)
    private Date datetime;
    @Enumerated(EnumType.STRING)
    private OperationCategory opcat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBuk() {
        return buk;
    }

    public void setBuk(Book buk) {
        this.buk = buk;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public OperationCategory getOpcat() {
        return opcat;
    }

    public void setOpcat(OperationCategory opcat) {
        this.opcat = opcat;
    }
    
    
}
