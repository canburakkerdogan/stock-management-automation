package io.github.ydhekim.stock_management_automation.dao;

import java.util.ArrayList;

import io.github.ydhekim.stock_management_automation.model.Employee;

public interface WarehouseAttendantDAO {

	public void insertWarehouseAttendant(int warehouseAttendantId, int password, String firstName, String lastName,
			int departmentId);

	public void deleteWarehouseAttendant(int warehouseAttendantId);

	public void updateWarehouseAttendant(int warehouseAttendantId, int password, String firstName, String lastName,
			int departmentId);

	public Employee getWarehouseAttendant(int warehouseAttendantId);

	public ArrayList<Employee> getAllWarehouseAttendants();

}
