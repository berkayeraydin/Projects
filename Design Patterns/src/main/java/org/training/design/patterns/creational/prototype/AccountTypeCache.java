package org.training.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccountTypeCache {

    private Map<Integer,Account> accountTypeMap = new ConcurrentHashMap<>();

    public Account createAccount(int accountType) {
        Account account = accountTypeMap.get(accountType);
        if (account == null) {
            // Db ye git dataları al
            account = new Account(null,
                    0D,
                    accountType,
                    "desc" + accountType,
                    "sd" + accountType,
                    "end" + accountType);
            accountTypeMap.put(accountType,account);
        }
        return account.cloneMe();
    }
}
