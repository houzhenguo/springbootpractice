package com.houzhenguo.demo_1.dao;

import com.houzhenguo.demo_1.bean.Account;

import java.util.List;

public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
