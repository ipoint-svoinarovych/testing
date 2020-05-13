package com.db.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( path = "/dbs" )
public class DbRestController {

    private final DbInfoGetter dbInfoGetter;

    public DbRestController ( DbInfoGetter dbInfoGetter ) {
        this.dbInfoGetter = dbInfoGetter;
    }

    @GetMapping ( path = "/{name}/status" )
    public DbStatusInfo statusCheck (@PathVariable ("name") String dbName ) {
        return dbInfoGetter.getDbInfo (dbName);
    }
}
