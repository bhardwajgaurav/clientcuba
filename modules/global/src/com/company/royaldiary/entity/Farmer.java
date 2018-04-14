package com.company.royaldiary.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|username")
@Table(name = "ROYALDIARY_FARMER")
@Entity(name = "royaldiary$Farmer")
public class Farmer extends StandardEntity {
    private static final long serialVersionUID = 863594274208661525L;

    @NotNull(message = "Please Enter Last Name ")
    @Column(name = "LAST_NAME")
    protected String lastName;

    @Column(name = "TOTAL_COWS")
    protected Integer totalCows;

    @Column(name = "MILK_PRODUCTION")
    protected Double milkProduction;

    @Column(name = "AVERAGE_QUALITY_OF_MILK")
    protected Double averageQualityOfMilk;

    @OneToMany(mappedBy = "farmer")
    protected List<FarmerAddress> address;

    @NotNull(message = "Please provide unique user name")
    @Column(name = "USERNAME", unique = true)
    protected String username;

    @NotNull(message = "Please Provide First Name")
    @Column(name = "FIRTST_NAME")
    protected String firtstName;


    public void setTotalCows(Integer totalCows) {
        this.totalCows = totalCows;
    }

    public Integer getTotalCows() {
        return totalCows;
    }

    public void setMilkProduction(Double milkProduction) {
        this.milkProduction = milkProduction;
    }

    public Double getMilkProduction() {
        return milkProduction;
    }

    public void setAverageQualityOfMilk(Double averageQualityOfMilk) {
        this.averageQualityOfMilk = averageQualityOfMilk;
    }

    public Double getAverageQualityOfMilk() {
        return averageQualityOfMilk;
    }


    public void setAddress(List<FarmerAddress> address) {
        this.address = address;
    }

    public List<FarmerAddress> getAddress() {
        return address;
    }


    public void setFirtstName(String firtstName) {
        this.firtstName = firtstName;
    }

    public String getFirtstName() {
        return firtstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


}