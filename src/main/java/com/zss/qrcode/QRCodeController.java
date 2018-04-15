package com.zss.qrcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class QRCodeController {

    @Autowired
    private QRCodeService qrCodeService;

    @GetMapping(path = "/qrcode")
    public void getQrcode(@RequestParam String content){
        qrCodeService.generateQrCode(content);
    }
}
