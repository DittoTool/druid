package com.alibaba.druid.sql.dialect.mysql.ast.statement;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitor;

import java.util.LinkedList;
import java.util.List;

/**
 * version 1.0
 * Author zzy
 * Date 2019-07-22 10:09
 */
public class DrdsClearDDLJobCache extends MySqlStatementImpl implements SQLStatement {

    private boolean allJobs = false;
    private List<Long> jobIds = new LinkedList<Long>();

    public void accept0(MySqlASTVisitor visitor) {
        visitor.visit(this);
        visitor.endVisit(this);
    }

    public boolean isAllJobs() {
        return allJobs;
    }

    public void setAllJobs(boolean allJobs) {
        this.allJobs = allJobs;
    }

    public List<Long> getJobIds() {
        return jobIds;
    }

    public void addJobId(long id) {
        jobIds.add(id);
    }

}
