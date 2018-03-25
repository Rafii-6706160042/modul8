package org.d3ifcool.pandoma;

/**
 * Created by RaR on 13/03/2018.
 */

public class Word {
    private String mNamaPasienWord;
    private String mTanggalWord;
    private int mImageResourceId;

    public Word(String NamaPasienWord, String TanggalWord, int ImageResourceId) {
        mImageResourceId= ImageResourceId;
        mNamaPasienWord = NamaPasienWord;
        mTanggalWord = TanggalWord;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmNamaPasienWord() {
        return mNamaPasienWord;
    }

    public String getmTanggalWord() {
        return mTanggalWord;
    }
}
