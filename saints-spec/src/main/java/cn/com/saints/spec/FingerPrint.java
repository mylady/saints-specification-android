package cn.com.saints.spec;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyLady on 07/12/2017.
 */

public class FingerPrint {
    @SerializedName("CharacterCode")
    private String characterCode;

    public String getCharacterCode() {
        return characterCode;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }
}
