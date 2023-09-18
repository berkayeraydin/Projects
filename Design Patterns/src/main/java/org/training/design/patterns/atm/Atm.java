package org.training.design.patterns.atm;

import org.training.design.patterns.atm.models.Account;
import org.training.design.patterns.atm.models.Customer;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Atm {
    private Map<String, Customer> customerMap = new ConcurrentHashMap<>();
    private DbConnection          connection  = new DbConnection();


    public Atm() {
    }

    public void boot(){
        Customer customer = Customer.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withUsername("osmany")
                                    .withPassword("123456")
                                    .withAccounts(Arrays.asList(Account.builder()
                                                                       .withAccountType(EAccountType.TL)
                                                                       .withName("osmantl")
                                                                       .withAmount(BigDecimal.valueOf(1000L))
                                                                       .build()))
                                    .build();
        customerMap.put(customer.getUsername(),
                        customer);

    }

    public void suspend(){
        System.out.println("Şu anda servis veremiyoruz");
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username:");
            String username = scanner.nextLine();
            System.out.println("password:");
            String password = scanner.nextLine();
            Customer customer = customerMap.get(username);
            if (customer != null) {
                root:
                while (true) {
                    System.out.println("1-TL den para çekme");
                    System.out.println("2-TL ye para yatırma");
                    System.out.println("3-TL para transferi");
                    System.out.println("4-TL para görüntüle");
                    System.out.println("5-DOLAR den para çekme");
                    System.out.println("6-DOLAR ye para yatırma");
                    System.out.println("7-DOLAR para transferi");
                    System.out.println("8-DOLAR para görüntüle");
                    System.out.println("seçiminiz : ");
                    int menuIndex = scanner.nextInt();
                    switch (menuIndex) {
                        case 1: {
                            System.out.println("Çekeceğiniz miktar : ");
                            BigDecimal withdrawAmount = scanner.nextBigDecimal();
                            withdraw(customer,
                                     withdrawAmount,
                                     EAccountType.TL);
                            connection.sendSql(customer);
                            break;
                        }
                        case 2: {
                            System.out.println("Yatıracağınız miktar : ");
                            BigDecimal depositAmount = scanner.nextBigDecimal();
                            deposit(customer,
                                    depositAmount,
                                    EAccountType.TL);
                            connection.sendSql(customer);
                            break;
                        }
                        case 3: {
                            System.out.println("Gönderilecek hesap no : ");
                            String accountNumber = scanner.next();
                            System.out.println("Göndereceğiniz miktar : ");
                            BigDecimal transferAmount = scanner.nextBigDecimal();
                            transfer(customer,
                                     transferAmount,
                                     EAccountType.TL,
                                     accountNumber);
                            connection.sendSql(customer);
                            break;
                        }
                        case 4: {
                            show(customer,
                                 EAccountType.TL);
                            connection.sendSql(customer);
                            break;
                        }
                        case 5: {
                            System.out.println("Çekeceğiniz miktar : ");
                            BigDecimal withdrawAmount = scanner.nextBigDecimal();
                            withdraw(customer,
                                     withdrawAmount,
                                     EAccountType.DOLAR);
                            connection.sendSql(customer);
                            break;
                        }
                        case 6: {
                            System.out.println("Yatıracağınız miktar : ");
                            BigDecimal depositAmount = scanner.nextBigDecimal();
                            deposit(customer,
                                    depositAmount,
                                    EAccountType.DOLAR);
                            connection.sendSql(customer);
                            break;
                        }
                        case 7: {
                            System.out.println("Gönderilecek hesap no : ");
                            String accountNumber = scanner.next();
                            System.out.println("Göndereceğiniz miktar : ");
                            BigDecimal transferAmount = scanner.nextBigDecimal();
                            transfer(customer,
                                     transferAmount,
                                     EAccountType.DOLAR,
                                     accountNumber);
                            connection.sendSql(customer);
                            break;
                        }
                        case 8: {
                            show(customer,
                                 EAccountType.DOLAR);
                            connection.sendSql(customer);
                            break;
                        }
                        default:
                            break root;
                    }

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void show(Customer customer,
                      EAccountType accountType) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }

    private void transfer(Customer customer,
                          BigDecimal transferAmount,
                          EAccountType accountType,
                          String accountNumber) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.subtract(transferAmount));
            System.out.println(accountType + " gönderme İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }

    private void deposit(Customer customer,
                         BigDecimal depositAmount,
                         EAccountType accountType) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.add(depositAmount));
            System.out.println(accountType + " yatırma İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }

    private void withdraw(Customer customer,
                          BigDecimal withdrawAmount,
                          EAccountType accountType) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.subtract(withdrawAmount));
            System.out.println(accountType + " çekme İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }
    }

}
