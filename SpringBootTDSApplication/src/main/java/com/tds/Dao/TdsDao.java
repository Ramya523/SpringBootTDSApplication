//creating the dao interface for tds master
package com.tds.Dao;

import com.tds.Model.TdsMaster;

public interface TdsDao {
	
	TdsMaster getById(int id);

}
