package org.training.design.patterns.temp.creational;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class Customer {

    // Bunlar dışarıda da kullanılacak bir data. Bunlar object yaratıldıktan sonra değişecek mi değişmeyecek mi ?
    // Hangi datalara dışardan verecek. (Dışardan okunabilecek)
    // Hangi datalara dışardan değiştirmesşne izin vericem ?
    // İçsel mi Dışsal mı ?
    private String name;
    private String surname;
    private String username;
    private String password;
    private LocalDate birthDate;

    // Dışarı verilmeyecek, sadece içerde kullanılacaksa içsel bir data. iç bir daha
    private int counter;
    private List<String> actions ;
}
