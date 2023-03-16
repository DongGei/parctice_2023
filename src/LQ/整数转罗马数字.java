package LQ;

/**
 * @className: 整数转罗马数字
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/13
 **/
public class 整数转罗马数字 {
    int  numq=0;
    public String intToRoman(int num) {
        numq=num;
        String res="";
        while(numq>0)
        {
            res = res+GetStr();
        }
        return res;
    }

    String GetStr()
    {
        if(numq>=1000)
        {
            numq -= 1000;
            return "M";
        }
        else if(numq>=900)
        {
            numq -= 900;
            return "CM";
        }
        else if(numq>=500)
        {
            numq -= 500;
            return "D";
        }
        else if(numq>=400)
        {
            numq -= 400;
            return "CD";
        }
        else if(numq >=100)
        {
            numq -= 100;
            return "C";
        }
        else if(numq>=90)
        {
            numq -= 90;
            return "XC";
        }
        else if(numq>=50)
        {
            numq -= 50;
            return "L";
        }
        else if(numq >=40)
        {
            numq-= 40;
            return "XL";
        }
        else if(numq>=10)
        {
            numq -= 10;
            return "X";
        }
        else if(numq>=9)
        {
            numq -= 9;
            return "IX";
        }
        else if(numq>=5)
        {
            numq -= 5;
            return "V";
        }
        else if(numq>=4)
        {
            numq -= 4;
            return "IV";
        }
        else
        {
            numq-=1;
            return "I";
        }
    }

}
