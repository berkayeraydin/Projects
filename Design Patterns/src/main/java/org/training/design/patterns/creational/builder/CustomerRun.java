package org.training.design.patterns.creational.builder;

// Builder Pattern dediğimiz bu

public class CustomerRun {
    public static void main(String[] args) {

        // Immutable bir objenin en iyi yaratma yolunu yapmış oluyoruz.

        Customer customer = Customer.getBuilder().setName("Berkay")
                .setSurname("eraydin")
                .setUsername("berkay.eraydin")
                .setPassword("123")
                .setBirthDate(null)
                .build();

        // Okuma kolaylığı
        // Anlama kolaylığı
        // Daha sonra yeni bir şey ekleme kolaylığı var.

        // Buna DSL deniyor. Tek satırda kod yazma.
    }
}
