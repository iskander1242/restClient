package com.red.restClient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {
    private float TP;

    @JsonProperty("NM")
    private long NM;

    @JsonProperty("DC")
    private String registrationDate;
    private String DD = null;
    private float NU;
    private String VU;
    private float NS;

    @JsonProperty("VS")
    private String status;

    private String VNM;
    private String VSN;
    private String VFN;
    private boolean ACT;
    private boolean Z;

    @JsonProperty("VNMB")
    private String fullName;

    private String VSNB;
    private String VFNB;


    // Getter Methods

    public float getTP() {
        return TP;
    }

    public float getNM() {
        return NM;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public String getDD() {
        return DD;
    }

    public float getNU() {
        return NU;
    }

    public String getVU() {
        return VU;
    }

    public float getNS() {
        return NS;
    }

    public String getStatus() {
        return status;
    }

    public String getVNM() {
        return VNM;
    }

    public String getVSN() {
        return VSN;
    }

    public String getVFN() {
        return VFN;
    }

    public boolean getACT() {
        return ACT;
    }

    public boolean getZ() {
        return Z;
    }

    public String getFullName() {
        return fullName;
    }

    public String getVSNB() {
        return VSNB;
    }

    public String getVFNB() {
        return VFNB;
    }

    // Setter Methods

    public void setTP(float TP) {
        this.TP = TP;
    }

    public void setNM(long NM) {
        this.NM = NM;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }

    public void setNU(float NU) {
        this.NU = NU;
    }

    public void setVU(String VU) {
        this.VU = VU;
    }

    public void setNS(float NS) {
        this.NS = NS;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVNM(String VNM) {
        this.VNM = VNM;
    }

    public void setVSN(String VSN) {
        this.VSN = VSN;
    }

    public void setVFN(String VFN) {
        this.VFN = VFN;
    }

    public void setACT(boolean ACT) {
        this.ACT = ACT;
    }

    public void setZ(boolean Z) {
        this.Z = Z;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setVSNB(String VSNB) {
        this.VSNB = VSNB;
    }

    public void setVFNB(String VFNB) {
        this.VFNB = VFNB;
    }

    @Override
    public String toString() {
        return "Company{" +
                "TP=" + TP +
                ", NM=" + NM +
                ", DC='" + registrationDate + '\'' +
                ", DD='" + DD + '\'' +
                ",\n NU=" + NU +
                ", VU='" + VU + '\'' +
                ", NS=" + NS +
                ", VS='" + status + '\'' +
                ", VNM='" + VNM + '\'' +
                ",\n VSN='" + VSN + '\'' +
                ", VFN='" + VFN + '\'' +
                ", ACT=" + ACT +
                ", Z=" + Z +
                ", fullName='" + fullName + '\'' +
                ", VSNB='" + VSNB + '\'' +
                ", VFNB='" + VFNB + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Float.compare(company.TP, TP) == 0 &&
                Float.compare(company.NM, NM) == 0 &&
                Float.compare(company.NU, NU) == 0 &&
                Float.compare(company.NS, NS) == 0 &&
                ACT == company.ACT &&
                Z == company.Z &&
                Objects.equals(registrationDate, company.registrationDate) &&
                Objects.equals(DD, company.DD) &&
                Objects.equals(VU, company.VU) &&
                Objects.equals(status, company.status) &&
                Objects.equals(VNM, company.VNM) &&
                Objects.equals(VSN, company.VSN) &&
                Objects.equals(VFN, company.VFN) &&
                Objects.equals(fullName, company.fullName) &&
                Objects.equals(VSNB, company.VSNB) &&
                Objects.equals(VFNB, company.VFNB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TP, NM, registrationDate, DD, NU, VU, NS, status, VNM, VSN, VFN, ACT, Z, fullName, VSNB, VFNB);
    }
}
