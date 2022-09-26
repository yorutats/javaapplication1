/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author s2000
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("23333");
        
        // *變數的生命週期-宣告 配置 初始化 回收*
        
        int a; //生命週期-宣告i、配置int的空間給i
        a=5; //生命週期-初始化
       
        System.out.println(a);
        
        char ttt = 'A';
        
        int grade=70;
        
        if (grade >=60){
            System.out.println("通過");
        }else
        {
            System.out.println("不通過");
        }
        
        int sum=0;
        for(int i=1;i<=10;i=i+1)//起始條件;終止條件;變化條件 
        {
            if(i%4==1 || i%4==0)
            {
                sum=sum+1;
            }
            else
            {
                sum=sum+1;
            }    
        }
        System.out.println(sum);
        
        int i; //變數要在區塊錢宣告
        for(i=1;i<=10;i=i+1)//起始條件;終止條件;變化條件 
        {
            if(i%4==1 || i%4==0)
            {
                sum=sum+1;
            }
            else
            {
                sum=sum+1;
            }    
        }
        System.out.println(i); 
        
        int b=3;
        float j=(float)3.3; //or 3.3f，否則4bytes的float放不下3.3 
        double k=3.3;
        //jave左右兩邊一定是相同的資料型別
        
        //float j=(float)3.3;//大型別轉小型別-DownCasting
        //小變大會自動加入-UpCasting
        
    } //生命週期-回收
    
}
