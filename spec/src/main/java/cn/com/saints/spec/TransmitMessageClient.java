package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by MyLady on 16/2/19.
 */
public class TransmitMessageClient {

    @SerializedName("Product")
    private ProductInfo product;

    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo product) {
        this.product = product;
    }

    @SerializedName("IPAddresses")
    private ArrayList<String> ipAddresses;

    public ArrayList<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(ArrayList<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    @SerializedName("MacAddresses")
    private ArrayList<String> macAddresses;

    public ArrayList<String> getMacAddresses() {
        return macAddresses;
    }

    public void setMacAddresses(ArrayList<String> macAddresses) {
        this.macAddresses = macAddresses;
    }
}
