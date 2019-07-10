package com.example.linhu.studio6test.prototype;

import java.util.ArrayList;

/**
 * Author:linhu
 * Email:lhzheng@grandstream.cn
 * Date:19-5-6
 */
public class WordDocument implements Cloneable {
    //文本
    private String mText;

    //图片列表
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument(){
        System.out.println("---WordDocument 构造函数----");
    }

    @Override
    protected WordDocument clone()  {

        try {
            WordDocument document = (WordDocument) super.clone();
            document.mText = this.mText;
            //浅拷贝，实际拷贝对象同原始对象指向的是同一个ArrayList对象，所以拷贝对象修改会影响原始对象
            document.mImages = this.mImages;
            //深拷贝,对mImages对象也调用clone()函数，进行深拷贝, 所以对拷贝对象的修改不会影响原始对象
            //document.mImages = (ArrayList<String>)this.mImages.clone();
            return document;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImage(String image) {
        mImages.add(image);
    }

    //打印文档内容
    public void showDocument(){
        System.out.println("------Word Content Start-----");
        System.out.println("Text: "+mText);
        System.out.println("Images List: ");
        for(String imgName: mImages){
            System.out.println("image name: "+imgName);
        }
        System.out.println("------Word Content End-----");


    }
}
