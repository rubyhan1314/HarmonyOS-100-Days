package com.example.hanruluckycirclepancomponent.customcomponent;

import com.example.hanruluckycirclepancomponent.ResourceTable;
import com.example.hanruluckycirclepancomponent.utils.ColorUtils;
import com.example.hanruluckycirclepancomponent.utils.PixelMapUtils;
import com.example.hanruluckycirclepancomponent.utils.ToastUtils;
import ohos.agp.animation.Animator;
import ohos.agp.animation.AnimatorValue;
import ohos.agp.components.Component;
import ohos.agp.render.*;
import ohos.agp.utils.Color;
import ohos.agp.utils.RectFloat;
import ohos.agp.utils.TextAlignment;
import ohos.app.Context;
import ohos.global.configuration.DeviceCapability;
import ohos.media.image.PixelMap;
import ohos.multimodalinput.event.TouchEvent;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * LuckyCirclePanComponent类，实现自定义组件，绘制圆形抽奖转盘，并实现抽奖效果。
 */
public class LuckyCirclePanComponent extends Component implements Component.DrawTask,
        Component.EstimateSizeListener, Component.TouchEventListener { 
    private static final int CIRCLE = 360; 
    private static final int TWO = 2; 
    private static final int THREE = 3; 
    private static final int FIVE = 5; 
 
    // 盘块的个数 
    private static final int COUNT = 6; 
 
    // 开始角度 
    private float startAngle = 0; 
 
    // 平均每份的角度 
    private float avgAngle = CIRCLE / COUNT; 
 
    // 边框间距 
    private int padding; 
 
    // 宽度和高度 
    private float width; 
    private float height; 
 
    // 中心的X，Y坐标 
    private float centerX; 
    private float centerY; 
 
    // 画内部扇形的画笔 
    private Paint paintInnerArc;
 
    // 画内部扇形文字的画笔 
    private Paint paintArcText; 
 
    // 外部圆弧的画笔 
    private Paint paintOutCircle; 
 
    // 内部圆弧的画笔 
    private Paint paintCenterCircle; 
 
    // 中间文字的画笔 
    private Paint paintCenterText; 
 
    // 画转盘大指针的画笔 
    private Paint paintPointer; 
 
    // 画转盘小指针的画笔 
    private Paint paintSmallPoint; 
 
    // 画图片的画笔 
    private Paint paintImage; 
 
    // 画外圆外面的花瓣 
    private Paint paintFlower; 
 
    // 画五角星的画笔 
    private Paint paintFive; 
 
    // 每个盘块的颜色 
    private Color[] colors = {ColorUtils.ARC_PINK, ColorUtils.ARC_YELLOW, ColorUtils.ARC_BLUE,
        ColorUtils.ARC_PINK, ColorUtils.ARC_YELLOW, ColorUtils.ARC_BLUE, }; 
 
    // 抽奖的文字 
    private String[] textArrs = {"华为手表", "华为平板", "恭喜发财", "华为手机", "华为耳机", "恭喜发财"}; 
 
    // 与文字对应的图片 
    private PixelMap[] pixelMaps = {
            PixelMapUtils.createPixelMapByResId(ResourceTable.Media_watch, getContext()).get(),
            PixelMapUtils.createPixelMapByResId(ResourceTable.Media_tablet, getContext()).get(),
            PixelMapUtils.createPixelMapByResId(ResourceTable.Media_thanks, getContext()).get(),
            PixelMapUtils.createPixelMapByResId(ResourceTable.Media_phone, getContext()).get(),
            PixelMapUtils.createPixelMapByResId(ResourceTable.Media_headset, getContext()).get(),
            PixelMapUtils.createPixelMapByResId(ResourceTable.Media_thanks, getContext()).get()};
 
    private List<PixelMapHolder> pixelMapHolderList;
    private Context context;
 
    // 动画 
    private AnimatorValue animatorVal = new AnimatorValue();
 
    /** 
     * constructor of LuckyCirclePanComponent 
     * 
     * @param context context 
     */ 
    public LuckyCirclePanComponent(Context context) { 
        super(context); 
        this.context = context; 
        // 初始化画笔 
        initPaint(); 
        // 获取屏幕的宽高度、中心点坐标，调用onEstimateSize方法 
        setEstimateSizeListener(this); 
        // 添加绘制任务，调用onDraw方法 
        addDrawTask(this); 
        // 实现点击中心圆盘区域位置开始抽奖功能，调用onTouchEvent方法 
        setTouchEventListener(this); 
    } 
 
    private void initPaint() { 
        final int size = 20; 
        padding = vp2px(size); 
 
        pixelMapToPixelMapHolder(); 
 
        paintInnerArc = new Paint(); 
        paintInnerArc.setAntiAlias(true); 
        paintInnerArc.setStyle(Paint.Style.FILL_STYLE); 
 
        paintArcText = new Paint(); 
        paintArcText.setAntiAlias(true); 
        paintArcText.setTextSize(padding); 
        paintArcText.setStyle(Paint.Style.FILL_STYLE); 
        paintArcText.setColor(ColorUtils.TEXT); 
 
        paintOutCircle = new Paint(); 
        paintOutCircle.setAntiAlias(true); 
        paintOutCircle.setStyle(Paint.Style.FILL_STYLE); 
 
        paintCenterCircle = new Paint(); 
        paintCenterCircle.setAntiAlias(true); 
        paintCenterCircle.setStyle(Paint.Style.FILL_STYLE); 
 
        paintPointer = new Paint(); 
        paintPointer.setAntiAlias(true); 
        paintPointer.setStyle(Paint.Style.FILL_STYLE); 
        paintPointer.setColor(ColorUtils.PAINT_POINTER); 
 
        paintCenterText = new Paint(); 
        paintCenterText.setAntiAlias(true); 
        paintCenterText.setTextSize(padding); 
        paintCenterText.setStyle(Paint.Style.FILL_STYLE); 
        paintCenterText.setColor(ColorUtils.TEXT); 
        paintCenterText.setTextAlign(TextAlignment.CENTER);
 
        paintImage = new Paint(); 
        paintImage.setAntiAlias(true); 
        paintImage.setStrokeCap(Paint.StrokeCap.ROUND_CAP); 
        paintImage.setStyle(Paint.Style.STROKE_STYLE); 
 
        paintFlower = new Paint(); 
        paintFlower.setAntiAlias(true); 
        paintFlower.setStyle(Paint.Style.FILL_STYLE); 
 
        paintFive = new Paint(); 
        paintFive.setAntiAlias(true); 
        paintFive.setStyle(Paint.Style.FILL_STYLE); 
        paintFive.setColor(Color.YELLOW);
 
        paintSmallPoint = new Paint(); 
        paintSmallPoint.setStyle(Paint.Style.FILL_STYLE); 
        paintSmallPoint.setColor(Color.WHITE); 
    } 
 
    @Override 
    public boolean onEstimateSize(int widthEstimateConfig, int heightEstimateConfig) { 
        int componentWidth = EstimateSpec.getSize(widthEstimateConfig); 
        int componentHeight = EstimateSpec.getSize(heightEstimateConfig); 
        this.width = componentWidth; 
        this.height = componentHeight; 
        centerX = this.width / TWO; 
        centerY = this.height / TWO; 
        setEstimatedSize( 
                EstimateSpec.getChildSizeWithMode(componentWidth, componentWidth, EstimateSpec.PRECISE), 
                EstimateSpec.getChildSizeWithMode(componentHeight, componentHeight, EstimateSpec.PRECISE) 
        ); 
        return true; 
    } 
 
    @Override 
    public void onDraw(Component component, Canvas canvas) {
        // 将画布沿X、Y轴平移指定距离 
        canvas.translate(centerX, centerY); 
        // 画外部圆盘的花瓣 
        drawFlower(canvas); 
        // 画外部圆盘、小圈圈、五角星 
        drawOutCircleAndFive(canvas); 
        // 画内部扇形抽奖区域 
        drawInnerArc(canvas); 
        // 画内部扇形区域文字 
        drawArcText(canvas); 
        // 画内部扇形区域奖品对应的图片 
        drawImage(canvas); 
        // 画中心圆盘和指针 
        drawCenter(canvas); 
    }

    /**
     * 外部圆盘的花瓣
     * @param canvas
     */
    private void drawFlower(Canvas canvas) { 
        float beginAngle = startAngle + avgAngle; 
        float radius = centerX - padding; 
        for (int i = 0; i < COUNT; i++) { 
            canvas.save(); 
            canvas.rotate(beginAngle, 0F, 0F); 
            paintFlower.setColor(ColorUtils.PAINT_FLOWER_YELLOW); 
            canvas.drawCircle(-radius / TWO, radius / TWO, radius / TWO, paintFlower); 
 
            paintFlower.setColor(ColorUtils.PAINT_FLOWER_PINK); 
            canvas.drawCircle(-radius / TWO, radius / TWO, (radius - padding) / TWO, paintFlower); 
            beginAngle += avgAngle; 
            canvas.restore(); 
        } 
    }

    /**
     * 画外部圆盘，圆盘边上的小圈圈和五角星
     * @param canvas
     */
    private void drawOutCircleAndFive(Canvas canvas) {
        // 在指定的X、Y（0F, 0F）坐标处，画一个半径为centerX - padding的圆形（其实就是绘制一个红色的圆盘）。
        paintOutCircle.setColor(ColorUtils.PAINT_OUT_CIRCLE); 
        canvas.drawCircle(0F, 0F, centerX - padding, paintOutCircle);
        // 画外部圆盘边上的小圈圈和五角星
        float beginAngle = startAngle + avgAngle / THREE; 
        for (int i = 0; i < COUNT * THREE; i++) { 
            canvas.save(); 
            canvas.rotate(beginAngle, 0F, 0F); 
            if (0 == i % TWO) { 
                paintOutCircle.setColor(Color.WHITE); 
                canvas.drawCircle(centerX - padding - padding / TWO, 0F, vp2px(FIVE), paintOutCircle); 
            } else { 
                paintFiveStart(canvas); 
            } 
            beginAngle += avgAngle / THREE; 
            canvas.restore(); 
        } 
    }

    /**
     * 画五角星
     * @param canvas
     */
    private void paintFiveStart(Canvas canvas) { 
        // 画五角星的path 
        Path path = new Path();
        float[] points = fivePoints(centerX - padding - padding / TWO, 0F, padding); 
        for (int i = 0; i < points.length - 1; i = i + TWO) { 
            path.lineTo(points[i], points[i + 1]); 
        } 
        path.close(); 
        canvas.drawPath(path, paintFive); 
    }
    /**
     * fivePoints 获取五角星的五个顶点
     *
     * @param pointXa 起始点A的x轴绝对位置
     * @param pointYa 起始点A的y轴绝对位置
     * @param sideLength 五角星的边长
     * @return 五角星5个顶点坐标
     */
    private static float[] fivePoints(float pointXa, float pointYa, float sideLength) {
        final int eighteen = 18;
        float pointXb = pointXa + sideLength / TWO;
        double num = sideLength * Math.sin(Math.toRadians(eighteen));
        float pointXc = (float) (pointXa + num);
        float pointXd = (float) (pointXa - num);
        float pointXe = pointXa - sideLength / TWO;
        float pointYb = (float) (pointYa + Math.sqrt(Math.pow(pointXc - pointXd, TWO)
                - Math.pow(sideLength / TWO, TWO)));
        float pointYc = (float) (pointYa + Math.cos(Math.toRadians(eighteen)) * sideLength);
        float pointYd = pointYc;
        float pointYe = pointYb;
        float[] points = new float[]{pointXa, pointYa, pointXd, pointYd, pointXb, pointYb,
                pointXe, pointYe, pointXc, pointYc, pointXa, pointYa};
        return points;
    }

    /**
     * 画抽奖区域扇形
     * @param canvas
     */
    private void drawInnerArc(Canvas canvas) { 
        float radius = Math.min(centerX, centerY) - padding * TWO; 
        RectFloat rect = new RectFloat(-radius, -radius, radius, radius);
        for (int i = 0; i < COUNT; i++) { 
            paintInnerArc.setColor(colors[i]); 
            canvas.drawArc(rect, new Arc(startAngle, avgAngle, true), paintInnerArc);
            startAngle += avgAngle; 
        } 
    }

    /**
     * 画抽奖区域文字
     * @param canvas
     */
    private void drawArcText(Canvas canvas) { 
        for (int i = 0; i < COUNT; i++) { 
            // 创建绘制路径 
            Path circlePath = new Path(); 
            float radius = Math.min(centerX, centerY) - padding * TWO; 
            RectFloat rect = new RectFloat(-radius, -radius, radius, radius); 
            circlePath.addArc(rect, startAngle, avgAngle); 
            float measureWidth = paintArcText.measureText(textArrs[i]); 
            // 偏移量 
            float advance = (float) ((Math.sin(avgAngle / CIRCLE * Math.PI) * radius) - measureWidth / TWO); 
            canvas.drawTextOnPath(paintArcText, textArrs[i], circlePath, advance, radius / FIVE); 
            startAngle += avgAngle; 
        } 
    }

    /**
     * 画抽奖区域文字对应图片
     * @param canvas
     */
    private void drawImage(Canvas canvas) { 
        float beginAngle = startAngle + avgAngle / TWO; 
        for (int i = 0; i < COUNT; i++) { 
            int imageWidth = pixelMaps[i].getImageInfo().size.width; 
            int imageHeight = pixelMaps[i].getImageInfo().size.height; 
            canvas.save(); 
            canvas.rotate(beginAngle, 0F, 0F); 
            // 指定图片在屏幕上显示的区域 
            RectFloat dst = new RectFloat(centerX / THREE, -imageHeight / TWO, 
                    centerX / THREE + imageWidth, imageHeight / TWO); 
            canvas.drawPixelMapHolderRect(pixelMapHolderList.get(i), dst, paintImage); 
            beginAngle += avgAngle; 
            canvas.restore(); 
        } 
    } 
 
    // 将pixelMap转换成PixelMapHolder 
    private void pixelMapToPixelMapHolder() { 
        pixelMapHolderList = new ArrayList<>(pixelMaps.length);
        for (PixelMap pixelMap : pixelMaps) { 
            pixelMapHolderList.add(new PixelMapHolder(pixelMap)); 
        } 
    }

    /**
     * 画中心圆盘和指针
     * @param canvas
     */
    private void drawCenter(Canvas canvas) { 
        final int nine = 9; 
        final int seven = 7; 
        final int eighteen = 18; 
        // 画大指针 
        Path path = new Path(); 
        path.moveTo(-centerX / nine, 0F); 
        path.lineTo(centerX / nine, 0F); 
        path.lineTo(0F, -centerX / THREE); 
        path.close(); 
        canvas.drawPath(path, paintPointer); 
 
        // 画内部大圆 
        paintCenterCircle.setColor(ColorUtils.PAINT_POINTER); 
        canvas.drawCircle(0F, 0F, centerX / seven + padding / TWO, paintCenterCircle); 
        // 画内部小圆 
        paintCenterCircle.setColor(Color.WHITE); 
        canvas.drawCircle(0F, 0F, centerX / seven, paintCenterCircle); 
 
        // 画小指针 
        Path smallPath = new Path(); 
        smallPath.moveTo(-centerX / eighteen, 0F); 
        smallPath.lineTo(centerX / eighteen, 0F); 
        smallPath.lineTo(0F, -centerX / THREE + padding / TWO); 
        smallPath.close(); 
        canvas.drawPath(smallPath, paintSmallPoint); 
 
        // 画中心圆弧文字 
        Paint.FontMetrics fontMetrics = paintCenterText.getFontMetrics(); 
        float textHeight = (float) Math.ceil(fontMetrics.leading - fontMetrics.ascent); 
        canvas.drawText(paintCenterText, "开始", 0F, textHeight / THREE); 
    } 
 
    /** 
     * vp2px 将vp转换成px 
     * 
     * @param size size 
     * @return int 
     */ 
    public int vp2px(int size) { 
        int density = getResourceManager().getDeviceCapability().screenDensity / DeviceCapability.SCREEN_MDPI;
        return size * density; 
    } 
 

    // 实现抽奖功能
    @Override 
    public boolean onTouchEvent(Component component, TouchEvent touchEvent) {
        final int seven = 7; 
        switch (touchEvent.getAction()) { 
            case TouchEvent.PRIMARY_POINT_DOWN: 
                // 获取屏幕上点击的坐标 
                float floatX = touchEvent.getPointerPosition(touchEvent.getIndex()).getX(); 
                float floatY = touchEvent.getPointerPosition(touchEvent.getIndex()).getY(); 
                float radius = centerX / seven + padding / TWO; 
                boolean isScopeX = centerX - radius < floatX && centerX + radius > floatX; 
                boolean isScopeY = centerY - radius < floatY && centerY + radius > floatY; 
                if (isScopeX && isScopeY && !animatorVal.isRunning()) { 
                    startAnimator(); 
                } 
                break; 
            case TouchEvent.PRIMARY_POINT_UP: 
                // 松开取消 
                invalidate(); 
                break; 
            default: 
                break; 
        } 
        return true; 
    }

    /**
     * 圆形转盘开始转动抽奖
     */
    private void startAnimator() { 
        final int angle = 270; 
        startAngle = 0; 
        // 动画时长 
        final long animatorDuration = 4000L; 
        // 随机角度 
        int randomAngle = new SecureRandom().nextInt(CIRCLE);
        animatorVal.setCurveType(Animator.CurveType.DECELERATE);
        animatorVal.setDuration(animatorDuration); 
        animatorVal.setValueUpdateListener((AnimatorValue animatorValue, float value) -> { 
            startAngle = value * (CIRCLE * FIVE - randomAngle + angle); 
            invalidate(); 
        }); 
        stateChangedListener(animatorVal, randomAngle); 
        animatorVal.start(); 
    } 
 
    private void stateChangedListener(AnimatorValue animatorValue, int randomAngle) { 
        final int four = 4; 
        final int six = 6; 
        animatorValue.setStateChangedListener(new Animator.StateChangedListener() { 
            @Override 
            public void onStart(Animator animator) { 
            } 
 
            @Override 
            public void onStop(Animator animator) { 
            } 
 
            @Override 
            public void onCancel(Animator animator) { 
            } 
 
            @Override 
            public void onEnd(Animator animator) { 
                if (randomAngle >= 0 && randomAngle < avgAngle) { 
                    ToastUtils.showTips(context, "恭喜您中了一块华为手表"); 
                } else if (randomAngle >= avgAngle && randomAngle < TWO * avgAngle) { 
                    ToastUtils.showTips(context, "恭喜您中了一台华为平板");
                } else if (randomAngle >= TWO * avgAngle && randomAngle < THREE * avgAngle) { 
                    ToastUtils.showTips(context, "sorry，您没有中奖"); 
                } else if (randomAngle >= THREE * avgAngle && randomAngle < four * avgAngle) { 
                    ToastUtils.showTips(context, "恭喜您中了一部华为手机"); 
                } else if (randomAngle >= four * avgAngle && randomAngle < FIVE * avgAngle) { 
                    ToastUtils.showTips(context, "恭喜您中了一副华为耳机"); 
                } else if (randomAngle >= FIVE * avgAngle && randomAngle < six * avgAngle) { 
                    ToastUtils.showTips(context, "sorry，您没有中奖"); 
                } else { 
                    invalidate(); 
                } 
                animator.release(); 
            } 
 
            @Override 
            public void onPause(Animator animator) { 
            } 
 
            @Override 
            public void onResume(Animator animator) { 
            } 
        }); 
    } 
}

