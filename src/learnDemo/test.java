package learnDemo;

import org.openjdk.jol.vm.VM;

/**
 * @className: test
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/18
 **/

enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
class EnumOne
{
    public static void main(String[]args)
    {
        //System.out.println(AccountType.FIXED);

        int a = 1;
        Integer b = 1;
        System.out.println("a的内存地址："+ VM.current().addressOf(a));
        System.out.println("b的内存地址："+VM.current().addressOf(b));
    }
}
