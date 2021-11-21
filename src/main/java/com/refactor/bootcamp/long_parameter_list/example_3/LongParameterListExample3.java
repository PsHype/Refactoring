package com.refactor.bootcamp.long_parameter_list.example_3;

import java.time.LocalDate;
import java.util.List;

/**
 * 你常会看到特定的一组参数总是被一起传递。可能有好几个函数都使用这一组参数，这些函数可能隶属同一个类，也可能隶属不同的类。
 * 这样的一组参数其实就是数据泥团(Data Clumps),我们可以运用一个对象包装所有参数，再让这些参数去替换它们，哪怕是单纯是把这些数据
 * 组织在一起，这样做的价值也是值得的，因为过长的参数列并不好理解，而新对象锁定一的访问函数，可以使得代码更具一致性，这样更进一步降低
 * 理解代码和修改代码的难度。
 * <p>
 * 还有一个好处是，当你把这些参数组织到一起后，往往很快可以发现一些被移至其它类的行为。通常，原本使用那些参数的函数，对这一组参数会有
 * 一些共通的处理，可以把这些行为放到新对象中，这样又进一步减少了重复代码。
 */
public class LongParameterListExample3 {
    public double amountInvoiceId(LocalDate startDate, LocalDate endDate) {
        return 0;
    }

    public double amountReceiveIn(LocalDate startDate, LocalDate endDate) {
        return 1;
    }

    public double amountOverdueIn(LocalDate startDate, LocalDate endDate) {
        return 2;
    }

    private final Account account;

    public LongParameterListExample3(List<Entry> entries) {
        account = new Account(entries);
    }

    public double getChargeValueBetween(LocalDate startDate, LocalDate endDate) {
        return account.getChargeValueBetween(startDate, endDate);
    }
}
