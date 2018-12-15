/**
 * Created by Tjl on 2018/12/13 9:22.
 */
public class demo2 {
/**
 * 储蓄计算
 */
    public static void main(String[] args) {
        //定存
        double dingchun = 3000;
        //定存年份
        int year = 8;
        //总额
        double sum = 0;
        //年利率
        double lilv = 0.04;
        //月收益
        double MMshouyi =0;
        //合计收益
        double sum_shouyi=0;
        //本金
        double benji = 0;

        System.out.println(dingchun * 96 / 10000.0);
        for (int i = 1; i <= year; i++) {
            //比前一年每月多存300
            dingchun = dingchun+300;
            for (int j = 1; j <= 12; j++) {
                MMshouyi = sum*lilv/12;
                System.out.println("总金:"+sum / 10000+"    本金"+benji+"   月收益"+(MMshouyi)+"元");
                sum = sum +MMshouyi + dingchun;
                benji = benji+dingchun;
                sum_shouyi+=MMshouyi;
            }
            System.out.println("第"+i+"年合计收益   "+sum_shouyi/ 10000+"万元");
        }
        System.out.println(year + "年," +
                lilv + "年化利率," +
                "本金" + benji +
                "+收益:" + (sum_shouyi) );
    }
}
