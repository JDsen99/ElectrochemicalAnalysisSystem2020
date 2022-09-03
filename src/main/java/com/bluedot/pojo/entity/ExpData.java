package com.bluedot.pojo.entity;

import java.sql.Timestamp;
import java.util.Arrays;

/**
 * @Author Jason
 * @CreationDate 2022/07/29 - 055
 * @Description ：
 */
public class ExpData {
    private Integer expDataId;
    private User user;
    private MaterialType materialType;
    private String expMaterialName;
    private Double expMaterialSolubility;
    private Double[] expVoltagePointData;
    private Double[] expOriginalCurrentPointData ;
    private Double[] expNewestCurrentPointData ;
    private String orderOfMagnitudes;
    private Double expOriginalCurrent;
    private Double expOriginalPotential;
    private Double expNewestCurrent;
    private Double expNewestPotential;
    private BufferSolution bufferSolution;
    private Double expPh;
    private String expDataDesc;
    private Timestamp expCreateTime;
    private Timestamp expLastUpdateTime;
    private Integer expDeleteStatus;

    public Integer getExpDataId() {
        return expDataId;
    }

    public void setExpDataId(Integer expDataId) {
        this.expDataId = expDataId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public String getExpMaterialName() {
        return expMaterialName;
    }

    public void setExpMaterialName(String expMaterialName) {
        this.expMaterialName = expMaterialName;
    }

    public Double getExpMaterialSolubility() {
        return expMaterialSolubility;
    }

    public void setExpMaterialSolubility(Double expMaterialSolubility) {
        this.expMaterialSolubility = expMaterialSolubility;
    }

    public Double[] getExpVoltagePointData() {
        return expVoltagePointData;
    }

    public void setExpVoltagePointData(Double[] expVoltagePointData) {
        this.expVoltagePointData = expVoltagePointData;
    }

    public Double[] getExpOriginalCurrentPointData() {
        return expOriginalCurrentPointData;
    }

    public void setExpOriginalCurrentPointData(Double[] expOriginalCurrentPointData) {
        this.expOriginalCurrentPointData = expOriginalCurrentPointData;
    }

    public Double[] getExpNewestCurrentPointData() {
        return expNewestCurrentPointData;
    }

    public void setExpNewestCurrentPointData(Double[] expNewestCurrentPointData) {
        this.expNewestCurrentPointData = expNewestCurrentPointData;
    }

    public String getOrderOfMagnitudes() {
        return orderOfMagnitudes;
    }

    public void setOrderOfMagnitudes(String orderOfMagnitudes) {
        this.orderOfMagnitudes = orderOfMagnitudes;
    }

    public Double getExpOriginalCurrent() {
        return expOriginalCurrent;
    }

    public void setExpOriginalCurrent(Double expOriginalCurrent) {
        this.expOriginalCurrent = expOriginalCurrent;
    }

    public Double getExpOriginalPotential() {
        return expOriginalPotential;
    }

    public void setExpOriginalPotential(Double expOriginalPotential) {
        this.expOriginalPotential = expOriginalPotential;
    }

    public Double getExpNewestCurrent() {
        return expNewestCurrent;
    }

    public void setExpNewestCurrent(Double expNewestCurrent) {
        this.expNewestCurrent = expNewestCurrent;
    }

    public Double getExpNewestPotential() {
        return expNewestPotential;
    }

    public void setExpNewestPotential(Double expNewestPotential) {
        this.expNewestPotential = expNewestPotential;
    }

    public BufferSolution getBufferSolution() {
        return bufferSolution;
    }

    public void setBufferSolution(BufferSolution bufferSolution) {
        this.bufferSolution = bufferSolution;
    }

    public Double getExpPh() {
        return expPh;
    }

    public void setExpPh(Double expPh) {
        this.expPh = expPh;
    }

    public String getExpDataDesc() {
        return expDataDesc;
    }

    public void setExpDataDesc(String expDataDesc) {
        this.expDataDesc = expDataDesc;
    }

    public Timestamp getExpCreateTime() {
        return expCreateTime;
    }

    public void setExpCreateTime(Timestamp expCreateTime) {
        this.expCreateTime = expCreateTime;
    }

    public Timestamp getExpLastUpdateTime() {
        return expLastUpdateTime;
    }

    public void setExpLastUpdateTime(Timestamp expLastUpdateTime) {
        this.expLastUpdateTime = expLastUpdateTime;
    }

    public Integer getExpDeleteStatus() {
        return expDeleteStatus;
    }

    public void setExpDeleteStatus(Integer expDeleteStatus) {
        this.expDeleteStatus = expDeleteStatus;
    }

    @Override
    public String toString() {
        return "ExpData{" +
                "expDataId=" + expDataId +
                ", user=" + user +
                ", materialType=" + materialType +
                ", expMaterialName='" + expMaterialName + '\'' +
                ", expMaterialSolubility=" + expMaterialSolubility +
                ", expVoltagePointData=" + Arrays.toString(expVoltagePointData) +
                ", expOriginalCurrentPointData=" + Arrays.toString(expOriginalCurrentPointData) +
                ", expNewestCurrentPointData=" + Arrays.toString(expNewestCurrentPointData) +
                ", orderOfMagnitudes='" + orderOfMagnitudes + '\'' +
                ", expOriginalCurrent=" + expOriginalCurrent +
                ", expOriginalPotential=" + expOriginalPotential +
                ", expNewestCurrent=" + expNewestCurrent +
                ", expNewestPotential=" + expNewestPotential +
                ", bufferSolution=" + bufferSolution +
                ", expPh=" + expPh +
                ", expDataDesc='" + expDataDesc + '\'' +
                ", expCreateTime=" + expCreateTime +
                ", expLastUpdateTime=" + expLastUpdateTime +
                ", expDeleteStatus=" + expDeleteStatus +
                '}';
    }
}
