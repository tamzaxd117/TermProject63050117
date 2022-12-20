/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DEMON SH4DOW
 */
@Entity
@Table(name = "TABLE117")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Table117.findAll", query = "SELECT t FROM Table117 t"),
    @NamedQuery(name = "Table117.findByYearnum", query = "SELECT t FROM Table117 t WHERE t.yearnum = :yearnum"),
    @NamedQuery(name = "Table117.findByWeeknum", query = "SELECT t FROM Table117 t WHERE t.weeknum = :weeknum"),
    @NamedQuery(name = "Table117.findByNewCase", query = "SELECT t FROM Table117 t WHERE t.newCase = :newCase"),
    @NamedQuery(name = "Table117.findByTotalCase", query = "SELECT t FROM Table117 t WHERE t.totalCase = :totalCase"),
    @NamedQuery(name = "Table117.findByNewCaseExcludeabroad", query = "SELECT t FROM Table117 t WHERE t.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Table117.findByTotalCaseExcludeabroad", query = "SELECT t FROM Table117 t WHERE t.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Table117.findByNewRecovered", query = "SELECT t FROM Table117 t WHERE t.newRecovered = :newRecovered"),
    @NamedQuery(name = "Table117.findByTotalRecovered", query = "SELECT t FROM Table117 t WHERE t.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Table117.findByNewDeath", query = "SELECT t FROM Table117 t WHERE t.newDeath = :newDeath"),
    @NamedQuery(name = "Table117.findByTotalDeath", query = "SELECT t FROM Table117 t WHERE t.totalDeath = :totalDeath"),
    @NamedQuery(name = "Table117.findByCaseForeign", query = "SELECT t FROM Table117 t WHERE t.caseForeign = :caseForeign"),
    @NamedQuery(name = "Table117.findByCasePrison", query = "SELECT t FROM Table117 t WHERE t.casePrison = :casePrison"),
    @NamedQuery(name = "Table117.findByCaseWalkin", query = "SELECT t FROM Table117 t WHERE t.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Table117.findByCaseNewPrev", query = "SELECT t FROM Table117 t WHERE t.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Table117.findByCaseNewDiff", query = "SELECT t FROM Table117 t WHERE t.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Table117.findByDeathNewPrev", query = "SELECT t FROM Table117 t WHERE t.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Table117.findByDeathNewDiff", query = "SELECT t FROM Table117 t WHERE t.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Table117.findByUpdateDate", query = "SELECT t FROM Table117 t WHERE t.updateDate = :updateDate")})
public class Table117 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "YEARNUM")
    private Integer yearnum;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Size(max = 40)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Table117() {
    }

    public Table117(Integer yearnum) {
        this.yearnum = yearnum;
    }

    Table117(int yearnum, int weeknum, int new_case, int total_case, int new_case_excludeabroad, int total_case_excludeabroad, int new_recovered, int total_recovered, int new_death, int total_death, int case_foreign, int case_prison, int case_walkin, int case_new_prev, int case_new_diff, int death_new_prev, int death_new_diff, String update_date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getYearnum() {
        return yearnum;
    }

    public void setYearnum(Integer yearnum) {
        this.yearnum = yearnum;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yearnum != null ? yearnum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Table117)) {
            return false;
        }
        Table117 other = (Table117) object;
        if ((this.yearnum == null && other.yearnum != null) || (this.yearnum != null && !this.yearnum.equals(other.yearnum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Table117[ yearnum=" + yearnum + " ]";
    }
    
}
