package com.fynnjason.app.lib;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * Created by FynnJason on on 2018/9/20.
 * Function：Glide简易封装
 */
public class GlideUtils {

    private GlideUtils() {

    }

    private static class Holder {
        private static GlideUtils sGlideUtils = new GlideUtils();
    }

    public static GlideUtils getInstance() {
        return Holder.sGlideUtils;
    }


    public GlideUtils setPlaceholder(int placeholder) {
        Config.placeholder = placeholder;
        return this;
    }

    public GlideUtils setError(int error) {
        Config.error = error;
        return this;
    }

    public GlideUtils setThumbnail(float sizeMultiplier) {
        Config.sizeMultiplier = sizeMultiplier;
        return this;
    }

    public GlideUtils setCrossFade(int duration) {
        Config.duration = duration;
        return this;
    }

    /**
     * 加载图片
     *
     * @param context 上下文
     * @param url     网络图片地址
     */
    public static void load(Context context, String url, ImageView view) {
        Glide.with(context).load(url).placeholder(Config.placeholder).error(Config.error).thumbnail(Config.sizeMultiplier).crossFade(Config.duration).into(view);
    }

    /**
     * 加载图片
     *
     * @param context 上下文
     * @param uri     uri
     */
    public static void load(Context context, Uri uri, ImageView view) {
        Glide.with(context).load(uri).placeholder(Config.placeholder).error(Config.error).thumbnail(Config.sizeMultiplier).crossFade(Config.duration).into(view);
    }

    /**
     * 加载图片
     *
     * @param context    上下文
     * @param resourceId 图片id
     */
    public static void load(Context context, Integer resourceId, ImageView view) {
        Glide.with(context).load(resourceId).placeholder(Config.placeholder).error(Config.error).thumbnail(Config.sizeMultiplier).crossFade(Config.duration).into(view);
    }

    /**
     * 加载图片
     *
     * @param context 上下文
     * @param model   图片字节流数组
     */
    public static void load(Context context, Byte[] model, ImageView view) {
        Glide.with(context).load(model).placeholder(Config.placeholder).error(Config.error).thumbnail(Config.sizeMultiplier).crossFade(Config.duration).into(view);
    }

    /**
     * 加载图片
     *
     * @param context 上下文
     * @param file    图片文件
     */
    public static void load(Context context, File file, ImageView view) {
        Glide.with(context).load(file).placeholder(Config.placeholder).error(Config.error).thumbnail(Config.sizeMultiplier).crossFade(Config.duration).into(view);
    }

}
