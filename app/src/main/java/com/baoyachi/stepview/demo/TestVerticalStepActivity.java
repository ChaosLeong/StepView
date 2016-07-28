package com.baoyachi.stepview.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.baoyachi.stepview.VerticalStepView;

import java.util.ArrayList;
import java.util.List;

/**
 * 日期：16/7/28 13:44
 * <p>
 * 描述：
 */
public class TestVerticalStepActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_vertical_stepview);
        findViewById(R.id.btn_status).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                VerticalStepView stepView = (VerticalStepView) findViewById(R.id.stepview);
                List<String> list0 = new ArrayList<>();
                list0.add("您已提交定单，等待系统确认");
                list0.add("您的商品需要从外地调拨，我们会尽快处理，请耐心等待");
                list0.add("您的订单已经进入亚洲第一仓储中心1号库准备出库");
                list0.add("您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中");
                list0.add("您的订单已打印完毕");
                list0.add("您的订单已拣货完成");
                list0.add("扫描员已经扫描");
                list0.add("打包成功");
                list0.add("您的订单在京东【华东外单分拣中心】发货完成，准备送往京东【北京通州分拣中心】");
                list0.add("您的订单在京东【北京通州分拣中心】分拣完成");
                list0.add("您的订单在京东【北京通州分拣中心】发货完成，准备送往京东【北京中关村大厦站】");
                list0.add("您的订单在京东【北京中关村大厦站】验货完成，正在分配配送员");
                list0.add("配送员【包牙齿】已出发，联系电话【130-0000-0000】，感谢您的耐心等待，参加评价还能赢取好多礼物哦");
                list0.add("感谢你在京东购物，欢迎你下次光临！");
                stepView.setStepsViewIndicatorComplectingPosition(list0.size() - 2)//设置完成的步数
                        .setStepViewTexts(list0)//总步骤
                        .setLinePaddingProportion(0.85f)//设置indicator线与线间距的比例系数
                        .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(getBaseContext(), android.R.color.white))//设置StepsViewIndicator完成线的颜色
                        .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(getBaseContext(), R.color.uncompleted_text_color))//设置StepsViewIndicator未完成线的颜色
                        .setStepViewComplectedTextColor(ContextCompat.getColor(getBaseContext(), android.R.color.white))//设置StepsView text完成线的颜色
                        .setStepViewUnComplectedTextColor(ContextCompat.getColor(getBaseContext(), R.color.uncompleted_text_color))//设置StepsView text未完成线的颜色
                        .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                        .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                        .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon
            }
        });
    }
}