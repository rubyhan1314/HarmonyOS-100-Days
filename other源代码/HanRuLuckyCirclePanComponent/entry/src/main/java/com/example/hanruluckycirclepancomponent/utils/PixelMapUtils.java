package com.example.hanruluckycirclepancomponent.utils;

import ohos.app.Context;
import ohos.global.resource.NotExistException;
import ohos.global.resource.Resource;
import ohos.global.resource.ResourceManager;
import ohos.media.image.ImageSource;
import ohos.media.image.PixelMap;
import ohos.media.image.common.PixelFormat;
import ohos.media.image.common.Rect;
import ohos.media.image.common.Size;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;

/**
 * PixelMapUtils类，加载本地图片资源，通过本地图片资源的resourceId，将图片转换成PixelMap类型。
 */
public class PixelMapUtils {
    private static final String TAG = "PixelMapUtils"; 
 
    private PixelMapUtils() { 
    } 
 
    private static byte[] readResource(Resource resource) {
        final int bufferSize = 1024; 
        final int ioEnd = -1; 
        byte[] byteArray; 
        byte[] buffers = new byte[bufferSize]; 
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            while (true) { 
                int readLen = resource.read(buffers, 0, bufferSize); 
                if (readLen == ioEnd) { 
                    LogUtils.error(TAG, "readResource finish"); 
                    byteArray = output.toByteArray(); 
                    break; 
                } 
                output.write(buffers, 0, readLen); 
            } 
        } catch (IOException e) {
            LogUtils.debug(TAG, "readResource failed " + e.getLocalizedMessage()); 
            return new byte[0]; 
        } 
        LogUtils.info(TAG, "readResource len: " + byteArray.length); 
        return byteArray; 
    } 
 
    /** 
     * Creates a {@code PixelMap} object based on the image resource ID. 
     * 
     * This method only loads local image resources. If the image file does not exist or the loading fails, 
     * {@code null} is returned. 
     * 
     * @param resourceId Indicates the image resource ID. 
     * @param slice Indicates the slice. 
     * @return Returns the image. 
     */ 
    public static Optional<PixelMap> createPixelMapByResId(int resourceId, Context slice) {
        final float rotateDegrees = 90F; 
        ResourceManager manager = slice.getResourceManager();
        if (manager == null) { 
            return Optional.empty(); 
        } 
        try (Resource resource = manager.getResource(resourceId)) { 
            if (resource == null) { 
                return Optional.empty(); 
            } 
            ImageSource.SourceOptions srcOpts = new ImageSource.SourceOptions();
            srcOpts.formatHint = "image/png"; 
            ImageSource imageSource = ImageSource.create(readResource(resource), srcOpts); 
            if (imageSource == null) { 
                return Optional.empty(); 
            } 
            ImageSource.DecodingOptions decodingOpts = new ImageSource.DecodingOptions(); 
            decodingOpts.desiredSize = new Size(0, 0);
            decodingOpts.desiredRegion = new Rect(0, 0, 0, 0);
            decodingOpts.desiredPixelFormat = PixelFormat.ARGB_8888;
            decodingOpts.rotateDegrees = rotateDegrees; 
 
            return Optional.of(imageSource.createPixelmap(decodingOpts)); 
        } catch (NotExistException | IOException e) {
            return Optional.empty(); 
        } 
    } 
}

