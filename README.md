# spring-jdbc-transaction

# summary
with @Transactional : when customer object is created by adding address object to the customer object exception raises due to address exceeds the length and no data will be 
inserted into the both the tables due to rollback

without @Transactional: Even if the Exception raises while adding address object to the customer object data is inserted Customer table and exception raises and 
data is not inserted in address table.
