package com.data61.paradise.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;
import java.util.List;

@NodeEntity
public class Intermediary {

    @Id
    @GeneratedValue
    private Long id;
    private String valid_until   ;
    private String country_codes  ;
    private String countries  ;
    private String node_id  ;
    private String sourceID  ;
    private String address  ;
    private String name  ;
    private String jurisdiction_description  ;
    private String service_provider  ;
    private String jurisdiction  ;
    private String closed_date  ;
    private String incorporation_date  ;
    private String ibcRUC  ;
    private String type  ;
    private String status  ;
    private String company_type  ;
    private String note ;

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Entity> getSameNameEntities() {
        return sameNameEntities;
    }

    public void setSameNameEntities(List<Entity> sameNameEntities) {
        this.sameNameEntities = sameNameEntities;
    }

    public List<Officer> getSameNameOfficer() {
        return sameNameOfficer;
    }

    public void setSameNameOfficer(List<Officer> sameNameOfficer) {
        this.sameNameOfficer = sameNameOfficer;
    }

    @Relationship(type = "intermediary_of")
    private List<Entity> entities;

    @Relationship(type = "registered_address")
    private List<Address> addresses;

    @Relationship(type = "same_name_as")
    private List<Entity> sameNameEntities;

    @Relationship(type = "same_name_as")
    private List<Officer> sameNameOfficer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValid_until() {
        return valid_until;
    }

    public void setValid_until(String valid_until) {
        this.valid_until = valid_until;
    }

    public String getCountry_codes() {
        return country_codes;
    }

    public void setCountry_codes(String country_codes) {
        this.country_codes = country_codes;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJurisdiction_description() {
        return jurisdiction_description;
    }

    public void setJurisdiction_description(String jurisdiction_description) {
        this.jurisdiction_description = jurisdiction_description;
    }

    public String getService_provider() {
        return service_provider;
    }

    public void setService_provider(String service_provider) {
        this.service_provider = service_provider;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getClosed_date() {
        return closed_date;
    }

    public void setClosed_date(String closed_date) {
        this.closed_date = closed_date;
    }

    public String getIncorporation_date() {
        return incorporation_date;
    }

    public void setIncorporation_date(String incorporation_date) {
        this.incorporation_date = incorporation_date;
    }

    public String getIbcRUC() {
        return ibcRUC;
    }

    public void setIbcRUC(String ibcRUC) {
        this.ibcRUC = ibcRUC;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompany_type() {
        return company_type;
    }

    public void setCompany_type(String company_type) {
        this.company_type = company_type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
