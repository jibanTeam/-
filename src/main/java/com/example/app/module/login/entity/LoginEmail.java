package com.example.app.module.login.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * login_email
 * @author 
 */
public class LoginEmail implements Serializable {
    private String email;

    private Integer reCode;

    private Date creatTime;

    private String vfcCode;

    private static final long serialVersionUID = 1L;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getReCode() {
        return reCode;
    }

    public void setReCode(Integer reCode) {
        this.reCode = reCode;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getVfcCode() {
        return vfcCode;
    }

    public void setVfcCode(String vfcCode) {
        this.vfcCode = vfcCode;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LoginEmail other = (LoginEmail) that;
        return (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getReCode() == null ? other.getReCode() == null : this.getReCode().equals(other.getReCode()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()))
            && (this.getVfcCode() == null ? other.getVfcCode() == null : this.getVfcCode().equals(other.getVfcCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getReCode() == null) ? 0 : getReCode().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
        result = prime * result + ((getVfcCode() == null) ? 0 : getVfcCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", email=").append(email);
        sb.append(", reCode=").append(reCode);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", vfcCode=").append(vfcCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}