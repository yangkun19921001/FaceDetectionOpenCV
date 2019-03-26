package com.lightweh.face;

import android.graphics.Bitmap;

/**
 * Created by yangk on 2018/12/27.
 */

public class FaceBean {
    private String imgUrl;

    public FaceBean(String imgUrl, Bitmap bitmap, String fileName, boolean isSelect) {
        this.imgUrl = imgUrl;
        this.bitmap = bitmap;
        this.fileName = fileName;
        this.isSelect = isSelect;
    }

    public FaceBean() {
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    private Bitmap bitmap;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String fileName;

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    private boolean isSelect;
}
