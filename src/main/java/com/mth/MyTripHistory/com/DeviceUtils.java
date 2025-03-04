package com.mth.MyTripHistory.com;

import com.mth.MyTripHistory.vo.Device;
import jakarta.servlet.http.HttpServletRequest;

public class DeviceUtils {

    public Device getCurrentDevice(HttpServletRequest request) {
        Device device = null;
        String deviceHeader = request.getHeader("User-Agent").toUpperCase();
        if(deviceHeader.indexOf("MOBILE") != -1){
            device.setDeviceType("MOBILE");
        }else if(deviceHeader.indexOf("TABLET") != -1){
            device.setDeviceType("TABLET");
        }else{
            device.setDeviceType("PC");
        }

        return device;
    }

}
