/**
 * Copyright 2015-2017 Knowm Inc. (http://knowm.org) and contributors.
 * Copyright 2011-2015 Xeiam LLC (http://xeiam.com) and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package harry;

import org.knowm.xchart.*;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.*;
import org.knowm.xchart.style.colors.*;


/**
 * Creates a simple Chart using QuickChart
 */
public class chart {

  public static void main(String[] args) throws Exception {

    double[] xData = new double[]{0.0, 0.5, 1.0, 1.5, 2.0};
    double[] yData = new double[]{2.0, 1.2, 1.0, 0.8, 0.0};

    // Create Chart
    XYChart chart = QuickChart.getChart("mood board", "time", "mood", "y(x)", xData, yData);
    chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.BLACK));

		BitmapEncoder.saveBitmap(chart, "./pic", BitmapFormat.PNG);
    
    // Show it
    new SwingWrapper(chart).displayChart();

    
  }
}
