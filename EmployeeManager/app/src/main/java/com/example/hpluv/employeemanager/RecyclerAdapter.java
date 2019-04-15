package com.example.hpluv.employeemanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hpluv.employeemanager.model.Employee;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by HpLuv on 4/14/2019.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolderEmp>  {

    private List<Employee> employees;
    private Context context;

    public RecyclerAdapter (Context applicationContext, List<Employee> employeesList) {

        this.context = applicationContext;
        this.employees = employeesList;
    }

    @Override
    public ViewHolderEmp onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_item, parent, false);
        return new ViewHolderEmp(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderEmp holder, int position) {
        holder.name.setText(employees.get(position).getEmp_name());
        holder.email.setText(employees.get(position).getEmp_mail());
        holder.branch.setText(employees.get(position).getEmp_address());
        holder.bank.setText(employees.get(position).getEmp_password());
        Picasso.get().load(employees.get(position).getEmp_photo()).into(holder.photo);
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public class ViewHolderEmp extends RecyclerView.ViewHolder {

        private TextView name,email,bank,branch;
        private ImageView photo;

        public ViewHolderEmp(View view) {
            super(view);

            name = (TextView) view.findViewById(R.id.txt_employee_name);
            email = (TextView) view.findViewById(R.id.txt_employee_mail);
            bank = (TextView) view.findViewById(R.id.txt_bank_name);
            branch = (TextView) view.findViewById(R.id.txt_branch_name);
            photo = (ImageView) view.findViewById(R.id.emp_thumbnail);
        }
    }
}
