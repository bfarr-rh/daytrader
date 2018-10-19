/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.geronimo.samples.daytrader.web.prims.ejb3;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean;
import org.apache.geronimo.samples.daytrader.ejb3.TradeSLSBRemote;
import org.apache.geronimo.samples.daytrader.util.Log;
import org.apache.geronimo.samples.daytrader.util.TradeConfig;

/**
 * Primitive to test Entity Container Managed Relationshiop One to One Servlet
 * will generate a random userID and get the profile for that user using a
 * {@link trade.Account} Entity EJB This tests the common path of a Servlet
 * calling a Session to Entity EJB to get CMR One to One data
 * 
 */

public class PingServlet2Session2CMROne2One extends HttpServlet {
    private static String initTime;

    private static int hitCount;

    @EJB
    private TradeSLSBRemote tradeSLSBRemote;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        res.setContentType("text/html");
        java.io.PrintWriter out = res.getWriter();

        String userID = null;

        StringBuffer output = new StringBuffer(100);
        output.append("<html><head><title>Servlet2Session2CMROne20ne</title></head>" + "<body><HR><FONT size=\"+2\" color=\"#000066\">PingServlet2Session2CMROne2One<BR></FONT>" + "<FONT size=\"-1\" color=\"#000066\"><BR>PingServlet2Session2CMROne2One uses the Trade Session EJB"
                + " to get the profile for a user using an EJB 3.0 CMR one to one relationship");
        try {

            AccountProfileDataBean accountProfileData = null;
            int iter = TradeConfig.getPrimIterations();
            for (int ii = 0; ii < iter; ii++) {
                userID = TradeConfig.rndUserID();
                // get the price and print the output.
                accountProfileData = tradeSLSBRemote.getAccountProfileData(userID);
            }

            output.append("<HR>initTime: " + initTime + "<BR>Hit Count: ").append(hitCount++);
            output.append("<HR>One to One CMR access of AccountProfile Information from Account Entity<BR><BR> " + accountProfileData.toHTML());
            output.append("</font><HR></body></html>");
            out.println(output.toString());
        } catch (Exception e) {
            Log.error(e, "PingServlet2Session2CMROne2One.doGet(...): error");
            // this will send an Error to teh web applications defined error
            // page.
            res.sendError(500, "PingServlet2Session2CMROne2One.doGet(...): error" + e.toString());

        }
    }

    public String getServletInfo() {
        return "web primitive, tests Servlet to Entity EJB path";
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        hitCount = 0;
        initTime = new java.util.Date().toString();
    }
}