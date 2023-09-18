package org.training.design.patterns.temp.creational;

import org.training.design.patterns.temp.creational.CustomerImmutable1;
import org.training.design.patterns.temp.creational.CustomerImmutable3;
import org.training.design.patterns.temp.creational.CustomerMutable;

public class RunTest {

    public static void main(String[] args) {
        CustomerImmutable1 customerImmutable1 = new CustomerImmutable1("Berkay",
                "Eraydın",
                "berkay.eraydin",
                "Abc");

        // Immutable objeyi en iyi yaratmanın yolu = Builder Pattern dir. Çok kullanılıyor.
        // İlerde okuma zorluğu
        // Analma zorluğu
        // İleride bir şey ekleme zorluğu var

        CustomerImmutable3 customerImmutable3 = CustomerImmutable3.builder()
                .withName("Berkay")
                .withSurname("eraydın")
                .build();


        CustomerMutable customerMutable = CustomerMutable.createCustomer()
                .setName("Berkay")
                .setSurname("eraydin")
                .setUsername("berkay.eraydin")
                .setPassword(null)
                .setBirthDate(null);

    }
}
