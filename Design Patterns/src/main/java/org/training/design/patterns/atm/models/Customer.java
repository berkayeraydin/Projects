package org.training.design.patterns.atm.models;

import org.training.design.patterns.atm.ECustomerType;
import org.training.design.patterns.atm.with.patterns.behavioral.iterator.IAccountIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Customer implements Iterable<Account> {
    private String name;
    private String surname;
    private String username;
    private String        password;
    private List<Account> accounts;
    private ECustomerType customerType;

    public Customer() {
    }

    public  Customer(String name,
                     String surname,
                     String username,
                     String password,
                     List<Account> accounts,
                     ECustomerType customerType) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.accounts = accounts;
        this.customerType = customerType;
    }

    public IAccountIterator getCustomIterator(){
        return new AccountIterator();
    }

    public Iterator<Account> getAccountIterator(){
        return accounts.iterator();
    }

    @Override
    public Iterator<Account> iterator() {
        return accounts.iterator();
    }

    @Override
    public void forEach(Consumer<? super Account> action) {
        accounts.forEach(action);
    }

    @Override
    public Spliterator<Account> spliterator() {
        return accounts.spliterator();
    }

    public void forAccountEach(Consumer<? super Account> action) {
        accounts.forEach(action);
    }

    public void forAccountEach2(Consumer<? super Account> action) {
        for (Account a:
             accounts) {
            action.accept(a);
        }
    }

    public Stream<Account> accountStream() {
        return accounts.stream();
    }


    public class AccountIterator implements IAccountIterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (accounts == null){
                return false;
            }
            return index < accounts.size();
        }

        @Override
        public Account next() {
            return accounts.get(index++);
        }
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public ECustomerType getCustomerType() {
        return this.customerType;
    }

    public static class CustomerBuilder {
        private String        name;
        private String        surname;
        private String        username;
        private String        password;
        private List<Account> accounts;
        private ECustomerType customerType;

        CustomerBuilder() {
        }

        public CustomerBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public CustomerBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public CustomerBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public CustomerBuilder withAccounts(List<Account> accounts) {
            this.accounts = accounts;
            return this;
        }

        public CustomerBuilder withCustomerType(ECustomerType customerType) {
            this.customerType = customerType;
            return this;
        }

        public Customer build() {
            return new Customer(name,
                                surname,
                                username,
                                password,
                                accounts,
                                customerType);
        }

        public String toString() {
            return "Customer.CustomerBuilder(name=" + this.name + ", surname=" + this.surname + ", username=" + this.username + ", password=" + this.password + ", accounts=" + this.accounts + ", customerType=" + this.customerType + ")";
        }
    }
}
