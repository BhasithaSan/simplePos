package com.github.BhasithaSan.ecommerce.Model.Process;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class POS {

    @Id
    private String posId;

    private String branch;

    public POS() {
    }

    public POS(String posId, String branch) {
        this.posId = posId;
        this.branch = branch;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
