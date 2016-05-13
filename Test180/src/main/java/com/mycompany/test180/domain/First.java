/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test180.domain;

import org.apache.log4j.Logger;

/**
 *
 * @author sb 604-15
 */
public class First {

    private static Logger logger = Logger.getLogger(First.class);

    private void showLog(String t) {
        
        if (logger.isDebugEnabled()) {
            logger.debug("Ini adalah debug message :" + t);
        }

        if (logger.isInfoEnabled()) {
            logger.debug("Ini adalah info message :" + t);
        }

        logger.fatal("Ini adalah fatal message : " + t);
        logger.warn("Ini adalah warn message : " + t);
        logger.error("Ini adalah error message : " + t);
    }
    
    public static void main(String args []){
        First fs = new First();
        fs.showLog("Contoh Log4J");
    }

}
