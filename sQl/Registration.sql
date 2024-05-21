SELECT * FROM UsRegistrationDetailsRegistrationDetailsers.ResterationDetails;
create database airline;
use airline;
desc airlineRegistration;
select * from airlineRegistration;
select * from LoginUser;
delete from LoginUser where id=3;
desc LoginUser;
desc RegistrationDetails;

update LoginUser set UserName="Hari", Password="Mani@123" where id=3;
Alter table airlineRegistration modify id int primary key auto_increment ;
Alter table RegistrationDetails add Gender varchar(10) not Null ;
 
 
 insert into airlineRegistration values(1,"Hari", "Mani" , "HaraiMani", "h93mani486
 @iraH", "pselvamani486@gmail.com", "20/03/2003", 21, "Male", 9361931850, "Thiruvannamalai","thiruvannamalai", "Tamil Nadu",606804);










<td></td>
						<td><%=rs.getInt("id")%></td>
						<td><%=rs.getString("FirstName")%></td>
						<td><%=rs.getString("LastName")%></td>
						<td><%=rs.getString("UserName")%></td>
						<td><%=rs.getString("Password")%></td>
						<td><%=rs.getString("Email")%></td>
						<td><%=rs.getString("DOB")%></td>
						<td><%=rs.getInt("Age")%></td>
						<td><%=rs.getString("Gender")%></td>
						<td><%=rs.getLong("MobileNumber")%></td>
						<td><%=rs.getString("Address")%></td>
						<td><%=rs.getString("City")%></td>
						<td><%=rs.getString("State")%></td>
						<td><%=rs.getLong("PinCode")%></td>
					</tr>