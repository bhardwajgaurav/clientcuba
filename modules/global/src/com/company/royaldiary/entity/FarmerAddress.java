package com.company.royaldiary.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

@NamePattern("%s|farmer")
@Table(name = "ROYALDIARY_FARMER_ADDRESS")
@Entity(name = "royaldiary$FarmerAddress")
public class FarmerAddress extends StandardEntity {
    private static final long serialVersionUID = 8072853517721856526L;

    @NotNull
    @Column(name = "STATE", nullable = false)
    protected String state;

    @Column(name = "DISTRICT")
    protected String district;


    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FARMER_ID")
    protected Farmer farmer;

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public Farmer getFarmer() {
        return farmer;
    }


    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }


}