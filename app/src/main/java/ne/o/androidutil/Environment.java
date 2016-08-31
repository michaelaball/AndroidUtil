package ne.o.androidutil;

/**
 * Created by Michael on 8/29/2016.
 */

public class Environment {

    public static String getExternalStorageDirectory() {
        return android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static boolean isExternalStorageEmulated() {
        return android.os.Environment.isExternalStorageEmulated();
    }

    public static String getExternalStorageState() {
        return android.os.Environment.getExternalStorageState();
    }

    public static String getDataDirectory() {
        return android.os.Environment.getDataDirectory().getAbsolutePath();
    }

    public static String getDownloadCacheDirectory() {
        return android.os.Environment.getDownloadCacheDirectory().getAbsolutePath();
    }

    public static String getRootDirectory() {
        return android.os.Environment.getRootDirectory().getAbsolutePath();
    }

}
