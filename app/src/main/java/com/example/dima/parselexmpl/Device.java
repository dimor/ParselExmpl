package com.example.dima.parselexmpl;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Dima on 3/1/2017.
 */

public class Device implements Parcelable{


    String model;
    String maker;
    String size;
    int year;

    public Device(String model, String size, int year, String maker) {
        this.model = model;
        this.size = size;
        this.year = year;
        this.maker = maker;
    }

    protected Device(Parcel in) {
        model = in.readString();
        maker = in.readString();
        size = in.readString();
        year = in.readInt();
    }

    public static final Creator<Device> CREATOR = new Creator<Device>() {
        @Override
        public Device createFromParcel(Parcel in) {
            return new Device(in);
        }

        @Override
        public Device[] newArray(int size) {
            return new Device[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(model);
        dest.writeString(maker);
        dest.writeString(size);
        dest.writeInt(year);
    }
}


