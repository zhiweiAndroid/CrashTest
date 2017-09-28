package com.example.shundai.crashtest;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import com.tencent.bugly.crashreport.CrashReport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by win7 on 2017/9/27.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Context context = getApplicationContext();
// 获取当前包名
        String packageName = context.getPackageName();
// 获取当前进程名
        String processName = getProcessName(android.os.Process.myPid());
// 设置是否为上报进程
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(context);
        strategy.setUploadProcess(processName == null || processName.equals(packageName));
// 初始化Bugly
        CrashReport.initCrashReport(context, "1e0d1ef38b", false, strategy);
//        Cockroach.install(new Cockroach.ExceptionHandler() {
//
//            // handlerException内部建议手动try{  你的异常处理逻辑  }catch(Throwable e){ } ，以防handlerException内部再次抛出异常，导致循环调用handlerException
//
//            @Override
//            public void handlerException(final Thread thread, final Throwable throwable) {
//                new Handler(Looper.getMainLooper()).post(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            Log.e("Cockroach", thread + "\n" + throwable.toString());
//                            throwable.printStackTrace();
//                            Toast.makeText(MyApplication.this, "Exception Happend\n" + thread + "\n" + throwable.toString(), Toast.LENGTH_LONG).show();
////                        throw new RuntimeException("..."+(i++));
//
//
//                        } catch (Throwable e) {
//
//                        }
//                    }
//                });
//            }
//        });

    }
    /**
     * 获取进程号对应的进程名
     *
     * @param pid 进程号
     * @return 进程名
     */
    private static String getProcessName(int pid) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            String processName = reader.readLine();
            if (!TextUtils.isEmpty(processName)) {
                processName = processName.trim();
            }
            return processName;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }


}
