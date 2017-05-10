package com.akanshi.babymonitortm;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.ramotion.foldingcell.FoldingCell;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       WebView webview = (WebView) findViewById(R.id.webview);

       /* GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);
*/


        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        webview.getSettings().setPluginState(WebSettings.PluginState.ON);
        webview.getSettings().setMediaPlaybackRequiresUserGesture(false);


        webview.setWebChromeClient(new WebChromeClient());
        webview.loadUrl("http://192.168.43.83:8080");

        final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
        // attach click listener to folding cell
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });

        // get our folding cell
// set custom parameters
        fc.initialize(1000, Color.DKGRAY, 2);
// or with camera height parameter
        fc.initialize(30, 1000, Color.DKGRAY, 2);







        final FoldingCell fc1 = (FoldingCell) findViewById(R.id.folding_cell1);
        // attach click listener to folding cell
        fc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc1.toggle(false);
            }
        });

        // get our folding cell
// set custom parameters
        fc1.initialize(1000, Color.DKGRAY, 2);
// or with camera height parameter
        fc1.initialize(30, 1000, Color.DKGRAY, 2);



        final FoldingCell fc2 = (FoldingCell) findViewById(R.id.folding_cell2);
        // attach click listener to folding cell
        fc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc2.toggle(false);
            }
        });

        // get our folding cell
// set custom parameters
        fc2.initialize(1000, Color.DKGRAY, 2);
// or with camera height parameter
        fc2.initialize(30, 1000, Color.DKGRAY, 2);

    }

}
