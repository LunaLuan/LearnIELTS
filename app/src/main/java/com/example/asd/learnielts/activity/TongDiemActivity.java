package com.example.asd.learnielts.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asd.learnielts.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import static com.example.asd.learnielts.R.id.graph;

public class TongDiemActivity extends AppCompatActivity {

    private GraphView graphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tong_diem);

        graphView= (GraphView) findViewById(graph);
        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMinX(1);
        graphView.getViewport().setMaxX(7);

        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graphView);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"N1", "N2", "N3", "N4", "N5", "N6", "N7"});
        graphView.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

        LineGraphSeries<DataPoint> seriesNghe= getSeriesNghe();
        LineGraphSeries<DataPoint> seriesDoc= getSeriesDoc();

        graphView.addSeries(seriesNghe);
        graphView.addSeries(seriesDoc);
    }


    public LineGraphSeries<DataPoint> getSeriesNghe() {
        LineGraphSeries<DataPoint> seriesNghe= new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6),
                new DataPoint(5, 6),
                new DataPoint(6, 6),
                new DataPoint(7, 6)
        });
        seriesNghe.setTitle("Nghe");
        seriesNghe.setColor(getResources().getColor(R.color.colorNghe));
        seriesNghe.setDrawDataPoints(true);
        seriesNghe.setDataPointsRadius(6);
        seriesNghe.setThickness(3);
        return seriesNghe;
    }

    public LineGraphSeries<DataPoint> getSeriesDoc() {
        LineGraphSeries<DataPoint> seriesDoc= new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(1, 3),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 3),
                new DataPoint(5, 5),
                new DataPoint(6, 1),
                new DataPoint(7, 4)
        });
        seriesDoc.setTitle("Đọc");
        seriesDoc.setColor(getResources().getColor(R.color.colorNoi));
        seriesDoc.setDrawDataPoints(true);
        seriesDoc.setDataPointsRadius(6);
        seriesDoc.setThickness(3);
        return seriesDoc;
    }
}
