package com.mth.MyTripHistory.com;

import jakarta.servlet.http.HttpServletRequest;

public class DeviceUtils {

    public Device getCurrentDevice(HttpServletRequest request) {
        Device device = null;
        String deviceHeader = request.getHeader("User-Agent").toUpperCase();
        if(deviceHeader.indexOf("MOBILE") != -1){
            //device ;
        }else if(deviceHeader.indexOf("TABLET") != -1){

        }else{
            //device
        }

        return device;
    }

}
