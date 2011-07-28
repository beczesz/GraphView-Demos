package com.jjoe64.graphviewdemos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.LineGraphView;

public class AdvancedGraph extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.advanced);

		// draw sin curve
		int num = 150;
		GraphViewData[] data = new GraphViewData[num];
		double v=0;
		for (int i=0; i<num; i++) {
			v += 0.2;
			data[i] = new GraphViewData(i, Math.sin(v));
		}
		// graph with dynamically genereated horizontal and vertical labels
		LineGraphView graphView = new LineGraphView(
				this
				, data
				, "GraphViewDemo"
				, null
				, null
		);
		// set view port, start=2, size=40
		graphView.setViewPort(2, 40);
		graphView.setScrollable(true);
		LinearLayout layout = (LinearLayout) findViewById(R.id.graph1);
		layout.addView(graphView);

		// draw random curve
		num = 1000;
		data = new GraphViewData[num];
		v=0;
		for (int i=0; i<num; i++) {
			v += 0.2;
			data[i] = new GraphViewData(i, Math.sin(Math.random()*v));
		}
		// graph with dynamically genereated horizontal and vertical labels
		graphView = new LineGraphView(
				this
				, data
				, "GraphViewDemo"
				, null
				, null
		);
		// set view port, start=2, size=10
		graphView.setViewPort(2, 10);
		graphView.setScalable(true);
		graphView.setDrawBackground(true);
		layout = (LinearLayout) findViewById(R.id.graph2);
		layout.addView(graphView);
	}
}