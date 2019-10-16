package com.example.app.admin.position.entity;

import java.io.Serializable;

/**
 * position_sort
 * @author 
 */
public class PositionSort implements Serializable {
    private Integer id;

    private String position;

    private String workSort;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkSort() {
        return workSort;
    }

    public void setWorkSort(String workSort) {
        this.workSort = workSort;
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
        PositionSort other = (PositionSort) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getWorkSort() == null ? other.getWorkSort() == null : this.getWorkSort().equals(other.getWorkSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getWorkSort() == null) ? 0 : getWorkSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", position=").append(position);
        sb.append(", workSort=").append(workSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}