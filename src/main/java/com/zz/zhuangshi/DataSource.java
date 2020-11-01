package com.zz.zhuangshi;

/**
 * @since 1.0
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
