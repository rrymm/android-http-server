/**************************************************
 * Android Web Server
 * Based on JavaLittleWebServer (2008)
 * <p/>
 * Copyright (c) Piotr Polak 2008-2016
 **************************************************/

package ro.polak.webserver.servlet.loader;

import java.io.IOException;

import ro.polak.webserver.servlet.Servlet;

/**
 * Loads and rolls servlets on Android.
 * The servlet classes are loaded from the current package or classpath.
 */
public class ClassPathServletLoader extends AbstractServletLoader {

    @Override
    protected Servlet instantiateServlet(String classCanonicalName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        return (Servlet) Class.forName(classCanonicalName).newInstance();
    }
}
