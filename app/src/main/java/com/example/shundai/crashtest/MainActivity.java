package com.example.shundai.crashtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tencent.bugly.crashreport.CrashReport;

public class MainActivity extends AppCompatActivity {


    private TextView tv;
    public static final String param="{\"result\":{\"ordinfo\":{\"ocount\":\"0\"},\"reqinfo\":{\"time\":5,\"list\":[{\"content\":\"余 * 最近一周完成了397单，收入2603.30元\"},{\"content\":\"冯 * 最近一周完成了368单，收入3034.61元\"},{\"content\":\"陈 * 最近一周完成了393单，收入3558.77元\"},{\"content\":\"武 * 最近一周完成了365单，收入2220.21元\"},{\"content\":\"梁 * 最近一周完成了111单，收入928.69元\"},{\"content\":\"蒋 * 最近一周完成了578单，收入4835.89元\"},{\"content\":\"陶 * 最近一周完成了535单，收入3745.00元\"},{\"content\":\"郝 * 最近一周完成了238单，收入2181.31元\"},{\"content\":\"毛 * 最近一周完成了134单，收入1129.10元\"},{\"content\":\"邵 * 最近一周完成了313单，收入2637.38元\"},{\"content\":\"韩 * 昊最近一周完成了415单，收入3267.71元\"},{\"content\":\"田 * 承最近一周完成了377单，收入2500.74元\"},{\"content\":\"史 * 最近一周完成了224单，收入2240.00元\"},{\"content\":\"赵 * 最近一周完成了272单，收入2291.91元\"},{\"content\":\"邓 * 文最近一周完成了424单，收入2613.71元\"},{\"content\":\"谢 * 恒最近一周完成了359单，收入3231.00元\"},{\"content\":\"廖 * 最近一周完成了345单，收入2886.48元\"},{\"content\":\"魏 * 最近一周完成了520单，收入5173.93元\"},{\"content\":\"邱 * 最近一周完成了336单，收入2303.50元\"},{\"content\":\"万 * 最近一周完成了195单，收入1217.77元\"},{\"content\":\"覃 * 嘉最近一周完成了222单，收入1332.00元\"},{\"content\":\"郭 * 最近一周完成了298单，收入1837.00元\"},{\"content\":\"林 * 最近一周完成了299单，收入2836.56元\"},{\"content\":\"孙 * 最近一周完成了249单，收入2083.28元\"},{\"content\":\"侯 * 睿最近一周完成了229单，收入2266.98元\"},{\"content\":\"严 * 恒最近一周完成了506单，收入4853.38元\"},{\"content\":\"武 * 最近一周完成了310单，收入2630.44元\"},{\"content\":\"蒋 * 建最近一周完成了311单，收入2468.49元\"},{\"content\":\"钱 * 最近一周完成了307单，收入1681.51元\"},{\"content\":\"薛 * 最近一周完成了302单，收入3004.86元\"},{\"content\":\"邹 * 最近一周完成了557单，收入4855.81元\"},{\"content\":\"方 * 学最近一周完成了521单，收入5078.08元\"},{\"content\":\"邓 * 最近一周完成了162单，收入958.40元\"},{\"content\":\"龙 * 嘉最近一周完成了367单，收入3481.67元\"},{\"content\":\"熊 * 学最近一周完成了82单，收入799.24元\"},{\"content\":\"李 * 最近一周完成了485单，收入4850.00元\"},{\"content\":\"史 * 润最近一周完成了539单，收入5084.92元\"},{\"content\":\"朱 * 最近一周完成了202单，收入1884.13元\"},{\"content\":\"冯 * 最近一周完成了382单，收入2781.00元\"},{\"content\":\"蒋 * 卓最近一周完成了98单，收入945.08元\"},{\"content\":\"田 * 最近一周完成了259单，收入2590.00元\"},{\"content\":\"廖 * 最近一周完成了553单，收入3626.26元\"},{\"content\":\"潘 * 永最近一周完成了557单，收入4130.82元\"},{\"content\":\"叶 * 最近一周完成了336单，收入2890.38元\"},{\"content\":\"沈 * 哲最近一周完成了234单，收入1516.49元\"},{\"content\":\"郭 * 最近一周完成了123单，收入1198.86元\"},{\"content\":\"林 * 志最近一周完成了248单，收入2326.45元\"},{\"content\":\"孙 * 睿最近一周完成了147单，收入1185.15元\"},{\"content\":\"曹 * 雨最近一周完成了295单，收入2554.77元\"},{\"content\":\"郝 * 最近一周完成了293单，收入2416.14元\"},{\"content\":\"程 * 恒最近一周完成了257单，收入1974.05元\"},{\"content\":\"龙 * 立最近一周完成了344单，收入3440.00元\"},{\"content\":\"卢 * 最近一周完成了524单，收入3475.82元\"},{\"content\":\"崔 * 奕最近一周完成了351单，收入2481.94元\"},{\"content\":\"贾 * 最近一周完成了595单，收入5321.84元\"},{\"content\":\"朱 * 最近一周完成了592单，收入5890.33元\"},{\"content\":\"谭 * 润最近一周完成了534单，收入4593.64元\"},{\"content\":\"史 * 最近一周完成了250单，收入2397.92元\"},{\"content\":\"周 * 最近一周完成了136单，收入1283.02元\"},{\"content\":\"曹 * 最近一周完成了220单，收入1475.80元\"},{\"content\":\"彭 * 俊最近一周完成了169单，收入1330.71元\"},{\"content\":\"田 * 最近一周完成了562单，收入3811.67元\"},{\"content\":\"何 * 最近一周完成了420单，收入2338.46元\"},{\"content\":\"张 * 承最近一周完成了249单，收入1688.80元\"},{\"content\":\"韩 * 博最近一周完成了223单，收入1608.08元\"},{\"content\":\"彭 * 最近一周完成了99单，收入970.00元\"},{\"content\":\"崔 * 宇最近一周完成了108单，收入648.00元\"},{\"content\":\"梁 * 最近一周完成了559单，收入4905.21元\"},{\"content\":\"杜 * 俊最近一周完成了323单，收入3081.22元\"},{\"content\":\"余 * 最近一周完成了215单，收入1442.26元\"},{\"content\":\"金 * 最近一周完成了451单，收入2991.60元\"},{\"content\":\"石 * 最近一周完成了515单，收入4748.07元\"},{\"content\":\"徐 * 最近一周完成了230单，收入2206.08元\"},{\"content\":\"孔 * 一最近一周完成了156单，收入1276.92元\"},{\"content\":\"武 * 最近一周完成了418单，收入3808.16元\"},{\"content\":\"曹 * 梓最近一周完成了90单，收入872.58元\"},{\"content\":\"洪 * 最近一周完成了149单，收入1105.01元\"},{\"content\":\"赵 * 最近一周完成了471单，收入2941.39元\"},{\"content\":\"朱 * 最近一周完成了111单，收入1005.15元\"},{\"content\":\"武 * 最近一周完成了494单，收入3630.14元\"},{\"content\":\"叶 * 最近一周完成了297单，收入2502.57元\"},{\"content\":\"曹 * 最近一周完成了201单，收入1669.63元\"},{\"content\":\"曾 * 最近一周完成了456单，收入2579.53元\"},{\"content\":\"高 * 雨最近一周完成了228单，收入2186.90元\"},{\"content\":\"龙 * 立最近一周完成了208单，收入1395.31元\"},{\"content\":\"夏 * 最近一周完成了385单，收入3080.00元\"},{\"content\":\"孙 * 最近一周完成了531单，收入3865.74元\"},{\"content\":\"韩 * 最近一周完成了194单，收入1767.42元\"},{\"content\":\"蒋 * 立最近一周完成了528单，收入2891.98元\"},{\"content\":\"胡 * 最近一周完成了415单，收入2490.00元\"},{\"content\":\"林 * 文最近一周完成了498单，收入3556.43元\"},{\"content\":\"夏 * 最近一周完成了495单，收入4669.82元\"},{\"content\":\"马 * 最近一周完成了365单，收入3097.13元\"},{\"content\":\"罗 * 明最近一周完成了114单，收入1099.38元\"},{\"content\":\"雷 * 最近一周完成了193单，收入1910.60元\"},{\"content\":\"夏 * 最近一周完成了369单，收入3361.75元\"},{\"content\":\"任 * 最近一周完成了510单，收入4446.08元\"},{\"content\":\"沈 * 子最近一周完成了356单，收入3282.16元\"},{\"content\":\"程 * 最近一周完成了281单，收入2810.00元\"},{\"content\":\"钟 * 最近一周完成了535单，收入4785.19元\"}],\"num\":31},\"userinfo\":{\"nickname\":\"\",\"ordernum\":0,\"isorder\":0,\"avatar\":null,\"userid\":\"\",\"setfee\":null,\"esccode\":null,\"deposit\":0,\"name\":\"郅志伟\",\"idcard\":\"410181199102288537\",\"mobile\":\"18538712527\",\"utelphone\":null,\"score\":0,\"servicetype\":null,\"ivtcode\":\"nR79IQ\",\"info\":\"请上传您的身份资料和银行卡号进行实名认证\",\"frzamount\":0,\"sex\":1,\"ctel\":\"400-826-8988\",\"grade\":\"铜牌\",\"isaudit\":\"0\",\"address\":null,\"agreement\":0,\"cmt\":null,\"wheels\":2,\"urgenter\":null,\"birth\":null,\"isupload\":\"1\",\"balance\":0},\"dayincome\":{\"income\":0,\"irank\":\"10329\"}},\"errormsg\":\"成功\",\"code\":0}\n";
    public static final String param1="\"list\":[]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("123456");
            }
        });

        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Bean bean = new Gson().fromJson(param, Bean.class);
                ObjectBean objectBean = new Gson().fromJson(param1, ObjectBean.class);
                try {
                } catch (JsonSyntaxException e) {
                    CrashReport.postCatchedException(e);
                }
            }
        });
    }
}
