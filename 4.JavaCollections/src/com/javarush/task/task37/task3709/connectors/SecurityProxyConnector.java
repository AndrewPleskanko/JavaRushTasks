package com.javarush.task.task37.task3709.connectors;

import com.javarush.task.task37.task3709.security.SecurityChecker;
import com.javarush.task.task37.task3709.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector {
    SecurityChecker securityChecker;
    SimpleConnector simpleConnector;

    public SecurityProxyConnector(String resourceString) {
        securityChecker = new SecurityCheckerImpl();
        simpleConnector = new SimpleConnector(resourceString);
    }

    @Override
    public void connect() {
        if(securityChecker.performSecurityCheck()){
            simpleConnector.connect();
        }

    }
}
