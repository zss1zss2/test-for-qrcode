package com.zss.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Service
public class QRCodeService {

    @Autowired
    private MatrixToImageWriter matrixToImageWriter;

    public void generateQrCode(String content){
        String format = "png";
        Map<EncodeHintType,Object> map = new HashMap<>();
        map.put(EncodeHintType.CHARACTER_SET,"utf-8");
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        map.put(EncodeHintType.MARGIN,2);
        try {
            BitMatrix hell_world = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, 900, 900, map);
            File file = new File("D:\\ER.png");
            matrixToImageWriter.writeToFile(hell_world,format,file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
