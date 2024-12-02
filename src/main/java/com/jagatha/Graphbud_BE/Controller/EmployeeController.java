package com.jagatha.Graphbud_BE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jagatha.Graphbud_BE.IServices.IEmployeeService;
import com.jagatha.Graphbud_BE.Model.employee;
import com.jagatha.Graphbud_BE.Request.EmployeeReq;
import com.jagatha.Graphbud_BE.Response.companyRes;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService cs;

    @PostMapping("/")                                                     
    public ResponseEntity<employee> add(@RequestBody EmployeeReq req){
        employee c = cs.add(req);
        return new ResponseEntity<>(c,HttpStatus.CREATED);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<companyRes> delete(@PathVariable Long Id){
        cs.delete(Id);
        companyRes c = new companyRes("Deleted successsfully");
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
     
    @GetMapping("/")                                                   
    public ResponseEntity<List<employee>> get_all(){
        List<employee> c = cs.get_all();
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<employee> get_by_id(@PathVariable Long Id){          
        employee c = cs.get_by_id(Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @PutMapping("/{Id}")
    public ResponseEntity<employee> update(@RequestBody EmployeeReq req,@PathVariable Long Id){              
        employee c = cs.update(req, Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
}
