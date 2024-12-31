package com.qrcodebenchmark;

import java.io.ByteArrayOutputStream;
import java.util.Base64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@SpringBootApplication
public class QRCodeBenchmarkApplication {
    public static void main(String[] args) {
        SpringApplication.run(QRCodeBenchmarkApplication.class, args);
        generateQRCode();
    }

    public static void generateQRCode() {
        long start = System.currentTimeMillis();
        String value = "LPA:1$RSP-1016.OBERTHUR.NET$8YEY4-6OXXO-K1XCL-WIVK3$1.3.6.1.4.1.30703.836685.503.102.101";
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(value, BarcodeFormat.QR_CODE, 500, 500);    
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix,"png", outputStream);
    
            String base64 = new String(Base64.getEncoder().encode(outputStream.toByteArray()));

            System.out.println("It took " + (System.currentTimeMillis() - start) + " ms");
            System.out.println("Image Base64 Code");
            System.out.println("data:image/gif;base64," + base64);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
