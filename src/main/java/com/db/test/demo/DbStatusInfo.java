package com.db.test.demo;

public class DbStatusInfo {
    private String dbName;

    private String dbStatus;

    private String dbUser;

    private String dbPassword;

    private String dbDriver;

    public String getDbUser () {
        return dbUser;
    }

    public void setDbUser ( String dbUser ) {
        this.dbUser = dbUser;
    }

    public String getDbPassword () {
        return dbPassword;
    }

    public void setDbPassword ( String dbPassword ) {
        this.dbPassword = dbPassword;
    }

    public String getDbDriver () {
        return dbDriver;
    }

    public void setDbDriver ( String dbDriver ) {
        this.dbDriver = dbDriver;
    }

    public String getDbName () {
        return dbName;
    }

    public void setDbName ( String dbName ) {
        this.dbName = dbName;
    }

    public String getDbStatus () {
        return dbStatus;
    }

    public void setDbStatus ( String dbStatus ) {
        this.dbStatus = dbStatus;
    }
}
