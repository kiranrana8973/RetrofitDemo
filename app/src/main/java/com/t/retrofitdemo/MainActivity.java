package com.t.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import APIService.EmployeeAPI;
import model.Employee;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "http://dummy.restapiexample.com/api/v1/";
    private TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = findViewById(R.id.tvData);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        EmployeeAPI employeeAPI = retrofit.create(EmployeeAPI.class);




        //Update
        Employee emp = new Employee("Kiran","2222","33");

        Call<Void> voidCal1l = employeeAPI.UpdateEmployee(22056,emp);

        voidCal1l.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });


        //Delete
//        Call<Void> voidCall = employeeAPI.DeleteEmployee(22012);
//
//        voidCall.enqueue(new Callback<Void>() {
//            @Override
//            public void onResponse(Call<Void> call, Response<Void> response) {
//                Toast.makeText(MainActivity.this, "Deleted", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<Void> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
//            }
//        });


//        listCall.enqueue(new Callback<List<Employee>>() {
//            @Override
//            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
//                if (!response.isSuccessful()) {
//                    Log.d("Error : ", "onResponse: ");
//                    return;
//                }
//
//                List<Employee> lstEmployee = response.body();
//
//                Log.d(this.getClass().toString(), "onResponse: " + response.body());
//                for (Employee emp : lstEmployee) {
//                    String content = "";
//
//                    content += "Id" + emp.getId() + "\n";
//                    content += "Name " + emp.getEmployee_name() + "\n";
//                    content += "Salary " + emp.getEmployee_salary() + "\n";
//                    content += " Age " + emp.getEmployee_age() + "\n";
//                    content += " Image " + emp.getEmployee_salary() + "\n";
//
//                    tvData.append(content);
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Employee>> call, Throwable t) {
//                tvData.setText(t.getMessage());
//            }
//        });
    }
}