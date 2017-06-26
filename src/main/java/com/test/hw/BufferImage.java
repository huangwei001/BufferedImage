package com.test.hw;

import sun.awt.windows.WInputMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 测试BufferImage(生成验证图片)
 * Created by huangwei on 2017/6/26.
 */
public class BufferImage extends HttpServlet{

    private static final int WIDTH = 120;
    private static final int HEIGHT = 30;

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //接收客户端传递的createFlag
        String createFlag = request.getParameter("createFlag");
        //在内存中创建一张图片
        BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        //设置背景色
        setBackGroud(graphics);
        //设置边框
        setBorder(graphics);
        //在图片上画干扰线
        drawRandomLine(graphics);
    }

    /**
     * 设置背景色
     * @param graphics
     */
    private void setBackGroud(Graphics2D graphics){
        //设置背景色
        graphics.setBackground(Color.white);
        //填充区域
        graphics.fillRect(0,0,WIDTH,HEIGHT);
    }

    /**
     * 设置边框
     * @param graphics
     */
    private void setBorder(Graphics2D graphics){
        graphics.setColor(Color.blue);
        graphics.drawRect(1,1,WIDTH - 1,HEIGHT - 1);
    }

    /**
     * 在图片上画干扰线
     * @param graphics
     */
    private void drawRandomLine(Graphics2D graphics){
        graphics.setColor(Color.green);
        for (int i = 0; i < 5; i++) {
            int x1 = new Random().nextInt(WIDTH);
            int y1 = new Random().nextInt(HEIGHT);
            int x2 = new Random().nextInt(WIDTH);
            int y2 = new Random().nextInt(HEIGHT);
            graphics.drawLine(x1,y1,x2,y2);
        }
    }

}
