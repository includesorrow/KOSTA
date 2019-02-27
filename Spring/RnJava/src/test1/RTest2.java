package test1;

import org.rosuda.REngine.REXP;

import org.rosuda.REngine.Rserve.*;

/**
 * 
 * Demonstration for accessing R via java
 *
 *   connection.eval("library(devtools)");
           connection.eval("library(RCurl)");
           connection.eval("library(d3Network)");
 * 
 */

public class RTest2 {

	public static void main(String[] args) throws Exception {
		double[] myvalues = { 1.0, 1.5, 2.2, 0.5, 0.9, 1.12 };
		RConnection c = null;
		try {
			c = new RConnection();
			  c.eval("library(shiny)");
	           c.eval("library(ggplot2)");
			c.assign("myvalues", myvalues);
			REXP x = c.eval("mean(myvalues)");
			System.out.println(x.asDouble());
			x = c.eval("sd(myvalues)");
			System.out.println(x.asDouble());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (c != null) {
				try {
					c.close();
				} finally {
				}
			}
		}

	}

}
