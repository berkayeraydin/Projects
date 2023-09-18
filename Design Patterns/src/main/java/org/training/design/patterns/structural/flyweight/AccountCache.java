package org.training.design.patterns.structural.flyweight;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccountCache {

    private Map<String, AccountFly> accountFlyMap = new ConcurrentHashMap<>();
    private Map<Integer, AccountTypeInfo> accountFlyTypeMap = new ConcurrentHashMap<>();

    public void add(AccountFly account) {
        accountFlyMap.put(account.getName(),
                          account);
    }

    public AccountFly getAccount(String accountName) {
        return accountFlyMap.get(accountName);
    }

}
