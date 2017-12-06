package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyLady on 16/2/16.
 */
public class UpdateDetail {

    @SerializedName("ProductId")
    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @SerializedName("OS")
    private int os;

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }

    @SerializedName("OldVersion")
    private int oldVersion;

    public int getOldVersion() {
        return oldVersion;
    }

    public void setOldVersion(int oldVersion) {
        this.oldVersion = oldVersion;
    }

    @SerializedName("NewVersion")
    private int newVersion;

    public int getNewVersion() {
        return newVersion;
    }

    public void setNewVersion(int newVersion) {
        this.newVersion = newVersion;
    }

    @SerializedName("ShouldUpdate")
    private boolean shouldUpdate;

    public boolean isShouldUpdate() {
        return shouldUpdate;
    }

    public void setShouldUpdate(boolean shouldUpdate) {
        this.shouldUpdate = shouldUpdate;
    }

    @SerializedName("UpdateAddress")
    private String updateAddress;

    public String getUpdateAddress() {
        return updateAddress;
    }

    public void setUpdateAddress(String updateAddress) {
        this.updateAddress = updateAddress;
    }
}
