package com.mth.MyTripHistory.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Device {

    private String deviceType;
    private String ip;
    private String OS_Type;

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOS_Type() {
        return OS_Type;
    }

    public void setOS_Type(String OS_Type) {
        this.OS_Type = OS_Type;
    }
}
