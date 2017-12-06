package cn.com.saints.spec;

import java.util.HashMap;

/**
 * Created by MyLady on 16/2/15.
 */
public class DigitalContentType {
    public static final int Real = 0;
    public static final int Vod = 1;
    public static final int Audio = 2;
    public static final int Web = 3;
    public static final int Image = 4;

    public static HashMap<Integer, Integer> ResourceMap = new HashMap<>(5);

    static {
        ResourceMap.put(DigitalContentType.Real, ResourceCode.RealSource);
        ResourceMap.put(DigitalContentType.Vod, ResourceCode.VideoFileSource);
        ResourceMap.put(DigitalContentType.Audio, ResourceCode.AudioFileSource);
        ResourceMap.put(DigitalContentType.Web, ResourceCode.WebSource);
        ResourceMap.put(DigitalContentType.Image, ResourceCode.ImageSource);
    }
}
