package com.app;

import java.util.List;
import java.util.Map;

import com.app.models.Account;
import com.app.models.Account2;
import com.jk.core.util.JK;
import com.jk.data.dataaccess.JKDataAccessFactory;
import com.jk.data.dataaccess.core.JKDataAccessService;
import com.jk.data.dataaccess.core.JKPopulator;

public class App {
	public static void main(String[] args) throws InterruptedException {
		// Create Instance
		JKDataAccessService dao = JKDataAccessFactory.getDataAccessService();
		JK.line();
		if (!dao.isTableExists("ACCOUNTS")) {
			dao.beginTransaction();
			dao.runScript("/h2-script.sql");
			dao.execute("INSERT INTO ACCOUNTS VALUES(?,?,?)", 5, "Jalal", 100);
			dao.execute("INSERT INTO ACCOUNTS VALUES(?,?,?)", 6, "Ata", 200);
			dao.execute("INSERT INTO ACCOUNTS VALUES(?,?,?)", 7, "Essa", 300);
			dao.execute("INSERT INTO ACCOUNTS VALUES(?,?,?)", 8, "Jamal", 400);
			dao.closeTransaction(true);
		}
		// return single results
		JK.line();
		long result = dao.executeQueryAsLong("SELECT BALANCE FROM ACCOUNTS WHERE ID=?", 5);
		JK.print(result);

		// return single row
		JK.line();
		Object[] row = dao.executeQueryAsRow("SELECT * FROM ACCOUNTS WHERE ID=?", 5);
		JK.print(row);

		// return multiple rows
		JK.line();
		List<List<Object>> rows = dao.executeQueryAsList("SELECT * FROM ACCOUNTS WHERE BALANCE>?", 100);
		for (List<Object> eachRow : rows) {
			JK.print(eachRow);
		}

		JK.line();
		// execute query from file, it will look into "/src/main/resources/jk/sql"
		// folder for the scripts file
		List<List<Object>> rows2 = dao.executeQueryAsList("all_accounts.sql", 100);
		for (List<Object> eachRow : rows2) {
			JK.print(eachRow);
		}

		// execute query and fill directly into a bean, the default is to have the same
		// name in both, bean and the tables
		JK.line();
		List<Account> rows3 = dao.executeQueryAsListOfObjects(Account.class, "all_accounts.sql", 100);

		for (Account account : rows3) {
			JK.print(account);
		}

		// execute query and fill directly into bean, and map the fields using Map
		// object
		JK.line();

		Map<String, Object> fieldsMapping = JK.toMap("accountId", "id", "accountName", "name", "accountBalance", "balance");
		List<Account2> rows4 = dao.executeQueryAsListOfObjects(Account2.class, fieldsMapping, "all_accounts.sql", 100);
		for (Account2 account : rows4) {
			JK.print(account);
		}

		// execute query with custom populator
		//Create populator that convert build object from ResultSet using Lambda expression
		JKPopulator<Account> accountPopulator = (rs)->{
			Account account = new Account();
			account.setId(rs.getInt("id"));
			account.setName(rs.getString("name"));
			account.setBalance(rs.getInt("balance"));
			return account;
		};
		//Find multiple records with populator and parameters
		List<Account> accounts = dao.getList("SELECT * FROM accounts WHERE balance>?", accountPopulator, 100);
		for (Account account : accounts) {
			System.out.println(JK.buildToString(account));
		}
		
		//find single record with populator and paramters
		Account account = dao.find("SELECT * FROM accounts WHERE name=?", accountPopulator, "Jalal");
		System.out.println(JK.buildToString(account));
		
		

	}
}
