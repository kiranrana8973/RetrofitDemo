package APIService;

import java.util.List;

import model.Employee;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;


public interface EmployeeAPI {
   @GET("employees")
    Call<List<Employee>> getAllEmployees();

   @POST("create")
    Call<Employee> CreateAccount(@Body Employee Emp);

   @DELETE("delete/{id}")
    Call<Void> DeleteEmployee(@Path("id") int EmpId);

   @PUT("update/{id}")
    Call<Void> UpdateEmployee(@Path("id") int EmpId,@Body Employee emp);
}